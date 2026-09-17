package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex20 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		int idade;
 
		System.out.println("Digite a idade: ");
		idade = sc.nextInt();
 
		String tipoAtendimento = (idade >= 60) ? "Atendimento preferencial" : "Atendimento comum";
 
		System.out.println("Idade: " + idade + " anos");
		System.out.println("Tipo de atendimento: " + tipoAtendimento);
 
		sc.close();
 
	}
 
}
