package dataBasePc;

import java.util.*;

public class Services {

	//Metodo para mostrar las distintas opciones que pudemos elegir
	public static void mostrarMenu() {
		System.out.println("Menú:");
		System.out.println("1. Añadir ordenador");
		System.out.println("2. Eliminar ordenador");
		System.out.println("3. Listado de los equipos");
		System.out.println("4. Datos de un equipo");
		System.out.println("5. Equipos por marca");
		System.out.println("6. Equipos por disco duro");
		System.out.println("7. Equipos por año de venta");
		System.out.println("8. Guardar los datos");
		System.out.println("0. Salir");
		System.out.print("Ingrese una opción: ");
	}



	//Metodos para agregar ordenador y no se encuentra en la lista
	public static void agregarOrdenador(List<Profesional> listaProfesional, List<Sobremesa> listaSobremesa, List<Portatil> listaPortatil, Scanner teclado) {
		System.out.println("Añadir ordenador");
		System.out.println("Selecciona el tipo");
		System.out.println("1. Ordenador profesional");
		System.out.println("2. Ordenador de sobremesa");
		System.out.println("3. Ordenador portátil");
		System.out.println("0. Salir ");
		int opcionPc = teclado.nextInt();

		switch (opcionPc) {
		case 0:
			break;

		case 1:
			agregarProfesional(listaProfesional, teclado);
			break;

		case 2:
			agregarSobremesa(listaSobremesa, teclado);
			break;

		case 3:
			agregarPortatil(listaPortatil, teclado);
			break;

		default:
			System.out.println("Opción inválida. Intente nuevamente.");
			break;
		}
	}

	private static void agregarProfesional(List<Profesional> listaProfesional, Scanner teclado) {
		System.out.println("Crear PC Profesional");
		String marca, modelo;
		System.out.print("Ingrese la marca: Ej: Asus ");
		marca = teclado.next();
		System.out.print("Ingrese el modelo: Ej: Rog ");
		modelo = teclado.next();

		if (verificarExistenciaOrdenador(listaProfesional, marca.toUpperCase(), modelo.toUpperCase())) {
			System.out.println("Ya existe un ordenador profesional con la combinación de marca y modelo proporcionada.");
		} else {
			int añoSalida, tiempoComercializacion, numeroProcesadores;
			float potencia;
			System.out.print("Ingrese el año de salida: Ej: 2023 ");
			añoSalida = teclado.nextInt();
			System.out.print("Ingrese el tiempo de comercialización (2-6):  Ej: 6");
			tiempoComercializacion = teclado.nextInt();
			System.out.print("Ingrese el número de procesadores: Ej: 4 ");
			numeroProcesadores = teclado.nextInt();
			System.out.print("Ingrese la potencia: Ej: 2,2 ");
			potencia = teclado.nextFloat();

			Profesional profesional = new Profesional(marca, modelo, añoSalida, tiempoComercializacion, numeroProcesadores, potencia);
			listaProfesional.add(profesional);
			System.out.println("Ordenador profesional agregado con éxito.");
		}
	}

	private static void agregarSobremesa(List<Sobremesa> listaSobremesa, Scanner teclado) {
		System.out.println("Crear PC de Escritorio");
		String marca, modelo;
		System.out.print("Ingrese la marca: Ej: Asus");
		marca = teclado.next();
		System.out.print("Ingrese el modelo: Ej: Rog");
		modelo = teclado.next();

		if (verificarExistenciaOrdenador(listaSobremesa, marca, modelo)) {
			System.out.println("Ya existe un ordenador de escritorio con la combinación de marca y modelo proporcionada.");
		} else {
			int añoSalida, tiempoComercializacion, ramKb;
			float precio, versionPci;
			String tipoDiscoDuro;
			System.out.print("Ingrese el año de salida: Ej: 2023 ");
			añoSalida = teclado.nextInt();
			System.out.print("Ingrese el tiempo de comercialización (2-6): Ej: 4 ");
			tiempoComercializacion = teclado.nextInt();
			System.out.print("Ingrese el precio: Ej: 499,99");
			precio = teclado.nextFloat();
			System.out.print("Ingrese la versión de PCI: Ej: 5,0");
			versionPci = teclado.nextFloat();
			System.out.print("Ingrese el tipo de disco duro: Ej: SSD ");
			tipoDiscoDuro = teclado.next();
			System.out.print("Ingrese la cantidad de RAM (en KB): Ej: 10000");
			ramKb = teclado.nextInt();

			Sobremesa sobremesa = new Sobremesa(marca, modelo, añoSalida, tiempoComercializacion, precio, versionPci, tipoDiscoDuro, ramKb);
			listaSobremesa.add(sobremesa);
			System.out.println("Ordenador de escritorio agregado con éxito.");
		}
	}

	private static void agregarPortatil(List<Portatil> listaPortatil, Scanner teclado) {
		System.out.println("Crear PC Portátil");
		String marca, modelo;
		System.out.print("Ingrese la marca: Ej: Asus");
		marca = teclado.next();
		System.out.print("Ingrese el modelo: Ej: Rog ");
		modelo = teclado.next();

		if (verificarExistenciaOrdenador(listaPortatil, marca, modelo)) {
			System.out.println("Ya existe un ordenador portátil con la combinación de marca y modelo proporcionada.");
		} else {
			int añoSalida, tiempoComercializacion, tiempoCarga;
			float precio, versionPci, peso;
			System.out.print("Ingrese el año de salida: Ej: 2023 ");
			añoSalida = teclado.nextInt();
			System.out.print("Ingrese el tiempo de comercialización (2-6): Ej: 5 ");
			tiempoComercializacion = teclado.nextInt();
			System.out.print("Ingrese el precio: Ej: 499,99");
			precio = teclado.nextFloat();
			System.out.print("Ingrese la versión de PCI: Ej: 6,0");
			versionPci = teclado.nextFloat();
			System.out.print("Ingrese el peso: Ej: 9,99");
			peso = teclado.nextFloat();
			System.out.print("Ingrese el tiempo de carga: Ej: 80");
			tiempoCarga = teclado.nextInt();

			Portatil portatil = new Portatil(marca, modelo, añoSalida, tiempoComercializacion, precio, versionPci, peso, tiempoCarga);
			listaPortatil.add(portatil);
			System.out.println("Ordenador portátil agregado con éxito.");
		}
	}

	//Metodo para comprobar si un ordenador esta en la lista
	private static <T extends Ordenador> boolean verificarExistenciaOrdenador(List<T> listaOrdenadores, String marca, String modelo) {
		for (T ordenador : listaOrdenadores) {
			if (ordenador.getMarca().equals(marca) && ordenador.getModelo().equals(modelo)) {
				return true;
			}
		}
		return false;
	}




	//Metodo que busca la marca y el modelo en todas las listas y lo elimina
	public static void eliminarOrdenador(List<Profesional> listaProfesional, List<Sobremesa> listaSobremesa, List<Portatil> listaPortatil, Scanner teclado) {

		System.out.println("Eliminar ordenador");
		System.out.print("Ingrese la marca: Ej: Asus");
		String marca = (teclado.next()).toUpperCase();
		System.out.print("Ingrese el modelo: Ej: Rog");
		String modelo = (teclado.next()).toUpperCase();

		boolean encontrado = false;

		// Buscar y eliminar en la lista de ordenadores profesionales
		for (Iterator<Profesional> iterator = listaProfesional.iterator(); iterator.hasNext(); ) {
			Profesional profesional = iterator.next();
			if (profesional.getMarca().equals(marca) && profesional.getModelo().equals(modelo)) {
				iterator.remove();
				encontrado = true;
				break;
			}
		}

		// Buscar y eliminar en la lista de ordenadores de sobremesa
		if (!encontrado) {
			for (Iterator<Sobremesa> iterator = listaSobremesa.iterator(); iterator.hasNext(); ) {
				Sobremesa sobremesa = iterator.next();
				if (sobremesa.getMarca().equals(marca) && sobremesa.getModelo().equals(modelo)) {
					iterator.remove();
					encontrado = true;
					break;
				}
			}
		}

		// Buscar y eliminar en la lista de ordenadores portátiles
		if (!encontrado) {
			for (Iterator<Portatil> iterator = listaPortatil.iterator(); iterator.hasNext(); ) {
				Portatil portatil = iterator.next();
				if (portatil.getMarca().equals(marca) && portatil.getModelo().equals(modelo)) {
					iterator.remove();
					encontrado = true;
					break;
				}
			}
		}

		if (encontrado) {
			System.out.println("Ordenador eliminado correctamente.");
		} else {
			System.out.println("No se encontró un ordenador con la marca y modelo especificados.");
		}
	}

	//Metodo para mostrar una lista con los ordenadores ordenados
	public static void mostrarListadoEquipos(List<Profesional> listaProfesional, List<Sobremesa> listaSobremesa, List<Portatil> listaPortatil) {
		// Combinar las listas de ordenadores en una lista general
		List<Ordenador> listaOrdenadores = new ArrayList<>();
		listaOrdenadores.addAll(listaProfesional);
		listaOrdenadores.addAll(listaSobremesa);
		listaOrdenadores.addAll(listaPortatil);

		// Ordenar la lista de ordenadores alfabéticamente por marca, año y modelo
		Collections.sort(listaOrdenadores, new Comparator<Ordenador>() {
			@Override
			public int compare(Ordenador o1, Ordenador o2) {
				int marcaComparison = o1.getMarca().compareTo(o2.getMarca());
				if (marcaComparison != 0) {
					return marcaComparison;
				}
				int añoComparison = Integer.compare(o1.getAñoSalida(), o2.getAñoSalida());
				if (añoComparison != 0) {
					return añoComparison;
				}
				return o1.getModelo().compareTo(o2.getModelo());
			}
		});

		// Imprimir el encabezado
		System.out.println("Marca\t\tModelo\t\tAño Salida\tTiempo Comercialización");

		// Imprimir los datos de cada equipo
		for (Ordenador ordenador : listaOrdenadores) {
			System.out.printf("%s\t\t%s\t\t%d\t\t%d\n", ordenador.getMarca(), ordenador.getModelo(),
					ordenador.getAñoSalida(), ordenador.getTiempoComercializacion());
		}
	}

	//Metodo para mostrar los ordenadoes de una marca en concreto
	public static void mostrarOrdenadoresPorMarca(List<Profesional> listaProfesional, List<Sobremesa> listaSobremesa, List<Portatil> listaPortatil) {
		// Combinar las listas de ordenadores en una lista general
		List<Ordenador> listaOrdenadores = new ArrayList<>();
		listaOrdenadores.addAll(listaProfesional);
		listaOrdenadores.addAll(listaSobremesa);
		listaOrdenadores.addAll(listaPortatil);

		// Solicitar la marca al usuario
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la marca de los ordenadores a mostrar:");
		String marca = scanner.nextLine().toUpperCase();

		// Crear una nueva lista para almacenar los ordenadores filtrados
		List<Ordenador> ordenadoresFiltrados = new ArrayList<>();

		// Filtrar los ordenadores por la marca proporcionada
		for (Ordenador ordenador : listaOrdenadores) {
			if (ordenador.getMarca().equals(marca)) {
				ordenadoresFiltrados.add(ordenador);
			}
		}

		System.out.println("Marca\t\tModelo\t\tAño Salida\tTiempo Comercialización");

		// Imprimir los datos de los ordenadores filtrados
		for (Ordenador ordenador : ordenadoresFiltrados) {
			System.out.printf("%s\t\t%s\t\t%d\t\t%d\n", ordenador.getMarca(), ordenador.getModelo(),
					ordenador.getAñoSalida(), ordenador.getTiempoComercializacion());
		}
	}

	//Metodo para mostrar los datos de un ordenador en concreto
	public static void mostrarDatosOrdenador(List<Profesional> listaProfesional, List<Sobremesa> listaSobremesa, List<Portatil> listaPortatil) {
		// Combinar las listas de ordenadores en una lista general
		List<Ordenador> listaOrdenadores = new ArrayList<>();
		listaOrdenadores.addAll(listaProfesional);
		listaOrdenadores.addAll(listaSobremesa);
		listaOrdenadores.addAll(listaPortatil);

		// Solicitar la marca y el modelo al usuario
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce la marca del ordenador:");
		String marca = scanner.nextLine().toUpperCase();
		System.out.println("Introduce el modelo del ordenador:");
		String modelo = scanner.nextLine().toUpperCase();

		// Buscar el ordenador en la lista
		Ordenador ordenadorEncontrado = null;
		for (Ordenador ordenador : listaOrdenadores) {
			if (ordenador.getMarca().equals(marca) && ordenador.getModelo().equals(modelo)) {
				ordenadorEncontrado = ordenador;
				break;
			}
		}

		// Mostrar los datos del ordenador encontrado
		if (ordenadorEncontrado != null) {
			System.out.println("Marca: " + ordenadorEncontrado.getMarca());
			System.out.println("Modelo: " + ordenadorEncontrado.getModelo());
			System.out.println("Año de salida: " + ordenadorEncontrado.getAñoSalida());
			System.out.println("Tiempo de comercialización: " + ordenadorEncontrado.getTiempoComercializacion());
		} else {
			System.out.println("No se encontró ningún ordenador con la marca y modelo especificados.");
		}
	}

	//Metodo para mostrar los ordenadores de sobremesa divididos por tipo de disco
	public static void mostrarDiscosDurosSobremesa(List<Sobremesa> listaSobremesa) {
		// Obtener los tipos de discos duros únicos de los ordenadores de sobremesa
		Set<String> tiposDiscosDuros = new HashSet<>();
		for (Sobremesa sobremesa : listaSobremesa) {
			tiposDiscosDuros.add(sobremesa.getTipoDiscoDuro());
		}

		// Mostrar los datos de los ordenadores de sobremesa para cada tipo de disco duro
		System.out.println("Ordenadores de sobremesa por tipo de disco duro:");

		for (String tipoDiscoDuro : tiposDiscosDuros) {
			System.out.println("Tipo de disco duro: " + tipoDiscoDuro);
			System.out.println("Marca\t\tModelo\t\tAño de Salida\tTiempo Comercialización");

			for (Sobremesa sobremesa : listaSobremesa) {
				if (sobremesa.getTipoDiscoDuro().equals(tipoDiscoDuro)) {
					System.out.println(sobremesa.getMarca() + "\t\t" + sobremesa.getModelo() + "\t\t" + sobremesa.getAñoSalida() + "\t\t" + sobremesa.getTiempoComercializacion());
				}
			}
			System.out.println();
		}
	}

	//Metodo para ver todos lo ordenadores de un año y sacar un recuento
	public static void mostrarOrdenadoresPorAño(List<Profesional> listaProfesional, List<Sobremesa> listaSobremesa, List<Portatil> listaPortatil) {
		// Combinar las listas de ordenadores en una lista general
		List<Ordenador> listaOrdenadores = new ArrayList<>();
		listaOrdenadores.addAll(listaProfesional);
		listaOrdenadores.addAll(listaSobremesa);
		listaOrdenadores.addAll(listaPortatil);

		// Solicitar el año al usuario
		Scanner scanner = new Scanner(System.in);
		System.out.println("Introduce el año:");
		int año = scanner.nextInt();

		// Filtrar los ordenadores del año especificado
		List<Ordenador> ordenadoresFiltrados = new ArrayList<>();
		for (Ordenador ordenador : listaOrdenadores) {
			if (ordenador.getAñoSalida() == año) {
				ordenadoresFiltrados.add(ordenador);
			}
		}

		// Mostrar los encabezados de las columnas
		System.out.println("Marca\t\tModelo\t\tAño\t\tTiempo Comercialización");
		System.out.println("--------------------------------------------------------------");

		// Mostrar los datos de los ordenadores en columnas
		int recuentoTotal = 0;
		for (Ordenador ordenador : ordenadoresFiltrados) {
			System.out.printf("%-15s%-15s%-10d%-20d\n", ordenador.getMarca(), ordenador.getModelo(), ordenador.getAñoSalida(), ordenador.getTiempoComercializacion());
			recuentoTotal++;
		}

		// Mostrar el recuento total
		System.out.println("Total de ordenadores del año " + año + ": " + recuentoTotal);
	}

}
