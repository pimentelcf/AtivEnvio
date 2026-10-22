package ex20;

public class Produto {
    private final int codigo;
    private final String nome;
    private final String categoria;
    private final double preco;
    private final int quantidade;

    public Produto(int codigo, String nome, String categoria, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return String.format("[%d] %s | %s | R$ %.2f | qtd: %d", codigo, nome, categoria, preco, quantidade);
    }
}
