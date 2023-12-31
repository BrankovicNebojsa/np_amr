/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 10.4.25-MariaDB : Database - np_automehanicarska_radnja
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`np_automehanicarska_radnja` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `np_automehanicarska_radnja`;

/*Table structure for table `automobil` */

DROP TABLE IF EXISTS `automobil`;

CREATE TABLE `automobil` (
  `registracioniBroj` varchar(20) NOT NULL,
  `godiste` int(11) NOT NULL,
  `brojMotora` varchar(40) NOT NULL,
  `brojSasije` varchar(40) NOT NULL,
  `boja` varchar(30) NOT NULL,
  `menjac` varchar(20) NOT NULL,
  `motorId` int(11) NOT NULL,
  `markaId` int(11) NOT NULL,
  `modelId` int(11) NOT NULL,
  `musterijaId` int(11) NOT NULL,
  PRIMARY KEY (`registracioniBroj`),
  KEY `marka_model_fk` (`markaId`,`modelId`),
  KEY `musterija_fk` (`musterijaId`),
  KEY `model_fk2` (`modelId`),
  KEY `motor_fk` (`motorId`),
  CONSTRAINT `marka_fk2` FOREIGN KEY (`markaId`) REFERENCES `marka` (`markaId`),
  CONSTRAINT `model_fk2` FOREIGN KEY (`modelId`) REFERENCES `model` (`modelId`),
  CONSTRAINT `motor_fk` FOREIGN KEY (`motorId`) REFERENCES `motor` (`motorId`),
  CONSTRAINT `musterija_fk` FOREIGN KEY (`musterijaId`) REFERENCES `musterija` (`musterijaId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `automobil` */

insert  into `automobil`(`registracioniBroj`,`godiste`,`brojMotora`,`brojSasije`,`boja`,`menjac`,`motorId`,`markaId`,`modelId`,`musterijaId`) values 
('BG1468OI',2007,'1fr1342f1','d31f41','PLAVA','RUCNI',1,51,274,28),
('NI3215NX',2012,'dfc9i8f2phf1p','fnui1ohf13','CRVENA','RUCNI',1,12,100,18);

/*Table structure for table `marka` */

DROP TABLE IF EXISTS `marka`;

CREATE TABLE `marka` (
  `markaId` int(11) NOT NULL AUTO_INCREMENT,
  `nazivMarke` varchar(30) NOT NULL,
  PRIMARY KEY (`markaId`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8mb4;

/*Data for the table `marka` */

insert  into `marka`(`markaId`,`nazivMarke`) values 
(1,'Alfa Romeo'),
(2,'Aston Martin'),
(3,'Audi'),
(4,'Bentley'),
(5,'BMW'),
(6,'Cadillac'),
(7,'Chevrolet'),
(8,'Citroen'),
(9,'Dacia'),
(10,'Dodge'),
(11,'Ferrari'),
(12,'Fiat'),
(13,'Ford'),
(14,'GMC'),
(15,'Honda'),
(16,'Hummer'),
(17,'Hyundai'),
(18,'Infinity'),
(19,'Jaguar'),
(20,'Jeep'),
(21,'Kia'),
(22,'Lamborghini'),
(23,'Land Rover'),
(24,'Lexus'),
(25,'Maserati'),
(26,'Mazda'),
(27,'Mercedes-Benz'),
(28,'Mini'),
(29,'Mitsubishi'),
(30,'Nissan'),
(31,'Opel'),
(32,'Peugeot'),
(33,'Pontiac'),
(34,'Porsche'),
(35,'Ram'),
(36,'Renault'),
(37,'Saab'),
(38,'Seat'),
(39,'Skoda'),
(40,'Smart'),
(41,'Subaru'),
(42,'Suzuki'),
(43,'Tesla'),
(44,'Toyota'),
(45,'Volvo'),
(46,'SsangYong'),
(47,'Lotus'),
(48,'Lincoln'),
(49,'Isuzu'),
(50,'Acura'),
(51,'Volkswagen');

/*Table structure for table `model` */

DROP TABLE IF EXISTS `model`;

CREATE TABLE `model` (
  `modelId` int(11) NOT NULL AUTO_INCREMENT,
  `markaId` int(11) NOT NULL,
  `nazivModela` varchar(30) NOT NULL,
  PRIMARY KEY (`modelId`,`markaId`),
  KEY `marka_fk` (`markaId`),
  CONSTRAINT `marka_fk` FOREIGN KEY (`markaId`) REFERENCES `marka` (`markaId`)
) ENGINE=InnoDB AUTO_INCREMENT=287 DEFAULT CHARSET=utf8mb4;

/*Data for the table `model` */

insert  into `model`(`modelId`,`markaId`,`nazivModela`) values 
(1,1,'Giulia'),
(2,1,'Stelvio'),
(3,1,'Giulietta'),
(4,1,'4C'),
(5,1,'Tonale'),
(6,1,'147'),
(7,1,'156'),
(8,1,'159'),
(9,1,'166'),
(10,1,'8c'),
(11,2,'Valhalla'),
(12,2,'DBX'),
(13,2,'Vantage'),
(14,2,'Speedster'),
(15,2,'DBS'),
(16,2,'DB11'),
(17,2,'Rapide'),
(18,2,'Vanquish'),
(19,2,'Vulcan'),
(20,2,'DB9'),
(21,3,'A1'),
(22,3,'A3'),
(23,3,'A4'),
(24,3,'A5'),
(25,3,'A6'),
(26,3,'A7'),
(27,3,'A8'),
(28,3,'Q3'),
(29,3,'Q5'),
(30,3,'Q7'),
(31,4,'Batur'),
(32,4,'Continental GT'),
(33,4,'Bentayga'),
(34,4,'Mulliner'),
(35,4,'Flying Spur'),
(36,4,'Mulsanne'),
(37,4,'Continental GTC'),
(38,4,'Azure'),
(39,4,'Brooklands'),
(40,4,'Arnage'),
(41,5,'1 serija'),
(42,5,'3 serija'),
(43,5,'5 serija'),
(44,5,'7 serija'),
(45,5,'X3'),
(46,5,'X5'),
(47,5,'X6'),
(48,5,'X4'),
(49,5,'4 serija'),
(50,5,'6 serija'),
(51,6,'Escalade'),
(52,6,'Lyriq'),
(53,6,'CT4'),
(54,6,'CT5'),
(55,6,'XT6'),
(56,6,'XT5'),
(57,6,'XT4'),
(58,6,'CT6'),
(59,6,'ATS'),
(60,6,'ELR'),
(61,7,'Blazer'),
(62,7,'Trax'),
(63,7,'Bolt'),
(64,7,'Corvette'),
(65,7,'Tahoe'),
(66,7,'Trailblazer'),
(67,7,'Suburban'),
(68,7,'Traverse'),
(69,7,'Camaro'),
(70,7,'Cruze'),
(71,8,'C3'),
(72,8,'C4'),
(73,8,'C5'),
(74,8,'AMI'),
(75,8,'Berlingo'),
(76,8,'C1'),
(77,8,'DS5'),
(78,8,'DS4'),
(79,8,'DS3'),
(80,8,'C2'),
(81,9,'Duster'),
(82,9,'Jogger'),
(83,9,'Logan'),
(84,9,'Sandero'),
(85,9,'Dokker'),
(86,10,'Viper'),
(87,10,'Hornet'),
(88,10,'Durango'),
(89,10,'Challenger'),
(90,10,'Charger'),
(91,11,'488'),
(92,11,'LaFerrari'),
(93,11,'Enzo'),
(94,11,'360'),
(95,11,'458'),
(96,12,'Bravo'),
(97,12,'Stilo'),
(98,12,'Panda'),
(99,12,'Tipo'),
(100,12,'Punto'),
(101,13,'Focus'),
(102,13,'Fiesta'),
(103,13,'Mondeo'),
(104,13,'Kuga'),
(105,13,'F-150'),
(106,14,'Hummer EV'),
(107,14,'Terrain'),
(108,14,'Yukon'),
(109,14,'Sierra'),
(110,14,'Acadia'),
(111,15,'Accord'),
(112,15,'CR-V'),
(113,15,'HR-V'),
(114,15,'Civic'),
(115,15,'Jazz'),
(116,16,'H1'),
(117,16,'H2'),
(118,16,'H3'),
(119,17,'i10'),
(120,17,'i20'),
(121,17,'i30'),
(122,17,'Ioniq 5'),
(123,17,'Tucson'),
(124,18,'QX50'),
(125,18,'QX60'),
(126,18,'QX80'),
(127,18,'Q50'),
(128,18,'Q70'),
(129,19,'XE'),
(130,19,'XF'),
(131,19,'XJ'),
(132,19,'F-type'),
(133,19,'E-pace'),
(134,20,'Cherokee'),
(135,20,'Grand Cherokee'),
(136,20,'Compass'),
(137,20,'Wrangler'),
(138,20,'Renegade'),
(139,21,'Ceed'),
(140,21,'Proceed'),
(141,21,'Xceed'),
(142,21,'Sportage'),
(143,21,'Stinger'),
(144,22,'Aventador'),
(145,22,'Huracan'),
(146,22,'Urus'),
(147,22,'Sian'),
(148,22,'Centenario'),
(149,23,'Discovery'),
(150,23,'Range Rover Sport'),
(151,23,'Defender'),
(152,23,'SV'),
(153,23,'Range Rover Velar'),
(154,24,'LFA'),
(155,24,'RX'),
(156,24,'ES'),
(157,24,'LX'),
(158,24,'IS'),
(159,25,'Ghibli'),
(160,25,'Levante'),
(161,25,'MC20'),
(162,25,'Quattroporte'),
(163,25,'GranTurismo'),
(164,26,'CX-30'),
(165,26,'CX-50'),
(166,26,'MX-30'),
(167,26,'6'),
(168,26,'3'),
(169,27,'A class'),
(170,27,'C class'),
(171,27,'E class'),
(172,27,'GLC'),
(173,27,'GLE'),
(174,28,'Countryman'),
(175,28,'Cooper S'),
(176,28,'Cooper'),
(177,28,'Clubman'),
(178,28,'Paceman'),
(179,29,'Mirage'),
(180,29,'ASX'),
(181,29,'Eclipse'),
(182,29,'Outlander'),
(183,29,'Lancer'),
(184,30,'Leaf'),
(185,30,'Altima'),
(186,30,'X-Trail'),
(187,30,'Sakura'),
(188,30,'GTR'),
(189,31,'Astra'),
(190,31,'Corsa'),
(191,31,'Mokka'),
(192,31,'Grandland'),
(193,31,'Zafira'),
(194,32,'307'),
(195,32,'308'),
(196,32,'407'),
(197,32,'3008'),
(198,32,'5008'),
(199,33,'G5'),
(200,33,'G6'),
(201,33,'Montana'),
(202,33,'Torrent'),
(203,33,'Solstice'),
(204,34,'Panamera'),
(205,34,'911'),
(206,34,'718'),
(207,34,'Cayenne'),
(208,34,'Macan'),
(209,35,'Trucks 1500'),
(210,35,'Trucks 2500'),
(211,35,'Trucks 3500'),
(212,36,'Megane'),
(213,36,'Clio'),
(214,36,'Twingo'),
(215,36,'Kangoo'),
(216,36,'Captur'),
(217,37,'9-5'),
(218,37,'9-3'),
(219,37,'9-7'),
(220,37,'Turbo X'),
(221,37,'9-2'),
(222,38,'Leon'),
(223,38,'Ibiza'),
(224,38,'Arona'),
(225,38,'Ateca'),
(226,38,'Toledo'),
(227,39,'Octavia'),
(228,39,'Fabia'),
(229,39,'Rapid'),
(230,39,'Superb'),
(231,39,'Enyaq'),
(232,40,'EQ fortwo'),
(233,40,'EQ forfour'),
(234,40,'fortwo'),
(235,40,'forfour'),
(236,41,'Impreza'),
(237,41,'Outback'),
(238,41,'Legacy'),
(239,41,'Ascent'),
(240,42,'S-Cross'),
(241,42,'Swift'),
(242,42,'Swace'),
(243,42,'Across'),
(244,43,'Model 3'),
(245,43,'Model S'),
(246,43,'Model X'),
(247,43,'Model Y'),
(248,44,'RAV4'),
(249,44,'Corolla'),
(250,44,'Camry'),
(251,44,'Crown'),
(252,45,'XC60'),
(253,45,'XC90'),
(254,45,'S60'),
(255,45,'S90'),
(256,46,'Rexton'),
(257,46,'Korando'),
(258,46,'Tivoli'),
(259,46,'Musso'),
(260,47,'Eletre'),
(261,47,'Sport 420'),
(262,47,'Sport 390'),
(263,47,'Elise'),
(264,48,'Navigator'),
(265,48,'Nautilus'),
(266,48,'Zephyr'),
(267,48,'Corsair'),
(268,49,'Ascender'),
(269,49,'Axiom'),
(270,49,'Rodeo'),
(271,50,'NSX'),
(272,50,'Integra'),
(273,50,'MDX'),
(274,51,'Polo'),
(275,51,'Golf'),
(276,51,'Passat'),
(277,51,'Touareg'),
(278,51,'Caddy');

/*Table structure for table `motor` */

DROP TABLE IF EXISTS `motor`;

CREATE TABLE `motor` (
  `motorId` int(11) NOT NULL AUTO_INCREMENT,
  `brojCilindara` int(11) NOT NULL,
  `kubikaza` double NOT NULL,
  `konjskaSnaga` int(11) NOT NULL,
  PRIMARY KEY (`motorId`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4;

/*Data for the table `motor` */

insert  into `motor`(`motorId`,`brojCilindara`,`kubikaza`,`konjskaSnaga`) values 
(1,3,1422,69),
(2,4,2000,140),
(25,6,3000,256);

/*Table structure for table `musterija` */

DROP TABLE IF EXISTS `musterija`;

CREATE TABLE `musterija` (
  `musterijaId` int(11) NOT NULL AUTO_INCREMENT,
  `imeMusterije` varchar(30) NOT NULL,
  `prezimeMusterije` varchar(30) NOT NULL,
  `mailMusterije` varchar(30) NOT NULL,
  `telefonMusterije` varchar(30) NOT NULL,
  PRIMARY KEY (`musterijaId`)
) ENGINE=InnoDB AUTO_INCREMENT=85 DEFAULT CHARSET=utf8mb4;

/*Data for the table `musterija` */

insert  into `musterija`(`musterijaId`,`imeMusterije`,`prezimeMusterije`,`mailMusterije`,`telefonMusterije`) values 
(18,'Zoran','Brankovic','zoran2@gmail.com','+381645246791'),
(21,'Dusan','Savic','dusan@gmail.com','+381614325801'),
(22,'Tatjana','Stojanovic','tatjana@gmail.com','+381634329801'),
(23,'Magdalena','Bursac','magdalena@gmail.com','+381654389046'),
(24,'Stefan','Lazarev','stefan@gmail.com','+381604590154'),
(25,'Aleksandar','Petrovic','aleksandar@gmail.com','+381634590132'),
(26,'Bogdan','Jovanovic','bogdan@gmail.com','+381623826912'),
(27,'Snezana','Brankovic','snezana.brankovic68@gmail.com','+381648960278'),
(28,'Nebojsa','Brankovic','nebojsab@gmail.com','+381643211872'),
(29,'Nebojsa','Stefanovic','nebojsastefa@gmail.com','+381643213215'),
(30,'Margareta','Jovanovic','marga@gmail.com','+381635216852'),
(31,'Nenad','Momcilovic','nenadm@gmail.com','+381636123623'),
(43,'Milan','Stefanovic','milance@gmail.com','+381632134123'),
(44,'Milan','Ivanisevic','milan@gmail.com','+381632112332'),
(45,'Milan','Ivancevic','milan@gmail.com','+381632112332'),
(47,'Vladimir','Petrovic','vlada@gmail.com','+381631235213'),
(48,'Dragan','Mitrovic','dragce@gmail.com','+381631234567'),
(50,'John','Walker','john@gmail.com','+381632341233'),
(51,'Ilija','Teofilovic','ilija3@gmail.com','+381641234321'),
(52,'Kristina','Petrovic','kristina@gmail.com','+381643513212'),
(53,'Tomica','Teofilovic','tomica@gmail.com','+381643215722'),
(54,'Jadranka','Teofilovic','jadranka@gmail.com','+381653821293'),
(55,'Maksim','Mehmedovic','maksim@gmail.com','+381653215212'),
(56,'Aleksej','Glavonjic','aleksa@gmail.com','+381639321832'),
(57,'Isaac','Newton','sd@gmail.com','+381651236212'),
(58,'Stefan','Lajic','stefa@gmail.com','+381632123216'),
(59,'Ivan','Ivanic','ivan@gmail.com','+381645426183'),
(63,'Zoran','Milanovic','zoran@gmail.com','0636128312'),
(64,'Danilo','Danilovic','danilo@gmail.com','0643215212');

/*Table structure for table `radnik` */

DROP TABLE IF EXISTS `radnik`;

CREATE TABLE `radnik` (
  `radnikId` int(11) NOT NULL AUTO_INCREMENT,
  `imeRadnika` varchar(50) NOT NULL,
  `prezimeRadnika` varchar(50) NOT NULL,
  `strucnaSprema` varchar(50) NOT NULL,
  `korisnickoIme` varchar(50) NOT NULL,
  `sifra` varchar(50) NOT NULL,
  PRIMARY KEY (`radnikId`)
) ENGINE=InnoDB AUTO_INCREMENT=270 DEFAULT CHARSET=utf8mb4;

/*Data for the table `radnik` */

insert  into `radnik`(`radnikId`,`imeRadnika`,`prezimeRadnika`,`strucnaSprema`,`korisnickoIme`,`sifra`) values 
(9,'Nikola','Brankovic','MASTER','nikola','123'),
(13,'Nebojsa','Brankovic','SREDNJA_SKOLA','admin','admin'),
(15,'Dragan','Mrkela','SREDNJA_SKOLA','dragan','dragan'),
(16,'Sinisa','Vukasinovic','OSNOVNA_SKOLA','sinisa','sinisa'),
(17,'Stefan','Petrovic','SREDNJA_SKOLA','stefan','stefan'),
(18,'Snezana','Brankovic','SPECIJALISTICKE_STRUKOVNE_STUDIJE','C15056','Privremeni.5'),
(19,'melani','mrkela','SREDNJA_SKOLA','melani','nesinadevojka'),
(20,'Miroslav','Milic','DOKTOR_NAUKA','mili','mili'),
(21,'Milan','Ivancic','SREDNJA_SKOLA','milan','milan'),
(22,'Zoran','Maljkovic','SREDNJA_SKOLA','maljko','123'),
(23,'Ilija','Teofilovic','SREDNJA_SKOLA','ilija','123'),
(24,'Zoran','Milanovic','SREDNJA_SKOLA','zoran','zoran123'),
(268,'Danilo','Danilovic','MAGISTAR_NAUKA','jid28f910j1d30-','jifo8193fhd321');

/*Table structure for table `rezervacija` */

DROP TABLE IF EXISTS `rezervacija`;

CREATE TABLE `rezervacija` (
  `rezervacijaId` int(11) NOT NULL AUTO_INCREMENT,
  `pocetakServisa` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `trajanjeServisa` int(11) NOT NULL,
  `musterijaId` int(11) NOT NULL,
  `registracioniBroj` varchar(20) NOT NULL,
  `radnikId` int(11) NOT NULL,
  PRIMARY KEY (`rezervacijaId`),
  KEY `radnik_fk2` (`radnikId`),
  KEY `musterija_fk2` (`musterijaId`),
  KEY `automobil_fk2` (`registracioniBroj`),
  CONSTRAINT `automobil_fk2` FOREIGN KEY (`registracioniBroj`) REFERENCES `automobil` (`registracioniBroj`),
  CONSTRAINT `musterija_fk2` FOREIGN KEY (`musterijaId`) REFERENCES `musterija` (`musterijaId`),
  CONSTRAINT `radnik_fk2` FOREIGN KEY (`radnikId`) REFERENCES `radnik` (`radnikId`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8mb4;

/*Data for the table `rezervacija` */

insert  into `rezervacija`(`rezervacijaId`,`pocetakServisa`,`trajanjeServisa`,`musterijaId`,`registracioniBroj`,`radnikId`) values 
(20,'2023-07-09 13:28:58',60,28,'BG1468OI',21);

/*Table structure for table `servis` */

DROP TABLE IF EXISTS `servis`;

CREATE TABLE `servis` (
  `registracioniBroj` varchar(20) NOT NULL,
  `radnikId` int(11) NOT NULL,
  `datumServisa` date NOT NULL,
  `kilometraza` int(11) NOT NULL,
  `opis` varchar(50) NOT NULL,
  PRIMARY KEY (`registracioniBroj`,`radnikId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `servis` */

insert  into `servis`(`registracioniBroj`,`radnikId`,`datumServisa`,`kilometraza`,`opis`) values 
('BG1468OI',21,'2023-06-25',115032,'Uradjen mali servis'),
('BG1468OI',257,'2023-07-09',30000,'Uradjen mali servis');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`email`) values 
(1,'admin','admin','admin@gmail.com'),
(3,'djordje','djordje','djoksile@gmail.com'),
(11,'djole','djole','djole@gmail.com'),
(15,'marko','marko','marko@gmail.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
