-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema addressdb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema addressdb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `addressdb` DEFAULT CHARACTER SET latin1 ;
USE `addressdb` ;

-- -----------------------------------------------------
-- Table `addressdb`.`addresses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `addressdb`.`addresses` (
  `addresses_id` INT(11) NOT NULL AUTO_INCREMENT,
  `street_id` INT(11) NULL DEFAULT NULL,
  `number` INT(11) NOT NULL,
  `apartmentNo` INT(11) NOT NULL,
  PRIMARY KEY (`addresses_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `addressdb`.`countries`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `addressdb`.`countries` (
  `countries_id` INT(11) NOT NULL AUTO_INCREMENT,
  `countries_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`countries_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `addressdb`.`municipalities`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `addressdb`.`municipalities` (
  `municipalities_id` INT(11) NOT NULL AUTO_INCREMENT,
  `municipalities_name` VARCHAR(45) NOT NULL,
  `postal_code` INT(11) NOT NULL,
  `populated_area_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`municipalities_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `addressdb`.`populated_area_types`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `addressdb`.`populated_area_types` (
  `populated_area_types_id` INT(11) NOT NULL AUTO_INCREMENT,
  `populated_area_types_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`populated_area_types_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `addressdb`.`populated_areas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `addressdb`.`populated_areas` (
  `populated_areas_id` INT(11) NOT NULL AUTO_INCREMENT,
  `populated_areas_name` VARCHAR(45) NOT NULL,
  `type_id` INT(11) NULL DEFAULT NULL,
  `region_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`populated_areas_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `addressdb`.`regions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `addressdb`.`regions` (
  `regions_id` INT(11) NOT NULL AUTO_INCREMENT,
  `regions_name` VARCHAR(45) NOT NULL,
  `country_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`regions_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `addressdb`.`streets`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `addressdb`.`streets` (
  `streets_id` INT(11) NOT NULL AUTO_INCREMENT,
  `streets_name` VARCHAR(45) NOT NULL,
  `municipality_id` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`streets_id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
