package PatronBuilder;

public class AppBuilder {

	public static void main(String[] args) {
		Director director = new Director();
		Normal pizzaNormal = new Normal();
		Fugazzeta pizzaFugazzeta = new Fugazzeta();
		
		director.builder(pizzaNormal);
		director.builder(pizzaFugazzeta);
		
		Producto pizzaNormalHecha = pizzaNormal.getProducto();
		Producto pizzaFugazzetaHecha = pizzaFugazzeta.getProducto();
	
		System.out.println(pizzaNormalHecha);
		System.out.println(pizzaFugazzetaHecha);
	}

}
