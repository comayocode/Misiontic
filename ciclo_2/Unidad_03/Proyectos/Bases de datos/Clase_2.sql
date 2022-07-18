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
	id INTEGER PRIMARY AUTOINCREMENT KEY NOT NULL, --AUTOINCREMENT: Autoimcremental
	jornada VARCHAR(10) NOT NULL,
	universidad VARCHAR(50) NOT NULL,
	cant_estudiantes INTEGER,
	promedio_edad DOUBLE NOT NULL,
	conectado BOOLEAN
);

INSERT INTO grupo_33(
	jornada, universidad, promedio_edad, conectado 
) VALUES("Tarde", "UPB", 31, true);


-- CONSULTAR CAMPOS
SELECT id, universidad FROM grupo_33;

SELECT * FROM grupo_33;

-- CONSULTAR CAMPOS CON ALIAS
SELECT id AS codigo, universidad AS uni FROM grupo_33;

-- MODIFICAR UN REGISTRO
UPDATE grupo_33 SET jornada = "Noche", promedio_edad=28 WHERE id=2;

-- ELIMINAR REGISTRO
DELETE FROM grupo_33; --Eliminar todos los registros
DELETE FROM grupo_33 WHERE id=1; --Eliminar registros específicos