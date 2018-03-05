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
public class Purchase {
    int fac;
    double ven;
    double impuesto;
    
    public void setNumFact(int fact){
        fac = fact;
    }
   
    public void setMontoVenta(double venta){
        ven = venta;
        impuesto = venta * 0.05;
    }
   
    public void resultados(){
        System.out.println("\n\nNum. de factura " + fac);
        System.out.println("Monto de venta es: $" + ven);
        System.out.println("Los impuestos de venta son $" + impuesto);
        System.out.println("Las ganancias son $" + (ven +impuesto));
    }
}
