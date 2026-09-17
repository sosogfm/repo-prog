package exercicios_arrays;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] val = new double[10];

        for (int i = 0; i < val.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            val[i] = sc.nextDouble();
        }

        double soma = 0;
        double maior = val[0];
        double menor = val[0];

        for (int i = 0; i < val.length; i++) {
            System.out.println(val[i]);
            soma += val[i];
            if (val[i] > maior) {
                maior = val[i];
            }
            if (val[i] < menor) {
                menor = val[i];
            }
        }

        double media = soma / val.length;

        int acimaMedia = 0;
        for (int i = 0; i < val.length; i++) {
            if (val[i] > media) {
                acimaMedia++;
            }
        }

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Quantidade acima da média: " + acimaMedia);

        sc.close();
    }
}