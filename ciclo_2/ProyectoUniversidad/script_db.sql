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