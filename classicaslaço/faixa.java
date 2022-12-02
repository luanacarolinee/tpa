package classicaslaço;

import java.util.Scanner;
public class faixa {
	public static void main(String args[]) {
		Scanner in = new Scanner (System.in);
		int idade, i, fa1, fa2, fa3, fa4, fa5
		fa1=1;
		fa2=1;
		fa3=1;
		fa4=1;
		fa5=1;
		for (i=1; i<=15; i++){
			System.out.println("Digite a idade: ");
			idade=in.nextInt();
			if(idade<=15) {
				fa1=fa1+1;
			}else if(idade<31) {
				fa2=fa2+1;
			}else if(idade<46) {
				fa3=fa3+1;
			}else if(idade<61) {
				fa4=fa4+1;
			}else {
				fa5=fa5+1;
			}
		}
		System.out.println("a faixa pessoas na etária 1 é: "+fa1+", na faixa etária 2 é: "+fa2+", na faixa etária 3 é: "+fa3+", na faixa etária 4: "+fa4+" e na faixa etária 5: "+fa5);
		
}
}
