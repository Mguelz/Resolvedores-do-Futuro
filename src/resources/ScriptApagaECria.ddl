-- Gerado por Oracle SQL Developer Data Modeler 23.1.0.087.0806
--   em:        2023-07-07 15:35:32 BRT
--   site:      Oracle Database 11g
--   tipo:      Oracle Database 11g



-- DROP TABLE sgr_apolice CASCADE CONSTRAINTS;

-- DROP TABLE sgr_cliente CASCADE CONSTRAINTS;

-- DROP TABLE sgr_corretor CASCADE CONSTRAINTS;

-- DROP TABLE sgr_especi CASCADE CONSTRAINTS;

-- DROP TABLE sgr_veiculo CASCADE CONSTRAINTS;

-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE sgr_apolice (
    id_apolice            NUMBER(5) NOT NULL,
    dt_emissao            DATE NOT NULL,
    vl_premio             NUMBER(9) NOT NULL,
    sgr_veiculo_ds_chassi VARCHAR2(17) NOT NULL
);

COMMENT ON COLUMN sgr_apolice.id_apolice IS
    'identificador único do apólice';

COMMENT ON COLUMN sgr_apolice.dt_emissao IS
    'data de emissão';

COMMENT ON COLUMN sgr_apolice.vl_premio IS
    'valor do premio';

CREATE UNIQUE INDEX tb_sgr_apolice__idx ON
    sgr_apolice (
        sgr_veiculo_ds_chassi
    ASC );

ALTER TABLE sgr_apolice ADD CONSTRAINT tb_sgr_apolice_pk PRIMARY KEY ( id_apolice,
                                                                       sgr_veiculo_ds_chassi );

CREATE TABLE sgr_cliente (
    nr_cpf             NUMBER(11) NOT NULL,
    sgr_corretor_nr_id NUMBER(3) NOT NULL,
    dt_nascimento      DATE NOT NULL,
    ds_email           VARCHAR2(256) NOT NULL,
    ds_estado          VARCHAR2(100) NOT NULL,
    ds_genero          VARCHAR2(20) NOT NULL,
    nr_tempo           NUMBER(2) NOT NULL,
    nr_dependente      NUMBER(1) NOT NULL
);

COMMENT ON COLUMN sgr_cliente.nr_cpf IS
    'numero do cpf';

COMMENT ON COLUMN sgr_cliente.dt_nascimento IS
    'data de nascimento';

COMMENT ON COLUMN sgr_cliente.ds_email IS
    'descrição do email';

COMMENT ON COLUMN sgr_cliente.ds_estado IS
    'descircao do estado civil';

COMMENT ON COLUMN sgr_cliente.ds_genero IS
    'descricao do genero';

COMMENT ON COLUMN sgr_cliente.nr_tempo IS
    'tempo de habilitacao em anos';

COMMENT ON COLUMN sgr_cliente.nr_dependente IS
    'descricao se tem dependente';

ALTER TABLE sgr_cliente ADD CONSTRAINT tb_sgr_cliente_pk PRIMARY KEY ( nr_cpf,
                                                                       sgr_corretor_nr_id );

CREATE TABLE sgr_corretor (
    nr_id                NUMBER(3) NOT NULL,
    nm_corretor          VARCHAR2(120) NOT NULL,
    ds_endereco          VARCHAR2(200) NOT NULL,
    ds_celular           VARCHAR2(15) NOT NULL,
    sgr_especi_nr_codigo NUMBER(2) NOT NULL
);

COMMENT ON COLUMN sgr_corretor.nr_id IS
    'ID do corretor';

COMMENT ON COLUMN sgr_corretor.nm_corretor IS
    'nome do corretor';

COMMENT ON COLUMN sgr_corretor.ds_endereco IS
    'descricao do endereco';

COMMENT ON COLUMN sgr_corretor.ds_celular IS
    'Celular do corretor';

CREATE UNIQUE INDEX tb_sgr_corretor__idx ON
    sgr_corretor (
        sgr_especi_nr_codigo
    ASC );

ALTER TABLE sgr_corretor ADD CONSTRAINT tb_sgr_corretor_pk PRIMARY KEY ( nr_id );

CREATE TABLE sgr_especi (
    nr_codigo        NUMBER(2) NOT NULL,
    nm_especialidade VARCHAR2(100) NOT NULL
);

COMMENT ON COLUMN sgr_especi.nr_codigo IS
    'Código da especialidade
';

COMMENT ON COLUMN sgr_especi.nm_especialidade IS
    'Nome da especialidade';

ALTER TABLE sgr_especi ADD CONSTRAINT tb_sgr_especialidade_pk PRIMARY KEY ( nr_codigo );

CREATE TABLE sgr_veiculo (
    ds_chassi                      VARCHAR2(17) NOT NULL,
    ds_placa                       VARCHAR2(8) NOT NULL,
    nm_modelo                      VARCHAR2(50) NOT NULL,
    bl_carrozero                   CHAR(1) NOT NULL,
    dt_fabricacao                  DATE NOT NULL,
    nm_fabricante                  VARCHAR2(50) NOT NULL,
    nm_combustivel                 VARCHAR2(20) NOT NULL,
    nr_garagem                     NUMBER(2) NOT NULL,
    bl_isencao                     CHAR(1) NOT NULL,
    bl_kitgas                      CHAR(1) NOT NULL,
    ds_utilizacao                  VARCHAR2(50) NOT NULL,
    sgr_cliente_nr_cpf             NUMBER(11) NOT NULL,
    sgr_cliente_sgr_corretor_nr_id NUMBER(3) NOT NULL
);

COMMENT ON COLUMN sgr_veiculo.ds_chassi IS
    'numero do chassi
';

COMMENT ON COLUMN sgr_veiculo.ds_placa IS
    'descrição da pllaca';

COMMENT ON COLUMN sgr_veiculo.nm_modelo IS
    'modelo do carro';

COMMENT ON COLUMN sgr_veiculo.bl_carrozero IS
    'boolean carro zero ';

COMMENT ON COLUMN sgr_veiculo.dt_fabricacao IS
    'data de fabricação do carro';

COMMENT ON COLUMN sgr_veiculo.nm_combustivel IS
    'nome do combústivel';

COMMENT ON COLUMN sgr_veiculo.nr_garagem IS
    'boolean se tem garagem';

COMMENT ON COLUMN sgr_veiculo.bl_isencao IS
    'se tem isencao fiscal';

COMMENT ON COLUMN sgr_veiculo.bl_kitgas IS
    'boolean se tem kitgas';

COMMENT ON COLUMN sgr_veiculo.ds_utilizacao IS
    'descricao da utilizacao do carro';

ALTER TABLE sgr_veiculo ADD CONSTRAINT tb_sgr_veiculo_pk PRIMARY KEY ( ds_chassi );

ALTER TABLE sgr_apolice
    ADD CONSTRAINT sgr_apolice_sgr_veiculo_fk FOREIGN KEY ( sgr_veiculo_ds_chassi )
        REFERENCES sgr_veiculo ( ds_chassi );

ALTER TABLE sgr_cliente
    ADD CONSTRAINT sgr_cliente_sgr_corretor_fk FOREIGN KEY ( sgr_corretor_nr_id )
        REFERENCES sgr_corretor ( nr_id );

ALTER TABLE sgr_corretor
    ADD CONSTRAINT sgr_corretor_sgr_especi_fk FOREIGN KEY ( sgr_especi_nr_codigo )
        REFERENCES sgr_especi ( nr_codigo );

ALTER TABLE sgr_veiculo
    ADD CONSTRAINT sgr_veiculo_sgr_cliente_fk FOREIGN KEY ( sgr_cliente_nr_cpf,
                                                            sgr_cliente_sgr_corretor_nr_id )
        REFERENCES sgr_cliente ( nr_cpf,
                                 sgr_corretor_nr_id );



-- Relatório do Resumo do Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             5
-- CREATE INDEX                             2
-- ALTER TABLE                              9
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
