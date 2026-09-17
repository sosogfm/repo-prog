package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex18 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double media;
 
		System.out.println("Digite a média: ");
		media = sc.nextDouble();
 
		String situacao = (media >= 7) ? "Aprovado" : "Reprovado";
 
		System.out.println(situacao);
 
		sc.close();
 
	}
 
}
