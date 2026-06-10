package poo.application;

import poo.entities.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class ProdutosProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produtos produtos = new Produtos();
        System.out.println("Digite o Produto:");
        System.out.print("Nome:");
        produtos.nome = sc.nextLine();
        System.out.print("Preço:");
        produtos.preco = sc.nextDouble();
        System.out.print("Quantidade no Estoque:");
        produtos.quantidade = sc.nextInt();
        System.out.println("Dados do Produtos :" + produtos);
        System.out.println("Digite a quantidade de produto para adicionar no estoque");
        int quantidade = sc.nextInt();
        produtos.adicionarProdutos(quantidade);
        System.out.println("Atualização dos Produtos :" + produtos);
        System.out.println("Digite a quantidade de produto para remover do estoque");
        int saidaQuantidade = sc.nextInt();
        produtos.removerProdutos(saidaQuantidade);
        System.out.println("Atualização dos Produtos :" + produtos);

        sc.close();

    }
}
