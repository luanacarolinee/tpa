package enquanto;
import java.util.Scanner;

public class novoVelho {
	
	public class VelhoNovo {
		public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			
			int i = 1, idade, idadeNovo = 0, idadeVelho = 0;
			String nome, nomeNovo = null, nomeVelho = null;
			
			 while (i <= 10) {
				 System.out.println("Digite o nome" + i + " usuário:");
				 nome = in.next();
				
				 System.out.println("Digite a idade" + i + " usuário:");
				 idade = in.nextInt();
				
				 if (i == 1) {
					 nomeNovo = nomeVelho = nome;
					 idadeNovo = idadeVelho = idade;
				 }
				
				 if (idade > idadeVelho) {
					 nomeVelho = nome;
					 idadeVelho = idade;
				 } else if (idade < idadeNovo) {
					 nomeNovo = nome;
					 idadeNovo = idade;
				 }
				 i++;
			 }
			
			 System.out.println("mais velho:" + nomeVelho + "\nIdade: " + idadeVelho);
			 System.out.println("mais novo:" + nomeNovo + "\nIdade: " + idadeNovo);
			 in.close();
		}

	}

}
