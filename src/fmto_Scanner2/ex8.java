package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex8 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double temperatura;
 
		System.out.println("Digite a temperatura: ");
		temperatura = sc.nextDouble();
 
		int temperaturaInt = (int) temperatura;
		double temperaturaConvertida = (double) temperaturaInt;
 
		System.out.println("Valor inicial: " + temperatura);
		System.out.println("Valor convertido para int: " + temperaturaInt);
		System.out.println("Valor convertido de volta para double: " + temperaturaConvertida);
 
		sc.close();
 
	}
 
}
