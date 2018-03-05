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
public class CountByAnything {

    
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        System.out.print("Valor a contar: ");
        int v = datos.nextInt();
        int cont=0;
        for(int i=0;i<=200;i=i+v){
            System.out.printf(" "+i);
            cont++;
            if(cont%10==0){
                System.out.println();
            }
        }
        System.out.println();
    }
    
}
