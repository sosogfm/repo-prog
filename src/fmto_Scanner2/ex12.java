package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex12 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double saldo;
 
		System.out.println("Digite o saldo: ");
		saldo = sc.nextDouble();
 
		System.out.println(saldo >= 1000);
		System.out.println(saldo < 500);
		System.out.println(saldo == 850);
		System.out.println(saldo != 850);
		System.out.println(saldo > 100);
 
		sc.close();
 
	}
 
}
