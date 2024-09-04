package com.desafio.segundo_desafio;

import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = 0, n2 = 1, n3 = 0, valor;

        System.out.println("Informe um número para verificar se está presente na sequência de Fibonacci: ");
        valor = scanner.nextInt();
        scanner.close();

        /*
         * Verifica sempre se a soma dos últimos dois números é diferente e menor que o
         * valor inserido pelo usuário para garantir que a sequência de Fibonacci só
         * seja calculada até chegar ou passar deste valor.
         */
        while (n3 != valor && n3 < valor) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        /*
         * Após o laço while ser quebrado, verifica se o valor da última soma (que fez o
         * loop quebrar) é ou não igual ao valor inserido pelo usuário e imprime a
         * mensagem correspondente.
         */
        if (n3 == valor) {
            System.out.println("O valor " + valor + " *está* presente na sequência.");
        } else {
            System.out.println("O valor " + valor + " *não* está presente na sequência.");
        }
    }
}
