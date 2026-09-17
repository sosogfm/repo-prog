package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex16 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		String nome, cargo;
		double salario;
 
		System.out.println("Digite o nome do funcionário: ");
		nome = sc.nextLine();
		System.out.println("Digite o cargo: ");
		cargo = sc.nextLine();
		System.out.println("Digite o salário: ");
		salario = sc.nextDouble();
 
		System.out.println("*************************");
		System.out.println("Funcionário: " + nome);
		System.out.println("Cargo: " + cargo);
		System.out.println("Salário: R$ " + salario);
		System.out.println("*************************");
 
		sc.close();
 
	}
 
}
