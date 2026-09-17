package fmto_Scanner2;
 
import java.util.Scanner;
 
public class ex3 {
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		double distancia, litros;
 
		System.out.println("Digite a distância percorrida (km): ");
		distancia = sc.nextDouble();
		System.out.println("Digite os litros consumidos: ");
		litros = sc.nextDouble();
 
		double consumoMedio = distancia / litros;
		double litrosPara100Km = 100 / consumoMedio;
 
		System.out.println("Consumo médio: " + consumoMedio + " km/l");
		System.out.println("Litros necessários para 100 km: " + litrosPara100Km);
 
		sc.close();
 
	}
 
}
