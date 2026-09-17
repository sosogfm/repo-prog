package fmto_Scanner1;
 
import java.util.Scanner;
 
public class ex2 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		String nomeProduto;
		int codigo;
		double preco;
		int quantidadeEstoque;
 
		System.out.println("Digite o nome do produto: ");
		nomeProduto = sc.nextLine();
		System.out.println("Digite o código do produto: ");
		codigo = sc.nextInt();
		System.out.println("Digite o preço do produto: ");
		preco = sc.nextDouble();
		System.out.println("Digite a quantidade em estoque: ");
		quantidadeEstoque = sc.nextInt();
 
		System.out.println("Produto: " + nomeProduto + ", Código: " + codigo
				+ ", Preço: R$ " + preco + ", Estoque: " + quantidadeEstoque + " unidades");
 
		sc.close();
 
	}
 
}
