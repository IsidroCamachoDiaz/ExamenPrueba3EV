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
}
