package dominio;

public class Auto extends Transporte {

	private static Double limiteDeCarga = 500.0;
	private static Double limiteDeVolumen = 2.0;
	
	@Override
	public Boolean agregarDestino(Destino destino) {
		if(this.getListaDeDestino().size() <= 2) {
		return	this.getListaDeDestino().add(destino);
			
		}
		return false;
	}

	@Override
	public Boolean registrarPaquete(Destino destino, Paquete paquete) {
		if(this.getListaDeDestino().contains(destino) && getListaDePaquete().size()<3
				&& paquete.getPeso() <= limiteDeCarga && paquete.getVolumen() <= limiteDeVolumen) {
			return super.getListaDePaquete().add(paquete);
		}
		return false;
	}

	

}
