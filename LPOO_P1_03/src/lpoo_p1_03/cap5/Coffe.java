/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo_p1_03.cap5;

import java.util.Scanner;

/**
 *
 * @author jdani
 */
public class Coffe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer opcion;
        double total=0;
        Scanner datos = new Scanner(System.in);
        System.out.println("elige una opcion:\n1.- American $1.99\n2.- Expresso $2.50\n3.- Latte $2.15\n0.- Exit");
	opcion = datos.nextInt();
        int cont=0;
        
        while(opcion!=0){
            if(opcion==1){
                total+=1.99;
            }else if(opcion == 2){
                total+=2.50;
            }else if(opcion == 3){
                total+=2.15;
            }
            System.out.println("ejige una opcion:\n1.- American $1.99\n2.- Expresso $2.50\n3.- Latte $2.15\n0.- Exit");
            opcion = datos.nextInt();
        }
        System.out.println("The total is $"+(float)total);
    }
    
}
