package ex20;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Estoque {
    // código -> produto
    private final Map<Integer, Produto> produtos = new HashMap<>();
    // categorias distintas, na ordem de cadastro
    private final Set<String> categorias = new LinkedHashSet<>();

    public boolean cadastrar(Produto p) {
        if (produtos.containsKey(p.getCodigo())) {
            return false;
        }
        produtos.put(p.getCodigo(), p);
        categorias.add(p.getCategoria());
        return true;
    }

    public boolean remover(int codigo) {
        Produto removido = produtos.remove(codigo);
        if (removido == null) {
            return false;
        }
        // se não sobrou nenhum produto da categoria, ela sai do conjunto
        boolean aindaExiste = produtos.values().stream()
                .anyMatch(p -> p.getCategoria().equalsIgnoreCase(removido.getCategoria()));
        if (!aindaExiste) {
            categorias.remove(removido.getCategoria());
        }
        return true;
    }

    public List<Produto> listarPorCategoria(String categoria) {
        List<Produto> resultado = new ArrayList<>();
        for (Produto p : produtos.values()) {
            if (p.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(p);
            }
        }
        resultado.sort(Comparator.comparingDouble(Produto::getPreco)); // preço crescente
        return resultado;
    }

    public List<Produto> buscarPorNome(String trecho) {
        List<Produto> resultado = new ArrayList<>();
        for (Produto p : produtos.values()) {
            if (p.getNome().toLowerCase().contains(trecho.toLowerCase())) {
                resultado.add(p);
            }
        }
        resultado.sort(Comparator.comparingDouble(Produto::getPreco)); // preço crescente
        return resultado;
    }

    public double valorTotal() {
        double total = 0;
        for (Produto p : produtos.values()) {
            total += p.getPreco() * p.getQuantidade();
        }
        return total;
    }

    public Set<String> getCategorias() {
        return categorias;
    }
}
