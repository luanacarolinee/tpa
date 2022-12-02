package classicaslaço;

import java.util.Scanner;
public class idade {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int idade, altura, i, idadev, idaden, media, soma;
		soma=0;
		for(i=0; i<10; i++) {
			System.out.println("coloque a altura: ");
			altura=in.nextInt();
			soma=soma+altura;
		}
		media=soma/i;
		i=0;
		System.out.println("coloque a idade: ");
		idade=in.nextInt();
		idadev=idade;
		idaden=idade;
		for(i=1; i<10; i++) {
			System.out.println("coloque a idade: ");
			idade=in.nextInt();
			if(idade<idaden) {
				idaden=idade;
			}else if(idade>idadev) {
				idadev=idade;
			}
		}
		System.out.println("A média das alturas é "+media+"cm, a pessoa mais velha tem "+idadev+" e a pessoa mais nova tem "+idaden+" idade");
	}
}
