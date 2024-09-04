package com.desafio.quinto_desafio;

import java.util.Scanner;

public class Quinto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um texto para ser invertido:");
        String texto = scanner.nextLine();
        scanner.close();

        // Divide a string inserida em letras individuais e as armazena em uma lista
        String[] textoPartido = texto.split("");

        String letraTemp;

        // Faz a substituição das primeiras letras com as últimas
        for (int i = 0; i < textoPartido.length / 2; i++) {
            letraTemp = textoPartido[textoPartido.length - 1 - i];
            textoPartido[textoPartido.length - 1 - i] = textoPartido[i];
            textoPartido[i] = letraTemp;
        }

        // Itera sobre a lista invertida, imprimindo o novo texto
        for (String s : textoPartido) {
            System.out.print(s);
        }
    }
}
