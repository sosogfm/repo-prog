package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex21 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		String nome;
		double salarioBase;
		int horasExtras;
 
		System.out.println("Digite o nome do funcionário: ");
		nome = sc.nextLine();
		System.out.println("Digite o salário base: ");
		salarioBase = sc.nextDouble();
		System.out.println("Digite a quantidade de horas extras trabalhadas: ");
		horasExtras = sc.nextInt();
 
		double valorHorasExtras = horasExtras * 35;
		double salarioFinal = salarioBase + valorHorasExtras;
 
		System.out.println("Nome: " + nome);
		System.out.println("Salário base: R$ " + salarioBase);
		System.out.println("Valor das horas extras: R$ " + valorHorasExtras);
		System.out.println("Salário final: R$ " + salarioFinal);
 
		sc.close();
 
	}
 
}
