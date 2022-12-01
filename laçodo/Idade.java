	import java.util.Scanner;
    package laçodo;

public class Idade {
	
		public static void main(String[]args){
			Scanner in = new Scanner(System.in) ;
			int m, anoAtual, anoNasc, idade, i;
			System.out.println("Qual o ano atual? ");
			anoAtual = in.nextInt();
			do {
				System.out.println("Em que ano você nasceu?");
				anoNasc = in.nextInt();
				idade = anoAtual -anoNasc;
				System.out.println("Você têm "+idade+" anos de idade");
				System.out.println("Deseja continuar a execução? (1-SIM ou 2-NÃO)");
				i= in.nextInt();
				while (i!=2 && i!=1) {
						System.out.println("Valor incorreto. (1-SIM ou 2-NÃO)");
						i = in.nextInt();
					}
			} while(i!=2);
			System.out.println("Programa encerrado.");
		}
	}

