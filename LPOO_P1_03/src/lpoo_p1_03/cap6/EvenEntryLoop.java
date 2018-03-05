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
public class EvenEntryLoop {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int v = 0;
        while(v!=999){
            System.out.print("Valor Par: ");
            v = datos.nextInt();
            if(v%2==0){
                System.out.println("Good job!");
            }else{
                System.out.println("Fatal Error");
            }
        }
    }
    
}
