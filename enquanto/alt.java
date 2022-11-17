package enquanto;
import java.util.Scanner;

public class alt {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double joao = 134, pedro = 145;
		int ano = 1;
		
		while (joao <= pedro) {
			System.out.println("\n" + ano + " ano(s):");
			System.out.println("Idade de Pedro: " + (pedro = pedro + 2) / 100 + "m");
			System.out.println("Idade de João: " + (joao = joao + 2.5) / 100 + "m");
			ano++;
		}
		System.out.println("\nSerão necessários" + (ano - 1) + " anos para João ficar mais alto que o Pedro");
		in.close();
	}

}
