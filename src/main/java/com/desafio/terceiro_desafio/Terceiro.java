package com.desafio.terceiro_desafio;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class Terceiro {
    public static void main(String[] args) throws FileNotFoundException {
        Gson gson = new Gson();

        // Leitura e conversão dos dados do Json para uma lista de mapas
        FileReader reader = new FileReader("src/main/java/com/desafio/terceiro_desafio/dados.json");

        Type listType = new TypeToken<List<Map<String, Object>>>() {
        }.getType();

        List<Map<String, Object>> data = gson.fromJson(reader, listType);

        double menorValor = Double.MAX_VALUE;
        double maiorValor = Double.MIN_VALUE;
        double somaValores = 0.0;
        int diasComFaturamento = 0;

        // Calcula o menor, maior e a soma dos valores e acrescenta na contagem de dias
        // com faturamento sempre que valor > 0
        for (Map<String, Object> entry : data) {
            double valor = (double) entry.get("valor");
            if (valor > 0) {
                if (valor < menorValor) {
                    menorValor = valor;
                }
                if (valor > maiorValor) {
                    maiorValor = valor;
                }
                somaValores += valor;
                diasComFaturamento++;
            }
        }

        // Calcula a média mensal usando as variáveis de soma dos valores e contagem de
        // dias com faturamento
        double mediaMensal = somaValores / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        // Calcula o número de dias com faturamento acima da média
        for (Map<String, Object> entry : data) {
            double valor = (double) entry.get("valor");
            if (valor > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }

        System.out.printf("Menor valor de faturamento: %.2f\n", menorValor);
        System.out.printf("Maior valor de faturamento: %.2f\n", maiorValor);
        System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);
    }
}