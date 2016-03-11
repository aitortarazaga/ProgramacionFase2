DROP TABLE centro CASCADE CONSTRAINTS ;

DROP TABLE administracion CASCADE CONSTRAINTS;

DROP TABLE logistica CASCADE CONSTRAINTS;

CREATE TABLE centro
  (
    id        NUMBER (2)
      GENERATED ALWAYS AS IDENTITY 
                        MINVALUE 1 
                        MAXVALUE 99
                        INCREMENT BY 1 
                        START WITH 1  
                        NOORDER  
                        NOCYCLE  NOT NULL ENABLE
      CONSTRAINT cent_id_pk PRIMARY KEY ,
    nombre    VARCHAR2 (30) NOT NULL ,
    calle     VARCHAR2 (30) NOT NULL,
    numero    NUMBER (2) NOT NULL,
    cPostal        VARCHAR2 (5) NOT NULL,
    ciudad    VARCHAR2 (15) NOT NULL,
    provincia VARCHAR2 (40) NOT NULL,
    telefono  VARCHAR2 (9) NOT NULL
  ) ;
  
CREATE TABLE logistica
  (
    dni         VARCHAR2 (9) CONSTRAINT log_dni_pk PRIMARY KEY ,
    nombre      VARCHAR2 (20) CONSTRAINT NNC_log_nombre NOT NULL ,
    apellido1   VARCHAR2 (30) CONSTRAINT NNC_log_apellido1 NOT NULL,
    apellido2   VARCHAR2 (30) CONSTRAINT NNC_log_apellido2 NOT NULL,
    calle       VARCHAR2 (20) NOT NULL,
    portal      VARCHAR2 (2) NOT NULL,
    piso        NUMBER (2) NOT NULL,
    mano        VARCHAR2 (4) NOT NULL,
    telEmpresa  VARCHAR2 (9) NOT NULL,
    telPersonal VARCHAR2 (9),
    fechaNac    DATE ,
    salario     NUMBER (5) ,
    idCentro       NUMBER (2) CONSTRAINT NNC_log_centro_id NOT NULL ,
    CONSTRAINT log_centro_fk FOREIGN KEY ( idCentro ) REFERENCES centro ( id )
  ) ;
  
CREATE TABLE administracion
  (
    dni         VARCHAR2 (9) CONSTRAINT adm_dni_pk PRIMARY KEY ,
    nombre      VARCHAR2 (20) CONSTRAINT NNC_adm_nombre NOT NULL ,
    apellido1   VARCHAR2 (30) CONSTRAINT NNC_adm_apellido1 NOT NULL,
    apellido2   VARCHAR2 (30) CONSTRAINT NNC_adm_apellido2 NOT NULL,
    calle       VARCHAR2 (20) NOT NULL,
    portal      VARCHAR2 (2) NOT NULL,
    piso        NUMBER (2) NOT NULL,
    mano        VARCHAR2 (4) NOT NULL,
    telEmpresa    VARCHAR2 (9) NOT NULL,
    telPersonal VARCHAR2 (9),
    fechaNac    DATE,
    salario     NUMBER (5),
    idCentro       NUMBER (2) CONSTRAINT NNC_adm_centro_id NOT NULL ,
    CONSTRAINT adm_centro_fk FOREIGN KEY ( idCentro ) REFERENCES centro ( id )
  ) ;