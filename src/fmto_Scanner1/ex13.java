package fmto_Scanner1;
 
import java.util.Scanner;
 
public class ex13 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double temperatura;
 
		System.out.println("Digite a temperatura: ");
		temperatura = sc.nextDouble();
 
		String situacao = (temperatura > 25) ? "Dia quente" : "Dia agradável";
 
		System.out.println("Temperatura: " + temperatura + "°C");
		System.out.println("Situação: " + situacao);
 
		sc.close();
 
	}
 
}
