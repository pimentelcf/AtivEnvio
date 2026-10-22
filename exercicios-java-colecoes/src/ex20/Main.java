package ex20;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estoque estoque = new Estoque();

        // Alguns dados iniciais para facilitar os testes
        estoque.cadastrar(new Produto(1, "Notebook", "Eletrônicos", 3500.00, 5));
        estoque.cadastrar(new Produto(2, "Mouse", "Eletrônicos", 80.00, 20));
        estoque.cadastrar(new Produto(3, "Cadeira", "Móveis", 650.00, 8));

        int opcao;
        do {
            System.out.println("\n===== ESTOQUE =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Listar por categoria");
            System.out.println("4 - Valor total em estoque");
            System.out.println("5 - Buscar por nome (ordenado por preço)");
            System.out.println("6 - Ver categorias");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            try {
                opcao = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            try {
                switch (opcao) {
                    case 1:
                        System.out.print("Código: ");
                        int codigo = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Nome: ");
                        String nome = sc.nextLine().trim();
                        System.out.print("Categoria: ");
                        String categoria = sc.nextLine().trim();
                        System.out.print("Preço: ");
                        double preco = Double.parseDouble(sc.nextLine().trim().replace(',', '.'));
                        System.out.print("Quantidade: ");
                        int qtd = Integer.parseInt(sc.nextLine().trim());
                        if (estoque.cadastrar(new Produto(codigo, nome, categoria, preco, qtd))) {
                            System.out.println("Produto cadastrado!");
                        } else {
                            System.out.println("Já existe um produto com esse código.");
                        }
                        break;
                    case 2:
                        System.out.print("Código a remover: ");
                        int cod = Integer.parseInt(sc.nextLine().trim());
                        System.out.println(estoque.remover(cod) ? "Produto removido!" : "Código não encontrado.");
                        break;
                    case 3:
                        System.out.print("Categoria: ");
                        List<Produto> lista = estoque.listarPorCategoria(sc.nextLine().trim());
                        if (lista.isEmpty()) {
                            System.out.println("Nenhum produto nessa categoria.");
                        }
                        lista.forEach(System.out::println);
                        break;
                    case 4:
                        System.out.printf("Valor total em estoque: R$ %.2f%n", estoque.valorTotal());
                        break;
                    case 5:
                        System.out.print("Trecho do nome: ");
                        List<Produto> busca = estoque.buscarPorNome(sc.nextLine().trim());
                        if (busca.isEmpty()) {
                            System.out.println("Nada encontrado.");
                        }
                        busca.forEach(System.out::println);
                        break;
                    case 6:
                        System.out.println("Categorias: " + estoque.getCategorias());
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Valor numérico inválido, tente novamente.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
