create database funcionários;

use funcionários;

create table Funcionários(
Usuário varchar(20) not null,
Senha varchar(20) not null,
Cpf varchar(11) not null,
primary key (Cpf)
)default charset = utf8;

select * FROM funcionários.funcionários;
