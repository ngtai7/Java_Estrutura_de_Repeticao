import java.util.Scanner;

public class Aula_12052020 {

	public static void main(String[] args) {
		
		//Variáveis
		float n;
		int c=1;
		
		//Início
		
		do
		{System.out.println("Digite o "+c+"º número: ");
		Scanner leitor = new Scanner(System.in);
		n = leitor.nextFloat();
		
		if (n<0)
		{System.out.println("\nO número é negativo!");}
		else if (n>0)
		{System.out.println("\nO número é positivo!");}
		else;
		
		c++;}
		while (c<11);

	}

}