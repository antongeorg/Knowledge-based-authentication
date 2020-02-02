-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: database
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `admin` (
  `name` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `number_code` int(11) NOT NULL,
  PRIMARY KEY (`number_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES ('anton','georgakopoulos','zekeris','zekeris23',1);
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `data_exetazomenou`
--

DROP TABLE IF EXISTS `data_exetazomenou`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `data_exetazomenou` (
  `number_id` int(11) NOT NULL AUTO_INCREMENT,
  `nunber_code` int(11) DEFAULT NULL,
  `data_date` date DEFAULT NULL,
  `code_exetastikou_kentrou` int(11) DEFAULT NULL,
  PRIMARY KEY (`number_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `data_exetazomenou`
--

LOCK TABLES `data_exetazomenou` WRITE;
/*!40000 ALTER TABLE `data_exetazomenou` DISABLE KEYS */;
INSERT INTO `data_exetazomenou` VALUES (1,12345,'2018-10-08',123456789),(2,23,'2018-10-09',32),(3,5555,'2018-10-09',1455),(4,1235,'2018-10-09',1455),(5,1414,'2018-10-09',131037),(6,515,'2018-10-13',46),(7,1235,'2018-10-14',5556),(8,7895,'2018-10-15',789),(9,51565,'2018-10-15',4699),(10,5,'2018-10-13',5);
/*!40000 ALTER TABLE `data_exetazomenou` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datalogin`
--

DROP TABLE IF EXISTS `datalogin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `datalogin` (
  `username` varchar(45) NOT NULL,
  `pass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datalogin`
--

LOCK TABLES `datalogin` WRITE;
/*!40000 ALTER TABLE `datalogin` DISABLE KEYS */;
INSERT INTO `datalogin` VALUES ('anton','anton07'),('as','as'),('v','v');
/*!40000 ALTER TABLE `datalogin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exetazomenos`
--

DROP TABLE IF EXISTS `exetazomenos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `exetazomenos` (
  `username` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `exetastiko_kentro` int(11) DEFAULT NULL,
  `exetasi` int(11) DEFAULT NULL,
  `egkrisi` int(11) DEFAULT NULL,
  `telika_apotelsmata` int(11) DEFAULT NULL,
  `sum` int(11) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exetazomenos`
--

LOCK TABLES `exetazomenos` WRITE;
/*!40000 ALTER TABLE `exetazomenos` DISABLE KEYS */;
INSERT INTO `exetazomenos` VALUES ('anton','georgakopoulos','anton','georgakopoulos',12,1,1,NULL,NULL);
/*!40000 ALTER TABLE `exetazomenos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kentro`
--

DROP TABLE IF EXISTS `kentro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `kentro` (
  `code_exetastikou_kentrou` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `odos` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`code_exetastikou_kentrou`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kentro`
--

LOCK TABLES `kentro` WRITE;
/*!40000 ALTER TABLE `kentro` DISABLE KEYS */;
INSERT INTO `kentro` VALUES (1,'tei','athinas'),(2,'asdaddf','pateraki 3b'),(4,'sasdf','asdsa'),(5,'asda','sadsad'),(11,'tei','pateraki'),(12,'panepistimio','pateraki 3b'),(122,'tei','athinas'),(555,'kala','pateraki 3b'),(1234,'asdasd','pare'),(5515,'kostas','pateraki'),(131037,'tei','leoforos athinon'),(878787,'tei','athina'),(12365656,'tei','athn');
/*!40000 ALTER TABLE `kentro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `master_ex_kentrou`
--

DROP TABLE IF EXISTS `master_ex_kentrou`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `master_ex_kentrou` (
  `name` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) DEFAULT NULL,
  `egkrisi` int(11) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `master_ex_kentrou`
--

LOCK TABLES `master_ex_kentrou` WRITE;
/*!40000 ALTER TABLE `master_ex_kentrou` DISABLE KEYS */;
INSERT INTO `master_ex_kentrou` VALUES ('anton','anton','anton','anton',1);
/*!40000 ALTER TABLE `master_ex_kentrou` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `themata`
--

DROP TABLE IF EXISTS `themata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `themata` (
  `number_code` int(11) NOT NULL,
  `erwtisi` varchar(3000) DEFAULT NULL,
  `choice1` varchar(3000) DEFAULT NULL,
  `choice2` varchar(3000) DEFAULT NULL,
  `choice3` varchar(3000) DEFAULT NULL,
  `choice4` varchar(3000) DEFAULT NULL,
  `correct` int(11) DEFAULT NULL,
  `counter` int(11) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `datetime` datetime DEFAULT NULL,
  `apotelesmata` int(11) DEFAULT NULL,
  PRIMARY KEY (`number_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `themata`
--

LOCK TABLES `themata` WRITE;
/*!40000 ALTER TABLE `themata` DISABLE KEYS */;
/*!40000 ALTER TABLE `themata` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-09-08 13:00:58
