# automotriz-backend-apirest

Este proyecto ha sido generado con [Spring Tools] version 4.0.0.

## Requisitos

Para poder levantar el proyecto se necesitará instalar jdk 8, y Maven. Estos pueden descargarse desde sus paginas oficiales (https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
y (https://maven.apache.org/download.cgi)

## Servidor de Desarrollo

El servidor de desarrollo esta programado para levantarse en el host `http://localhost:8080/`. Use la herramienta de STS para levantar el proyecto.

## Base de datos

-Para que el sistema funsione debe crearse un SCHEMA en un motor de base de datos MYQSL, si ya se tiene instalado ejecutar el siguiente script  
OJO: `La data de prueba y las tablas se generaran automaticamente`

`create database db_automotriz_backend;`

Si desea consultar los valores de los registros de esta tabla debe usar los siguientes querys

`use db_automotriz_backend;`

`select * from db_automotriz_backend.producto;`

`select * from db_automotriz_backend.user;`

`select * from db_automotriz_backend.authority;`

`select * from db_automotriz_backend.authorities_users;`

## Usuario y contraseña de la base de datos

`user=root`

`password=admin`

## Ojo

`Si se desea cambiar el puerto del servidor local debera considerarlo en el front-end, para configurar el nuevo puerto.`

`La data de prueba y las tablas se generaran automaticamente`

`Primero debe levantarse el backend para que el front traiga los valores`