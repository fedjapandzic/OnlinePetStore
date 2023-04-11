-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema online_pet_shop
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema online_pet_shop
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `online_pet_shop` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `online_pet_shop` ;

-- -----------------------------------------------------
-- Table `online_pet_shop`.`customers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `online_pet_shop`.`customers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `phone_number` INT NOT NULL,
  `address` VARCHAR(256) NOT NULL,
  `cart_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `cart_customer_id_idx` (`cart_id` ASC) VISIBLE,
  CONSTRAINT `cart_customer_id`
    FOREIGN KEY (`cart_id`)
    REFERENCES `online_pet_shop`.`cart` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `online_pet_shop`.`cart`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `online_pet_shop`.`cart` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `is_empty` TINYINT NOT NULL,
  `customer_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `customer_cart_id_idx` (`customer_id` ASC) VISIBLE,
  CONSTRAINT `customer_cart_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `online_pet_shop`.`customers` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `online_pet_shop`.`categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `online_pet_shop`.`categories` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `online_pet_shop`.`orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `online_pet_shop`.`orders` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `order_date` DATETIME NOT NULL,
  `order_status` TINYINT NOT NULL,
  `customer_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `customer_id_idx` (`customer_id` ASC) VISIBLE,
  CONSTRAINT `customer_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `online_pet_shop`.`customers` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `online_pet_shop`.`products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `online_pet_shop`.`products` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `desc` VARCHAR(256) NULL DEFAULT NULL,
  `price` INT NOT NULL,
  `category_id` INT NOT NULL,
  `cart_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `category_id_idx` (`category_id` ASC) VISIBLE,
  INDEX `cart_id_idx` (`cart_id` ASC) VISIBLE,
  CONSTRAINT `cart_id`
    FOREIGN KEY (`cart_id`)
    REFERENCES `online_pet_shop`.`cart` (`id`),
  CONSTRAINT `category_id`
    FOREIGN KEY (`category_id`)
    REFERENCES `online_pet_shop`.`categories` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `online_pet_shop`.`order_products`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `online_pet_shop`.`order_products` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `order_id` INT NOT NULL,
  `product_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `product_id_idx` (`product_id` ASC) VISIBLE,
  INDEX `order_id_idx` (`order_id` ASC) VISIBLE,
  CONSTRAINT `order_id`
    FOREIGN KEY (`order_id`)
    REFERENCES `online_pet_shop`.`orders` (`id`),
  CONSTRAINT `product_id`
    FOREIGN KEY (`product_id`)
    REFERENCES `online_pet_shop`.`products` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `online_pet_shop`.`reviews`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `online_pet_shop`.`reviews` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `text` VARCHAR(512) NOT NULL,
  `rating` INT NOT NULL,
  `customer_id` INT NOT NULL,
  `product_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `customer_reviews_id_idx` (`customer_id` ASC) VISIBLE,
  INDEX `product_reviews_id_idx` (`product_id` ASC) VISIBLE,
  CONSTRAINT `customer_reviews_id`
    FOREIGN KEY (`customer_id`)
    REFERENCES `online_pet_shop`.`customers` (`id`),
  CONSTRAINT `product_reviews_id`
    FOREIGN KEY (`product_id`)
    REFERENCES `online_pet_shop`.`products` (`id`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
