package exercicios_arrays;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[4][4];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        int soma = 0;
        int maior = mat[0][0];
        int menor = mat[0][0];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                soma += mat[i][j];
                if (mat[i][j] > maior) {
                    maior = mat[i][j];
                }
                if (mat[i][j] < menor) {
                    menor = mat[i][j];
                }
            }
        }

        double media = (double) soma / (mat.length * mat[0].length);

        System.out.println("Matriz:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);

        sc.close();
    }
}
