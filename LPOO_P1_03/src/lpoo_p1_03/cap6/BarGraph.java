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
public class BarGraph {


    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int Pam,Leo,Kim,Bob;
        System.out.print("Autos vendidos de Pam: ");
        Pam = datos.nextInt();
        System.out.print("Autos vendidos de Leo: ");
        Leo = datos.nextInt();
        System.out.print("Autos vendidos de Kim: ");
        Kim = datos.nextInt();
        System.out.print("Autos vendidos de Bob: ");
        Bob = datos.nextInt();
        System.out.print("\nCarros vendidos:\nPam: ");
        for(int i=0;i<Pam;i++){
            System.out.print("X");
        }
        System.out.print("\nLeo: ");
        for(int i=0;i<Leo;i++){
            System.out.print("X");
        }
        System.out.print("\nKim: ");
        for(int i=0;i<Kim;i++){
            System.out.print("X");
        }
        System.out.print("\nBob: ");
        for(int i=0;i<Bob;i++){
            System.out.print("X");
        }
        System.out.println("\n\n");
    }
    
}
