package PatronBuilder;

public class Normal implements PizzaBuilder {
	private Producto pizza;
	
	public Normal() {
		this.pizza = new Producto();
	}
	
	@Override
	public void contruirMasa() {
		pizza.setMasa("Masa fina");
	}

	@Override
	public void construirSalsa() {
		pizza.setSalsa("Salsa de tomate");
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
		pizza.setCebolla(null);
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
