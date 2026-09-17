package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex22 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		String produto;
		double valorUnitario;
		int quantidade, parcelas;
 
		System.out.println("Digite o nome do produto: ");
		produto = sc.nextLine();
		System.out.println("Digite o valor unitário: ");
		valorUnitario = sc.nextDouble();
		System.out.println("Digite a quantidade comprada: ");
		quantidade = sc.nextInt();
		System.out.println("Digite a quantidade de parcelas: ");
		parcelas = sc.nextInt();
 
		double valorTotal = valorUnitario * quantidade;
		double valorParcela = valorTotal / parcelas;
 
		System.out.println("Produto: " + produto);
		System.out.println("Valor unitário: R$ " + valorUnitario);
		System.out.println("Quantidade comprada: " + quantidade);
		System.out.println("Valor total da compra: R$ " + valorTotal);
		System.out.println("Quantidade de parcelas: " + parcelas);
		System.out.println("Valor de cada parcela: R$ " + valorParcela);
 
		sc.close();
 
	}
 
}