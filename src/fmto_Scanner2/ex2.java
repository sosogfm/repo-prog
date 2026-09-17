package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex2 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		String marca, modelo, cor;
		int anoFabricacao;
		double valor;
		boolean automatico;
 
		System.out.println("Digite a marca do veículo: ");
		marca = sc.nextLine();
		System.out.println("Digite o modelo: ");
		modelo = sc.nextLine();
		System.out.println("Digite o ano de fabricação: ");
		anoFabricacao = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite a cor: ");
		cor = sc.nextLine();
		System.out.println("Digite o valor: ");
		valor = sc.nextDouble();
		System.out.println("É automático? (true ou false): ");
		automatico = sc.nextBoolean();
 
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano de fabricação: " + anoFabricacao);
		System.out.println("Cor: " + cor);
		System.out.println("Valor: " + valor);
		System.out.println("Automático: " + automatico);
 
		sc.close();
 
	}
 
}
