package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex5 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double celsius;
 
		System.out.println("Digite a temperatura em °C: ");
		celsius = sc.nextDouble();
 
		double fahrenheit = (celsius * 9 / 5) + 32;
 
		System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
 
		sc.close();
 
	}
 
}
