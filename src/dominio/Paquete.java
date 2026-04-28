package dominio;

public class Paquete {
	
	private Double largo,ancho,profundidad,peso;

	public Paquete(Double largo, Double ancho, Double profundidad, Double peso) {
		this.largo = largo;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.peso = peso;
	}

	public Double getVolumen() {
		return profundidad * largo * ancho;
	}

	public Double getPeso() {
		return peso;
	}
	
	

}
