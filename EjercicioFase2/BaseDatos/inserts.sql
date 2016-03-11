insert into centro (nombre,CALLE,NUMERO,CPOSTAL,CIUDAD,PROVINCIA,TELEFONO) values('centro1','a',1,'a','a','a','a');

select * from centro;

insert into administracion (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) values('11111111A','iker','lorente','calvo','a',1,1,'a','a',null,null,null,1);
insert into administracion (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) values('22222222A','dani','lorente','calvo','a',1,1,'a','a',null,null,null,1);
insert into administracion (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) values('33333333A','iker','lorente','calvo','a',1,1,'a','a',null,null,null,2);
insert into administracion (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) values('44444444A','dani','lorente','calvo','a',1,1,'a','a',null,null,null,2);
insert into administracion (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) values('55555555A','iker','lorente','calvo','a',1,1,'a','a',null,null,null,3);
insert into administracion (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) values('66666666A','dani','lorente','calvo','a',1,1,'a','a',null,null,null,3);

insert into logistica (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) values('77777777A','iker','lorente','calvo','a',1,1,'a','a',null,null,null,1);
insert into logistica (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) values('88888888A','dani','lorente','calvo','a',1,1,'a','a',null,null,null,1);

select * from administracion;

select id from centro;

delete from administracion where dni = '11111111A';

select * from logistica;

select * from administracion where dni = '11111111A';

INSERT INTO administracion (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) VALUES('11111111A','a','a','a','a',1,1,'a','111111111',null,null,null,1);

delete from administracion where dni = '11111111A';

drop table logistica cascade constraints;

INSERT INTO administracion (dni,NOMBRE,APELLIDO1,APELLIDO2,CALLE,PORTAL,PISO,MANO,TELEMPRESA,TELPERSONAL,FECHANAC,SALARIO,IDCENTRO) 
VALUES('11111111A','a','a','a','a',1,1,'a','111111111',null,TO_DATE('02041997','DDMMYYYY'),null,1);

COMMIT;


UPDATE administracion SET NOMBRE = 'e', APELLIDO1 = 'a', APELLIDO2 = 'a', CALLE = 'a', PORTAL = 1, PISO = 1, MANO = 'a', TELEMPRESA = '111111111, TELPERSONAL = null, SALARIO = null, FECHANAC = TO_DATE('2016-03-01','YYYY-MM-DD')
