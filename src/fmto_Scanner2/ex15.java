package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex15 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		String produto;
		double preco;
		int estoque;
 
		System.out.println("Digite o nome do produto: ");
		produto = sc.nextLine();
		System.out.println("Digite o preço: ");
		preco = sc.nextDouble();
		System.out.println("Digite o estoque: ");
		estoque = sc.nextInt();
 
		System.out.println("=========================");
		System.out.println("Produto: " + produto);
		System.out.println("Preço: R$ " + preco);
		System.out.println("Estoque: " + estoque + " unidades");
		System.out.println("=========================");
 
		sc.close();
 
	}
 
}
 
