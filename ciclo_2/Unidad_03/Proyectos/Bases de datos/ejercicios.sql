SELECT last_name salary FROM employees
WHERE NOT salary BETWEEN 5000 AND 12000;

--PUNTO 4
SELECT last_name, job_id, hire_date FROM employees 
WHERE last_name ="Chen" OR last_name="Taylor"
ORDER BY hire_date ASC;
--ASC ascendente; DESC descendente

--PUNTO 5
SELECT last_name, department_id FROM employees 
WHERE department_id = 10 OR department_id = 6
ORDER BY last_name ASC;

--PUNTO 6
SELECT last_name AS "Employee", salary AS "Monthly Salary" FROM employees 
WHERE salary BETWEEN 5000 AND 12000 AND (department_id = 6 
OR department_id = 10);

--PUNTO 7
SELECT first_name FROM employees
WHERE first_name LIKE "%D"; --LIKE: Como; "%D": empezar o terminar.

SELECT first_name FROM employees -- D% Nombre termine con D
WHERE first_name LIKE "D%";

SELECT first_name FROM employees
WHERE first_name LIKE "%D%"; -- %D% Nombre tenga D


SELECT last_name, hire_date FROM employees
WHERE hire_date LIKE "%1994%";

--PUNTO 8
--Trabajando con 2 o más tablas
-- INNER JOIN traer los registros que coinciden entre X tablas y "crea" una tabla momentanea con  los datos

SELECT last_name, job_id
FROM employees
WHERE manager_id IS NULL;

SELECT last_name, job_id
FROM employees 
WHERE manager_id   IS  NULL;


SELECT e.last_name, j.job_title 
FROM employees e 
INNER JOIN jobs j 
ON e.job_id = j.job_id 
WHERE manager_id  IS  NULL;




---USO DE 'alias'
SELECT first_name AS nombre, last_name AS apellido 
FROM employees;

SELECT first_name nombre, last_name apellido 
FROM employees;

SELECT first_name "nombre", last_name "primer apellido" 
FROM employees;

--Obtener a todas las personas que empiezan por 'D'
SELECT first_name 
FROM employees 
WHERE first_name LIKE 'D%';

--Obtener a todas las personas que terminan en 'D'
SELECT first_name 
FROM employees 
WHERE first_name LIKE '%D';

--Obtener a todas las personas que tengan 'D' en su nombre
SELECT first_name 
FROM employees 
WHERE first_name LIKE '%D%';

--Obtener los registros que tengan null en el campo telefono
SELECT * FROM employees 
WHERE phone_number IS NULL;

--Obtener los registros que no tengan null en el campo telefono
SELECT * FROM employees 
WHERE phone_number IS NOT NULL;

/*
 * Obtener:
 * nombre, apellido, salario, departamento 
 * De todos los empleados que tengan un salario 
 * entre 5000 y 20000
 */

SELECT e.first_name, e.last_name, e.salary, d.department_name
FROM employees e
INNER JOIN departments d 
ON e.department_id = d.department_id 
WHERE (salary BETWEEN 5000 AND 20000);


SELECT e.first_name||" "||e.last_name,e.salary ,d.department_name
FROM employees e
INNER JOIN departments d
ON e.department_id = d.department_id
WHERE salary BETWEEN 5000 AND 20000;

/*
 * Obtener:
 * nombre, apellido, salario, cargo, departamento
 */
SELECT e.first_name, e.last_name, e.salary, j.job_title, d.department_name 
FROM employees e
INNER JOIN jobs j ON j.job_id = e.job_id 
INNER JOIN departments d ON d.department_id = e.department_id;


/*
 * Obtener:
 * nombre, apellido, nombre_cargo, nombre_departamento, relacion(relationship)
 * Usar esos mismos nombres como etiquetas para las columnas
 */
SELECT e.first_name AS Nombre,e.last_name AS Apellido, j.job_title AS "Nombre_Cargo",
d.department_name AS "Nombre_Departamento", d2.relationship AS Relacion
FROM employees e
INNER JOIN jobs j
ON j.job_id = e.job_id
INNER JOIN departments d
ON d.department_id = e.department_id
INNER JOIN dependents d2
ON e.employee_id = d2.employee_id ;

/*
 * Obtener:
 * nombre, apellido, salario, departamento, ciudad
 */

SELECT e.first_name nombre, e.last_name apellido, e.salary salario,
	d.department_name departamento, l.city ciudad
FROM employees e
INNER JOIN departments d ON d.department_id = e.department_id 
INNER JOIN locations l ON l.location_id = d.location_id;


/*
 * Obtener:
 * nombre, apellido, salario, cargo, departamento, ciudad  
 * de todas las personas que tengan la letra 'A' en su nombre 
 * y que tengan un salario entre 8000 y 17000.
 * Ordenar el resultado por la columna salario de menor a mayor
 * NOTA:
 * Utilizar las mismas etiquetas para las columnas
 */
SELECT e.first_name Nombre,e.last_name Apellido,e.salary Salario, j.job_title Cargo,
d.department_name Departamento ,l.city Ciudad
FROM employees e
INNER JOIN jobs j
ON j.job_id = e.job_id
INNER JOIN departments d
ON d.department_id = e.department_id
INNER JOIN locations l
ON l.location_id = d.location_id
WHERE first_name LIKE '%a%'
AND salary BETWEEN 8000 AND 17000
ORDER BY salary ASC;

SELECT e.first_name nombre, e.last_name apellido, e.salary salario, 
d.department_name departamento, j.job_title cargo, l.city ciudad
FROM employees e 
INNER JOIN jobs j ON j.job_id = e.job_id
INNER JOIN departments d ON d.department_id = e.department_id
INNER JOIN locations l ON d.location_id = l.location_id
WHERE (first_name LIKE '%A%') AND (salary BETWEEN 8000 AND 17000)
ORDER BY salary ASC;

/*
 * Obtener:
 * nombre, apellido, salario, departamento, ciudad 
 * de todos los empleados que vivan/trabajen en la ciudad
 * de 'Toronto' y 'Seattle'.
 * 
 */
SELECT e.first_name nombre, e.last_name apellido, e.salary salario,
	d.department_name departamento, l.city ciudad 
FROM employees e 
INNER JOIN departments d ON d.department_id = e.department_id 
INNER JOIN locations l ON l.location_id = d.location_id 
WHERE l.city="London" OR l.city="Oxford";