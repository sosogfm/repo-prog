package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex1 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		String nome, curso;
		int idade;
		double altura, mediaFinal;
		boolean matriculado;
 
		System.out.println("Digite o nome do aluno: ");
		nome = sc.nextLine();
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o curso: ");
		curso = sc.nextLine();
		System.out.println("Digite a altura: ");
		altura = sc.nextDouble();
		System.out.println("Digite a média final: ");
		mediaFinal = sc.nextDouble();
		System.out.println("Está matriculado? (true ou false): ");
		matriculado = sc.nextBoolean();
 
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Curso: " + curso);
		System.out.println("Altura: " + altura);
		System.out.println("Média final: " + mediaFinal);
		System.out.println("Matriculado: " + matriculado);
 
		sc.close();
 
	}
 
}
