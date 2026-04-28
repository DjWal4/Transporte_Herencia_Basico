package dominio;

public class Camion extends Transporte {

	private static Double limiteDeCarga = 16000.0;
	private static Double limiteDeVolumen = 20.0;
	
	@Override
	public Boolean agregarDestino(Destino destino) {
		return super.getListaDeDestino().add(destino);
	}

	@Override
	public Boolean registrarPaquete(Destino destino, Paquete paquete) {
		if(getListaDeDestino().contains(destino) && paquete.getVolumen() <= limiteDeVolumen 
				&& paquete.getPeso() <= limiteDeCarga) {
			return super.getListaDePaquete().add(paquete);
		}
			
		return false;
	}

	

}
