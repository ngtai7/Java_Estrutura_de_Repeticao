import java.util.Scanner;

public class Aula_12052020 {

	public static void main(String[] args) {
		
		//Variáveis
		
		int n, c=1, maior=0;
		
		//Início
	
		do {
		System.out.println("Digite o "+c+"º número:");
		Scanner leitor = new Scanner(System.in);
		n = leitor.nextInt();
		c++;
		
		if (n>maior)
		{maior=n;}
		}
		while (c<=15);
		
		System.out.println("O maior número da sequência é: "+maior);
	

	}

}