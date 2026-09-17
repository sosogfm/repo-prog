package exercicios_arrays;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] notas = new double[5][4];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("Nota " + (j + 1) + " do aluno " + (i + 1) + ": ");
                notas[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }

        double[] media = new double[5];
        double somaGeral = 0;

        for (int i = 0; i < notas.length; i++) {
            double soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j];
            }
            media[i] = soma / notas[i].length;
            somaGeral += media[i];
            System.out.println("Aluno " + (i + 1) + " - Média: " + media[i]);
        }

        int maiorAluno = 0;
        int menorAluno = 0;

        for (int i = 0; i < media.length; i++) {
            if (media[i] > media[maiorAluno]) {
                maiorAluno = i;
            }
            if (media[i] < media[menorAluno]) {
                menorAluno = i;
            }
        }

        double mediaTurma = somaGeral / media.length;

        int aprovados = 0;
        for (int i = 0; i < media.length; i++) {
            if (media[i] >= 7.0) {
                aprovados++;
            }
        }

        System.out.println("Maior média: Aluno " + (maiorAluno + 1) + " - " + media[maiorAluno]);
        System.out.println("Menor média: Aluno " + (menorAluno + 1) + " - " + media[menorAluno]);
        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Alunos aprovados: " + aprovados);

        sc.close();
    }
}