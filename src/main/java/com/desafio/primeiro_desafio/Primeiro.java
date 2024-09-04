package com.desafio.primeiro_desafio;

public class Primeiro {
    public static void main(String[] args) {
        int indice = 13, soma = 0, k = 0;

        while (k < indice) {
            k++;
            soma += k;
        }

        System.out.println("O valor da variável \"soma\" é: " + soma);
    }
}
