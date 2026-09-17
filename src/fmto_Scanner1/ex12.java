package fmto_Scanner1;
 
import java.util.Scanner;
 
public class ex12 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int idade;
 
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
 
		String resultado = (idade >= 18) ? "Maior de idade" : "Menor de idade";
 
		System.out.println(resultado);
 
		sc.close();
 
	}
 
}
