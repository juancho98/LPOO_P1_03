package lpoo_p1_03.cap9;

import java.util.Scanner;

class Majors {
	
	public static void main(String[] args) {
		
		String materia;
		Scanner datos= new Scanner(System.in);
		System.out.println("Enter Major: ");
		for (majors maj: majors.values()){
			System.out.println(maj);		
		}
		materia=datos.nextLine();
		switch (materia){
			case "ACC":
			case "CIS":
			System.out.println("Esta materia cae en la divisi�n empresarial");
			break;
			case"CHEM":
			case"PHYS":
			System.out.println("Esta materia cae en la divisi�n de ciencias");
			break;
			case"ENG":
			case"HIS":
			System.out.println("Esta materia cae en la division de humanidades");
			break;
			default:
			System.out.println("Esta NO es una materia");
		}
	}
}
enum majors{ACC, CHEM, CIS, ENG, HIS, PHYS}