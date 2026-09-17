package fmto_Scanner1;
 
import java.util.Scanner;
 
public class ex8 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int numA, numB;
 
		System.out.println("Digite o primeiro número inteiro: ");
		numA = sc.nextInt();
		System.out.println("Digite o segundo número inteiro: ");
		numB = sc.nextInt();
 
		int divisaoInteira = numA / numB;
		double divisaoReal = (double) numA / numB;
 
		System.out.println("Divisão inteira: " + divisaoInteira);
		System.out.println("Divisão em ponto flutuante: " + divisaoReal);
 
		sc.close();
 
	}
 
}
 
