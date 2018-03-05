/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo_p1_03.cap6;

import java.util.Scanner;

/**
 *
 * @author jdani
 */
public class CollegeCost {

    public static void main(String[] args) {
        int ed;
	int co;
        Scanner datos=new Scanner(System.in);
	
        System.out.println("Edad: ");
	ed = datos.nextInt();
		
        System.out.println("colegiatura: ");
	co= datos.nextInt();

        while (ed>=18){
            System.out.println("edad no valida");
            System.out.print("La edad debe ser menor de 18\nIntente. ");
            ed=datos.nextInt();
	}
	System.out.println("Tiene que guardar $" + co/(18-ed) + " por anio");
    }
    
}
