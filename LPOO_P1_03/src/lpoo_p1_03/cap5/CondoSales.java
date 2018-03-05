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
public class CondoSales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer number;
        Scanner datos = new Scanner(System.in);
        System.out.println("elige una opción: \n1.- Vista del parque \n2.- Vista del campo de golf \n3.- Vista del lago:");
	number = datos.nextInt();
        if(number==1){
                System.out.println("Vista elegida: Vista del parque \nPrecio: $ 150,000");
        }else if(number ==2){
                System.out.println("Vista elegida: vistas del campo de golf \nPrecio del condominio: $ 170,000");
        }else if(number==3){
                System.out.println("Vista elegida: vistas al lago \nPrecio del condominio: $ 210,000");
        }else{
                System.out.println("Vista elegida: incorrecta \nPrecio del condominio: $ 0");
        
        }
    }
    
}
