package ejercicio5;

import java.util.Scanner;

public class EstadisticaEmpleados {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i;
		String nombre;
		double salario;
		
		Empleado[] empleados = new Empleado[5];
		
		
		for(i=0 ; i < 5; i++) {
			System.out.print("Nombre: ");
			nombre = sc.next();
			System.out.print("Salario: ");
			salario = sc.nextDouble();
			
			empleados[i] = new Empleado(nombre, salario);
		}
		
		mayorSueldo(empleados);
		promedioSueldo(empleados);
		
		sc.close();
	}
	
	public static void mayorSueldo(Empleado[] empleados) {
		int i;
		Empleado mayor = empleados[0];
		
		
		for(i = 1; i < empleados.length ; i++ ) {
			if(empleados[i].getSueldo() > mayor.getSueldo()) {
				mayor = empleados[i];
			}
		}
		
		System.out.println("Nombre del empleado que cobra el mayor sueldo: " + mayor.getNombre());
		System.out.println("Sueldo del empleado que cobra el mayor sueldo: " + mayor.getSueldo());		
	}
	
	public static void promedioSueldo(Empleado[] empleados) {
		int i;
		double promedio = 0;
		
		for(i = 0 ;i < empleados.length; i++ ) {
			promedio += empleados[i].getSueldo() / empleados.length;
		}
		
		System.out.println("Sueldo promedio de los empleados: " + promedio);
	}

}
