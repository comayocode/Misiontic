--CREAR TABLA UNIVERSIDAD
CREATE TABLE universidades(
	nit VARCHAR(10) PRIMARY KEY NOT NULL, 
	nombre VARCHAR(20) NOT NULL, 
	direccion VARCHAR(60) NOT NULL, 
	email VARCHAR(100) NOT NULL
);

--CREAR TABLA UNIVERSIDAD
CREATE TABLE telefonos_universidad(
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
	numero_telefono VARCHAR(16),
	universidad_nit VARCHAR(10) NOT NULL,
	--Relacion con foreign key
	FOREIGN KEY(universidad_nit) REFERENCES universidades(nit)
);

--TABLA FACULTADES
CREATE TABLE facultades(
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
	codigo VARCHAR(10) NOT NULL,
	nombre VARCHAR(60) NOT NULL,
	universidad_nit VARCHAR(10) NOT NULL,
	FOREIGN KEY(universidad_nit) REFERENCES universidades(nit)
);

--TABLA ESTUDIANTES
CREATE TABLE estudiantes(
	cedula VARCHAR(15) PRIMARY KEY NOT NULL,
	nombre VARCHAR(50) NOT NULL,
	apellido VARCHAR(50) NOT NULL,
	edad INTEGER(3) NOT NULL,
	sexo CHAR NOT NULL,
	codigo VARCHAR(20) NOT NULL,
	facultad_id INTEGER NOT NULL,
	FOREIGN KEY(facultad_id) REFERENCES facultades(id)
);

--TABLA TELEFONOS ESTUDIANTES
CREATE TABLE telefonos_estudiante(
	id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
	numero_telefono VARCHAR(20) NOT NULL,
	estudiante_cedula VARCHAR(15) NOT NULL,
	FOREIGN KEY(estudiante_cedula) REFERENCES estudiantes(cedula)
);

