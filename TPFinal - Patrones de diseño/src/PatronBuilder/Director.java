package PatronBuilder;

public class Director {
	
	public Director(){}
	
	public void builder(PizzaBuilder pizza) {
		
		pizza.contruirMasa();
		pizza.construirSalsa();
		pizza.construirParmesano();
		pizza.construirMozzarella();
		pizza.construirCebolla();
		pizza.construirPaleta();
		pizza.construirAceitunas();
		pizza.construirTomate();
		
	}

}
