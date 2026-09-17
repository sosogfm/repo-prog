package fmto_Scanner1;
 
import java.util.Scanner;
 
public class ex5 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double arroz, feijao, oleo;
 
		System.out.println("Digite o preço do arroz: ");
		arroz = sc.nextDouble();
		System.out.println("Digite o preço do feijão: ");
		feijao = sc.nextDouble();
		System.out.println("Digite o preço do óleo: ");
		oleo = sc.nextDouble();
 
		double valorTotal = arroz + feijao + oleo;
		double valorMedio = valorTotal / 3;
 
		System.out.println("Valor total da compra: R$ " + valorTotal);
		System.out.println("Valor médio dos produtos: R$ " + valorMedio);
 
		sc.close();
 
	}
 
}
