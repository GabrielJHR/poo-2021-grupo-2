package cartas;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;

public class Mazo {
	private List<Naipe> naipes;

	public Mazo() {
		super();
		this.naipes = new ArrayList<Naipe>();
		this.inicializar();
	}

	public List<Naipe> getNaipes() {
		return naipes;
	}

	public void setNaipes(List<Naipe> naipes) {
		this.naipes = naipes;
	}
	
	private void inicializar() {
		for ( int i = 1; i <= 12 ; i++ ) {
			naipes.add(new Naipe(i,Palo.BASTO));
			naipes.add(new Naipe(i,Palo.COPA));
			naipes.add(new Naipe(i,Palo.ESPADA));
			naipes.add(new Naipe(i,Palo.ORO));
		}
	}
	
	public void mezclar() {
		Collections.shuffle(naipes);
	}
	
	public Naipe sacarNaipeArriba() {
		if (this.naipes.isEmpty()) {
			return null;
		}else {
			return naipes.remove(naipes.size() -1);
		}
	}
	
	public Naipe sacarNaipeAbajo() {
		if (this.naipes.isEmpty()) {
			return null;
		}else {
			return naipes.remove(0);
		}
	}

	@Override
	public String toString() {
		return "Mazo: " + naipes + ",";
	}
	
	
	
}
