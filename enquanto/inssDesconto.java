package enquanto;
import java.util.Scanner;

public class inssDesconto {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int i = 1;
		double salario, desconto;
		
		while (i <= 4) {
			System.out.println("Digite o salário do " + i + "° funcionário:");
			salario = in.nextDouble();
			if (salario < 2000) {
				desconto = salario / 100 * 8.5;
				System.out.println("desconto é de: R$ " + desconto + "  8,5% do salário total.");
			} else if (salario >= 2000) {
				desconto = salario / 100 * 11;
				System.out.println("desconto é de: R$ " + desconto + " 11% do salário total.");
			}
			System.out.println();
			i++;
		}
		in.close();
	    }
	
     }

