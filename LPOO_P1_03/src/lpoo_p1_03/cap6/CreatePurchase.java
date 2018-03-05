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
public class CreatePurchase {

    public static void main(String[] args) {
        int fact;
        double venta;
        Purchase p = new Purchase();
        Scanner datos = new Scanner(System.in);
        
        System.out.print("Numero de factura: ");
        fact = datos.nextInt();
        System.out.print("Cant. de venta: $");
        venta = datos.nextDouble(); 
        venta *= 100;
        venta +=0.5;
        venta = (int)venta;
        venta /= 100;
      
        while (fact < 1000 || fact> 8000){
            System.out.println("error, " + 
                    "\nIngrese de nuevo (entre 1000 y 8000): ");
            fact = datos.nextInt(); 
        }
      
        while (venta < 0){
            System.out.println("error "+
                    "\nIngrese un dato mayor a 0: ");
            venta = datos.nextDouble();
        }
   
      
        p.setNumFact(fact);
        p.setMontoVenta(venta);
        p.resultados();
    }
    
}
