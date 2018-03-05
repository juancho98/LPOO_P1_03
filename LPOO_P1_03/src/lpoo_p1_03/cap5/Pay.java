/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lpoo_p1_03.cap5;

import java.util.Scanner;

/**
 *
 * @author jdani
 */
public class Pay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        	
                int level,  pay = 0, hours, extrahours = 0;
		Scanner datos = new Scanner(System.in);
		System.out.println("Elige tu nivel de habilidad: 1, 2, 3.");
		level = datos.nextInt();
                	
		switch (level) {
		case 1:
			pay = 17;
			break;
		case 2:
			pay = 20;
			break;
		case 3:
			pay = 22;
			break;
		default:
			System.out.println("Invalido.");
		}

		
		if (level >=1 && level <=3) {
			System.out.println("horas de trabajo: ");
			hours = datos.nextInt();
			
			if (hours > 40) {
				extrahours = hours - 40;
				hours = 40;
			}

			
			double rpay = hours * pay;
			double opay = extrahours * pay * 1.5;
			Integer  totalHours = hours + extrahours;
			double totalPay = rpay + opay;

			
			final double medicalInsurance = 32.5;
			final int dentalInsurance = 20;
			final int longTermDisability = 10;
			double retirementPlan = totalPay * .03;
			double itemizedDeductions = 0;
			int opcion=0;
			int numSelections = 0;
			if (level == 2 || level == 3) {
				do {
					System.out.println("Ingrese una opción 1) seguro médico \n 2) seguro dental \n 3) seguro por incapacidad a largo plazo \n 0. - Salga");
					opcion = datos.nextInt();
					numSelections++;
					if (opcion == 1) {
						itemizedDeductions += medicalInsurance;
						System.out.println("Usted ha agregado un seguro médico.");
					} else if (opcion == 2) {
						itemizedDeductions += dentalInsurance;
						System.out.println("Usted ha agregado un seguro dental.");
					} else if (opcion == 3) {
						itemizedDeductions += longTermDisability;
						System.out.println("Usted ha agregado seguro de discapacidad a largo plazo.");
					} else {
                                            opcion =0;
					}
				} while (opcion != 0 && numSelections < 3);
			}
			if (level == 3) {
				System.out.println("¿Le gustaría participar en el plan de jubilación? 1) Sí 2) No");
				int retirementYesNo = datos.nextInt();
				if (retirementYesNo == 1) {
					itemizedDeductions += retirementPlan;
					System.out.println("Usted ha elegido participar en el plan de jubilación.");
				} else {
					System.out.println("Ha elegido no participar en el plan de jubilación.");
				}

			}

			double netPay = totalPay - itemizedDeductions;

			
			System.out.println("horas de trabajo: " + totalHours);
			System.out.println("Tasa de pago por hora: $" + pay);
			System.out.println("Paga regular por 40 horas: $" + rpay);
			System.out.println("Pago de horas extras: $" + opay);
			System.out.println("total a pagar: $" + totalPay);
			if (itemizedDeductions > totalPay) {
				System.out.println("Error:");
			} else {
				System.out.println("Total: $" + itemizedDeductions);
				System.out.println("pay: $" + netPay);
			}
		}
    }
    
}
