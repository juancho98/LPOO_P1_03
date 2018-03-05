/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo_p1_03.cap5;

/**
 *
 * @author jdani
 */
import java.util.Scanner;

public class EvenOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer number;
        Scanner datos= new Scanner(System.in);
        System.out.println("ingresa un entero: ");
	number = datos.nextInt();
        if((number%2)==0){
            System.out.println("Tu número es par");
        }else{
            System.out.println("Tu número es impar");
        }
		

    }
    
}
