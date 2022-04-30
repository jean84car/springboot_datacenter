-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         8.0.27 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para datacenter
CREATE DATABASE IF NOT EXISTS `datacenter` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `datacenter`;

-- Volcando estructura para tabla datacenter.recargas
CREATE TABLE IF NOT EXISTS `recargas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) NOT NULL,
  `cantidad` int NOT NULL,
  `operador` varchar(40) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=latin1;

-- Volcando datos para la tabla datacenter.recargas: ~0 rows (aproximadamente)
DELETE FROM `recargas`;
/*!40000 ALTER TABLE `recargas` DISABLE KEYS */;
INSERT INTO `recargas` (`id`, `nombre`, `cantidad`, `operador`) VALUES
	(1, 'maria', 1000, 'tigo'),
	(2, 'maria', 1000, 'tigo'),
	(3, 'hermes', 5000, 'claro'),
	(4, 'ariana', 10000, 'tigo'),
	(5, 'angerly', 2000, 'movistar'),
	(6, 'jose', 20000, 'tigo'),
	(7, 'luis', 5000, 'tigo'),
	(8, 'p', 1000, 'tigo'),
	(9, 'hermes', 10, 'won'),
	(10, 'ana', 5000, 'claro'),
	(11, 'anita', 5000, 'claro'),
	(12, 'julian', 1000, 'tigo'),
	(13, 'hermes', 50000, 'tigo'),
	(14, 'jaime', 7000, 'tigo'),
	(15, 'julian', 20000, ''),
	(16, 'julian', 20000, 'claro'),
	(17, 'ariana', 15000, 'tigo'),
	(18, 'hermes', 500000, 'tigo'),
	(19, 'hermes', 5000, 'tigo'),
	(20, 'hermes', 10, 'claro'),
	(21, 'hermes', 10000, 'tigo'),
	(22, 'hermes', 10, 'tigo'),
	(23, 'hermes', 10, 'tigo'),
	(24, 'hermes', 10000, 'tigo'),
	(25, 'julian', 100, 'tigo'),
	(26, 'hermes', 1200, 'tigo'),
	(27, 'sd', 45000, 'tigo'),
	(28, 'sd', 45000, 'tigo'),
	(29, 'sd', 45000, 'tigo'),
	(30, 'sd', 45000, 'tigo'),
	(31, 'sd', 45000, 'tigo'),
	(32, 'sd', 45000, 'tigo'),
	(33, 'sd', 45000, 'tigo'),
	(34, 'sd', 45000, 'tigo'),
	(35, 'sd', 45000, 'tigo'),
	(36, 'sd', 45000, 'tigo'),
	(37, 'sd', 45000, 'tigo'),
	(38, 'sd', 45000, 'tigo'),
	(39, 'sd', 45000, 'tigo'),
	(40, 'sd', 45000, 'tigo'),
	(41, 'sd', 45000, 'tigo'),
	(42, 'hermes', 80000, 'tigo'),
	(43, 'hermes', 80000, 'tigo');
/*!40000 ALTER TABLE `recargas` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
