import java.util.Scanner;

public class Aula_12052020 {

	public static void main(String[] args) {
		
		//Variáveis
		double n, soma=0, media=0;
		int c=1;
		
		//Início
	
		do
		{
		System.out.println("Digite o "+c+"º número inteiro: ");
		Scanner leitor = new Scanner(System.in);
		n = leitor.nextInt();
		soma+=n;
		c++;}
		while (c<=20);
		
		media=soma/20;
		System.out.println("A soma dos número é:"+soma);
		System.out.println("A média é:"+media);

	}

}