package lpoo_p1_03.cap9;

import java.util.Scanner;

public class MeanMedian2 {
	public static void main(String[] args) {

		Integer temp;
		Integer a = 1;
		Integer b;
		Double suma = 0.0;
		Integer numeroElementos;
		Scanner datos= new Scanner(System.in);
		System.out.println("Ingresa el numero de elementos(maximo 20): ");
		numeroElementos = datos.nextInt();
		if(numeroElementos<=20){
			Integer[] arr = new Integer[numeroElementos];
			for(int i = 0; i<arr.length; i++) {
				System.out.printf("Ingresa el dato %d: ", i+1);
				arr[i] = datos.nextInt();
			}
			while(a < arr.length) {
				temp = arr[a];
				b = a-1;
				while(b >= 0 && arr[b] > temp )
				{
					arr[b + 1] = arr[b];
					--b;
				}
				arr[b+1] = temp;
				a++;
			}
			
			for(int i = 0; i<arr.length; i++) {
				suma+=arr[i];
			}
			System.out.println("Media : "+suma/arr.length);
			Double mediana;
			if(arr.length%2 == 0) {
				mediana = ((arr.length/2) + ((arr.length/2)+1))/2.0;
			}else {
				mediana = arr.length/2.0;
			}
				
			System.out.println("Mediana : "+mediana);
		}else {
			System.out.println("MAXIMO 20");
		}
		
	}
}
