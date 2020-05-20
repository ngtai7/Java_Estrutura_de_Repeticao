import java.util.Scanner;

public class Aula_12052020 {

	public static void main(String[] args) {
		
		//Variáveis
		int n;
		int c=1;
		
		//Início
		System.out.println("Digite um núnmero inteiro: ");
		Scanner leitor = new Scanner(System.in);
		n = leitor.nextInt();
		
		do
		{System.out.print(c+" ");
		c++;}
		while (c<=n);

	}

}