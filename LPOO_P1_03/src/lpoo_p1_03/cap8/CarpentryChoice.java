/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo_p1_03.cap8;
import java.util.*;
/**
 *
 * @author jdani
 */
public class CarpentryChoice {
    
    
     
         
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner (System.in);
        String mueble;
        int precio;
        String[] muebles = {"mesa", "escritorio", "tocador", "centro de entretenimiento"};
        // TODO code application logic here
        for(int i = 0; i<4;i++){
            System.out.println(i+1+".-" +muebles[i]);
        }
        do{
            System.out.println("escoja una opcion y escriba el mueble que desea");
            mueble = datos.nextLine();
            switch(mueble){
            case "mesa":
            case "MESA":
                precio= 250;
                break;
            case "escritorio":
            case "ESCRITORIO":
                precio= 325;
                break;
            case "tocador":
            case "TOCADOR":
                precio= 420;
                break;
            case "centro de entretenimiento":
            case "CENTRO DE ENTRETENIMEINTO":
                precio= 600;
                break;
            default: 
                precio = 0;
                break;
            }

        } while(precio == 0);
        
        System.out.println("pagará: $"+precio);
    }    
}
