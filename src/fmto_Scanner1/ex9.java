package fmto_Scanner1;
 
import java.util.Scanner;
 
public class ex9 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		boolean possuiIngresso, possuiDocumento, acompanhanteMaiorIdade;
 
		System.out.println("Possui ingresso? (true ou false): ");
		possuiIngresso = sc.nextBoolean();
		System.out.println("Possui documento? (true ou false): ");
		possuiDocumento = sc.nextBoolean();
		System.out.println("Acompanhante é maior de idade? (true ou false): ");
		acompanhanteMaiorIdade = sc.nextBoolean();
 
		
		System.out.println("possuiIngresso && possuiDocumento: " + (possuiIngresso && possuiDocumento));
		System.out.println("possuiIngresso || possuiDocumento: " + (possuiIngresso || possuiDocumento));
		System.out.println("!possuiDocumento: " + (!possuiDocumento));
		System.out.println("possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade): "+ (possuiIngresso && (possuiDocumento || acompanhanteMaiorIdade)));
		System.out.println("!(possuiIngresso && possuiDocumento): " + !(possuiIngresso && possuiDocumento));
 
		sc.close();
 
	}
 
}
