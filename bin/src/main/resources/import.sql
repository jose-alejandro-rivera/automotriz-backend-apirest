insert into producto(codigo,nombre_prod,precio_prod,fecha_registro) values ('ASD123AC','Funko Pop Hulk','S/.50','2021-09-01');
insert into producto(codigo,nombre_prod,precio_prod,fecha_registro) values ('BADXEE12','Polo Stark','S/.90','2021-09-01');
insert into producto(codigo,nombre_prod,precio_prod,fecha_registro) values ('JKMH45AD','Taza Thor','S/.30','2021-09-01');
insert into user(enabled,password,username) values (true,'$2y$04$szVC/XceGNCDA4q/NzkOSeC3sHn.6ieO9h7uBLGKsfuHzxDbGj6Qe','leguarda');
insert into user(enabled,password,username) values (true,'$2y$04$szVC/XceGNCDA4q/NzkOSeC3sHn.6ieO9h7uBLGKsfuHzxDbGj6Qe','admin');
insert into authority (authority) values ('ADMIN');
insert into authority (authority) values ('USER');
insert into authorities_users (usuario_id,authority_id) values (1,1);
insert into authorities_users (usuario_id,authority_id) values (2,1);