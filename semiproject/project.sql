
/* Drop Tables */

DROP TABLE affiliation CASCADE CONSTRAINTS;
DROP TABLE INVEN CASCADE CONSTRAINTS;
DROP TABLE RENTAL CASCADE CONSTRAINTS;
DROP TABLE BOOK CASCADE CONSTRAINTS;
DROP TABLE LECTURE CASCADE CONSTRAINTS;
DROP TABLE NOTICEBOARD CASCADE CONSTRAINTS;
DROP TABLE customer CASCADE CONSTRAINTS;
DROP TABLE TUITION CASCADE CONSTRAINTS;




/* Create Tables */

-- 소속
CREATE TABLE affiliation
(
	-- 소속번호
	a_num number(10) NOT NULL,
	-- 입학날짜
	a_admissiondate date,
	-- 졸업일자
	a_graduationdate date,
	-- 단과대학
	a_college varchar2(20),
	-- 주전공(학과)
	a_major varchar2(20),
	-- 제2전공
	a_secondmajor varchar2(20),
	-- 부전공
	a_dualmajor varchar2(20),
	-- 학년
	a_grade varchar2(10),
	-- 학적상태
	a_state varchar2(10),
	-- 학사번호
	c_id number(10) NOT NULL,
	PRIMARY KEY (a_num)
);


-- 전자도서
CREATE TABLE BOOK
(
	-- 도서번호 
	B_NUM  number(10) NOT NULL,
	-- 도서명 
	B_NAME varchar2(1000),
	-- 저자명 
	 B_AUTHOR varchar2(100),
	-- 번역자 
	B_TRANSLATOR varchar2(100),
	-- 출판사 
	B_PUBLISHER varchar2(200),
	-- 발행연도 
	B_ISSUEDATE date,
	-- ISBN   
	B_ISBN varchar2(200),
	-- 대출가능여부 
	B_ABLE number(1),
	-- 학사번호
	c_id number(10) NOT NULL,
	PRIMARY KEY (B_NUM )
);


-- 회원
CREATE TABLE customer
(
	-- 학사번호
	c_id number(10) NOT NULL,
	-- 비밀번호
	c_password varchar2(20),
	-- 성명
	c_name varchar2(20) NOT NULL,
	-- 주민등록번호
	c_rrn number(20),
	-- 계좌번호
	c_acount number(30),
	-- 권한
	c_authority number(1),
	-- 성별
	c_gender varchar2(10),
	-- 전화번호
	c_callnumber number(20),
	-- 휴대폰번호
	c_phone number(20),
	-- 이메일
	c_email varchar2(30),
	-- 주소
	m_address varchar2(100),
	PRIMARY KEY (c_id)
);


-- 재고
CREATE TABLE INVEN
(
	-- 재고번호 
	I_NUM number(10) NOT NULL,
	-- 원수량 
	I_SYSCOUNT number(10),
	-- 대출가능수량 
	I_RENTABLECOUNT number(10),
	-- 도서번호 
	B_NUM  number(10) NOT NULL,
	PRIMARY KEY (I_NUM)
);


-- 수강과목
CREATE TABLE LECTURE
(
	-- 수강번호 
	L_ID number(20) NOT NULL,
	-- 관련학과 
	L_DEPARTMENT varchar2(50),
	-- 이수구분 
	L_CATEGORIZE varchar2(50),
	-- 이수학년 
	L_YEAR varchar2(20),
	--  이수학기 
	 L_SEMESTER varchar2(20),
	-- 과목명  
	L_NAME  varchar2(1000),
	--  교수명 
	 L_PROFESSOR varchar2(50),
	--  학점 
	 L_CREDIT  number(10,2),
	-- 학사번호
	c_id number(10) NOT NULL,
	PRIMARY KEY (L_ID)
);


-- 게시판
CREATE TABLE NOTICEBOARD
(
	-- 게시물번호
	N_NUM number(20) NOT NULL,
	-- 제목
	N_TITLE varchar2(1000),
	-- 게시일
	N_REGDATE date,
	-- 원본파일이름
	N_ORGFILENAME varchar2(1000),
	-- 저장된파일이름
	N_SAVEFILENAME varchar2(1000),
	-- 학사번호
	c_id number(10) NOT NULL,
	PRIMARY KEY (N_NUM)
);


-- 대출/반납
CREATE TABLE RENTAL
(
	-- 대출번호 
	R_NUM number(20) NOT NULL,
	-- 대출상태 
	R_ABLE number(1),
	-- 대출일자 
	R_RENTABLE date,
	-- 반납예정일 
	R_RETURN date,
	-- 연장여부 
	R_DELAY number(1),
	-- 도서번호 
	B_NUM  number(10) NOT NULL,
	PRIMARY KEY (R_NUM)
);


-- 비용
CREATE TABLE TUITION
(
	-- 등록금납부상태 
	T_STATE number(1) NOT NULL,
	-- 결제수단 
	T_PAYMENT varchar2(50)
);



/* Create Foreign Keys */

ALTER TABLE INVEN
	ADD FOREIGN KEY (B_NUM )
	REFERENCES BOOK (B_NUM )
;


ALTER TABLE RENTAL
	ADD FOREIGN KEY (B_NUM )
	REFERENCES BOOK (B_NUM )
;


ALTER TABLE affiliation
	ADD FOREIGN KEY (c_id)
	REFERENCES customer (c_id)
;


ALTER TABLE BOOK
	ADD FOREIGN KEY (c_id)
	REFERENCES customer (c_id)
;


ALTER TABLE LECTURE
	ADD FOREIGN KEY (c_id)
	REFERENCES customer (c_id)
;


ALTER TABLE NOTICEBOARD
	ADD FOREIGN KEY (c_id)
	REFERENCES customer (c_id)
;



/* Comments */

COMMENT ON TABLE affiliation IS '소속';
COMMENT ON COLUMN affiliation.a_num IS '소속번호';
COMMENT ON COLUMN affiliation.a_admissiondate IS '입학날짜';
COMMENT ON COLUMN affiliation.a_graduationdate IS '졸업일자';
COMMENT ON COLUMN affiliation.a_college IS '단과대학';
COMMENT ON COLUMN affiliation.a_major IS '주전공(학과)';
COMMENT ON COLUMN affiliation.a_secondmajor IS '제2전공';
COMMENT ON COLUMN affiliation.a_dualmajor IS '부전공';
COMMENT ON COLUMN affiliation.a_grade IS '학년';
COMMENT ON COLUMN affiliation.a_state IS '학적상태';
COMMENT ON COLUMN affiliation.c_id IS '학사번호';
COMMENT ON TABLE BOOK IS '전자도서';
COMMENT ON COLUMN BOOK.B_NUM  IS '도서번호 ';
COMMENT ON COLUMN BOOK.B_NAME IS '도서명 ';
COMMENT ON COLUMN BOOK. B_AUTHOR IS '저자명 ';
COMMENT ON COLUMN BOOK.B_TRANSLATOR IS '번역자 ';
COMMENT ON COLUMN BOOK.B_PUBLISHER IS '출판사 ';
COMMENT ON COLUMN BOOK.B_ISSUEDATE IS '발행연도 ';
COMMENT ON COLUMN BOOK.B_ISBN IS 'ISBN   ';
COMMENT ON COLUMN BOOK.B_ABLE IS '대출가능여부 ';
COMMENT ON COLUMN BOOK.c_id IS '학사번호';
COMMENT ON TABLE customer IS '회원';
COMMENT ON COLUMN customer.c_id IS '학사번호';
COMMENT ON COLUMN customer.c_password IS '비밀번호';
COMMENT ON COLUMN customer.c_name IS '성명';
COMMENT ON COLUMN customer.c_rrn IS '주민등록번호';
COMMENT ON COLUMN customer.c_acount IS '계좌번호';
COMMENT ON COLUMN customer.c_authority IS '권한';
COMMENT ON COLUMN customer.c_gender IS '성별';
COMMENT ON COLUMN customer.c_callnumber IS '전화번호';
COMMENT ON COLUMN customer.c_phone IS '휴대폰번호';
COMMENT ON COLUMN customer.c_email IS '이메일';
COMMENT ON COLUMN customer.m_address IS '주소';
COMMENT ON TABLE INVEN IS '재고';
COMMENT ON COLUMN INVEN.I_NUM IS '재고번호 ';
COMMENT ON COLUMN INVEN.I_SYSCOUNT IS '원수량 ';
COMMENT ON COLUMN INVEN.I_RENTABLECOUNT IS '대출가능수량 ';
COMMENT ON COLUMN INVEN.B_NUM  IS '도서번호 ';
COMMENT ON TABLE LECTURE IS '수강과목';
COMMENT ON COLUMN LECTURE.L_ID IS '수강번호 ';
COMMENT ON COLUMN LECTURE.L_DEPARTMENT IS '관련학과 ';
COMMENT ON COLUMN LECTURE.L_CATEGORIZE IS '이수구분 ';
COMMENT ON COLUMN LECTURE.L_YEAR IS '이수학년 ';
COMMENT ON COLUMN LECTURE. L_SEMESTER IS ' 이수학기 ';
COMMENT ON COLUMN LECTURE.L_NAME  IS '과목명  ';
COMMENT ON COLUMN LECTURE. L_PROFESSOR IS ' 교수명 ';
COMMENT ON COLUMN LECTURE. L_CREDIT  IS ' 학점 ';
COMMENT ON COLUMN LECTURE.c_id IS '학사번호';
COMMENT ON TABLE NOTICEBOARD IS '게시판';
COMMENT ON COLUMN NOTICEBOARD.N_NUM IS '게시물번호';
COMMENT ON COLUMN NOTICEBOARD.N_TITLE IS '제목';
COMMENT ON COLUMN NOTICEBOARD.N_REGDATE IS '게시일';
COMMENT ON COLUMN NOTICEBOARD.N_ORGFILENAME IS '원본파일이름';
COMMENT ON COLUMN NOTICEBOARD.N_SAVEFILENAME IS '저장된파일이름';
COMMENT ON COLUMN NOTICEBOARD.c_id IS '학사번호';
COMMENT ON TABLE RENTAL IS '대출/반납';
COMMENT ON COLUMN RENTAL.R_NUM IS '대출번호 ';
COMMENT ON COLUMN RENTAL.R_ABLE IS '대출상태 ';
COMMENT ON COLUMN RENTAL.R_RENTABLE IS '대출일자 ';
COMMENT ON COLUMN RENTAL.R_RETURN IS '반납예정일 ';
COMMENT ON COLUMN RENTAL.R_DELAY IS '연장여부 ';
COMMENT ON COLUMN RENTAL.B_NUM  IS '도서번호 ';
COMMENT ON TABLE TUITION IS '비용';
COMMENT ON COLUMN TUITION.T_STATE IS '등록금납부상태 ';
COMMENT ON COLUMN TUITION.T_PAYMENT IS '결제수단 ';



