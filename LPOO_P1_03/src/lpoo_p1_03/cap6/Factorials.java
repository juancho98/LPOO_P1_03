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
public class Factorials {

    public static void main(String[] args) {
     
        int fa=1,fa1=1,fa2=1,fa3=1,fa4=1,fa5=1,fa6=1,fa7=1,fa8=1,fa9=1;
        for(int i=1;i<=10;i++){
            switch(i){
                case 1:
                    fa*=i;
                case 2:
                   fa1*=i;
                case 3:
                    fa2*=i;
                case 4:
                   fa3*=i;
                case 5:
                    fa4*=i;
                case 6:
                    fa5*=i;
                case 7:
                    fa6*=i;
                case 8:
                    fa7*=i;
                case 9:
                    fa8*=i;
                case 10:
                    fa9*=i;
            }
        }
        System.out.println("Factorial 1: "+fa+"\nFactorial 2: "+fa1+"\nFactorial 3: "+fa2+"\nFactorial 4: "
                +fa3+"\nFactorial 5: "+fa4+"\nFactorial 6: "+fa5+"\nFactorial 7: "+fa6+"\nFactorial 8: "+fa7
                +"\nFactorial 9: "+fa8+"\nFactorial 10: "+fa9);
    }
    
}
