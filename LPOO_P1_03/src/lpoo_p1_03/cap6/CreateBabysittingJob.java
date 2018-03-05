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
public class CreateBabysittingJob {

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        boolean condi = false;
        int anio;
        int id;
        int trab = 0;
        int emp = 0;
        int hijos = 0;
        int nH = 0;

        
        do{
            if (condi){
                System.out.println("El anio (2013-2025): ");
            }
            System.out.print("Anio (2013-2025): ");
            anio = datos.nextInt();
            condi = true;
        }while (anio < 2013 || anio > 2025);
        
        condi = false;
        do{
            if (condi){
                System.out.println("El dato debe estar en el rango de 0 y 9999.");
            }
            System.out.print("Numero de trabajo (0-9999): ");
            trab = datos.nextInt();
            condi = true;
        }while (trab < 0 || trab > 9999);

        condi = false;
        do{
            if (condi){
                System.out.println("Solo hay un rango de 1 a 3 en ID");
            }
            System.out.print("ID empleado (1-3): ");
            emp = datos.nextInt();
            condi = true;
        }while (emp < 1 || emp > 3);

        condi = false;
        do{
            if (condi){
                System.out.println("Son aceptados desde 1 a 9 ninios. No mas no menos");
            }
            System.out.print("Numero de ninios (1-9): ");
            hijos = datos.nextInt();
            condi = true;
        }while (hijos < 1 || hijos > 9);

        condi = false;
        do{
            if (condi){
                System.out.println("Solo laboramos 12 horas");
            }
            System.out.print("Numero de horas (1-12): ");
            nH = datos.nextInt();
            condi = true;
        }while (nH < 1 || nH > 12);

        

        id = BabysittingJob.nuevoidJob(anio,trab);

        BabysittingJob prueba = new BabysittingJob(id, emp, hijos, nH);
        prueba.resultados();
    }
    
}
