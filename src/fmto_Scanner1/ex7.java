package fmto_Scanner1;
 
import java.util.Scanner;
 
public class ex7 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double salario;
 
		System.out.println("Digite o salário: ");
		salario = sc.nextDouble();
 
		int salarioInt = (int) salario;
		double salarioConvertido = (double) salarioInt;
 
		System.out.println("Valor original: " + salario);
		System.out.println("Valor convertido para int: " + salarioInt);
		System.out.println("Valor convertido de volta para double: " + salarioConvertido);
 
		sc.close();
 
	}
 
}
