-- 스퀸스 객체 생성
create sequence seq_board;
-- 스퀸스 삭제 (차후에 활용)
drop sequence seq_board;

create table test_board(
	t_bno number(10,0),    				-- 게시물번호 (시퀀스)
	t_title varchar2(200) not null,		-- 제목
	t_content varchar2(2000) not null,	-- 내용
	t_writer varchar2(50) not null,		-- 작성자 (차후에 member와 연동)
	t_regdate date default sysdate,		-- 작성일 (자동으로 DB날짜가 입력)
	t_updatedate date default sysdate		-- 수정일 (자동으로 DB날짜가 입력)
); -- board 테이블 생성


alter table test_board add constraint pk_board primary key (t_bno);
-- tbl_board 구조변경(수정) 기본기를 bno로 지정함.
insert into TEST_BOARD(t_bno, t_title, t_content, t_writer) values(seq_board.nextval, '테스트제목1', '테스트내용1', 'user00');
insert into TEST_BOARD(t_bno, t_title, t_content, t_writer) values(seq_board.nextval, '테스트제목2', '테스트내용2', 'user00');
insert into TEST_BOARD(t_bno, t_title, t_content, t_writer) values(seq_board.nextval, '테스트제목3', '테스트내용3', 'user00');
insert into TEST_BOARD(t_bno, t_title, t_content, t_writer) values(seq_board.nextval, '테스트제목4', '테스트내용4', 'user00');
insert into TEST_BOARD(t_bno, t_title, t_content, t_writer) values(seq_board.nextval, '테스트제목5', '테스트내용5', 'user00');
insert into TEST_BOARD(t_bno, t_title, t_content, t_writer) values(seq_board.nextval, '테스트제목6', '테스트내용6', 'user00');
insert into TEST_BOARD(t_bno, t_title, t_content, t_writer) values(seq_board.nextval, '테스트제목7', '테스트내용7', 'user00');
insert into TEST_BOARD(t_bno, t_title, t_content, t_writer) values(seq_board.nextval, '테스트제목8', '테스트내용8', 'user00');

select * from TEST_BOARD;