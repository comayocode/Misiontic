
/*
 * Esto es un comentario
 * de varias lineas
 * de código
*/

CREATE TABLE grupo_33(
	id INTEGER PRIMARY KEY NOT NULL,
	jornada VARCHAR(10) NOT NULL,
	universidad VARCHAR(50) NOT NULL,
	cant_estudiantes INTEGER,
	prom_edad DOUBLE NOT NULL,
	conectado BOOLEAN
);


--Insertar datos en la tabla

INSERT INTO grupo_33(
	id, jornada, universidad,
	cant_estudiantes, prom_edad ,conectado
) 
VALUES(1, "Mañana", "UTP", 20, 25, true);


INSERT INTO grupo_33 (
	id, jornada, universidad, 
	prom_edad, conectado
)
VALUES(2, "Mañana", "UTP", 24, false);


--Consultar registros
SELECT * FROM grupo_33;

SELECT id AS codigo, universidad AS UNIVERSIDAD FROM grupo_33;


--Elimnar una tabla
DROP TABLE grupo_33;
