-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema hhh(db)
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema hhh(db)
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hhh(db)` DEFAULT CHARACTER SET utf8 ;
USE `hhh(db)` ;

-- -----------------------------------------------------
-- Table `hhh(db)`.`gender`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hhh(db)`.`gender` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `gender` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hhh(db)`.`permission`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hhh(db)`.`permission` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `permission` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hhh(db)`.`profile`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hhh(db)`.`profile` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(15) NULL DEFAULT NULL,
  `gender_id` INT(10) UNSIGNED NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `permission_id` INT(10) UNSIGNED NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC),
  INDEX `gender_idx` (`gender_id` ASC),
  INDEX `permission_idx` (`permission_id` ASC),
  CONSTRAINT `gender`
    FOREIGN KEY (`gender_id`)
    REFERENCES `hhh(db)`.`gender` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `permission`
    FOREIGN KEY (`permission_id`)
    REFERENCES `hhh(db)`.`permission` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
AUTO_INCREMENT = 6
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hhh(db)`.`action_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hhh(db)`.`action_type` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `type` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 5
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hhh(db)`.`advert_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hhh(db)`.`advert_type` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hhh(db)`.`point`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hhh(db)`.`point` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hhh(db)`.`way_point`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hhh(db)`.`way_point` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `prev_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `point_id` INT(10) UNSIGNED NOT NULL,
  `next_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `point_idx` (`point_id` ASC),
  INDEX `prev_idx` (`prev_id` ASC),
  INDEX `next_idx` (`next_id` ASC),
  CONSTRAINT `next`
    FOREIGN KEY (`next_id`)
    REFERENCES `hhh(db)`.`way_point` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `point`
    FOREIGN KEY (`point_id`)
    REFERENCES `hhh(db)`.`point` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `prev`
    FOREIGN KEY (`prev_id`)
    REFERENCES `hhh(db)`.`way_point` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hhh(db)`.`advert`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hhh(db)`.`advert` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `advert_type_id` INT(10) UNSIGNED NOT NULL,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `description` VARCHAR(45) NULL DEFAULT NULL,
  `created` TIMESTAMP NULL DEFAULT NULL,
  `end` TIMESTAMP NULL DEFAULT NULL,
  `seat_number` INT(10) UNSIGNED NULL DEFAULT NULL,
  `start_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `type_idx` (`advert_type_id` ASC),
  INDEX `start_idx` (`start_id` ASC),
  CONSTRAINT `advert_type`
    FOREIGN KEY (`advert_type_id`)
    REFERENCES `hhh(db)`.`advert_type` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `start`
    FOREIGN KEY (`start_id`)
    REFERENCES `hhh(db)`.`way_point` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hhh(db)`.`action`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hhh(db)`.`action` (
  `id` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `action_type_id` INT(10) UNSIGNED NOT NULL,
  `date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  `author_id` INT(10) UNSIGNED NOT NULL,
  `actor_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `advert_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`id`),
  INDEX `author_idx` (`author_id` ASC),
  INDEX `actor_idx` (`actor_id` ASC),
  INDEX `type_idx` (`action_type_id` ASC),
  INDEX `advert_idx` (`advert_id` ASC),
  CONSTRAINT `action_author`
    FOREIGN KEY (`author_id`)
    REFERENCES `hhh(db)`.`profile` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `action_type`
    FOREIGN KEY (`action_type_id`)
    REFERENCES `hhh(db)`.`action_type` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `actor`
    FOREIGN KEY (`actor_id`)
    REFERENCES `hhh(db)`.`profile` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `advert`
    FOREIGN KEY (`advert_id`)
    REFERENCES `hhh(db)`.`advert` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `hhh(db)`.`recall`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hhh(db)`.`recall` (
  `mark` FLOAT NOT NULL,
  `description` VARCHAR(45) NOT NULL,
  `date` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  `author_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  `context_id` INT(10) UNSIGNED NULL DEFAULT NULL,
  INDEX `author_idx` (`author_id` ASC),
  INDEX `context_idx` (`context_id` ASC),
  CONSTRAINT `context`
    FOREIGN KEY (`context_id`)
    REFERENCES `hhh(db)`.`action` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `recall_author`
    FOREIGN KEY (`author_id`)
    REFERENCES `hhh(db)`.`profile` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
