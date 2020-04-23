#drop database universidad;
create database universidad;
use universidad;

create table alumnos (
carnetAlumnos varchar(15) primary key ,
nombreAlumnos varchar(45) not null,
direccionAlumnos varchar(45) not null,
telefonoAlumnos varchar(45) not null,
emailAlumnos varchar(20) not null,
estatusAlumno varchar(1) not null

)engine=InnoDB Default charset = Latin1;

create table maestros (
codigoMaestros varchar(5) primary key ,
nombreMaestros varchar(45) not null,
direccionMaestros varchar(45) not null,
telefonoMaestros varchar(45) not null,
emailMaestros varchar(45) not null,
estatusMaestros varchar(1) not null

)engine=InnoDB Default charset = Latin1 ;

create table facultad(
codigoFacultad varchar(5) primary key ,
nombreFacultad varchar(45) not null,
estatusFacultad varchar(1) not null
)engine=InnoDB Default charset = Latin1 ;

create table secciones(
codigoSecciones varchar(5) primary key ,
nombreSecciones varchar(45) not null,
estatusSecciones varchar(1) not null

)engine=InnoDB Default charset = Latin1 ;

create table carreras(
codigoCarreras varchar(5) primary key ,
nombreCarreras varchar(45) not null,
estatusCarreras varchar(1) not null
)engine=InnoDB Default charset = Latin1 ;

create table cursos(
codigoCursos varchar(5) primary key ,
nombreCursos varchar(45) not null,
estatusCursos varchar(1) not null
)engine=InnoDB Default charset = Latin1 ;

create table cursoMaestro(
codigoCursos varchar(5),
codigoMaestros varchar(5)
)engine=InnoDB Default charset = Latin1 ;

create table cursoAlumnos(
codigoCursos varchar(5) not null,
codigoAlumnos varchar(5) not null,
nota int not null
)engine=InnoDB Default charset = Latin1 ;