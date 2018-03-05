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
public class Perfect {

    public static void main(String[] args) {
        int i, j, sum;
        System.out.println("Números perfectos entre 1 y 1000: ");
        for(i=1;i<=1000;i++){
            sum=0;
            for(j=1;j<i;j++){ 
                 if(i%j==0){
                    sum=sum+j;
                 }
            }
          if(i==sum){
                 System.out.println(i);
              }
        }
    }
    
}
