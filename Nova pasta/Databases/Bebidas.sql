create database bebidas;

use bebidas;

CREATE TABLE `Bebidas` (
  `Lote` INT(255) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(30) NOT NULL,
  `Categoria` varchar(30) NOT NULL,
  `Quantidade` varchar(20) NOT NULL,
  `Validade` varchar(11) NOT NULL,
  PRIMARY KEY (`Lote`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8

select * from bebidas.bebidas;