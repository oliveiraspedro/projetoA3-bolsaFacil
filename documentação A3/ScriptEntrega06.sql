CREATE TABLE alunos (
	aluno_id int not null auto_increment primary key,
    name VARCHAR(50),
    dataDeNascimento date,
    email varchar(50),
    senha varchar(50)
);

SELECT DATE_FORMAT(dataDeNascimento, '%d/%m/%Y') AS dataDeNascimento FROM alunos;

INSERT INTO alunos
VALUES(1, "admin", "01/01/2005", "bolsafacil@gmail.com", "bolsafacil011");

CREATE TABLE UsuarioInstituicao (
	userInst_id int not null auto_increment primary key,
    nome VARCHAR(50),
    email varchar(50),
    sigla varchar(50),
    cnpj varchar(50),
    cep varchar(50)
);

INSERT INTO usuarioinstituicao
VALUES(1, "UNIVERSIDADE01", "unversidade01@gmail.com", "UNI01", "00.000.000/0001-00", "00000-001"),
(2, "UNIVERSIDADE02", "unversidade02@gmail.com", "UNI02", "00.000.000/0002-00", "00000-002"),
(3, "UNIVERSIDADE03", "unversidade03@gmail.com", "UNI03", "00.000.000/0003-00", "00000-003"),
(4, "UNIVERSIDADE04", "unversidade04@gmail.com", "UNI04", "00.000.000/0004-00", "00000-004");