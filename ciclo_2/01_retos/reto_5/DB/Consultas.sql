-- PRIMERA CONSULTA
SELECT ID_Lider, Nombre, Primer_Apellido, Ciudad_Residencia  FROM Lider ORDER BY Ciudad_Residencia ASC;

--SEGUNDA CONSULTA
SELECT ID_Proyecto, Clasificacion, Constructora, Numero_Habitaciones , Ciudad FROM Proyecto WHERE Ciudad IN ('Cartagena', 'Barranquilla', 'Santa Marta') AND Clasificacion = 'Casa Campestre';

--TERCERA CONSULTA
SELECT c.ID_Compra, c.Proveedor, p.Ciudad, p.Constructora, p.Banco_Vinculado FROM Compra c INNER JOIN Proyecto p ON c.ID_Proyecto = p.ID_Proyecto WHERE c.Proveedor = 'Homecenter' AND p.Ciudad = 'Salento';
