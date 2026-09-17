package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex13 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		boolean possuiCNH, possuiCarro, possuiDinheiro;
 
		System.out.println("Possui CNH? (true ou false): ");
		possuiCNH = sc.nextBoolean();
		System.out.println("Possui carro? (true ou false): ");
		possuiCarro = sc.nextBoolean();
		System.out.println("Possui dinheiro? (true ou false): ");
		possuiDinheiro = sc.nextBoolean();
 
		System.out.println("possuiCNH && possuiCarro: " + (possuiCNH && possuiCarro));
		System.out.println("possuiCarro || possuiDinheiro: " + (possuiCarro || possuiDinheiro));
		System.out.println("!possuiCNH: " + (!possuiCNH));
		System.out.println("possuiCNH && possuiDinheiro: " + (possuiCNH && possuiDinheiro));
		System.out.println("!(possuiCarro || possuiDinheiro): " + !(possuiCarro || possuiDinheiro));
 
		sc.close();
 
	}
 
}
