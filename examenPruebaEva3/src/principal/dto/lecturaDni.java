package principal.dto;

import java.util.Scanner;

public class lecturaDni {
	//Atributos
	private int numeroDNI;
	private char letraDNI;
	//Geters y Seters
	public int getNumeroDNI() {
		return numeroDNI;
	}
	public void setNumeroDNI(int numeroDNI) {
		this.numeroDNI = numeroDNI;
	}
	public char getLetraDNI() {
		return letraDNI;
	}
	public void setLetraDNI(char letraDNI) {
		this.letraDNI = letraDNI;
	}
	//Constructores
	public lecturaDni() {
		super();
	}
	public lecturaDni(int numeroDNI, char letraDNI) {
		super();
		this.numeroDNI = numeroDNI;
		this.letraDNI = letraDNI;
	}
	
	public lecturaDni lectorDni(){
		lecturaDni dni = new lecturaDni();
		char [] vectorLetras= new char [] {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'T'};
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca el numero del DNI: ");
		dni.setNumeroDNI(leer.nextInt());
		System.out.println("Introduzca la letra del DNI: ");
		//Touppercase sirve para poner letras en mayuscula
		String letras= leer.next().toUpperCase();
		//si es mayor o menor entra para volver a pedirlo
		if(dni.getNumeroDNI()<0||dni.getNumeroDNI()>99999999) {
			while(dni.getNumeroDNI()<0||dni.getNumeroDNI()>99999999) {
				System.out.println("El numero proporcionado no es valido");
				System.out.println("Introduzca el numero del DNI: ");
				dni.setNumeroDNI(leer.nextInt());
			}
		}
		//calcula la letra
		dni.setLetraDNI(vectorLetras[dni.getNumeroDNI()%23]);
		//si es distinta lo vulve a pedir
		//el charat coge solo una letra
		if(letras.charAt(0)!=dni.getLetraDNI()) {
			while(letras.charAt(0)!=dni.getLetraDNI()) {
				System.out.println("La letra proporcionada no es valido");
				System.out.println("Introduzca la letra del DNI: ");
				letras=leer.next().toUpperCase();
			}
		}
		
		System.out.println("El numero indicado y letra son sorrectos");	
		leer.close();
		return dni;
		
	}
	
	

}
