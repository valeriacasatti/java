CREATE DATABASE IF NOT EXISTS coderhouse; -- creacion de la DB coderhouse
USE coderhouse; -- usar la DB

-- ALUMNOS 

CREATE TABLE alumnos -- crear tabla
 (
 nombre VARCHAR(20), -- nombre de la columna y tipo de dato
 apellido VARCHAR(20),
 dni INT(8) UNIQUE
 );
 
 SELECT * FROM alumnos; -- selecciona/visualiza todo de la tabla
 
 INSERT INTO alumnos VALUES -- y le inserta los valores
("Valeria", "Casatti", 42511590), -- primer valor primera columna
("Agustin", "Juncos", 38882854); -- segundo valor segunda columna

-- agregar columna
ALTER TABLE alumnos ADD COLUMN id INTEGER auto_increment NOT NULL PRIMARY KEY; 
ALTER TABLE alumnos ADD COLUMN email VARCHAR(40) NULL;

-- actualizar datos segun id
UPDATE alumnos SET email = "valeria.casatti@gmail.com" WHERE id = 1;
UPDATE alumnos SET email = "agustin@gmail.com" WHERE id = 2;

-- eliminar la tabla
DROP TABLE IF EXISTS alumnos;

-- USUARIOS 

CREATE TABLE usuarios(
idx INT PRIMARY KEY auto_increment,
usuario VARCHAR(20),
nombre VARCHAR(20),
sexo VARCHAR(1),
nivel TINYINT,
email VARCHAR(50),
telefono VARCHAR(20),
marca VARCHAR(20),
compania VARCHAR(20),
saldo FLOAT,
activo BOOLEAN
);

SELECT * FROM usuarios;

INSERT INTO usuarios VALUES
('1','BRE2271','BRENDA','M','2','brenda@live.com','655-330-5736','SAMSUNG','IUSACELL','100','1'),
('2','OSC4677','OSCAR','H','3','oscar@gmail.com','655-143-4181','LG','TELCEL','0','1'),
('3','JOS7086','JOSE','H','3','francisco@gmail.com','655-143-3922','NOKIA','MOVISTAR','150','1'),
('4','LUI6115','LUIS','H','0','enrique@outlook.com','655-137-1279','SAMSUNG','TELCEL','50','1'),
('5','LUI7072','LUIS','H','1','luis@hotmail.com','655-100-8260','NOKIA','IUSACELL','50','0'),
('6','DAN2832','DANIEL','H','0','daniel@outlook.com','655-145-2586','SONY','UNEFON','100','1'),
('7','JAQ5351','JAQUELINE','M','0','jaqueline@outlook.com','655-330-5514','BLACKBERRY','AXEL','0','1'),
('8','ROM6520','ROMAN','H','2','roman@gmail.com','655-330-3263','LG','IUSACELL','50','1'),
('9','BLA9739','BLAS','H','0','blas@hotmail.com','655-330-3871','LG','UNEFON','100','1'),
('10','JES4752','JESSICA','M','1','jessica@hotmail.com','655-143-6861','SAMSUNG','TELCEL','500','1'),
('11','DIA6570','DIANA','M','1','diana@live.com','655-143-3952','SONY','UNEFON','100','0'),
('12','RIC8283','RICARDO','H','2','ricardo@hotmail.com','655-145-6049','MOTOROLA','IUSACELL','150','1'),
('13','VAL6882','VALENTINA','M','0','valentina@live.com','655-137-4253','BLACKBERRY','AT&T','50','0'),
('14','BRE8106','BRENDA','M','3','brenda2@gmail.com','655-100-1351','MOTOROLA','NEXTEL','150','1'),
('15','LUC4982','LUCIA','M','3','lucia@gmail.com','655-145-4992','BLACKBERRY','IUSACELL','0','1'),
('16','JUA2337','JUAN','H','0','juan@outlook.com','655-100-6517','SAMSUNG','AXEL','0','0'),
('17','ELP2984','ELPIDIO','H','1','elpidio@outlook.com','655-145-9938','MOTOROLA','MOVISTAR','500','1'),
('18','JES9640','JESSICA','M','3','jessica2@live.com','655-330-5143','SONY','IUSACELL','200','1'),
('19','LET4015','LETICIA','M','2','leticia@yahoo.com','655-143-4019','BLACKBERRY','UNEFON','100','1'),
('20','LUI1076','LUIS','H','3','luis2@live.com','655-100-5085','SONY','UNEFON','150','1'),
('21','HUG5441','HUGO','H','2','hugo@live.com','655-137-3935','MOTOROLA','AT&T','500','1');

-- visualiza una columna especifica
SELECT nombre FROM usuarios;
SELECT nombre, usuario FROM usuarios;

-- muestra el mayor de los valores de una columna
SELECT max(saldo) FROM usuarios WHERE sexo = "M";
-- muestra nombre y telefono de marcas especificas
SELECT nombre, telefono, marca FROM usuarios WHERE marca in("NOKIA", "BLACKBERRY", "SONY");
-- ordena alfabeticamente en forma ascendente
SELECT nombre, usuario FROM usuarios ORDER BY nombre desc; 
-- ordena alfabeticamente en forma descendente
SELECT idx FROM usuarios ORDER BY idx desc; 
-- muestra valores que contengan lo incluido entre % %
SELECT nombre, email FROM usuarios WHERE lower(email) LIKE "%@gmail.com%";

-- ESTUDIANTES

CREATE TABLE estudiantes
(
id_estudiante INT PRIMARY KEY,
nombre VARCHAR(20),
apellido VARCHAR(20)
);

SELECT * FROM estudiantes;

INSERT INTO estudiantes (id_estudiante, nombre, apellido) VALUES
(1,"valeria","casatti"),
(2,"agustin","juncos"),
(3,"sofia","capdevila"),
(4,"camila","suarez");

-- INNER JOIN

SELECT estudiantes.nombre, cursos.nombre_curso -- esto es lo que muestra
FROM estudiantes
INNER JOIN cursos ON estudiantes.id_estudiante = cursos.id_estudiante; -- compara si ambos id son iguales

-- LEFT JOIN

SELECT estudiantes.nombre, cursos.nombre_curso
FROM estudiantes
LEFT JOIN cursos ON estudiantes.id_estudiante = cursos.id_estudiante;

-- RIGHT JOIN

SELECT estudiantes.nombre, cursos.nombre_curso
FROM estudiantes
RIGHT JOIN cursos ON estudiantes.id_estudiante = cursos.id_estudiante;

-- FULL JOIN

SELECT estudiantes.nombre, cursos.nombre_curso
FROM estudiantes
LEFT JOIN cursos
ON estudiantes.id_estudiante = cursos.id_estudiante
UNION
SELECT estudiantes.nombre, cursos.nombre_curso
FROM estudiantes
RIGHT JOIN cursos
ON estudiantes.id_estudiante = cursos.id_estudiante;

-- CURSOS

CREATE TABLE cursos
(
id_curso INT PRIMARY KEY,
nombre_curso VARCHAR(20),
id_estudiante INT,
FOREIGN KEY (id_estudiante) REFERENCES estudiantes(id_estudiante)
);

SELECT * FROM cursos;

INSERT INTO cursos (id_curso, nombre_curso, id_estudiante) VALUES
(100,"HTML",1),
(101,"CSS",2),
(102,"JAVASCRIPT",3),
(103,"JAVA",4);

-- PASAPORTES

CREATE TABLE pasaportes
(
id_pasaporte INT PRIMARY KEY,
id_estudiante INT UNIQUE,
fecha_expiracion DATE,
FOREIGN KEY (id_estudiante) REFERENCES estudiantes(id_estudiante)
);

INSERT INTO pasaportes (id_pasaporte, id_estudiante, fecha_expiracion) VALUES
(1001, 1, "2025-02-22"),
(1002, 2, "2025-03-03"),
(1003, 3, "2025-04-14"),
(1004, 4, "2025-01-11");

SELECT * FROM pasaportes;

-- PROFESORES

CREATE TABLE profesores(
id_profesor INT PRIMARY KEY,
nombre_profesor VARCHAR(20),
curso_asignado INT,
FOREIGN KEY (curso_asignado) REFERENCES cursos(id_curso)
);

INSERT INTO profesores (id_profesor, nombre_profesor, curso_asignado) VALUES
(1,"laura garcia",100),
(2,"pedro ramirez",102),
(3,"lucia diaz",103);

SELECT * FROM profesores;




