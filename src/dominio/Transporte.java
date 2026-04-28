package dominio;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public abstract class Transporte {

	private List<Paquete> listaDePaquete;
	private Set<Destino> listaDeDestino;

	public Transporte() {
		this.listaDePaquete = new LinkedList<>();
		this.listaDeDestino = new HashSet<>();
		;
	}

	public List<Paquete> getListaDePaquete() {
		return listaDePaquete;
	}

	public Set<Destino> getListaDeDestino() {
		return listaDeDestino;
	}

	public abstract Boolean agregarDestino(Destino destino);
	public abstract Boolean registrarPaquete(Destino destino ,Paquete paquete);
	
}
