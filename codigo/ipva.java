package codigo;

import java.util.Scanner;

public class ipva {
	public static void main(String[] args) {
		
		double v, ipva;
		
		Scanner in = new Scanner(System.in);
		System.out.println("coloque a tabela fipe do seu veículo:");
		v = in.nextDouble();
		ipva = v * 4 / 100;
		System.out.println("O ipva desse veículo é de: R$ " + ipva);
		in.close();
	}
}