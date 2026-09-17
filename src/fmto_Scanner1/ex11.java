package fmto_Scanner1;
 
import java.util.Scanner;
 
public class ex11 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		String nomeAluno;
		int nota, frequencia;
 
		System.out.println("Digite o nome do aluno: ");
		nomeAluno = sc.nextLine();
		System.out.println("Digite a nota: ");
		nota = sc.nextInt();
		System.out.println("Digite a frequência: ");
		frequencia = sc.nextInt();
 
		String situacao = (nota >= 6 && frequencia >= 70) ? "Aprovado" : "Reprovado";
 
		System.out.println(nomeAluno + " está " + situacao);
 
		sc.close();
 
	}
 
}
