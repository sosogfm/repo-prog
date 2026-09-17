package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex6 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double quilometros;
 
		System.out.println("Digite a distância em quilômetros: ");
		quilometros = sc.nextDouble();
 
		double metros = quilometros * 1000;
 
		System.out.println("Distância em metros: " + metros);
 
		sc.close();
 
	}
 
}
