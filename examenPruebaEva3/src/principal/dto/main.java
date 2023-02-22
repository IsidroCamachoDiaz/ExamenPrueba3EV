package principal.dto;

import interfaz.implementacionLectura;
import interfaz.interfazDni;

public class main {

	public static void main(String[] args) {
		lecturaDni dni = new lecturaDni();
		interfazDni lector = new implementacionLectura();
		dni=lector.lectorDni();
	}

}
