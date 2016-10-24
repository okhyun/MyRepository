--행 순번 붙이기
select rownum, bno, btitle
from board
order by bno; --틀린예)

select rownum, bno, btitle
from (select bno, btitle from board order by bno);--옳은예)

select rownum, bno, btitle
from (select bno, btitle from board order by bno desc);--옳은예)

--최근 삽입된 행 5개를 가져와라
select rownum, bno, btitle
from (select bno, btitle from board order by bno desc)
where rownum<=5;

select rownum, bno, btitle
from (select bno, btitle from board order by bno desc)
where rownum>11; --값보다 크다라는 구문은 쓸수가 없다. 쓸려면 및에 처럼 같이 써야한다.

--행의 순번이 11번 부터 20번까지를 가져와라
select rn, bno, btitle
from (
  select rownum as rn, bno, btitle
  from (select bno, btitle from board order by bno desc)
  where rownum<=20 --마지막행의 순번
)
where rn>=11; --시작행의 순번


--1페이지에 10개씩 구성하고 n번째 페이지를 가져와라
select rn, bno, btitle
from (
  select rownum as rn, bno, btitle
  from (select bno, btitle from board order by bno desc)
  where rownum<=(n*10) --마지막행의 순번
)
where rn>=((n-1)*10+1); --시작행의 순번