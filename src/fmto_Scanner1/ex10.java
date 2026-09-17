package fmto_Scanner1;
 
import java.util.Scanner;
 
public class ex10 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		String nomeAluno, curso;
		int idade;
 
		System.out.println("Digite o nome do aluno: ");
		nomeAluno = sc.nextLine();
		System.out.println("Digite o curso: ");
		curso = sc.nextLine();
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
 
		System.out.println("==============================");
		System.out.println("Aluno: " + nomeAluno);
		System.out.println("Curso: " + curso);
		System.out.println("Idade: " + idade + " anos");
		System.out.println("==============================");
 
		sc.close();
 
	}
 
}
