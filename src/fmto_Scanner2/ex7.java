package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex7 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double nota;
 
		System.out.println("Digite a nota: ");
		nota = sc.nextDouble();
 
		int notaInt = (int) nota;
		double notaConvertida = (double) notaInt;
 
		System.out.println("Valor inicial: " + nota);
		System.out.println("Valor convertido para int: " + notaInt);
		System.out.println("Valor convertido de volta para double: " + notaConvertida);
 
		sc.close();
 
	}
 
}
 
