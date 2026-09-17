package fmto_Scanner1;
 
import java.util.Scanner;
 
public class ex4 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		String nomeAluno;
		double nota1, nota2;
 
		System.out.println("Digite o nome do aluno: ");
		nomeAluno = sc.nextLine();
		System.out.println("Digite a nota 1: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a nota 2: ");
		nota2 = sc.nextDouble();
 
		double media = (nota1 + nota2) / 2;
 
		System.out.println("Aluno: " + nomeAluno);
		System.out.println("Nota 1: " + nota1);
		System.out.println("Nota 2: " + nota2);
		System.out.println("Média: " + media);
 
		sc.close();
 
	}
 
}
