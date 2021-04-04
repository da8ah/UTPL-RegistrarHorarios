-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema SistemaEscolar
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema SistemaEscolar
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `SistemaEscolar` DEFAULT CHARACTER SET utf8 ;
SHOW WARNINGS;
USE `SistemaEscolar` ;

-- -----------------------------------------------------
-- Table `SistemaEscolar`.`aniolectivo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaEscolar`.`aniolectivo` (
  `idAnioLectivo` INT(1) ZEROFILL UNSIGNED NOT NULL AUTO_INCREMENT,
  `fechaInicio` DATE NOT NULL,
  `fechaFin` DATE NOT NULL,
  PRIMARY KEY (`idAnioLectivo`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `SistemaEscolar`.`grado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaEscolar`.`grado` (
  `idGrado` INT(1) ZEROFILL UNSIGNED NOT NULL AUTO_INCREMENT,
  `sufijo` VARCHAR(2) NOT NULL,
  PRIMARY KEY (`idGrado`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `SistemaEscolar`.`docente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaEscolar`.`docente` (
  `idDocente` INT(3) ZEROFILL UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombres` VARCHAR(45) CHARACTER SET 'utf8' NOT NULL,
  `apellidos` VARCHAR(45) CHARACTER SET 'utf8' NOT NULL,
  `cedula` VARCHAR(10) CHARACTER SET 'utf8' NOT NULL,
  `telefono` VARCHAR(10) NOT NULL,
  `mail` VARCHAR(45) NULL,
  `usuario` VARCHAR(20) NOT NULL,
  `contrasena` VARCHAR(20) NOT NULL,
  `titulo` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idDocente`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;

SHOW WARNINGS;
CREATE UNIQUE INDEX `cedula_UNIQUE` ON `SistemaEscolar`.`docente` (`cedula` ASC);

SHOW WARNINGS;
CREATE UNIQUE INDEX `usuario_UNIQUE` ON `SistemaEscolar`.`docente` (`usuario` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `SistemaEscolar`.`materia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaEscolar`.`materia` (
  `idMateria` INT(3) ZEROFILL UNSIGNED NOT NULL AUTO_INCREMENT,
  `codigo` INT(5) ZEROFILL UNSIGNED NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `area` VARCHAR(45) NULL,
  PRIMARY KEY (`idMateria`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;

SHOW WARNINGS;
CREATE UNIQUE INDEX `codigo_UNIQUE` ON `SistemaEscolar`.`materia` (`codigo` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `SistemaEscolar`.`paralelo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaEscolar`.`paralelo` (
  `idParalelo` INT(2) UNSIGNED ZEROFILL NOT NULL AUTO_INCREMENT,
  `paralelo_idGrado` INT(1) ZEROFILL UNSIGNED NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `numEstudiantes` INT(2) UNSIGNED NOT NULL,
  `ubicacion` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`idParalelo`, `paralelo_idGrado`),
  CONSTRAINT `fk_paralelo_grado`
    FOREIGN KEY (`paralelo_idGrado`)
    REFERENCES `SistemaEscolar`.`grado` (`idGrado`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;

SHOW WARNINGS;
CREATE INDEX `fk_paralelo_grado_idx` ON `SistemaEscolar`.`paralelo` (`paralelo_idGrado` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `SistemaEscolar`.`horario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaEscolar`.`horario` (
  `idHorario` INT(5) ZEROFILL UNSIGNED NOT NULL,
  `horaInicio` TIME(2) NOT NULL,
  `horaFin` TIME(2) NOT NULL,
  `dia` VARCHAR(10) NOT NULL,
  `horario_idDocente` INT(3) ZEROFILL UNSIGNED NOT NULL,
  `horario_idMateria` INT(3) ZEROFILL UNSIGNED NOT NULL,
  `horario_idAnioLectivo` INT(1) ZEROFILL UNSIGNED NOT NULL,
  `horario_idGrado` INT(1) ZEROFILL UNSIGNED NOT NULL,
  `horario_idParalelo` INT(2) UNSIGNED ZEROFILL NOT NULL,
  PRIMARY KEY (`horario_idParalelo`, `horario_idGrado`, `horario_idAnioLectivo`, `horaInicio`, `horaFin`, `dia`),
  CONSTRAINT `fk_horario_docente`
    FOREIGN KEY (`horario_idDocente`)
    REFERENCES `SistemaEscolar`.`docente` (`idDocente`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_horario_materia`
    FOREIGN KEY (`horario_idMateria`)
    REFERENCES `SistemaEscolar`.`materia` (`idMateria`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_horario_aniolectivo`
    FOREIGN KEY (`horario_idAnioLectivo`)
    REFERENCES `SistemaEscolar`.`aniolectivo` (`idAnioLectivo`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_horario_gradoParalelo`
    FOREIGN KEY (`horario_idParalelo` , `horario_idGrado`)
    REFERENCES `SistemaEscolar`.`paralelo` (`idParalelo` , `paralelo_idGrado`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;

SHOW WARNINGS;
CREATE INDEX `fk_horario_docente_idx` ON `SistemaEscolar`.`horario` (`horario_idDocente` ASC);

SHOW WARNINGS;
CREATE INDEX `fk_horario_materia_idx` ON `SistemaEscolar`.`horario` (`horario_idMateria` ASC);

SHOW WARNINGS;
CREATE INDEX `fk_horario_aniolectivo_idx` ON `SistemaEscolar`.`horario` (`horario_idAnioLectivo` ASC);

SHOW WARNINGS;
CREATE INDEX `fk_horario_paralelo_idx` ON `SistemaEscolar`.`horario` (`horario_idParalelo` ASC, `horario_idGrado` ASC);

SHOW WARNINGS;
CREATE UNIQUE INDEX `idHorario_UNIQUE` ON `SistemaEscolar`.`horario` (`idHorario` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `SistemaEscolar`.`secretaria`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaEscolar`.`secretaria` (
  `idSecretaria` INT(1) ZEROFILL UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombres` VARCHAR(45) CHARACTER SET 'utf8' NOT NULL,
  `apellidos` VARCHAR(45) CHARACTER SET 'utf8' NOT NULL,
  `cedula` VARCHAR(10) CHARACTER SET 'utf8' NOT NULL,
  `telefono` VARCHAR(10) NOT NULL,
  `mail` VARCHAR(45) NULL,
  `usuario` VARCHAR(20) NOT NULL,
  `contrasena` VARCHAR(20) NOT NULL,
  `extension` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idSecretaria`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;

SHOW WARNINGS;
CREATE UNIQUE INDEX `cedula_UNIQUE` ON `SistemaEscolar`.`secretaria` (`cedula` ASC);

SHOW WARNINGS;
CREATE UNIQUE INDEX `usuario_UNIQUE` ON `SistemaEscolar`.`secretaria` (`usuario` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `SistemaEscolar`.`administrador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaEscolar`.`administrador` (
  `idAdministrador` INT(1) ZEROFILL UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombres` VARCHAR(45) CHARACTER SET 'utf8' NOT NULL,
  `apellidos` VARCHAR(45) CHARACTER SET 'utf8' NOT NULL,
  `cedula` VARCHAR(10) CHARACTER SET 'utf8' NOT NULL,
  `telefono` VARCHAR(10) NOT NULL,
  `mail` VARCHAR(45) NOT NULL,
  `usuario` VARCHAR(20) NOT NULL,
  `contrasena` VARCHAR(20) NOT NULL,
  PRIMARY KEY (`idAdministrador`))
ENGINE = InnoDB
AUTO_INCREMENT = 1
DEFAULT CHARACTER SET = utf8;

SHOW WARNINGS;
CREATE UNIQUE INDEX `cedula_UNIQUE` ON `SistemaEscolar`.`administrador` (`cedula` ASC);

SHOW WARNINGS;
CREATE UNIQUE INDEX `usuario_UNIQUE` ON `SistemaEscolar`.`administrador` (`usuario` ASC);

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `SistemaEscolar`.`grado_materia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `SistemaEscolar`.`grado_materia` (
  `idGrado` INT(1) ZEROFILL UNSIGNED NOT NULL,
  `idMateria` INT(3) ZEROFILL UNSIGNED NOT NULL,
  PRIMARY KEY (`idGrado`, `idMateria`),
  CONSTRAINT `fk_gradomateria_grado`
    FOREIGN KEY (`idGrado`)
    REFERENCES `SistemaEscolar`.`grado` (`idGrado`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_gradomateria_materia`
    FOREIGN KEY (`idMateria`)
    REFERENCES `SistemaEscolar`.`materia` (`idMateria`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

SHOW WARNINGS;
CREATE INDEX `fk_gradomateria_materia_idx` ON `SistemaEscolar`.`grado_materia` (`idMateria` ASC);

SHOW WARNINGS;
CREATE INDEX `fk_gradomateria_grado_idx` ON `SistemaEscolar`.`grado_materia` (`idGrado` ASC);

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
