--Section01 서브쿼리의 기본 개념
--테이블간의 데이터를 연결(Join문으로 변경가능)
--이문세 사원의 부서 이름은?
select dname
from dept
where deptno=(select deptno from emp where ename='이문세');--속도면에선 서브쿼리가 더 빠르다.(중복하는 행이 많을수록 느리다.)
--Join문
select dname
from emp, dept
where emp.deptno=dept.deptno 
  and ename='이문세';
  

--1.1 단일 행 서브 쿼리
--이문세 사원의 부서 이름은?
select dname
from dept
where deptno=(select deptno from emp where ename='이문세');
--최저 봉급을 받아가는 사원의 정보는?
select * 
from emp
where sal=(select min(sal) from emp);
--평균 봉급 이상을 받아가는 사원의 수는?
select count(*)
from emp
where sal>=(select avg(sal) from emp);

--Select02 다중행 서브 쿼리
--서울에 근무하는 사원의 이름은?
select ename
from emp 
where deptno in(select deptno from dept where loc='서울');

--2.4 EXISTS 연산자
--사원이 1명이라도 존재하는 부서의 이름은?
select dname
from dept
where exists(select * from emp where emp.deptno=dept.deptno);

--사원이 존재하지 않는 부서의 이름은?
select dname
from dept
where not exists(select * from emp where emp.deptno=dept.deptno);

select dname
from dept
where not dname 
in(select distinct dname from emp e, dept d where d.deptno=e.deptno);

--Section03 서브쿼리를 이용하여 테이블을 생성하고 데이터를 조작하기
--emp  테이블을 복제해서 emp2로 만드세요(하나의 DDL로 작성하시오)
--제약조건은 복제가 되지 않습니다.(PK, FK, NOT NULL, CHECK)
--인덱스도 복제가 되지 않습니다.
create table emp2 
as
select * from emp;
--emp 테이블의 구조만 복제해서 emp3로 만드세요
--제약조건과 인덱스는 복제하지 않아도 됨
create table emp3
as
select * from emp where 1=0;
--3.3 서버쿼리로 데이터를 삽입하기
--emp3를 만들었다면 10번부서의 사원들만 복사하세요
insert into emp3 select * from emp where deptno=10;
--3.4서브 쿼리를 이용한 데이터 변경
--20번 부서의 위치를 40번 부서의 위치로 변경하세요
update dept
set loc=(select loc from dept where deptno=40)
where deptno=20;
--3.5 서브쿼리를 이용한 데이터 삭제
--영업부서의 사원을 삭제하세요
delete emp where deptno=(select deptno from dept where dname='영업%');

  