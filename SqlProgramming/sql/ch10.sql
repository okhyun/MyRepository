--Section Equi Join(=Inner Join)
--조인 대상이 되는 두 테이블에서 공통으로 존재하는 컬럼의 값이
--일치하는 행을 연결하여 결과를 생성하는 조인 방법


--101번 사원의 부서 이름은?
select department_name 
from departments d, employees e
where employee_id=101 
  and d.department_id=e.department_id;

-- ANSI Inner Join 문법
select department_name
from departments d
inner join employees e
on d.department_id=e.department_id
where employee_id=101;

--------------------------------------------------------------------------------

--Sales 부서가 있는 도시는?
select department_name, city 
from departments d, locations l
where d.location_id=l.location_id
and department_name='sales';

--ANSI Inner Join 문법
select department_name, city 
from departments d
inner join locations l
on d.location_id=l.location_id
where department_name='sales';

--------------------------------------------------------------------------------

--101번 사원의 부서 번호와 부서 이름은?
select d.department_id, department_name
from departments d, employees e
where employee_id=101 
  and d.department_id=e.department_id;
  
  
--101번 사원의 근무 도시는?
select city
from departments d, employees e, locations l
where d.DEPARTMENT_ID=e.DEPARTMENT_ID 
  and d.LOCATION_ID=l.LOCATION_ID
  and employee_id=101;
  

--ANSI Inner Join 문법  
select city
from  employees e
inner join departments d on d.DEPARTMENT_ID=e.DEPARTMENT_ID
inner join locations l on d.LOCATION_ID=l.LOCATION_ID
where employee_id=101;
  
--------------------------------------------------------------------------------

--101번 사원의 사번, first_name, 부서번호, 부서이름, 나라, 도시는?
select first_name, d.department_id, department_name, country_name, city
from departments d, employees e, locations l, countries c
where e.department_id=d.department_id 
  and d.location_id=l.location_id 
  and l.country_id=c.country_id 
  and employee_id=101;
  
  
--ANSI Inner Join 문법
select first_name, d.department_id, department_name, country_name, city
from employees e
inner join departments d on e.department_id=d.department_id
inner join locations l on d.location_id=l.location_id
inner join countries c on l.country_id=c.country_id
where employee_id=101;


--Section04 Self Join(=Inner Join)
--101번 사원의 관리자 이름은?
select e2.first_name
from employees e1, employees e2
where e1.manager_id=e2.employee_id
  and e1.employee_id=101;
  
  
--5.3 ANSI Outer Join
drop table lefttable;
create table member (
  mid varchar(10) primary key,
  mname varchar(10) not null
);
drop table righttable;
 create table board (
   bno number(5) primary key,
   btitle varchar(100) not null,
   bwriter varchar(10) references member(mid)
 );
insert into member values('user1', '사용자1');
insert into member values('user2', '사용자2');
insert into member values('user3', '사용자3');
insert into member values('user4', '사용자4');
insert into member values('user5', '사용자5'); 

insert into board values(1, '제목1', 'user1');
insert into board values(2, '제목2', 'user2');
insert into board values(3, '제목3', 'user3');
--게시물을 한번도 작성하지 않은 멤버의 정보는?
select mid, mname, bno, btitle
from member
left outer join board
on member.mid=board.bwriter
where bno is null;

select bno, btitle ,mid, mname
from board
right outer join member
on member.mid=board.bwriter
where bno is null;

--left otter
select mid, mname, bno, btitle
from member
left outer join board
on member.mid=board.bwriter;
--right otter
select bno, btitle ,mid, mname
from board
right outer join member
on member.mid=board.bwriter;
--full otter
select mid, mname, bno, btitle
from member
full outer join board
on member.mid=board.bwriter;

--[참고]--------------------------
--left
select mid, mname, bno, btitle
from member, board
where member.mid=board.bwriter(+);
--right
select mid, mname, bno, btitle
from board, member
where board.bwriter(+)=member.mid;
-----------------------------------