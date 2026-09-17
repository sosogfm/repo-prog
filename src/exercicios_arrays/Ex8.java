package exercicios_arrays;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] estoque = new int[3][4];

        for (int i = 0; i < estoque.length; i++) {
            for (int j = 0; j < estoque[i].length; j++) {
                System.out.print("Quantidade do produto " + (i + 1) + " no período " + (j + 1) + ": ");
                estoque[i][j] = sc.nextInt();
            }
        }

        int[] totalProduto = new int[3];
        int totalGeral = 0;

        for (int i = 0; i < estoque.length; i++) {
            int total = 0;
            for (int j = 0; j < estoque[i].length; j++) {
                total += estoque[i][j];
            }
            totalProduto[i] = total;
            totalGeral += total;
        }

        int maiorProduto = 0;
        for (int i = 0; i < totalProduto.length; i++) {
            if (totalProduto[i] > totalProduto[maiorProduto]) {
                maiorProduto = i;
            }
        }

        for (int i = 0; i < totalProduto.length; i++) {
            System.out.println("Produto " + (i + 1) + ": " + totalProduto[i] + " unidades");
        }

        System.out.println("Estoque total: " + totalGeral + " unidades");
        System.out.println("Maior estoque acumulado: Produto " + (maiorProduto + 1));

        sc.close();
    }
}