CREATE TABLE alunos (
	aluno_id int not null auto_increment primary key,
    nome VARCHAR(50),
    dataDeNascimento varchar(10),
    email varchar(50),
    senha varchar(50)
);

INSERT INTO alunos
VALUES(1, "admin", "01/01/2005", "admin@gmail.com", "admin");