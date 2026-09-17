package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex14 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		boolean chovendo, guardaChuva, carroDisponivel;
 
		System.out.println("Está chovendo? (true ou false): ");
		chovendo = sc.nextBoolean();
		System.out.println("Possui guarda-chuva? (true ou false): ");
		guardaChuva = sc.nextBoolean();
		System.out.println("Carro disponível? (true ou false): ");
		carroDisponivel = sc.nextBoolean();
 
		System.out.println("chovendo && guardaChuva: " + (chovendo && guardaChuva));
		System.out.println("guardaChuva || carroDisponivel: " + (guardaChuva || carroDisponivel));
		System.out.println("!chovendo: " + (!chovendo));
		System.out.println("chovendo && (guardaChuva || carroDisponivel): " + (chovendo && (guardaChuva || carroDisponivel)));
		System.out.println("!(chovendo && guardaChuva): " + !(chovendo && guardaChuva));
 
		sc.close();
 
	}
 
}
