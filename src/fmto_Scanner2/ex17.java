package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex17 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int estoque;
 
		System.out.println("Digite a quantidade em estoque: ");
		estoque = sc.nextInt();
 
		String situacao = (estoque < 5) ? "Estoque baixo" : "Estoque suficiente";
 
		System.out.println(situacao);
 
		sc.close();
 
	}
 
}
 
