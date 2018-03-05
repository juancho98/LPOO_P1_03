/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo_p1_03.cap6;

/**
 *
 * @author jdani
 */
public class Population {

    
    public static void main(String[] args) {
        double mx = 114; 
        double usa = 312; 
        double mxi = .0101; 
        double usd = .0015; 
        int c=0;
        while (usa>mx){ 
            System.out.println("Poblacion de Mexico; " +(int) mx + "millones"); 
            System.out.println("Poblacion de Estadis Unidos: " + (int)usa + "millones\n"); 
            mx+=mx*mxi; 
            usa-=usa*usd; 
            c++;
        } 
        System.out.println("El proceso abarca: "+c+" anios");
    }
    
}
