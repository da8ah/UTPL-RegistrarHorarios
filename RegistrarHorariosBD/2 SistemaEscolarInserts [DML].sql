/* GRADO Y PARALELO */

INSERT INTO `sistemaescolar`.`grado` (`idGrado`, `sufijo`) VALUES ('1', 'ro');
INSERT INTO `sistemaescolar`.`grado` (`idGrado`, `sufijo`) VALUES ('2', 'do');
INSERT INTO `sistemaescolar`.`grado` (`idGrado`, `sufijo`) VALUES ('3', 'ro');
INSERT INTO `sistemaescolar`.`grado` (`idGrado`, `sufijo`) VALUES ('4', 'to');
INSERT INTO `sistemaescolar`.`grado` (`idGrado`, `sufijo`) VALUES ('5', 'to');
INSERT INTO `sistemaescolar`.`grado` (`idGrado`, `sufijo`) VALUES ('6', 'to');
INSERT INTO `sistemaescolar`.`grado` (`idGrado`, `sufijo`) VALUES ('7', 'mo');

INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('1', '1', '1A', '10', 'Edificio 1, aula 111');
INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('2', '1', '1B', '10', 'Edificio 1, aula 112');
INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('3', '1', '1C', '8', 'Edificio 1, aula 113');
INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('1', '2', '2A', '15', 'Edificio 1, aula 121');
INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('2', '2', '2B', '15', 'Edificio 1, aula 122');
INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('3', '2', '2C', '13', 'Edificio 1, aula 123');
INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('1', '3', '3A', '15', 'Edificio 1, aula 131');
INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('2', '3', '3B', '15', 'Edificio 1, aula 132');
INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('3', '3', '3C', '11', 'Edificio 1, aula 133');
INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('1', '4', '4A', '10', 'Edificio 2, aula 211');
INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('2', '4', '4B', '8', 'Edificio 2, aula 212');
INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('1', '5', '5A', '15', 'Edificio 2, aula 221');
INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('2', '5', '5B', '15', 'Edificio 2, aula 222');
INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('3', '5', '5C', '15', 'Edificio 2, aula 223');
INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('1', '6', '6A', '10', 'Edificio 2, aula 231');
INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('2', '6', '6B', '10', 'Edificio 2, aula 232');
INSERT INTO `sistemaescolar`.`paralelo` (`idParalelo`, `paralelo_idGrado`, `nombre`, `numEstudiantes`, `ubicacion`) VALUES ('1', '7', '7A', '10', 'Edificio 2, aula 233');

/* MATERIA */

# 00101 hasta 00199 = Ciencias Naturales
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('1', '00101', 'Los Animales', 'Ciencias Naturales');
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('2', '00102', 'Las Plantas', 'Ciencias Naturales');
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('3', '00103', 'Los Vegetales', 'Ciencias Naturales');
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('4', '00104', 'La Naturaleza', 'Ciencias Naturales');
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('5', '00105', 'Los Seres Vivos', 'Ciencias Naturales');
# 00201 hasta 00299 = Ciencias Sociales
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('6', '00201', 'Las Comunidades', 'Ciencias Sociales');
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('7', '00202', 'La Amistad', 'Ciencias Sociales');
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('8', '00203', 'La Ciudadania', 'Ciencias Sociales');
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('9', '00204', 'Los Vecindarios', 'Ciencias Sociales');
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('10', '00205', 'Historia del Ecuador', 'Ciencias Sociales');
# 00501 hasta 00599 = Matematica
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('11', '00501', 'Los Numeros', 'Matematica');
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('12', '00502', 'Aprendo a Contar', 'Matematica');
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('13', '00503', 'Sistema Decimal', 'Matematica');
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('14', '00504', 'Suma y Resta', 'Matematica');
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('15', '00505', 'Multiplicacion y Division', 'Matematica');
# 01001 hasta 01099 = Extras
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('16', '01001', 'Musica', 'Extra');
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('17', '01002', 'Computacion', 'Extra');
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('18', '01003', 'Educacion Fisica', 'Extra');
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('19', '01004', 'Dibujo y Pintura', 'Extra');
INSERT INTO `sistemaescolar`.`materia` (`idMateria`, `codigo`, `nombre`, `area`) VALUES ('20', '01005', 'Manualidades', 'Extra');

/* GRADO - MATERIA */

INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('1', '1');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('1', '2');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('1', '3');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('1', '4');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('1', '5');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('1', '6');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('1', '7');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('1', '11');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('1', '12');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('1', '16');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('1', '17');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('1', '18');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('1', '19');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('1', '20');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('2', '3');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('2', '4');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('2', '7');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('2', '9');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('2', '12');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('2', '13');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('2', '16');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('2', '17');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('2', '18');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('2', '19');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('2', '20');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('3', '16');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('3', '17');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('3', '18');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('3', '19');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('3', '20');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('4', '16');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('4', '17');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('4', '18');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('4', '19');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('4', '20');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('5', '16');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('5', '17');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('5', '18');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('5', '19');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('5', '20');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('6', '16');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('6', '17');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('6', '18');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('6', '19');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('6', '20');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('7', '16');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('7', '17');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('7', '18');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('7', '19');
INSERT INTO `sistemaescolar`.`grado_materia` (`idGrado`, `idMateria`) VALUES ('7', '20');

/* AÑO LECTIVO */

INSERT INTO `sistemaescolar`.`aniolectivo` (`idAnioLectivo`, `fechaInicio`, `fechaFin`) VALUES ('1', '2017-09-01', '2018-07-01');

/* PERSONAS */

# Administrador
INSERT INTO `sistemaescolar`.`administrador` (`idAdministrador`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`) VALUES ('1', 'Dominic Alejandro', 'Cueva Lopez', '1000000001', '1000000001', 'dc@mail.com', '1000000001', '1000000001');
INSERT INTO `sistemaescolar`.`administrador` (`idAdministrador`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`) VALUES ('2', 'Angel Alexander', 'Jaramillo Carrion', '1000000002', '1000000002', 'aj@mail.com', '1000000002', '1000000002');
INSERT INTO `sistemaescolar`.`administrador` (`idAdministrador`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`) VALUES ('3', 'Daniel Jose', 'Santiago Zumba', '1000000003', '1000000003', 'ds@mail.com', '1000000003', '1000000003');
INSERT INTO `sistemaescolar`.`administrador` (`idAdministrador`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`) VALUES ('4', 'Gerardo Javier', 'Ortega Chamba', '1000000004', '1000000004', 'go@mail.com', '1000000004', '1000000004');
INSERT INTO `sistemaescolar`.`administrador` (`idAdministrador`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`) VALUES ('5', 'Damian Geovanny', 'Mendieta Silva', '1000000005', '1000000005', 'dm@mail.com', '1000000005', '1000000005');
# Secretarias
INSERT INTO `sistemaescolar`.`secretaria` (`idSecretaria`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`, `extension`) VALUES ('1', 'Karina Alejandra', 'Herrera Montenegro', '2000000001', '2000000001', 'kh@mail.com', '2000000001', '2000000001', '2000000001');
INSERT INTO `sistemaescolar`.`secretaria` (`idSecretaria`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`, `extension`) VALUES ('2', 'Sofia Carolina', 'Lopez Ortega', '2000000002', '2000000002', 'sl@mail.com', '2000000002', '2000000002', '2000000002');
INSERT INTO `sistemaescolar`.`secretaria` (`idSecretaria`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`, `extension`) VALUES ('3', 'Alejandra Sofia', 'Ortega Garcia', '2000000003', '2000000003', 'ao@mail.com', '2000000003', '2000000003', '2000000003');
INSERT INTO `sistemaescolar`.`secretaria` (`idSecretaria`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`, `extension`) VALUES ('4', 'Soraya Emilia', 'Herrera Montero', '2000000004', '2000000004', 'sh@mail.com', '2000000004', '2000000004', '2000000004');
INSERT INTO `sistemaescolar`.`secretaria` (`idSecretaria`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`, `extension`) VALUES ('5', 'Maria Camila', 'Lojano Romero', '2000000005', '2000000005', 'ml@mail.com', '2000000005', '2000000005', '2000000005');
# Docentes
INSERT INTO `sistemaescolar`.`docente` (`idDocente`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`, `titulo`) VALUES ('1', 'Maria Domenica', 'Armijos Soto', '3000000001', '3000000001', 'ma@mail.com', '3000000001', '3000000001', 'Lic. CCNN');
INSERT INTO `sistemaescolar`.`docente` (`idDocente`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`, `titulo`) VALUES ('2', 'Pedro Angel', 'Salas Ponce', '3000000002', '3000000002', 'ps@mail.com', '3000000002', '3000000002', 'Lic. CCSS');
INSERT INTO `sistemaescolar`.`docente` (`idDocente`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`, `titulo`) VALUES ('3', 'Angel Santiago', 'Pacheco Montiel', '3000000003', '3000000003', 'ap@mail.com', '3000000003', '3000000003', 'Lic. Matematica');
INSERT INTO `sistemaescolar`.`docente` (`idDocente`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`, `titulo`) VALUES ('4', 'Juan Sebastian', 'Campoverde Salinas', '3000000004', '3000000004', 'jc@mail.com', '3000000004', '3000000004', 'Ing. Administracion Empresarial');
INSERT INTO `sistemaescolar`.`docente` (`idDocente`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`, `titulo`) VALUES ('5', 'Klever Isac', 'Mendieta Torres', '3000000005', '3000000005', 'km@mail.com', '3000000005', '3000000005', 'Licenciado. Educacion Fisica');
INSERT INTO `sistemaescolar`.`docente` (`idDocente`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`, `titulo`) VALUES ('6', 'Adrian Jose', 'Sandoval Martines', '3000000006', '3000000006', 'as@mail.com', '3000000006', '3000000006', 'Ing. Sistemas y Computacion');
INSERT INTO `sistemaescolar`.`docente` (`idDocente`, `nombres`, `apellidos`, `cedula`, `telefono`, `mail`, `usuario`, `contrasena`, `titulo`) VALUES ('7', 'Andres Damian', 'Espinoza Carrion', '3000000007', '3000000007', 'ae@mail.com', '3000000007', '3000000007', 'Lic. Educacion Artistica');

/* HORARIO */

INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('1', '07:10', '07:50', 'Lunes', '1', '1', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('2', '07:50', '08:30', 'Lunes', '1', '1', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('3', '08:30', '09:10', 'Lunes', '1', '2', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('4', '09:10', '09:50', 'Lunes', '1', '2', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('5', '09:50', '10:30', 'Lunes', '7', '16', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('6', '11:00', '11:40', 'Lunes', '1', '3', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('7', '11:40', '12:20', 'Lunes', '1', '3', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('8', '12:20', '13:00', 'Lunes', '5', '18', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('9', '07:10', '07:50', 'Martes', '1', '2', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('10', '07:50', '08:30', 'Martes', '1', '2', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('11', '08:30', '09:10', 'Martes', '1', '1', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('12', '09:10', '09:50', 'Martes', '1', '1', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('13', '09:50', '10:30', 'Martes', '5', '18', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('14', '11:00', '11:40', 'Martes', '1', '4', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('15', '11:40', '12:20', 'Martes', '1', '4', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('16', '12:20', '13:00', 'Martes', '7', '16', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('17', '07:10', '07:50', 'Miercoles', '1', '5', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('18', '07:50', '08:30', 'Miercoles', '1', '5', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('19', '08:30', '09:10', 'Miercoles', '1', '4', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('20', '09:10', '09:50', 'Miercoles', '1', '4', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('21', '09:50', '10:30', 'Miercoles', '7', '19', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('22', '11:00', '11:40', 'Miercoles', '2', '6', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('23', '11:40', '12:20', 'Miercoles', '2', '6', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('24', '12:20', '13:00', 'Miercoles', '7', '20', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('25', '07:10', '07:50', 'Jueves', '1', '4', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('26', '07:50', '08:30', 'Jueves', '1', '4', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('27', '08:30', '09:10', 'Jueves', '1', '5', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('28', '09:10', '09:50', 'Jueves', '1', '5', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('29', '09:50', '10:30', 'Jueves', '7', '20', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('30', '11:00', '11:40', 'Jueves', '1', '3', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('31', '11:40', '12:20', 'Jueves', '1', '3', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('32', '12:20', '13:00', 'Jueves', '7', '19', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('33', '07:10', '07:50', 'Viernes', '2', '7', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('34', '07:50', '08:30', 'Viernes', '2', '7', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('35', '08:30', '09:10', 'Viernes', '3', '11', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('36', '09:10', '09:50', 'Viernes', '6', '17', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('37', '09:50', '10:30', 'Viernes', '3', '12', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('38', '11:00', '11:40', 'Viernes', '5', '18', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('39', '11:40', '12:20', 'Viernes', '5', '18', '1', '1', '1');
INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('40', '12:20', '13:00', 'Viernes', '7', '19', '1', '1', '1');

INSERT INTO `sistemaescolar`.`horario` (`idHorario`, `horaInicio`, `horaFin`, `dia`, `horario_idDocente`, `horario_idMateria`, `horario_idAnioLectivo`, `horario_idGrado`, `horario_idParalelo`) VALUES ('41', '07:10', '07:50', 'Lunes', '2', '7', '1', '2', '1');
