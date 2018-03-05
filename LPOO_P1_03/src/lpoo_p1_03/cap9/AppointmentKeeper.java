package lpoo_p1_03.cap9;



import java.util.Scanner;

public class AppointmentKeeper{ 
  private static final int SALIR = 99;
  public static void main(String[] args) {
    Scanner datos= new Scanner(System.in);
    Integer dia, hora;
    Integer diaUsuario, horaUsuario;
    String nombreCita;
    Boolean continuar = true;

    String[][] citas = new String[31][24];
    for(int i=0; i<31; i++) {
    	for(int j=0; j<24;j++) {
    		citas[i][j] = "";
    	}
    }
    while (continuar) {
       System.out.println("Crear una nueva cita, ingrese d�a(entero) (99 para finalizar)");
       diaUsuario = datos.nextInt();
       if (diaUsuario == SALIR) {
          continuar = false;
       } else {
          System.out.println("Ingresa la hora");
          horaUsuario = datos.nextInt();
         datos.nextLine();
          System.out.println("Ingrese nombre de la cita");
          nombreCita = datos.nextLine();
          citas[diaUsuario - 1][horaUsuario] = nombreCita;
       }
    } 
    continuar = true;
    while (continuar) {
       System.out.println("\nIngrese el d�a del que desea ver las citas programadas");
       dia = datos.nextInt(); 
       if (dia == SALIR) {
         continuar = false;
       } else {
          for (hora = 0; hora < citas[dia].length; ++hora) {
             if ("".equals(citas[dia - 1][hora])) {
               System.out.print("\nDia: " + (dia) + " Hora: " + hora + " " 
                 + "Nada programado");
             } else {
               System.out.print("\nDia: " + (dia) + " Hora: " + hora + " " 
                 + citas[dia - 1][hora]);
             } 
          }
       }
    }
  }
}
