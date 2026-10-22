package ex17;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> carrinho = new LinkedHashMap<>();
        carrinho.put("Arroz", 25.90);
        carrinho.put("Feijão", 8.50);
        carrinho.put("Leite", 5.99);
        carrinho.put("Café", 18.75);
        carrinho.put("Azeite", 39.90);

        System.out.println("== keySet() ==");
        for (String produto : carrinho.keySet()) {
            System.out.println(produto);
        }

        System.out.println("== values() ==");
        double total = 0;
        for (double preco : carrinho.values()) {
            System.out.println("R$ " + preco);
            total += preco;
        }

        System.out.println("== entrySet() ==");
        String maisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Map.Entry<String, Double> e : carrinho.entrySet()) {
            System.out.printf("%s -> R$ %.2f%n", e.getKey(), e.getValue());
            if (e.getValue() > maiorPreco) {
                maiorPreco = e.getValue();
                maisCaro = e.getKey();
            }
        }

        System.out.printf("Valor total: R$ %.2f%n", total);
        System.out.printf("Produto mais caro: %s (R$ %.2f)%n", maisCaro, maiorPreco);
    }
}
