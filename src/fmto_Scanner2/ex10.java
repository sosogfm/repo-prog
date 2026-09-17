package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex10 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int totalAlunos, grupos;
 
		System.out.println("Digite o total de alunos: ");
		totalAlunos = sc.nextInt();
		System.out.println("Digite a quantidade de grupos: ");
		grupos = sc.nextInt();
 
		int divisaoInteira = totalAlunos / grupos;
		double divisaoReal = (double) totalAlunos / grupos;
 
		System.out.println("Divisão inteira: " + divisaoInteira);
		System.out.println("Divisão em ponto flutuante: " + divisaoReal);
 
		sc.close();
 
	}
 
}
