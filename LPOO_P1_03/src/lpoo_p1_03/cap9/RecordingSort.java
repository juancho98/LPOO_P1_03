package lpoo_p1_03.cap9;



import java.util.Scanner;

public class RecordingSort {
	public static void main(String[] args) {
		Scanner datos= new Scanner(System.in);
		Recording[] arr = new Recording[5];
		Integer opcion;
		String titulo, nombreArtista;
		Integer duracion;
		for(int i=0; i<arr.length; i++) {
			System.out.printf("Ingresa titulo para cancion %d: ",i+1);
			titulo = datos.nextLine();
			System.out.printf("Ingresa nombre de artista para cancion %d: ",i+1);
			nombreArtista = datos.nextLine();
			System.out.printf("Ingresa duracion en segundos para cancion %d: ",i+1);
			duracion = datos.nextInt();
			arr[i] = new Recording(titulo, nombreArtista, duracion);
			datos.nextLine();

		}
		System.out.println("Por qu� elemento deseas ordenar el array?");
		System.out.println("1.-Titulo de la canci�n");
		System.out.println("2.-Nombre del artista");
		System.out.println("3.-Tiempo de duracion de la cancion");
		System.out.print("Ingresa seleccion: ");
		opcion = datos.nextInt();
		switch(opcion) {
		case 1:
			Recording temp;
			Integer a = 1;
			Integer b;
			while(a < arr.length) {
				temp = arr[a];
				b = a-1;
				while(b >= 0 && arr[b].getTitle().compareTo(temp.getTitle())>=0 )
				{
					arr[b + 1] = arr[b];
					--b;
				}
				arr[b+1] = temp; 
				a++;
			}
			break;
		case 2:
			Recording temp2;
			Integer a2 = 1;
			Integer b2;
			while(a2 < arr.length) {
				temp2 = arr[a2];
				b2 = a2-1;
				while(b2 >= 0 && arr[b2].getArtist().compareTo(temp2.getArtist())>=0 )
				{
					arr[b2 + 1] = arr[b2];
					--b2;
				}
				arr[b2+1] = temp2; 
				a2++;
			}
			break;
		case 3:
			Recording temp3;
			Integer a3 = 1;
			Integer b3;
			while(a3 < arr.length) {
				temp3 = arr[a3];
				b3 = a3-1;
				while(b3 >= 0 && arr[b3].getPlayingTime() > temp3.getPlayingTime() )
				{
					arr[b3 + 1] = arr[b3];
					--b3;
				}
				arr[b3+1] = temp3;
				a3++;
			}
			break;
		default:
			System.out.println();	
		}
	System.out.println();
		for(int i = 0; i < arr.length ; i++) {
			System.out.printf("Titulo cacion %d: %s%n", i, arr[i].getTitle());
			System.out.printf("Nombre artista cacion %d: %s%n", i, arr[i].getArtist());
			System.out.printf("Duracion %d: %d%n", i, arr[i].getPlayingTime());
			System.out.println();
		}
	}
}
