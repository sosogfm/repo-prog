package exercicios_arrays;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] val = new int[10];

        for (int i = 0; i < val.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            val[i] = sc.nextInt();
        }

        System.out.println("Valores informados:");
        for (int i = 0; i < val.length; i++) {
            System.out.println(val[i]);
        }

        int maior = val[0];
        int posMaior = 0;
        int menor = val[0];
        int posMenor = 0;

        for (int i = 0; i < val.length; i++) {
            if (val[i] > maior) {
                maior = val[i];
                posMaior = i;
            }
            if (val[i] < menor) {
                menor = val[i];
                posMenor = i;
            }
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Posição do maior: " + posMaior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Posição do menor: " + posMenor);

        sc.close();
    }
}