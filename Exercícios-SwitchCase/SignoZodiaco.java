package escolhaCaso;

import java.util.Scanner;

public class SignoZodiaco {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int dia, mes;
		
		System.out.println("Digite o dia em que vocÃª nasceu:");
		dia = in.nextInt();
		
		System.out.println("Digite o mÃªs em que vocÃª nasceu:");
		mes = in.nextInt();
		
		switch(mes) {
			case 1:
				if (dia >= 1 && dia <= 20) {
					System.out.println("Signo: CapricÃ³rnio");
				} else if (dia >= 21 && dia <= 31) {
					System.out.println("Signo: AquÃ¡rio");
				}
				break;
			case 2:
				if (dia >= 1 && dia <= 18) {
					System.out.println("Signo: AquÃ¡rio");
				} else if (dia >= 19 && dia <= 28) {
					System.out.println("Signo: Peixes");
				}
				break;
			case 3:
				if (dia >= 1 && dia <= 20) {
					System.out.println("Signo: Peixes");
				} else if (dia >= 21 && dia <= 31) {
					System.out.println("Signo: Á�ries");
				}
				break;
			case 4:
				if (dia >= 1 && dia <= 20) {
					System.out.println("Signo: Ã�ries");
				} else if (dia >= 21 && dia <= 30) {
					System.out.println("Signo: Touro");
				}
				break;
			case 5:
				if (dia >= 1 && dia <= 20) {
					System.out.println("Signo: Touro");
				} else if (dia >= 21 && dia <= 31) {
					System.out.println("Signo: GÃªmeos");
				}
				break;
			case 6:
				if (dia >= 1 && dia <= 20) {
					System.out.println("Signo: GÃªmeos");
				} else if (dia >= 21 && dia <= 30) {
					System.out.println("Signo: CÃ¢ncer");
				}
				break;
			case 7:
				if (dia >= 1 && dia <= 22) {
					System.out.println("Signo: CÃ¢ncer");
				} else if (dia >= 23 && dia <= 31) {
					System.out.println("Signo: LeÃ£o");
				}
				break;
			case 8:
				if (dia >= 1 && dia <= 22) {
					System.out.println("Signo: LeÃ£o");
				} else if (dia >= 23 && dia <= 31) {
					System.out.println("Signo: Virgem");
				}
				break;
			case 9:
				if (dia >= 1 && dia <= 22) {
					System.out.println("Signo: Virgem");
				} else if (dia >= 23 && dia <= 30) {
					System.out.println("Signo: Libra");
				}
				break;
			case 10:
				if (dia >= 1 && dia <= 22) {
					System.out.println("Signo: Libra");
				} else if (dia >= 23 && dia <= 31) {
					System.out.println("Signo: EscorpiÃ£o");
				}
				break;
			case 11:
				if (dia >= 1 && dia <= 21) {
					System.out.println("Signo: EscorpiÃ£o");
				} else if (dia >= 22 && dia <= 30) {
					System.out.println("Signo: SagitÃ¡rio");
				}
				break;
			case 12:
				if (dia >= 1 && dia <= 21) {
					System.out.println("Signo: SagitÃ¡rio");
				} else if (dia >= 22 && dia <= 31) {
					System.out.println("Signo: CapricÃ³rnio");
				}
				break;
			default:
				System.out.println("MÃªs invÃ¡lido");
		}
		in.close();
	}
}
