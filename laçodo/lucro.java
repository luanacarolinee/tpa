import java.util.Scanner;

public class lucro {
	
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int i;
		double mk, preco, pv;
		i=1;
		do{
			System.out.println("Digite o pre�o: ");
			preco = in.nextDouble();
			System.out.println("Digite a margem de lucro em porcentagem: %");
			mk = in.nextDouble();
			pv = (preco*mk/100)+preco;
			System.out.println("Preco de venda �: "+pv);
			System.out.println("Deseja continuar a execu��o do programa? Digite ''1'' para SIM, e ''2'' para N�O.");
			i = in.nextInt();
		}while (i==1);
		in.close();
		
	}
}