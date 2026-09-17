package exercicios_arrays;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[8];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = sc.next();
        }

        System.out.print("Digite o nome do aluno que deseja pesquisar: ");
        String busca = sc.next();

        boolean encontrado = false;
        int pos = -1;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(busca)) {
                encontrado = true;
                pos = i;
            }
        }

        if (encontrado) {
            System.out.println("Aluno encontrado na posição: " + pos);
        } else {
            System.out.println("Aluno não encontrado.");
        }

        sc.close();
    }
}