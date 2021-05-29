insert into producto(codigo,nombre_prod,precio_prod,fecha_registro,usuario_registro,cantidad) values ('ASD123AC','hombre solo','S/.50','2021-09-01','1','5');
insert into producto(codigo,nombre_prod,precio_prod,fecha_registro,usuario_registro,cantidad) values ('BADXEE12','gato idraulico','S/.90','2021-09-01','1','7');
insert into producto(codigo,nombre_prod,precio_prod,fecha_registro,usuario_registro,cantidad) values ('JKMH45AD','llave de tubo','S/.30','2021-09-01','1','8');
insert into user(enabled,password,username) values (true,'$2y$04$szVC/XceGNCDA4q/NzkOSeC3sHn.6ieO9h7uBLGKsfuHzxDbGj6Qe','arivera');
insert into user(enabled,password,username) values (true,'$2y$04$szVC/XceGNCDA4q/NzkOSeC3sHn.6ieO9h7uBLGKsfuHzxDbGj6Qe','admin');
insert into authority (authority) values ('ADMIN');
insert into authority (authority) values ('USER');
insert into authorities_users (usuario_id,authority_id) values (1,1);
insert into authorities_users (usuario_id,authority_id) values (2,1);