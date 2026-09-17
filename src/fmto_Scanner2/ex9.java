package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex9 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int x, y;
 
		System.out.println("Digite o valor de x: ");
		x = sc.nextInt();
		System.out.println("Digite o valor de y: ");
		y = sc.nextInt();
 
		int divisaoInteira = x / y;
		double divisaoReal = (double) x / y;
 
		System.out.println("Divisão inteira: " + divisaoInteira);
		System.out.println("Divisão em ponto flutuante: " + divisaoReal);
 
		sc.close();
 
	}
 
}
