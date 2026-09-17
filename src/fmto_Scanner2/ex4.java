package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex4 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double nota1, nota2, nota3;
 
		System.out.println("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3 = sc.nextDouble();
 
		double soma = nota1 + nota2 + nota3;
		double media = soma / 3;
 
		System.out.println("Soma das notas: " + soma);
		System.out.println("Média final: " + media);
 
		sc.close();
 
	}
 
}
