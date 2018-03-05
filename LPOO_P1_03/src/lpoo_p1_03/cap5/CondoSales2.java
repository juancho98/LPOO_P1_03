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
public class CondoSales2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer number;
        boolean i=false;
        int price = 0;
        Scanner datos = new Scanner(System.in);
        System.out.println("Elija un número: \n1.- Vista de parque \n2.- Vista de campo de golf \n3.- Vista de lago:");
	number = datos.nextInt();
        if(number==1){
                 i=true;  
                 price = 150000;
                System.out.println("Vista elegida: Vista del parque \nPrecio del condominio: $ 150,000");
        }else if(number ==2){
                i=true;
                price=170000;
                System.out.println("Vista elegida: vistas del campo de golf \nPrecio del condominio: $ 170,000");
        }else if(number==3){
                i=true;
                price=210000;
                System.out.println("Vista elegida: vistas al lago \nPrecio del condominio: $ 210,000");
        }else{
                i=false;
                
                System.out.println("Vista elegida: incorrecta \nPrecio del condominio: $ 0");
        } 
        if(i){
              System.out.println("Ingrese Detalles si es necesario \n1) Garaje \n2) Estacionamiento \n");
             int additionalChoice=datos.nextInt();

             if(additionalChoice==1||additionalChoice==2)
           {
                  price+=5000;
                  System.out.println("Total = $"+price+" \n");
           }
           else
           {
               System.out.println("Total =$"+price+"\n");
           }        
        }
    
    }
    
}
