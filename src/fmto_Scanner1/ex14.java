package fmto_Scanner1;
 
import java.util.Scanner;
 
public class ex14 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		String nome;
		double salario;
		int tempoEmpresa;
 
		System.out.println("Digite o nome do funcionário: ");
		nome = sc.nextLine();
		System.out.println("Digite o salário: ");
		salario = sc.nextDouble();
		System.out.println("Digite o tempo de empresa (anos): ");
		tempoEmpresa = sc.nextInt();
 
		double bonus = (tempoEmpresa >= 5) ? 500 : 0;
		double salarioFinal = salario + bonus;
 
		System.out.println("Nome: " + nome);
		System.out.println("Salário: " + salario);
		System.out.println("Bônus: " + bonus);
		System.out.println("Salário Final: " + salarioFinal);
 
		sc.close();
 
	}
 
}
