package PatronBuilder;

public interface PizzaBuilder {
	
	public void contruirMasa();
	public void construirSalsa();
	public void construirParmesano();
	public void construirMozzarella();
	public void construirCebolla();
	public void construirPaleta();
	public void construirAceitunas();
	public void construirTomate();
	public Producto getProducto();

}
