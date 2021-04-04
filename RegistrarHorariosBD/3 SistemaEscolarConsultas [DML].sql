/* GRADO Y PARALELO */
SELECT p.*
FROM grado g INNER JOIN paralelo p ON g.idGrado = p.paralelo_idGrado
WHERE g.idGrado = 1 ORDER BY 1;

SELECT MAX(idParalelo) + 1 as idGenerado
FROM grado g INNER JOIN paralelo p ON g.idGrado = p.paralelo_idGrado
WHERE g.idGrado = 1;

UPDATE paralelo
SET idParalelo = 1,
	paralelo_idGrado = 1,
    nombre = '1A',
    numEstudiantes = '15',
    ubicacion = 'Edificio 1, aula 111'
WHERE idParalelo = 1 AND paralelo_idGrado = 1;

/* GRADO - MATERIA */
SELECT m.*
FROM grado g, materia m, grado_materia gm
WHERE g.idGrado = gm.idGrado AND gm.idMateria = m.idMateria
AND g.idGrado = 1;

/* HORARIO */
SELECT *
FROM horario h INNER JOIN docente d ON h.horario_idDocente = d.idDocente
WHERE idDocente = 1;

SELECT d.*
FROM horario h INNER JOIN docente d ON h.horario_idDocente = d.idDocente
WHERE h.idHorario = 1;

SELECT m.*
FROM horario h INNER JOIN materia m ON h.horario_idMateria = m.idMateria
WHERE h.idHorario = 1;

SELECT al.*
FROM horario h INNER JOIN aniolectivo al ON h.horario_idAnioLectivo = al.idAnioLectivo
WHERE h.idHorario = 1;

SELECT h.*
FROM horario h
WHERE (h.horaInicio = '11:40' AND h.horaFin = '12:20' AND h.dia = 'Martes'
AND h.horario_idAnioLectivo = '1' AND h.horario_idGrado = '2' AND h.horario_idParalelo = '1')
OR (h.horaInicio = '11:40' AND h.horaFin = '12:20' AND h.dia = 'Martes'
AND h.horario_idAnioLectivo = '1' AND h.horario_idDocente = '1');

SELECT h.*
FROM horario h
WHERE h.horaInicio = '11:00';

