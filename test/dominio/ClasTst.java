package dominio;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class ClasTst {
	
	private Paquete paqueteChico;
	private Paquete paqueteMediano;
	private Paquete paqueteGrande;
	private Paquete paquetePesoExcedido;
	private Paquete paqueteVolumenExedido;
	private Transporte bicicleta;
	private Transporte auto;
	private Transporte camion;
	private Destino destino1;
	private Destino destino2;
	private Destino destino3;
	private Destino destino4;
	private Destino destinoRepetido;
	
	@Before
	public void init() {
		this.paqueteChico = new Paquete(0.5, 0.5, 0.5, 15.0);
		this.paqueteMediano = new Paquete(1.5, 0.5, 2.0, 500.0);
		this.paqueteGrande = new Paquete(2.5, 2.5, 3.0, 16000.0);
		this.paquetePesoExcedido = new Paquete(0.6, 0.5, 0.5, 16000.1);
		this.paqueteVolumenExedido = new Paquete (3.0, 3.0, 3.0 ,14.0);
		this.bicicleta = new Bicicleta();
		this.destino1 = new Destino(" San Justo ");
		this.destino2 = new Destino(" Moron ");
		this.destino3 = new Destino(" Ramos ");
		this.destino4 = new Destino(" Linears ");
		this.destinoRepetido = new Destino(" San Justo ");
		this.auto = new Auto();
		this.camion = new Camion();
	}
	
	@Test
	public void dadoQueTegoUnaEmpresaDeTransporteQuieroAgregarUnDestinoParaUnaBicicleta() {
		assertTrue(this.bicicleta.agregarDestino( this.destino1 ));
		//assertTrue(this.bicicleta.agregarDestino(this.destino2));
	}
	
	@Test
	public void dadoQueTegoUnaEmpresaDeTransporteQuieroAgregarUnDestinoParaUnaAuto() {
		assertTrue(this.auto.agregarDestino( this.destino1 ));
		assertTrue(this.auto.agregarDestino( this.destino2 ));
		assertTrue(this.auto.agregarDestino( this.destino3 ));
		//assertTrue(this.auto.agregarDestino( this.destino4 ));
	}
	
	@Test
	public void dadoQueTegoUnaEmpresaDeTransporteNoQuieroAgregarUnDestinoRepetidoParaUnaAuto() {
		assertTrue(this.auto.agregarDestino( this.destino1 ));
		assertTrue(this.auto.agregarDestino( this.destino2 ));
		assertFalse(this.auto.agregarDestino( this.destinoRepetido ));
		//assertTrue(this.auto.agregarDestino( this.destino4 ));
	}
	
	@Test
	public void dadoQueTegoUnaEmpresaDeTransporteQuieroAgregarUnDestinoParaUnaCamion() {
		assertTrue(this.camion.agregarDestino( this.destino1 ));
		assertTrue(this.camion.agregarDestino( this.destino2 ));
		assertTrue(this.camion.agregarDestino( this.destino3 ));
		assertTrue(this.camion.agregarDestino( this.destino4 ));
		
	}
	
	@Test
	public void dadoQueTegoUnaEmpresaDeTransporteNOQuieroAgregarDosDestinoParaUnaBicicleta() {
		assertTrue(this.bicicleta.agregarDestino( this.destino1 ));
		assertFalse(this.bicicleta.agregarDestino(this.destino2));
	}
	
	@Test
	public void dadoQueTegoUnaEmpresaDeTransporteNoQuieroAgregarUnDestinoParaUnaAuto() {
		assertTrue(this.auto.agregarDestino( this.destino1 ));
		assertTrue(this.auto.agregarDestino( this.destino2 ));
		assertTrue(this.auto.agregarDestino( this.destino3 ));
		assertFalse(this.auto.agregarDestino( this.destino4 ));	
	}
	
	@Test
	public void dadoQueTegoUnaEmpresaDeTransporteQuieroAgregarUnPaqueteParaUnaBicicleta() {
		assertTrue(this.bicicleta.agregarDestino( this.destino1 ));
		assertTrue(this.bicicleta.registrarPaquete(this.destino1, this.paqueteChico));
	}
	
	@Test
	public void dadoQueTegoUnaEmpresaDeTransporteNOQuieroAgregarUnPaqueteConPesoExedidoParaUnaBicicleta() {
		assertTrue(this.bicicleta.agregarDestino( this.destino2 ));
		assertFalse(this.bicicleta.registrarPaquete(this.destino2, this.paquetePesoExcedido));
	}
	
	@Test
	public void dadoQueTegoUnaEmpresaDeTransporteNOQuieroAgregarUnPaqueteConVolumenExedidoParaUnaBicicleta() {
		assertTrue(this.bicicleta.agregarDestino( this.destino2 ));
		assertFalse(this.bicicleta.registrarPaquete(this.destino2, this.paqueteVolumenExedido));
	}
	
	@Test
	public void dadoQueTegoUnaEmpresaDeTransporteQuieroAgregarUnPaqueteParaUnaAuto() {
		assertTrue(this.auto.agregarDestino( this.destino1 ));
		assertTrue(this.auto.registrarPaquete(this.destino1, this.paqueteMediano));
	}
	
	@Test
	public void dadoQueTegoUnaEmpresaDeTransporteNoQuieroAgregarUnPaqueteConPesoExcedidoParaUnaAuto() {
		assertTrue(this.auto.agregarDestino( this.destino1 ));
		assertFalse(this.auto.registrarPaquete(this.destino1, this.paquetePesoExcedido));
	}
	
	@Test
	public void dadoQueTegoUnaEmpresaDeTransporteNoQuieroAgregarUnPaqueteConVolumenExcedidoParaUnaAuto() {
		assertTrue(this.auto.agregarDestino( this.destino1 ));
		assertFalse(this.auto.registrarPaquete(this.destino1, this.paqueteVolumenExedido));
	}
	
	@Test
	public void dadoQueTegoUnaEmpresaDeTransporteQuieroAgregarUnPaqueteParaUnaCamion() {
		assertTrue(this.camion.agregarDestino( this.destino1 ));
		assertTrue(this.camion.registrarPaquete(this.destino1, this.paqueteGrande));
	}
	
	@Test
	public void dadoQueTegoUnaEmpresaDeTransporteNoQuieroAgregarUnPaqueteconPesoExedidoParaUnaCamion() {
		assertTrue(this.camion.agregarDestino( this.destino1 ));
		assertFalse(this.camion.registrarPaquete(this.destino1, this.paquetePesoExcedido));
	}
	
	@Test
	public void dadoQueTegoUnaEmpresaDeTransporteNoQuieroAgregarUnPaqueteConVolumenExedidoParaUnaCamion() {
		assertTrue(this.camion.agregarDestino( this.destino1 ));
		assertFalse(this.camion.registrarPaquete(this.destino1, this.paqueteVolumenExedido));
	}
	
}
