package lpoo_p1_03.cap9;

public class SortString {
	public static void main(String[] args) {
		String[] arr= {"hola", "adiosxd", "juan daniel", "cruz", "garcia", "ohmygod", "siete", "nueve", "ocho"};
		String temp;
		Integer a = 1;
		Integer b;
		
		while(a < arr.length) {
			temp = arr[a];
			b = a-1;
			while(b >= 0 && arr[b].compareTo(temp)>=0 )
			{
				arr[b + 1] = arr[b];
				--b;
			}
			arr[b+1] = temp;
			a++;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%s%n",arr[i]);
		}
	}

}
