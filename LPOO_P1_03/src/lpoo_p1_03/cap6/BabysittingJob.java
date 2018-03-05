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
public class BabysittingJob {
    private int job;
    private int emp;
    private int b;
    private int nH;
    private int total;
    private String nombre;

    public BabysittingJob(int job, int emp, int b, int nH){
        this.job = job;
        this.emp = emp;
        this.b = b;
        this.nH = nH;
        asignarNombre();
        calculaTotal();
    }


    private void asignarNombre(){
        switch (emp){
            case 1:
                nombre = "Cindy";
                break;
            case 2:
                nombre = "Greg";
                break;
            case 3:
                nombre = "Marcia";
                break;
        }
    }


    public static int nuevoidJob(int year, int jobNumber){
        return Integer.parseInt((year % 100) + "" + jobNumber);
    }


    private void calculaTotal(){
        int pago = 0;

        switch (emp){
            case 1:
                pago = 7 * b;
                break;
            case 2:
            case 3:
                for (int i = 0; i < b; ++i){
                    if (i == 0) {
                        pago = 9;
                    } else {
                        pago += 4;
                    }
                }
                break;
        }

        total = pago * nH;

    }

    public void resultados(){

        System.out.println("                Nota");
        System.out.println("******************************************");
        System.out.println("Id trabajo:                " + job);
        System.out.println("Empleado:                  " + nombre);
        System.out.println("Id empleado:               " + emp);
        System.out.println("Num. ninios:               " + b);
        System.out.println("Horas:                     " + nH);
        System.out.println("*******************************************");
        System.out.println("Total:                   $" + total);

    }
}
