create database Exam_Cyberturismo;

use Exam_Cyberturismo;

create table tb_choferes(
cod_chofer int not null primary key,
nom_chofer varchar(30),
ape_chofer varchar(30),
dni varchar(8)
); 

create table tb_rutas(
cod_ruta int not null primary key,
nom_ruta varchar(30),
descrip_ruta varchar(100)
);

create table tb_buses(
cod_bus char(8),
nom_bus varchar(30),
num_placa varchar(7),
capacidad int,
cod_chofer int, 
cod_ruta int,
primary key (cod_bus),
foreign key (cod_chofer) references tb_choferes(cod_chofer),
foreign key (cod_ruta) references tb_rutas(cod_ruta) 
);

drop table tb_buses;

insert into tb_choferes values (1,'Lucas','Montolla','77552863');
insert into tb_choferes values (2,'Mario','Montes','85693254');
insert into tb_choferes values (3,'Raul','Campos','44578962');
insert into tb_choferes values (4,'Jacinto','Lopez','63589148');
insert into tb_choferes values (5,'Juan','Fontis','93985425');

select*from tb_choferes;

insert into tb_rutas values (1,'Callao-Lima','Recorrido por las mejores zonas de Callao y Lima');
insert into tb_rutas values (2,'Moche-Lambayeque','Recorrido por las mejores zonas de Moche y Lambayeque');
insert into tb_rutas values (3,'Arequipa-Colca','Recorrido por las mejores zonas de Arequipa y Colca');
insert into tb_rutas values (4,'Cusco-Machu Picchu','Recorrido por las mejores zonas de Cusco y Machu Picchu');
insert into tb_rutas values (5,'Paracas-Ica','Recorrido por las mejores zonas de Paracas e Ica');

select*from tb_rutas;

insert into tb_buses values('BU001','Peru Bus','C8I-T32',35,1,5);
insert into tb_buses values('BU002','Soyuz','H34-I9O',25,5,3);
insert into tb_buses values('BU003','Oltursa','K3R-76D',30,2,4);
insert into tb_buses values('BU004','Civa','IO5-N5X',22,3,1);

select*from tb_buses;