package ex13;

public class Aluno implements Comparable<Aluno> {
    private final String nome;
    private final int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    // Ordem natural: por idade
    @Override
    public int compareTo(Aluno outro) {
        return Integer.compare(this.idade, outro.idade);
    }

    @Override
    public String toString() {
        return nome + " (" + idade + ")";
    }
}
