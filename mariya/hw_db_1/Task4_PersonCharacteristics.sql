-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema citizen_registrations
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema citizen_registrations
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `citizen_registrations` DEFAULT CHARACTER SET latin1 ;
USE `citizen_registrations` ;

-- -----------------------------------------------------
-- Table `citizen_registrations`.`addresses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `citizen_registrations`.`addresses` (
  `addresses_id` INT(11) NOT NULL AUTO_INCREMENT,
  `country` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `municipality` VARCHAR(45) NOT NULL,
  `postal_code` VARCHAR(45) NOT NULL,
  `street` VARCHAR(45) NOT NULL,
  `number` VARCHAR(45) NOT NULL,
  `floor` INT(11) NULL DEFAULT NULL,
  `apartmentNo` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`addresses_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `citizen_registrations`.`education_types`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `citizen_registrations`.`education_types` (
  `education_types_id` INT(11) NOT NULL AUTO_INCREMENT,
  `education_types_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`education_types_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `citizen_registrations`.`educations`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `citizen_registrations`.`educations` (
  `educations_id` INT(11) NOT NULL AUTO_INCREMENT,
  `type_id` INT(11) NOT NULL,
  `institution_name` VARCHAR(45) NOT NULL,
  `enrollment_date` DATE NOT NULL,
  `graduation_date` DATE NULL DEFAULT NULL,
  `graduated` BIT(6) NOT NULL,
  `final_grade` DECIMAL(3,2) NULL DEFAULT NULL,
  PRIMARY KEY (`educations_id`),
  INDEX `fk_type_id_idx` (`type_id` ASC),
  CONSTRAINT `fk_type_id`
    FOREIGN KEY (`type_id`)
    REFERENCES `citizen_registrations`.`education_types` (`education_types_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `citizen_registrations`.`genders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `citizen_registrations`.`genders` (
  `genders_id` INT(11) NOT NULL AUTO_INCREMENT,
  `genders_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`genders_id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `citizen_registrations`.`people`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `citizen_registrations`.`people` (
  `people_id` INT(11) NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `middle_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `gender_id` INT(11) NOT NULL,
  `height` SMALLINT(250) NULL DEFAULT NULL,
  `birth_date` DATE NOT NULL,
  `current_address` INT(11) NOT NULL,
  PRIMARY KEY (`people_id`),
  INDEX `fk_gender_id_idx` (`gender_id` ASC),
  INDEX `fk_current_address_idx` (`current_address` ASC),
  CONSTRAINT `fk_current_address`
    FOREIGN KEY (`current_address`)
    REFERENCES `citizen_registrations`.`addresses` (`addresses_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_gender_id`
    FOREIGN KEY (`gender_id`)
    REFERENCES `citizen_registrations`.`genders` (`genders_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `citizen_registrations`.`people_addresses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `citizen_registrations`.`people_addresses` (
  `person_id` INT(11) NOT NULL,
  `address_id` INT(11) NOT NULL,
  INDEX `fk_person_id_idx` (`person_id` ASC),
  INDEX `fk_address_id_idx` (`address_id` ASC),
  CONSTRAINT `fk_address_id`
    FOREIGN KEY (`address_id`)
    REFERENCES `citizen_registrations`.`addresses` (`addresses_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_person_id`
    FOREIGN KEY (`person_id`)
    REFERENCES `citizen_registrations`.`people` (`people_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `citizen_registrations`.`people_educations`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `citizen_registrations`.`people_educations` (
  `ed_person_id` INT(11) NOT NULL,
  `ed_education_id` INT(11) NOT NULL,
  INDEX `fk_ed_person_id_idx` (`ed_person_id` ASC),
  INDEX `fk_ed_education_id_idx` (`ed_education_id` ASC),
  CONSTRAINT `fk_ed_education_id`
    FOREIGN KEY (`ed_education_id`)
    REFERENCES `citizen_registrations`.`educations` (`educations_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ed_person_id`
    FOREIGN KEY (`ed_person_id`)
    REFERENCES `citizen_registrations`.`people` (`people_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
