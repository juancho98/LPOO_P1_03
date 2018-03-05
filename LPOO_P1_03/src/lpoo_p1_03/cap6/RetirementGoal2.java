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
public class RetirementGoal2 {

    
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int anio;
        double ahorro;
      
        do {
            System.out.print("Anios antes de su retiro: ");
            anio = datos.nextInt();
      
            System.out.print("Ahorro anual estimado: ");
            ahorro = datos.nextDouble();
         
            if (anio < 1 || ahorro <= 0){
                System.out.println();
                System.out.println("ERROR.");
                System.out.println();
            }
        }while (anio < 1 || ahorro <= 0);
        
        for (int x = 1; x <= anio; x++) {
            for (int y = 0; y < x; y++)
                ahorro += (ahorro * 0.05);
        }
        
        System.out.println("\nTiene que ahorrar $"+(anio * ahorro));
    }
    
}
