CREATE TABLE IF NOT EXISTS `sucursal` (
  `codSucursal` varchar(20) PRIMARY KEY,
  `telefono` varchar(45) DEFAULT NULL,
  `ciudad` varchar(45) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `encargado` varchar(45) DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS `suscriptor` (
  `idSuscriptor` varchar(20) PRIMARY KEY,
  `nombre` varchar(45) DEFAULT NULL,
  `identificacion` varchar(10) DEFAULT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL
);

CREATE TABLE IF NOT EXISTS `region` (
  `codRegion` varchar(20) PRIMARY KEY,
  `encargado` varchar(45) DEFAULT NULL,
  `sucursal_codSucursal` varchar(20) NOT NULL,
  FOREIGN KEY (sucursal_codSucursal) REFERENCES sucursal(codSucursal)
);

CREATE TABLE IF NOT EXISTS `servicio` (
  `codServicio` varchar(20) PRIMARY KEY,
  `fechaInst` date DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `region_codRegion` varchar(20) NOT NULL,
  `suscriptor_idSuscriptor` varchar(20) NOT NULL,
  FOREIGN KEY (region_codRegion) REFERENCES region(codRegion),
  FOREIGN KEY (suscriptor_idSuscriptor) REFERENCES suscriptor(idSuscriptor)
);

CREATE TABLE IF NOT EXISTS `cuadra` (
  `codCuadra` varchar(20) PRIMARY KEY,
  `nombre` varchar(45) DEFAULT NULL,
  `region_codRegion` varchar(20) NOT NULL,
  FOREIGN KEY (region_codRegion) REFERENCES region(codRegion)
);

CREATE TABLE IF NOT EXISTS `averia` (
  `codAveria` varchar(20) PRIMARY KEY,
  `descripcion` varchar(150) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `servicio_codServicio` varchar(20) NOT NULL,
  FOREIGN KEY (servicio_codServicio) REFERENCES servicio(codServicio)
);

CREATE TABLE IF NOT EXISTS `estadoaveria` (
  `idEstAveria` varchar(20) PRIMARY KEY,
  `nombre` varchar(45) DEFAULT NULL,
  `averia_codAveria` varchar(20) NOT NULL,
  FOREIGN KEY (averia_codAveria) REFERENCES averia(codAveria)
);

CREATE TABLE IF NOT EXISTS `estadoserv` (
  `codEstServ` varchar(20) PRIMARY KEY,
  `nombre` varchar(45) DEFAULT NULL,
  `servicio_codServicio` varchar(20) NOT NULL,
  FOREIGN KEY (servicio_codServicio) REFERENCES servicio(codServicio)
);

CREATE TABLE IF NOT EXISTS `instalacion` (
  `idInst` varchar(20) PRIMARY KEY,
  `numConcent` int(11) DEFAULT NULL,
  `cantMetCable` float DEFAULT NULL,
  `instPropia` tinyint(1) DEFAULT NULL,
  `cantTel` int(11) DEFAULT NULL,
  `servicio_codServicio` varchar(20) NOT NULL,
  FOREIGN KEY (servicio_codServicio) REFERENCES servicio(codServicio)
);

CREATE TABLE IF NOT EXISTS `servicioextra` (
  `codServExtra` varchar(20) PRIMARY KEY,
  `nombre` varchar(45) DEFAULT NULL,
  `servicio_codServicio` varchar(20) NOT NULL,
  FOREIGN KEY (servicio_codServicio) REFERENCES servicio(codServicio)
);

CREATE TABLE IF NOT EXISTS `tipoaveria` (
  `idTipoAveria` varchar(20) PRIMARY KEY,
  `nombre` varchar(45) DEFAULT NULL,
  `averia_codAveria` varchar(20) NOT NULL,
  FOREIGN KEY (averia_codAveria) REFERENCES averia(codAveria)
);

CREATE TABLE IF NOT EXISTS `tipovivienda` (
  `idTipVivienda` varchar(20) PRIMARY KEY,
  `nombre` varchar(45) DEFAULT NULL,
  `servicio_codServicio` varchar(20) NOT NULL,
  FOREIGN KEY (servicio_codServicio) REFERENCES servicio(codServicio)
);

INSERT INTO `averia` (`codAveria`, `descripcion`, `fecha`, `servicio_codServicio`) VALUES
('codAveria01', 'No tengo señal', '2012-09-12', 'codServ01'),
('codAveria02', 'No se ven los canales', '2012-09-13', 'codServ02'),
('codAveria03', 'La imagen esta borrosa', '2012-09-10', 'codServ03'),
('codAveria04', 'Error de configuracion', '2012-09-12', 'codServ04');

INSERT INTO `cuadra` (`codCuadra`, `nombre`, `region_codRegion`) VALUES
('codCuadra01', 'Cuadra 1', 'codReg1'),
('codCuadra02', 'Cuadra 1', 'codReg2'),
('codCuadra03', 'Cuadra 1', 'codReg3'),
('codCuadra04', 'Cuadra 1', 'codReg4');

INSERT INTO `estadoaveria` (`idEstAveria`, `nombre`, `averia_codAveria`) VALUES
('idestave01', 'Pendiente', 'codAveria01'),
('idestave02', 'En revision', 'codAveria02'),
('idestave03', 'Resuelto', 'codAveria03'),
('idestave04', 'Resuelto', 'codAveria04');

INSERT INTO `estadoserv` (`codEstServ`, `nombre`, `servicio_codServicio`) VALUES
('codEstServ01', 'Pendiente', 'codServ01'),
('codEstServ02', 'Activo', 'codServ02'),
('codEstServ03', 'Suspendido', 'codServ03'),
('codEstServ04', 'Activo', 'codServ04');

INSERT INTO `instalacion` (`idInst`, `numConcent`, `cantMetCable`, `instPropia`, `cantTel`, `servicio_codServicio`) VALUES
('idInst01', 1, 6.5, 1, 1, 'codServ01'),
('idInst02', 2, 8, 0, 2, 'codServ02'),
('idInst03', 3, 8.6, 1, 3, 'codServ03'),
('idInst04', 4, 10, 1, 1, 'codServ04'),
('idInst05', 5, 3, 0, 1, 'codServ03'),
('idInst06', 6, 18, 0, 5, 'codServ01');

INSERT INTO `region` (`codRegion`, `encargado`, `sucursal_codSucursal`) VALUES
('codReg1', 'Marta Sanchez', 'codsuc1'),
('codReg2', 'Esteban Mora', 'codsuc1'),
('codReg3', 'Elena Zandoval', 'codsuc2'),
('codReg4', 'Adriana Sanchez', 'codsuc2');

INSERT INTO `servicio` (`codServicio`, `fechaInst`, `direccion`, `region_codRegion`, `suscriptor_idSuscriptor`) VALUES
('codServ01', '2012-09-10', 'Contiguo a deposito', 'codReg1', 'idSuscr01'),
('codServ02', '2012-09-02', 'Contiguo a pulperia', 'codReg2', 'idSuscr02'),
('codServ03', '2012-09-13', 'Contiguo a deposito', 'codReg3', 'idSuscr03'),
('codServ04', '2012-08-14', 'Contiguo a pulperia', 'codReg4', 'idSuscr04');

INSERT INTO `servicioextra` (`codServExtra`, `nombre`, `servicio_codServicio`) VALUES
('codServE01', 'Cable Digital', 'codServ01'),
('codServE02', 'Internet', 'codServ01'),
('codServE03', 'Cable Digital', 'codServ02'),
('codServE04', 'Red Privada', 'codServ02'),
('codServE05', 'Cable Digital', 'codServ03'),
('codServE06', 'Internet', 'codServ03'),
('codServE07', 'Cable Digital', 'codServ04'),
('codServE08', 'Internet', 'codServ04');

INSERT INTO `sucursal` (`codSucursal`, `telefono`, `ciudad`, `direccion`, `encargado`) VALUES
('codsuc1', '22602258', 'Heredia', '100m Norte del Estadio', 'Carlos Lopez'),
('codsuc2', '22659875', 'San Jose', 'Frente al BN', 'Maria Morales');

INSERT INTO `suscriptor` (`idSuscriptor`, `nombre`, `identificacion`, `telefono`, `direccion`) VALUES
('idSuscr01', 'Mauren Salazar', '401225416', '86958745', 'Heredia'),
('idSuscr02', 'Adrian Solano', '65241154', '89574545', 'San Jose'),
('idSuscr03', 'Gimena Hernandez', '456982525', '26659875', 'San Jose'),
('idSuscr04', 'Luis Acosta', '50626659', '88755742', 'Heredia, Belen');

INSERT INTO `tipoaveria` (`idTipoAveria`, `nombre`, `averia_codAveria`) VALUES
('idtipaver01', 'Sin señal', 'codAveria01'),
('idtipaver02', 'Problema con canales', 'codAveria02'),
('idtipaver03', 'Imagen defectuosa', 'codAveria03'),
('idtipaver04', 'Configuracion', 'codAveria04');

INSERT INTO `tipovivienda` (`idTipVivienda`, `nombre`, `servicio_codServicio`) VALUES
('idTipViv01', 'Apartamento', 'codServ01'),
('idTipViv02', 'Condominio', 'codServ02'),
('idTipViv03', 'Casa Independiente', 'codServ03'),
('idTipViv04', 'Casa en Grupo', 'codServ04');


