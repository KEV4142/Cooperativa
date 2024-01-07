CREATE DATABASE Agricola;
go
USE Agricola;--use master
go

--TABLAS
CREATE TABLE Tienda (
  TiendaID int NOT NULL,
  Nombre varchar(50) NOT NULL,
  Encargado varchar(50) NOT NULL,
  Direccion varchar(50) NOT NULL
);
go

CREATE TABLE Bodega (
  BodegaID int NOT NULL,
  Nombre varchar(50) NOT NULL
);
go

CREATE TABLE Puesto (
  PuestoID int NOT NULL,
  Nombre varchar(50) NOT NULL
);
go

CREATE TABLE Empresa (
  EmpresaID int NOT NULL,
  Nombre varchar(50) NOT NULL,
  Aportacion int NOT NULL
);
go

CREATE TABLE Proveedor (
  ProveedorID int NOT NULL,
  Nombre varchar(50) NOT NULL,
  Direccion varchar(50) NOT NULL,
  Contacto varchar(50) NOT NULL,
  Telefono varchar(10) NOT NULL,
  Limite float NOT NULL,
  Dias int NOT NULL
);
go

CREATE TABLE Cooperativa (
  CooperativaID int NOT NULL,
  Nombre varchar(20) NOT NULL,
  PlazoAnticipos int NOT NULL,
  PlazoPrestamos int NOT NULL,
  InteresFactura float NOT NULL,
  InteresPrestamo float NOT NULL,
);
GO

CREATE TABLE Articulo (
  ArticuloID int NOT NULL,
  Nombre varchar(50) NOT NULL,
  ISV bit NOT NULL,
  Precio float NOT NULL,
  Utilidad float NOT NULL
);
go

CREATE TABLE Moneda (
  MonedaID int NOT NULL,
  Nombre varchar(50) NOT NULL
);
go

CREATE TABLE Banco (
  BancoID int NOT NULL,
  Nombre varchar(50) NOT NULL
);
go

CREATE TABLE Cheque (
  ChequeID int NOT NULL,
  BancoID int NOT NULL,
  CuentaID varchar(20) NOT NULL,
  Fecha datetime NOT NULL,
  Beneficiario varchar(50) NOT NULL,
  Valor float NOT NULL,
  Estado varchar(1) NOT NULL,
  Observacion varchar(100) NOT NULL
);
go

CREATE TABLE CompraCab (
  CompraID int NOT NULL,
  ProveedorID int NOT NULL,
  BodegaID int NOT NULL,
  Fecha datetime NOT NULL,
  Factura int NOT NULL,
  Estado varchar(1) NOT NULL,
  Tipo varchar(1) NOT NULL
);
go

CREATE TABLE CompraDet (
  CompraID int NOT NULL,
  ArticuloID int NOT NULL,
  Cantidad int NOT NULL,
  Precio float NOT NULL,
  ISV bit NOT NULL
);
go

CREATE TABLE Socio (
  SocioID int NOT NULL,
  Codigo varchar(20) NOT NULL,
  Nombre varchar(50) NOT NULL,
  Sexo varchar(1) NOT NULL,
  Civil varchar(1) NOT NULL,
  Direccion varchar(50) NOT NULL,
  Telefono varchar(20) NOT NULL,
  FechaIngreso datetime NOT NULL,
  Estado varchar(1) NOT NULL,
  EmpresaID int NOT NULL,
  Sueldo float NOT NULL,
  Ahorro float NOT NULL,
  PuestoID int NOT NULL
);
go

CREATE TABLE Factura (
  FacturaID int NOT NULL,
  TiendaID int NOT NULL,
  SocioID int NOT NULL,
  Fecha datetime NOT NULL,
  Estado varchar(1) NOT NULL,
  Observacion varchar(100) NOT NULL
);
GO

CREATE TABLE Detalle (
  ArticuloID int NOT NULL,
  FacturaID int NOT NULL,
  TiendaID int NOT NULL,
  Cantidad int NOT NULL,
  Precio float NOT NULL,
  Impuesto float NOT NULL
);
go

CREATE TABLE Recibo (
  ReciboID int NOT NULL,
  Fecha datetime NOT NULL,
  AnticipoID int DEFAULT NULL,
  CuotaID int DEFAULT NULL,
  PrestamoID int DEFAULT NULL,
  FacturaID int DEFAULT NULL,
  TiendaID int DEFAULT NULL,
  Estado varchar(1) NOT NULL,
  CargaID int NOT NULL
);
GO

CREATE TABLE Ahorro (
  SocioID int NOT NULL,
  Item int NOT NULL,
  Fecha datetime NOT NULL,
  Tipo varchar(1) NOT NULL,
  Valor float NOT NULL,
  CargaID int NOT NULL
);
go

CREATE TABLE Prestamo (
  PrestamoID int NOT NULL,
  SocioID int NOT NULL,
  Fecha datetime NOT NULL,
  Valor float NOT NULL,
  Tiempo int NOT NULL,
  Interes int NOT NULL,
  Mora int NOT NULL,
  BancoID int NOT NULL,
  CuentaID varchar(20) NOT NULL,
  ChequeID int NOT NULL
);
go

CREATE TABLE FormaPago (
  TiendaID int NOT NULL,
  FacturaID int NOT NULL,
  Tipo varchar(1) NOT NULL,
  Valor float NOT NULL
);
go

CREATE TABLE Existencia (
  ArticuloID int NOT NULL,
  TiendaID int NOT NULL,
  Cantidad int NOT NULL,
  Minimo int NOT NULL,
);
go

CREATE TABLE Traslado (
  TrasladoID int NOT NULL,
  BodegaID int NOT NULL,
  TiendaID int NOT NULL,
  Fecha datetime NOT NULL,
  Tipo varchar(1) NOT NULL,
  Estado varchar(1) NOT NULL
);
go

CREATE TABLE TiendaEmpresa (
  TiendaID int NOT NULL,
  EmpresaID int NOT NULL
);
go

CREATE TABLE Deposito (
  DepositoID varchar(20) NOT NULL,
  BancoID int NOT NULL,
  CuentaID varchar(20) NOT NULL,
  Fecha datetime NOT NULL,
  Valor float NOT NULL,
  Estado varchar(1) NOT NULL,
  Observacion varchar(100) NOT NULL
);
go

CREATE TABLE Carga (
  CargaID int NOT NULL,
  Fecha datetime NOT NULL,
  EmpresaID int NOT NULL,
  Archivo varchar(200) NOT NULL
);
go

CREATE TABLE Cuenta (
  CuentaID varchar(20) NOT NULL,
  BancoID int NOT NULL,
  MonedaID int NOT NULL,
  Nombre varchar(50) NOT NULL,
  Tipo varchar(1) NOT NULL,
  Estado varchar(1) NOT NULL
);
go

CREATE TABLE Cuota (
  PrestamoID int NOT NULL,
  CuotaID int NOT NULL,
  FechaVence datetime NOT NULL,
  FechaPago datetime NOT NULL,
  Capital float NOT NULL,
  Interes float NOT NULL,
  Mora float NOT NULL,
  Estado varchar(1) NOT NULL
);
go

CREATE TABLE Movimiento (
  TrasladoID int NOT NULL,
  ArticuloID int NOT NULL,
  Cantidad int NOT NULL
  );
go

CREATE TABLE PagoCab (
  PagoID int NOT NULL,
  ProveedorID int NOT NULL,
  BancoID int NOT NULL,
  CuentaID varchar(20) NOT NULL,
  ChequeID int NOT NULL,
  Fecha datetime NOT NULL,
  Estado varchar(1) NOT NULL
);
go

CREATE TABLE PagoDet (
  PagoID int NOT NULL,
  CompraID int NOT NULL,
  Valor float NOT NULL,
);
go

CREATE TABLE Anticipo (
  AnticipoID int NOT NULL,
  SocioID int NOT NULL,
  Fecha datetime NOT NULL,
  Valor float NOT NULL,
  Estado varchar(1) NOT NULL,
  Observacion varchar(100) NOT NULL
);
go

--llaves primarias
ALTER TABLE Tienda ADD CONSTRAINT pkTiendaID PRIMARY KEY (TiendaID);
ALTER TABLE Bodega ADD CONSTRAINT pkBodegaID PRIMARY KEY (BodegaID);
ALTER TABLE Puesto ADD CONSTRAINT pkPuestoID PRIMARY KEY (PuestoID);
ALTER TABLE Empresa ADD CONSTRAINT pkEmpresaID PRIMARY KEY (EmpresaID);
ALTER TABLE Proveedor ADD CONSTRAINT pkProveedorID PRIMARY KEY (ProveedorID);
ALTER TABLE Cooperativa ADD CONSTRAINT pkCooperativaID PRIMARY KEY (CooperativaID);
ALTER TABLE Articulo ADD CONSTRAINT pkArticuloID PRIMARY KEY (ArticuloID);
ALTER TABLE Moneda ADD CONSTRAINT pkMonedaID PRIMARY KEY (MonedaID);
alter table Banco add constraint pkBancoID primary key(BancoID);
ALTER TABLE Cheque ADD CONSTRAINT pkChequeID PRIMARY KEY (ChequeID);
ALTER TABLE CompraCab ADD CONSTRAINT pkCompraID PRIMARY KEY (CompraID);
ALTER TABLE Socio ADD CONSTRAINT pkSocioID PRIMARY KEY (SocioID);
ALTER TABLE Factura ADD CONSTRAINT pkFacturaID PRIMARY KEY (FacturaID);
ALTER TABLE Recibo ADD CONSTRAINT pkReciboID PRIMARY KEY (ReciboID);
ALTER TABLE Ahorro ADD CONSTRAINT pkItem PRIMARY KEY (Item);
ALTER TABLE Prestamo ADD CONSTRAINT pkPrestamoID PRIMARY KEY (PrestamoID);
ALTER TABLE Traslado ADD CONSTRAINT pkTrasladoID PRIMARY KEY (TrasladoID);
ALTER TABLE Deposito ADD CONSTRAINT pkDepositoID PRIMARY KEY (DepositoID);
ALTER TABLE Carga ADD CONSTRAINT pkCargaID PRIMARY KEY (CargaID);
ALTER TABLE Cuenta ADD CONSTRAINT pkCuentaID PRIMARY KEY (CuentaID);
ALTER TABLE Cuota ADD CONSTRAINT pkCuotaID PRIMARY KEY (CuotaID);
ALTER TABLE PagoCab ADD CONSTRAINT pkPagoID PRIMARY KEY (PagoID);
ALTER TABLE Anticipo ADD CONSTRAINT pkAnticipoID PRIMARY KEY (AnticipoID);
go

--llaves foraneas
ALTER TABLE Cheque ADD CONSTRAINT fkChequeBancoID FOREIGN KEY (BancoID) REFERENCES Banco(BancoID);
ALTER TABLE Cheque ADD CONSTRAINT fkChequeCuentaID FOREIGN KEY (CuentaID) REFERENCES Cuenta(CuentaID);
ALTER TABLE CompraCab ADD CONSTRAINT fkCompraCabProveedorID FOREIGN KEY (ProveedorID) REFERENCES Proveedor(ProveedorID);
ALTER TABLE CompraCab ADD CONSTRAINT fkCompraCabBodegaID FOREIGN KEY (BodegaID) REFERENCES Bodega(BodegaID);
ALTER TABLE CompraDet ADD CONSTRAINT fkCompraDetCompraID FOREIGN KEY (CompraID) REFERENCES CompraCab(CompraID);
ALTER TABLE CompraDet ADD CONSTRAINT fkCompraDetArticuloID FOREIGN KEY (ArticuloID) REFERENCES Articulo(ArticuloID);
ALTER TABLE Socio ADD CONSTRAINT fkSocioEmpresaID FOREIGN KEY (EmpresaID) REFERENCES Empresa(EmpresaID);
ALTER TABLE Socio ADD CONSTRAINT fkSocioPuestoID FOREIGN KEY (PuestoID) REFERENCES Puesto(PuestoID);
ALTER TABLE Factura ADD CONSTRAINT fkFacturaSocioID FOREIGN KEY (SocioID) REFERENCES Socio(SocioID);
ALTER TABLE Factura ADD CONSTRAINT fkFacturaTiendaID FOREIGN KEY (TiendaID) REFERENCES Tienda(TiendaID);
ALTER TABLE Detalle ADD CONSTRAINT fkDetalleFacturaID FOREIGN KEY (FacturaID) REFERENCES Factura(FacturaID);
ALTER TABLE Detalle ADD CONSTRAINT fkDetalleArticuloID FOREIGN KEY (ArticuloID) REFERENCES Articulo(ArticuloID);
ALTER TABLE Detalle ADD CONSTRAINT fkDetalleTiendaID FOREIGN KEY (TiendaID) REFERENCES Tienda(TiendaID);
ALTER TABLE Recibo ADD CONSTRAINT fkReciboAnticipoID FOREIGN KEY (AnticipoID) REFERENCES Anticipo(AnticipoID);
ALTER TABLE Recibo ADD CONSTRAINT fkReciboCuotaID FOREIGN KEY (CuotaID) REFERENCES Cuota(CuotaID);
ALTER TABLE Recibo ADD CONSTRAINT fkReciboPrestamoID FOREIGN KEY (PrestamoID) REFERENCES Prestamo(PrestamoID);
ALTER TABLE Recibo ADD CONSTRAINT fkReciboFacturaID FOREIGN KEY (FacturaID) REFERENCES Factura(FacturaID);
ALTER TABLE Recibo ADD CONSTRAINT fkReciboTiendaID FOREIGN KEY (TiendaID) REFERENCES Tienda(TiendaID);
ALTER TABLE Recibo ADD CONSTRAINT fkReciboCargaID FOREIGN KEY (CargaID) REFERENCES Carga(CargaID);
ALTER TABLE Ahorro ADD CONSTRAINT fkAhorroSocioID FOREIGN KEY (SocioID) REFERENCES Socio(SocioID);
ALTER TABLE Ahorro ADD CONSTRAINT fkAhorroCargaID FOREIGN KEY (CargaID) REFERENCES Carga(CargaID);
ALTER TABLE Prestamo ADD CONSTRAINT fkPrestamoSocioID FOREIGN KEY (SocioID) REFERENCES Socio(SocioID);
ALTER TABLE Prestamo ADD CONSTRAINT fkPrestamoBancoID FOREIGN KEY (BancoID) REFERENCES Banco(BancoID);
ALTER TABLE Prestamo ADD CONSTRAINT fkPrestamoCuentaID FOREIGN KEY (CuentaID) REFERENCES Cuenta(CuentaID);
ALTER TABLE Prestamo ADD CONSTRAINT fkPrestamoChequeID FOREIGN KEY (ChequeID) REFERENCES Cheque(ChequeID);
ALTER TABLE FormaPago ADD CONSTRAINT fkFormaPagoTiendaID FOREIGN KEY (TiendaID) REFERENCES Tienda(TiendaID);
ALTER TABLE FormaPago ADD CONSTRAINT fkFormaPagoFacturaID FOREIGN KEY (FacturaID) REFERENCES Factura(FacturaID);
ALTER TABLE Existencia ADD CONSTRAINT fkExistenciaTiendaID FOREIGN KEY (ArticuloID) REFERENCES Articulo(ArticuloID);
ALTER TABLE Traslado ADD CONSTRAINT fkTrasladoBodegaID FOREIGN KEY (BodegaID) REFERENCES Bodega(BodegaID);
ALTER TABLE Traslado ADD CONSTRAINT fkTrasladoTiendaID FOREIGN KEY (TiendaID) REFERENCES Tienda(TiendaID);
ALTER TABLE TiendaEmpresa ADD CONSTRAINT fkTiendaEmpresaTiendaID FOREIGN KEY (TiendaID) REFERENCES Tienda(TiendaID);
ALTER TABLE TiendaEmpresa ADD CONSTRAINT fkTiendaEmpresaEmpresaID FOREIGN KEY (EmpresaID) REFERENCES Empresa(EmpresaID);
ALTER TABLE Deposito ADD CONSTRAINT fkDepositoBancoID FOREIGN KEY (BancoID) REFERENCES Banco(BancoID);
ALTER TABLE Deposito ADD CONSTRAINT fkDepositoCuentaID FOREIGN KEY (CuentaID) REFERENCES Cuenta(CuentaID);
ALTER TABLE Carga ADD CONSTRAINT fkCargaEmpresaID FOREIGN KEY (EmpresaID) REFERENCES Empresa(EmpresaID);
ALTER TABLE Cuenta ADD CONSTRAINT fkCuentaBancoID FOREIGN KEY (BancoID) REFERENCES Banco(BancoID);
ALTER TABLE Cuenta ADD CONSTRAINT fkCuentaMonedaID FOREIGN KEY (MonedaID) REFERENCES Moneda(MonedaID);
ALTER TABLE Cuota ADD CONSTRAINT fkCuotaPrestamoID FOREIGN KEY (PrestamoID) REFERENCES Prestamo(PrestamoID);
ALTER TABLE Movimiento ADD CONSTRAINT fkMovimientoTrasladoID FOREIGN KEY (TrasladoID) REFERENCES Traslado(TrasladoID);
ALTER TABLE Movimiento ADD CONSTRAINT fkMovimientoArticuloID FOREIGN KEY (ArticuloID) REFERENCES Articulo(ArticuloID);
ALTER TABLE PagoCab ADD CONSTRAINT fkPagoCabProveedorID FOREIGN KEY (ProveedorID) REFERENCES Proveedor(ProveedorID);
ALTER TABLE PagoCab ADD CONSTRAINT fkPagoCabBancoID FOREIGN KEY (BancoID) REFERENCES Banco(BancoID);
ALTER TABLE PagoCab ADD CONSTRAINT fkPagoCabCuentaID FOREIGN KEY (CuentaID) REFERENCES Cuenta(CuentaID);
ALTER TABLE PagoCab ADD CONSTRAINT fkPagoCabChequeID FOREIGN KEY (ChequeID) REFERENCES Cheque(ChequeID);
ALTER TABLE PagoDet ADD CONSTRAINT fkPagoDetPagoID FOREIGN KEY (PagoID) REFERENCES PagoCab(PagoID);
ALTER TABLE PagoDet ADD CONSTRAINT fkPagoDetCompraID FOREIGN KEY (CompraID) REFERENCES CompraCab(CompraID);
ALTER TABLE Anticipo ADD CONSTRAINT fkAnticipoSocioID FOREIGN KEY (SocioID) REFERENCES Socio(SocioID);
go