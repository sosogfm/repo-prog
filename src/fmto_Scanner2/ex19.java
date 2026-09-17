package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex19 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double saldo;
 
		System.out.println("Digite o saldo: ");
		saldo = sc.nextDouble();
 
		String situacao = (saldo > 0) ? "Saldo positivo" : "Saldo negativo";
 
		System.out.println("Saldo: R$ " + saldo);
		System.out.println("Situação: " + situacao);
 
		sc.close();
 
	}
 
}

