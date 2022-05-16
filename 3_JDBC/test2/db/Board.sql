CREATE TABLE BOARD (
	NO INT PRIMARY KEY,
	TITLE VARCHAR(100) NOT NULL,
	WRITER VARCHAR(100) NOT NULL,
	CONTENT VARCHAR(500) NOT NULL,
	REGDATE DATE NOT NULL
);

SELECT * FROM BOARD;

INSERT INTO BOARD VALUES(1, '안녕하세요', '홍길동', '처음 작성 하는 글입니다', date_format(NOW(),'%Y-%m-%d'));
INSERT INTO BOARD VALUES(2, '너무 반가워요', '김유신', '글은 처음으로 적어보네요.', date_format(NOW(),'%Y-%m-%d'));
INSERT INTO BOARD VALUES(3, '가입했습니다.', '이순신', '만나서 반갑습니다 등업부탁해요', date_format(NOW(),'%Y-%m-%d'));
INSERT INTO BOARD VALUES(4, '무슨일이죠?', '유관순', '접속이 잘 안되네요ㅠ 어쪄죠?', date_format(NOW(),'%Y-%m-%d'));
INSERT INTO BOARD VALUES(5, '물어볼게 있습니다.', '신사임당', '탈퇴는 어떻게 하는건가요?', date_format(NOW(),'%Y-%m-%d'));