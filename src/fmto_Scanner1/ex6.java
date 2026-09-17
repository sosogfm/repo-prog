package fmto_Scanner1;
 
import java.util.Scanner;
 
public class ex6 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double valorEmDolares, cotacaoDolar;
 
		System.out.println("Digite o valor do monitor em dólares: ");
		valorEmDolares = sc.nextDouble();
		System.out.println("Digite a cotação do dólar: ");
		cotacaoDolar = sc.nextDouble();
 
		double valorEmReais = valorEmDolares * cotacaoDolar;
 
		System.out.println("O monitor custa " + valorEmReais + " reais");
 
		sc.close();
 
	}
 
}
