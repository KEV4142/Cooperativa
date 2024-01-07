CREATE DATABASE Agricola /*!40100 DEFAULT CHARACTER SET latin1 */;
-- GO;
USE Agricola;
-- GO;
-- MySQL dump 10.13  Distrib 5.1.66, for redhat-linux-gnu (i386)
--
-- Host: localhost    Database: Agricola
-- ------------------------------------------------------
-- Server version	5.1.66

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Tienda`
--

-- DROP TABLE  `Tienda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE Tienda (
  TiendaID int NOT NULL,
  Nombre varchar(50) NOT NULL,
  Encargado varchar(50) NOT NULL,
  Direccion varchar(50) NOT NULL,
  PRIMARY KEY (TiendaID)
);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `PagoDet`
--

-- DROP TABLE IF EXISTS `PagoDet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE PagoDet (
  PagoID int NOT NULL,
  CompraID int NOT NULL,
  Valor float NOT NULL
);
ALTER TABLE PagoDet ADD CONSTRAINT fkPagoDetPagoID FOREIGN KEY (PagoID) REFERENCES Pago(PagoID);
ALTER TABLE PagoDet ADD CONSTRAINT fkPagoDetCompraID FOREIGN KEY (CompraID) REFERENCES Compra(CompraID);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Anticipo`
--

DROP TABLE IF EXISTS `Anticipo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Anticipo` (
  `AnticipoID` int(11) NOT NULL,
  `SocioID` int(11) NOT NULL,
  `Fecha` datetime NOT NULL,
  `Valor` float NOT NULL,
  `Estado` varchar(1) NOT NULL,
  `Observacion` varchar(100) NOT NULL,
  PRIMARY KEY (`AnticipoID`),
  KEY `fkAnticipoSocioID` (`SocioID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `PagoCab`
--

DROP TABLE IF EXISTS `PagoCab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PagoCab` (
  `PagoID` int(11) NOT NULL,
  `ProveedorID` int(11) NOT NULL,
  `BancoID` int(11) NOT NULL,
  `CuentaID` varchar(20) NOT NULL,
  `ChequeID` int(11) NOT NULL,
  `Fecha` datetime NOT NULL,
  `Estado` varchar(1) NOT NULL,
  PRIMARY KEY (`PagoID`),
  KEY `fkPagoCabProveedorID` (`ProveedorID`),
  KEY `fkPagoCabBancoID` (`BancoID`),
  KEY `fkPagoCabCuentaID` (`CuentaID`),
  KEY `fkPagoCabChequeID` (`ChequeID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Movimiento`
--

DROP TABLE IF EXISTS `Movimiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Movimiento` (
  `TrasladoID` int(11) NOT NULL,
  `ArticuloID` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  KEY `fkMovimientoTrasladoID` (`TrasladoID`),
  KEY `fkMovimientoArticuloID` (`ArticuloID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Bodega`
--

DROP TABLE IF EXISTS `Bodega`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Bodega` (
  `BodegaID` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`BodegaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Cuota`
--

DROP TABLE IF EXISTS `Cuota`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cuota` (
  `PrestamoID` int(11) NOT NULL,
  `CuotaID` int(11) NOT NULL,
  `FechaVence` datetime NOT NULL,
  `FechaPago` datetime NOT NULL,
  `Capital` float NOT NULL,
  `Interes` float NOT NULL,
  `Mora` float NOT NULL,
  `Estado` varchar(1) NOT NULL,
  PRIMARY KEY (`CuotaID`),
  KEY `fkCuotaPrestamoID` (`PrestamoID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Cuenta`
--

DROP TABLE IF EXISTS `Cuenta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cuenta` (
  `CuentaID` varchar(20) NOT NULL,
  `BancoID` int(11) NOT NULL,
  `MonedaID` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Tipo` varchar(1) NOT NULL,
  `Estado` varchar(1) NOT NULL,
  PRIMARY KEY (`CuentaID`),
  KEY `fkCuentaBancoID` (`BancoID`),
  KEY `fkCuentaMonedaID` (`MonedaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Carga`
--

DROP TABLE IF EXISTS `Carga`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Carga` (
  `CargaID` int(11) NOT NULL,
  `Fecha` datetime NOT NULL,
  `EmpresaID` int(11) NOT NULL,
  `Archivo` varchar(200) NOT NULL,
  `Estado` varchar(1) NOT NULL,
  PRIMARY KEY (`CargaID`),
  KEY `fkCargaEmpresaID` (`EmpresaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Puesto`
--

DROP TABLE IF EXISTS `Puesto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Puesto` (
  `PuestoID` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`PuestoID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Deposito`
--

DROP TABLE IF EXISTS `Deposito`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Deposito` (
  `DepositoID` varchar(20) NOT NULL,
  `BancoID` int(11) NOT NULL,
  `CuentaID` varchar(20) NOT NULL,
  `Fecha` datetime NOT NULL,
  `Valor` float NOT NULL,
  `Estado` varchar(1) NOT NULL,
  `Observacion` varchar(100) NOT NULL,
  PRIMARY KEY (`DepositoID`),
  KEY `fkDepositoBancoID` (`BancoID`),
  KEY `fkDepositoCuentaID` (`CuentaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `TiendaEmpresa`
--

DROP TABLE IF EXISTS `TiendaEmpresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TiendaEmpresa` (
  `TiendaID` int(11) NOT NULL,
  `EmpresaID` int(11) NOT NULL,
  KEY `fkTiendaEmpresaTiendaID` (`TiendaID`),
  KEY `fkTiendaEmpresaEmpresaID` (`EmpresaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Traslado`
--

DROP TABLE IF EXISTS `Traslado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Traslado` (
  `TrasladoID` int(11) NOT NULL,
  `BodegaID` int(11) NOT NULL,
  `TiendaID` int(11) NOT NULL,
  `Fecha` datetime NOT NULL,
  `Tipo` varchar(1) NOT NULL,
  `Estado` varchar(1) NOT NULL,
  PRIMARY KEY (`TrasladoID`),
  KEY `fkTrasladoBodegaID` (`BodegaID`),
  KEY `fkTrasladoTiendaID` (`TiendaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Existencia`
--

DROP TABLE IF EXISTS `Existencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Existencia` (
  `ArticuloID` int(11) NOT NULL,
  `TiendaID` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `Minimo` int(11) NOT NULL,
  KEY `fkExistenciaTiendaID` (`ArticuloID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `CompraDet`
--

DROP TABLE IF EXISTS `CompraDet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CompraDet` (
  `CompraID` int(11) NOT NULL,
  `ArticuloID` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `Precio` float NOT NULL,
  `ISV` bit(1) NOT NULL,
  KEY `fkCompraDetCompraID` (`CompraID`),
  KEY `fkCompraDetArticuloID` (`ArticuloID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `FormaPago`
--

DROP TABLE IF EXISTS `FormaPago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `FormaPago` (
  `TiendaID` int(11) NOT NULL,
  `FacturaID` int(11) NOT NULL,
  `Tipo` varchar(1) NOT NULL,
  `Valor` float NOT NULL,
  KEY `fkFormaPagoTiendaID` (`TiendaID`),
  KEY `fkFormaPagoFacturaID` (`FacturaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Empresa`
--

DROP TABLE IF EXISTS `Empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Empresa` (
  `EmpresaID` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Aportacion` int(11) NOT NULL,
  PRIMARY KEY (`EmpresaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Proveedor`
--

DROP TABLE IF EXISTS `Proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Proveedor` (
  `ProveedorID` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Contacto` varchar(50) NOT NULL,
  `Telefono` varchar(10) NOT NULL,
  `Limite` float NOT NULL,
  `Dias` int(11) NOT NULL,
  PRIMARY KEY (`ProveedorID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Prestamo`
--

DROP TABLE IF EXISTS `Prestamo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Prestamo` (
  `PrestamoID` int(11) NOT NULL,
  `SocioID` int(11) NOT NULL,
  `Fecha` datetime NOT NULL,
  `Valor` float NOT NULL,
  `Tiempo` int(11) NOT NULL,
  `Interes` int(11) NOT NULL,
  `Mora` int(11) NOT NULL,
  `BancoID` int(11) NOT NULL,
  `CuentaID` varchar(20) NOT NULL,
  `ChequeID` int(11) NOT NULL,
  PRIMARY KEY (`PrestamoID`),
  KEY `fkPrestamoSocioID` (`SocioID`),
  KEY `fkPrestamoBancoID` (`BancoID`),
  KEY `fkPrestamoCuentaID` (`CuentaID`),
  KEY `fkPrestamoChequeID` (`ChequeID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Ahorro`
--

DROP TABLE IF EXISTS `Ahorro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Ahorro` (
  `SocioID` int(11) NOT NULL,
  `Item` int(11) NOT NULL,
  `Fecha` datetime NOT NULL,
  `Tipo` varchar(1) NOT NULL,
  `Valor` float NOT NULL,
  `CargaID` int(11) NOT NULL,
  PRIMARY KEY (`Item`),
  KEY `fkAhorroSocioID` (`SocioID`),
  KEY `fkAhorroCargaID` (`CargaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Recibo`
--

DROP TABLE IF EXISTS `Recibo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Recibo` (
  `ReciboID` int(11) NOT NULL,
  `Fecha` datetime NOT NULL,
  `AnticipoID` int(11) DEFAULT NULL,
  `CuotaID` int(11) DEFAULT NULL,
  `PrestamoID` int(11) DEFAULT NULL,
  `FacturaID` int(11) DEFAULT NULL,
  `TiendaID` int(11) DEFAULT NULL,
  `Estado` varchar(1) NOT NULL,
  `CargaID` int(11) NOT NULL,
  PRIMARY KEY (`ReciboID`),
  KEY `fkReciboAnticipoID` (`AnticipoID`),
  KEY `fkReciboCuotaID` (`CuotaID`),
  KEY `fkReciboPrestamoID` (`PrestamoID`),
  KEY `fkReciboFacturaID` (`FacturaID`),
  KEY `fkReciboTiendaID` (`TiendaID`),
  KEY `fkReciboCargaID` (`CargaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Factura`
--

DROP TABLE IF EXISTS `Factura`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Factura` (
  `FacturaID` int(11) NOT NULL,
  `TiendaID` int(11) NOT NULL,
  `SocioID` int(11) NOT NULL,
  `Fecha` datetime NOT NULL,
  `Estado` varchar(1) NOT NULL,
  `Observacion` varchar(100) NOT NULL,
  PRIMARY KEY (`FacturaID`),
  KEY `fkFacturaSocioID` (`SocioID`),
  KEY `fkFacturaTiendaID` (`TiendaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Cooperativa`
--

DROP TABLE IF EXISTS `Cooperativa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cooperativa` (
  `CooperativaID` int(11) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `PlazoAnticipos` int(11) NOT NULL,
  `PlazoPrestamos` int(11) NOT NULL,
  `InteresFactura` float NOT NULL,
  `InteresPrestamo` float NOT NULL,
  PRIMARY KEY (`CooperativaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Articulo`
--

DROP TABLE IF EXISTS `Articulo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Articulo` (
  `ArticuloID` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `ISV` bit(1) NOT NULL,
  `Precio` float NOT NULL,
  `Utilidad` float NOT NULL,
  PRIMARY KEY (`ArticuloID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Socio`
--

DROP TABLE IF EXISTS `Socio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Socio` (
  `SocioID` int(11) NOT NULL,
  `Codigo` varchar(20) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Sexo` varchar(1) NOT NULL,
  `Civil` varchar(1) NOT NULL,
  `Direccion` varchar(50) NOT NULL,
  `Telefono` varchar(20) NOT NULL,
  `FechaIngreso` datetime NOT NULL,
  `Estado` varchar(1) NOT NULL,
  `EmpresaID` int(11) NOT NULL,
  `Sueldo` float NOT NULL,
  `Ahorro` float NOT NULL,
  `PuestoID` int(11) NOT NULL,
  PRIMARY KEY (`SocioID`),
  KEY `fkSocioEmpresaID` (`EmpresaID`),
  KEY `fkSocioPuestoID` (`PuestoID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `CompraCab`
--

DROP TABLE IF EXISTS `CompraCab`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `CompraCab` (
  `CompraID` int(11) NOT NULL,
  `ProveedorID` int(11) NOT NULL,
  `BodegaID` int(11) NOT NULL,
  `Fecha` datetime NOT NULL,
  `Factura` int(11) NOT NULL,
  `Estado` varchar(1) NOT NULL,
  `Tipo` varchar(1) NOT NULL,
  PRIMARY KEY (`CompraID`),
  KEY `fkCompraCabProveedorID` (`ProveedorID`),
  KEY `fkCompraCabBodegaID` (`BodegaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Cheque`
--

DROP TABLE IF EXISTS `Cheque`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Cheque` (
  `ChequeID` int(11) NOT NULL,
  `BancoID` int(11) NOT NULL,
  `CuentaID` varchar(20) NOT NULL,
  `Fecha` datetime NOT NULL,
  `Beneficiario` varchar(50) NOT NULL,
  `Valor` float NOT NULL,
  `Estado` varchar(1) NOT NULL,
  `Observacion` varchar(100) NOT NULL,
  PRIMARY KEY (`ChequeID`),
  KEY `fkChequeBancoID` (`BancoID`),
  KEY `fkChequeCuentaID` (`CuentaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Moneda`
--

DROP TABLE IF EXISTS `Moneda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Moneda` (
  `MonedaID` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  PRIMARY KEY (`MonedaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Banco`
--

--DROP TABLE IF EXISTS `Banco`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE Banco (
  BancoID int NOT NULL,
  Nombre varchar(50) NOT NULL
);
alter table Banco add constraint pkBancoID primary key(BancoID);
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `Detalle`
--

DROP TABLE IF EXISTS `Detalle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Detalle` (
  `ArticuloID` int(11) NOT NULL,
  `FacturaID` int(11) NOT NULL,
  `TiendaID` int(11) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `Precio` float NOT NULL,
  `Impuesto` float NOT NULL,
  KEY `fkDetalleFacturaID` (`FacturaID`),
  KEY `fkDetalleArticuloID` (`ArticuloID`),
  KEY `fkDetalleTiendaID` (`TiendaID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2012-12-16  2:25:53
