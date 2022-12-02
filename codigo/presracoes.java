package codigo;

import java.util.Scanner;

public class presracoes {
	public static void main(String[] args) {
		
		double compra, totalCompra, valor, desconto;
		int prest;
		
		Scanner in = new Scanner(System.in);
		System.out.println("coloque o valor da compra:");
		compra = in.nextDouble();
		System.out.println("coloque a quantidade de prestações:");
		prest = in.nextInt();
		desconto = (compra * 10) / 100;
		totalCompra = compra - desconto;
		valor = totalCompra / prest;
		System.out.println("O desconto foi de: R$ " + totalCompra + "compra foi parcelada em " + prest + " prestações." + "a prestação saira por: R$ " + valor);
		in.close();
	}
}