package fmto_Scanner1;
 
import java.util.Scanner;
 
public class ex3 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int numA, numB;
 
		System.out.println("Digite o primeiro número inteiro: ");
		numA = sc.nextInt();
		System.out.println("Digite o segundo número inteiro: ");
		numB = sc.nextInt();
 
		int soma = numA + numB;
		int subtracao = numA - numB;
		int multiplicacao = numA * numB;
		int divisao = numA / numB;
		int resto = numA % numB;
 
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao);
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);
		System.out.println("Resto da divisão: " + resto);
 
		sc.close();
 
	}
 
}
