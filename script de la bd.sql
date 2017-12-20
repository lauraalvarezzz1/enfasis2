-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema taller_final
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema taller_final
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `taller_final` ;
USE `taller_final` ;

-- -----------------------------------------------------
-- Table `taller_final`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `taller_final`.`Cliente` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `nif` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `direccion` VARCHAR(45) NOT NULL,
  `ciudad` VARCHAR(45) NOT NULL,
  `telefono` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `taller_final`.`Coches`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `taller_final`.`Coches` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `matricula` VARCHAR(45) NOT NULL,
  `marca` VARCHAR(45) NOT NULL,
  `modelo` INT NOT NULL,
  `color` VARCHAR(45) NOT NULL,
  `precio` VARCHAR(45) NOT NULL,
  `Cliente_codigo` INT NOT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_Coches_Cliente1_idx` (`Cliente_codigo` ASC),
  CONSTRAINT `fk_Coches_Cliente1`
    FOREIGN KEY (`Cliente_codigo`)
    REFERENCES `taller_final`.`Cliente` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `taller_final`.`revision`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `taller_final`.`revision` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `cambio_filtro` TINYINT(1) NOT NULL,
  `cambio_aceite` TINYINT(1) NOT NULL,
  `cambio_frenos` TINYINT(1) NOT NULL,
  `revisioncol` VARCHAR(45) NOT NULL,
  `Coches_codigo` INT NOT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_revision_Coches1_idx` (`Coches_codigo` ASC),
  CONSTRAINT `fk_revision_Coches1`
    FOREIGN KEY (`Coches_codigo`)
    REFERENCES `taller_final`.`Coches` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
