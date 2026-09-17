package fmto_Scanner1;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String nome, sexo;
		int idade;
		double altura, peso;
		boolean matricula;
		
		System.out.println("digite seu nome: ");
		nome = sc.nextLine();
		System.out.println("digite sua idade: ");
		idade = sc.nextInt();
		System.out.println("digite sua altura: ");
		altura = sc.nextDouble();
		System.out.println("digite seu peso: ");
		peso = sc.nextDouble();
		System.out.println("digite seu sexo (f ou m): ");
		sexo = sc.next();
		System.out.println("matricula ativa (true ou false)");
		matricula = sc.hasNext();

		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Sexo: " + sexo);
		System.out.println("Peso: " + peso);
		System.out.println("Matrícula: " + matricula);
		
		sc.close();
		
	}

}