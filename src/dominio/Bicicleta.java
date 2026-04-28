package dominio;

public class Bicicleta extends Transporte {

	private static Double limiteDeCarga = 15.0;
	private static Double limiteDeVolumen = 0.125;

	@Override
	public Boolean agregarDestino(Destino destino) {

		if (this.getListaDeDestino().isEmpty() && getListaDeDestino().size() < 1) {
			return super.getListaDeDestino().add(destino);
		}
		return false;
	}

	@Override
	public Boolean registrarPaquete(Destino destino, Paquete paquete) {
		if (this.getListaDeDestino().contains(destino) && getListaDePaquete().size() <= 2
				&& paquete.getPeso() <= limiteDeCarga && paquete.getVolumen() <= limiteDeVolumen ) {
			return getListaDePaquete().add(paquete);
		}
		return false;
	}

}
