import java.util.Scanner;

public class Aula_12052020 {

	public static void main(String[] args) {
		
		//Variáveis
		
		double altura, salario, media=0, maioraltura=0, menoraltura=1000,soma=0;
		String sexo;
		int qtdmulher=0, c=1;
		//Início
		do {
		System.out.println("Informe o sexo do "+c+"º funcionário digitando M para masculino ou F para feminino: ");
		Scanner leitor = new Scanner(System.in);
		sexo = leitor.next();
		System.out.println("Informe o salário do funcionário: ");
		salario = leitor.nextDouble();
		System.out.println("Informe a altura do funcionário em centímetros: ");
		altura = leitor.nextDouble();
		
		if (altura>maioraltura)
		{maioraltura=altura;}
		
		if (altura<menoraltura)
		{menoraltura=altura;}
		
		if (sexo.equals("F")&&(salario<=1000.00))
		{qtdmulher++;}
		
		soma+=salario;
		media=soma/c;
		c++;
		}
		while (c<=20);
		
		
		System.out.println("A media dos salários é:R$"+media);
		System.out.println("A maior altura é:"+maioraltura+"cm");
		System.out.println("A menor altura é:"+menoraltura+"cm");
		System.out.println("A quantidade de mulheres com o salário até R$1000,00 é:"+qtdmulher);
		
		

	}

}