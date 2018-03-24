-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema School
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema School
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `School` DEFAULT CHARACTER SET utf8 ;
USE `School` ;

-- -----------------------------------------------------
-- Table `School`.`addresses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `School`.`addresses` (
  `addresses_id` INT NOT NULL AUTO_INCREMENT,
  `country` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `street` VARCHAR(45) NOT NULL,
  `number` INT NOT NULL,
  `floor` INT NOT NULL,
  `apartment_no` INT NOT NULL,
  PRIMARY KEY (`addresses_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `School`.`teachers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `School`.`teachers` (
  `teachers_id` INT NOT NULL AUTO_INCREMENT,
  `teachers_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) CHARACTER SET 'ucs2' COLLATE 'ucs2_general_ci' NOT NULL,
  `salary` INT NOT NULL,
  `teacher_address_id` INT NULL,
  PRIMARY KEY (`teachers_id`),
  INDEX `fk_te_address_id_idx` (`teacher_address_id` ASC),
  CONSTRAINT `fk_te_address_id`
    FOREIGN KEY (`teacher_address_id`)
    REFERENCES `School`.`addresses` (`addresses_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `School`.`students`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `School`.`students` (
  `students_id` INT NOT NULL AUTO_INCREMENT,
  `students_name` VARCHAR(45) NOT NULL,
  `students_enrollment_date` DATE NOT NULL,
  `student_address_id` INT NULL,
  PRIMARY KEY (`students_id`),
  INDEX `fk_st_address_id_idx` (`student_address_id` ASC),
  CONSTRAINT `fk_st_address_id`
    FOREIGN KEY (`student_address_id`)
    REFERENCES `School`.`addresses` (`addresses_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `School`.`disciplines`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `School`.`disciplines` (
  `disciplines_id` INT NOT NULL AUTO_INCREMENT,
  `disciplines_name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`disciplines_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `School`.`disciplines_studied`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `School`.`disciplines_studied` (
  `discipline_st_id` INT NULL,
  `student_st_id` INT NULL,
  INDEX `fk_discipline_id_idx` (`discipline_st_id` ASC),
  INDEX `fk_student_id_idx` (`student_st_id` ASC),
  CONSTRAINT `fk_st_discipline_id`
    FOREIGN KEY (`discipline_st_id`)
    REFERENCES `School`.`disciplines` (`disciplines_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_student_id`
    FOREIGN KEY (`student_st_id`)
    REFERENCES `School`.`students` (`students_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `School`.`disciplines_taught`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `School`.`disciplines_taught` (
  `discipline_ta_id` INT NULL,
  `teacher_ta_id` INT NULL,
  INDEX `fk_disciplines_id_idx` (`discipline_ta_id` ASC),
  INDEX `fk_teachers_id_idx` (`teacher_ta_id` ASC),
  CONSTRAINT `fk_te_disciplines_id`
    FOREIGN KEY (`discipline_ta_id`)
    REFERENCES `School`.`disciplines` (`disciplines_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_teachers_id`
    FOREIGN KEY (`teacher_ta_id`)
    REFERENCES `School`.`teachers` (`teachers_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `School`.`teachers`
-- -----------------------------------------------------
START TRANSACTION;
USE `School`;
INSERT INTO `School`.`teachers` (`teachers_id`, `teachers_name`, `email`, `salary`) VALUES (29, 'Peter Ivanov', 'pivanov@gmail.com', 10);
INSERT INTO `School`.`teachers` (`teachers_id`, `teachers_name`, `email`, `salary`) VALUES (30, 'Georgi Stoimenov', 'stoimenov@gmail.com', 20);
INSERT INTO `School`.`teachers` (`teachers_id`, `teachers_name`, `email`, `salary`) VALUES (31, 'Nataliya Yordanova', 'nyyoo@abv.bg', 30);
INSERT INTO `School`.`teachers` (`teachers_id`, `teachers_name`, `email`, `salary`) VALUES (32, 'Simeon Prodanov', 'sprod@yahoo.com', 40);

COMMIT;


-- -----------------------------------------------------
-- Data for table `School`.`students`
-- -----------------------------------------------------
START TRANSACTION;
USE `School`;
INSERT INTO `School`.`students` (`students_id`, `students_name`, `students_enrollment_date`, `student_address_id`) VALUES (25, 'Georgi Georgiev', '2000-10-22', NULL);
INSERT INTO `School`.`students` (`students_id`, `students_name`, `students_enrollment_date`, `student_address_id`) VALUES (26, 'Stoyan Ivanov', '2010-11-18', NULL);
INSERT INTO `School`.`students` (`students_id`, `students_name`, `students_enrollment_date`, `student_address_id`) VALUES (27, 'Mariya Grozdanova', '2008-05-27', NULL);
INSERT INTO `School`.`students` (`students_id`, `students_name`, `students_enrollment_date`, `student_address_id`) VALUES (28, 'Stefaniya Petkova', '2007-01-12', NULL);

COMMIT;


-- -----------------------------------------------------
-- Data for table `School`.`disciplines`
-- -----------------------------------------------------
START TRANSACTION;
USE `School`;
INSERT INTO `School`.`disciplines` (`disciplines_id`, `disciplines_name`) VALUES (21, 'Mathematics');
INSERT INTO `School`.`disciplines` (`disciplines_id`, `disciplines_name`) VALUES (22, 'Geography');
INSERT INTO `School`.`disciplines` (`disciplines_id`, `disciplines_name`) VALUES (23, 'Physics');
INSERT INTO `School`.`disciplines` (`disciplines_id`, `disciplines_name`) VALUES (24, 'Informatics');

COMMIT;

