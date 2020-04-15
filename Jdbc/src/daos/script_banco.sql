
create database bdloja;

use bdloja;

create table Usuario(

  id int auto_increment primary key,
  nome varchar(100) not null,
  cpf varchar(20) not null unique,
  usuario varchar(20) not null unique,
  senha varchar(10) not null unique

);

create table Cupom(

  id int auto_increment primary key, 
  codigo int not null unique,
  descricao varchar(100) not null,
  pontos long not null
) engine InnoDB;

commit work;
