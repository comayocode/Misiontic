INSERT INTO grupo_33(id, jornada, universidad, cant_estudiantes, promedio_edad, conectado)
VALUES(1, "Mañana", "UTP", 20, 25, TRUE);

-- CONSULTAR REGISTROS
SELECT * FROM grupo_33;

-- INSERTAR CON CAMPOS NULOS
INSERT INTO grupo_33(id, jornada, universidad, promedio_edad)
VALUES (3, "Mañana", "UNAB","24");

--VOLVER A CONSULTAR
SELECT * FROM grupo_33;

-- ELIMINAR UNA TABLA
DROP TABLE grupo_33;

-- OBLIGAR QUE LOS CAMPOS TENGAN DATOS CON NOT NULL
CREATE TABLE grupo_33(
	id INTEGER PRIMARY KEY NOT NULL,
	jornada VARCHAR(10) NOT NULL,
	universidad VARCHAR(50) NOT NULL,
	cant_estudiantes INTEGER,
	promedio_edad DOUBLE NOT NULL,
	conectado BOOLEAN
);
