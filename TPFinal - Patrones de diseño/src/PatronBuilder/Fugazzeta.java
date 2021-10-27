package PatronBuilder;

public class Fugazzeta implements PizzaBuilder {

private Producto pizza;
	
	public Fugazzeta() {
		this.pizza = new Producto();
	}
	
	@Override
	public void contruirMasa() {
		pizza.setMasa("Masa gruesa");
	}

	@Override
	public void construirSalsa() {
		pizza.setSalsa(null);
	}

	@Override
	public void construirParmesano() {
		pizza.setParmesano(null);
	}

	@Override
	public void construirMozzarella() {
		pizza.setMozzarella("Mozzarella");
	}

	@Override
	public void construirCebolla() {
		pizza.setCebolla("Cebolla");
	}

	@Override
	public void construirPaleta() {
		pizza.setPaleta(null);		
	}

	@Override
	public void construirAceitunas() {
		pizza.setAceitunas(null);		
	}

	@Override
	public void construirTomate() {
		pizza.setTomate(null);	
	}
	
	public Producto getProducto() {		
		return this.pizza;
	}

}
