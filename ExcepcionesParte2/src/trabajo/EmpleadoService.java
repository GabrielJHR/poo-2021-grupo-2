package trabajo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class EmpleadoService {
	private static List<Empleado> empleados = new ArrayList<Empleado>();

	public static EnteroPositivoException agregar(Empleado empleado) {

		if (empleados.isEmpty()) {
			try {
				empleado.setLegajo(1);
			}
			catch (EnteroPositivoException e) {
				return e;
			}

		} else {
			// Esto sirve para obtener el último empleado agregado. Mayor numero de legajo
			Empleado ultimo = Collections.max(empleados, new Comparator<Empleado>() {

				@Override
				public int compare(Empleado e1, Empleado e2) {
					if (e1.getLegajo() < e2.getLegajo()) {
						return -1;
					}
					if (e1.getLegajo() > e2.getLegajo()) {
						return 1;
					}
					return 0;
				}

			});
			try {
				empleado.setLegajo(ultimo.getLegajo() + 1);
			}
			catch (EnteroPositivoException e) {
				return e;
			}

		}

		empleados.add(empleado);

		return null;
	}

	public static List<Empleado> getEmpleados() {
		return empleados;
	}

	public static List<Empleado> getEmpleadosMezcaldos() {
		Collections.shuffle(empleados);
		return empleados;
	}

	public static Double sueldoPromedio() throws CollectionVaciaException {
		if( empleados.size() == 0 ) {
			throw new CollectionVaciaException("No hay empleados.");
		}
		else {
			Double total = 0.0;
			for (Empleado empleado : empleados) {
				total = total + empleado.getSueldo();
			}
			return total / empleados.size();	
		}
	}

	public static Empleado mayorSueldo() throws CollectionVaciaException {
		if( empleados.size() == 0 ) {
			throw new CollectionVaciaException("No hay empleados.");
		}
		else {
			Iterator<Empleado> iterator = empleados.iterator();
			Empleado mayor = iterator.next();
			while (iterator.hasNext()) {
				Empleado empleado = iterator.next();
				if (mayor.getSueldo() <= empleado.getSueldo()) {
					mayor = empleado;
				}
			}
			return mayor;
		}
	}

	public static void eliminar(String nombre) throws NoEncontradoException, CollectionVaciaException {
		if(empleados.size() > 0) {
			boolean encontrado = false;
			Iterator<Empleado> iterator = empleados.iterator();
			while (iterator.hasNext()) {
				Empleado empleado = iterator.next();
				if (empleado.getNombre().equalsIgnoreCase(nombre)) {
					encontrado = true;
					iterator.remove();
				}
			}
			
			if(!encontrado) {
				throw new NoEncontradoException("No se encontro el empleado.");
			}
		}
		else {
			throw new CollectionVaciaException("No hay empleados.");
		}
		
		
	}
}
