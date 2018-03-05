package lpoo_p1_03.cap9;

import java.util.Scanner;

public class MeanMedian {
	public static void main(String[] args) {
		Integer[] arr = new Integer[5];
		Integer temp;
		Integer a = 1;
		Integer b;
		Double suma = 0.0;
		Scanner datos= new Scanner(System.in);
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("Ingresa el dato %d: ", i);
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
		System.out.println("Mediana : "+arr[2]);
	}
}
