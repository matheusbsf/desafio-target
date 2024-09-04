package com.desafio.quarto_desafio;

import java.util.HashMap;
import java.util.Map;

public class Quarto {
    public static void main(String[] args) {
        // Cria um HashMap para receber os dados dos faturamentos
        Map<String, Double> faturamento = new HashMap<String, Double>();
        double valorTotal = 0;

        faturamento.put("SP", 67836.43);
        faturamento.put("RJ", 36678.66);
        faturamento.put("MG", 29229.88);
        faturamento.put("ES", 27165.48);
        faturamento.put("Outros", 19849.53);

        // Calcula o valor total dos faturamentos da distribuidora
        for (Map.Entry<String, Double> entry : faturamento.entrySet()) {
            valorTotal += entry.getValue();
        }

        System.out
                .println(
                        "A porcentagem de faturamento de cada estado sobre o valor total de R$" + valorTotal + " foi:");

        // Faz a iteração sobre o HashMap e imprime a chave e valor de cada entry
        for (Map.Entry<String, Double> entry : faturamento.entrySet()) {
            String estado = entry.getKey();
            double valor = entry.getValue();

            double porcentagem = (valor / valorTotal) * 100;

            System.out.printf("\n%.2f%s em %s", porcentagem, "%", estado);
        }

    }
}
