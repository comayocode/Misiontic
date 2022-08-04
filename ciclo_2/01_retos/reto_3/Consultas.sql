--PRIMERO
SELECT
	ID_MaterialConstruccion AS ID,
	Nombre_Material AS NOMBRE,
	Precio_Unidad AS PRECIO
FROM
	MaterialConstruccion
WHERE Importado = "Si"
ORDER BY Nombre_Material ASC;

--SEGUNDO
SELECT
	p.ID_Proyecto AS ID,
	p.Constructora,
	p.Ciudad,
	p.Clasificacion,
	t.Estrato,
	l.Nombre || " " || l.Primer_Apellido || " " || l.Segundo_Apellido AS LIDER
FROM
	Proyecto p
INNER JOIN Tipo t ON
	t.ID_Tipo = p.ID_Tipo
INNER JOIN Lider l ON
	l.ID_Lider = p.ID_Lider
WHERE
	Banco_Vinculado = 'Conavi'
ORDER BY
	Fecha_Inicio DESC, Ciudad ASC, Constructora ASC;

--TERCERO
SELECT
	Ciudad,
	Clasificacion,
	COUNT(Numero_Habitaciones) AS TOTAL,
	MIN(Fecha_Inicio) AS VIEJO,
	MAX(Fecha_Inicio) AS RECIENTE
FROM
	Proyecto
WHERE Clasificacion NOT IN ('Casa Campestre', 'Condominio')
GROUP BY Ciudad, Clasificacion
ORDER BY Ciudad, Clasificacion;

--CUARTO
SELECT
	c.ID_Proyecto,
	SUM(c.Cantidad * mc.Precio_Unidad) AS VALOR
FROM
	Compra c
INNER JOIN MaterialConstruccion mc ON
	c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion
WHERE c.Pagado = 'No'
GROUP BY ID_Proyecto
HAVING VALOR > 50000
ORDER BY VALOR DESC;

--CINCO
SELECT 
	l.Nombre || " " || l.Primer_Apellido || " " || l.Segundo_Apellido AS LIDER,
	SUM(c.Cantidad * mc.Precio_Unidad) AS VALOR
FROM 
	Lider l
INNER JOIN Proyecto p ON
	l.ID_Lider = p.ID_Lider 
INNER JOIN Compra c ON
	p.ID_Proyecto = c.ID_Proyecto 
INNER JOIN MaterialConstruccion mc ON
	c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion
GROUP BY LIDER
ORDER BY VALOR DESC
LIMIT 10;

--SELECT Ciudad, Clasificacion, Numero_Habitaciones FROM Proyecto
--WHERE Ciudad = 'Armenia';

--PRUEBA COUNT
SELECT COUNT(ID_Lider)
FROM Lider l ;