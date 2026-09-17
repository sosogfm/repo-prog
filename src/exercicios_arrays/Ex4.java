package exercicios_arrays;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[15];

        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            num[i] = sc.nextInt();
        }

        int pares = 0;
        int impares = 0;
        int maior10 = 0;
        int menorIgual10 = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (num[i] > 10) {
                maior10++;
            } else {
                menorIgual10++;
            }
        }

        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
        System.out.println("Maiores que 10: " + maior10);
        System.out.println("Menores ou iguais a 10: " + menorIgual10);

        sc.close();
    }
}