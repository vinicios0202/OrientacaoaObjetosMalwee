package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;

public class ProdutoController {

	private Scanner tec;

	public ProdutoController() {
		tec = new Scanner(System.in);
	}

	public int leOpcao() {
		System.out.print("> ");
		return tec.nextInt();
	}


	
	public Produto cadastrarProduto() {
		Produto produto = new Produto();

		System.out.println("--- CADASTRAR PRODUTOS ---");

		System.out.print("Nome do Produto: ");
		produto.setNomeDoProduto(tec.next());

		System.out.print("Valor unitario do produto: R$");
		produto.setValorUnitarioDoProduto(tec.nextDouble());

		System.out.print("Quantidade do produto: ");
		produto.setQuantidadeDoProduto(tec.nextInt());

		produto.setValorTotalDoProduto(produto.getValorUnitarioDoProduto() * produto.getQuantidadeDoProduto());

		return produto;

	}

	public List<Produto> listarProdutos(List<Produto> produtos) {
		
		if(produtos.isEmpty()) {
			System.out.println("N�o Possui produtos listados.");
			return null;
		}
		
		System.out.println("----PRODUTOS CADASTRADOS----");

		System.out.printf("| %2s | %10s | %9s | %11s | %15s |\n", "id", "Nome", "ValorUni", "Quantidade",
				"Valor Total");
		System.out.println("----------------------------------------------------------");
		for (int i = 0; i < produtos.size(); i++) {
			System.out.printf("| %2d | %10s | %9s | %11s | %15s |\n",
					i + 1,
					produtos.get(i).getNomeDoProduto(),
					produtos.get(i).getValorUnitarioDoProduto(),
					produtos.get(i).getQuantidadeDoProduto(),
					produtos.get(i).getValorTotalDoProduto());
		}

		return produtos;
	}

	public List<Produto> editarProduto(List<Produto> produtos) {
		
		Produto produto = new Produto();
		listarProdutos(produtos);
		
		if(produtos.isEmpty()) {
			return null;
		}

		System.out.println("Informe o Id do produto para editar: ");
		int idProduto = tec.nextInt() - 1;

		System.out.println("1) Nome do Produto");
		System.out.println("2) Quantidade de Produto");
		System.out.println("3) Valor unit�rio do Produto");
		System.out.println("Informe o campo para ser editado: ");
		int opcao = tec.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("--- EDITAR O NOME DO PRODUTO ---");
			System.out.println("Informe o novo nome do produto: ");
			produto.setNomeDoProduto(tec.next());

			produto.setQuantidadeDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getQuantidadeDoProduto());
			produto.setValorTotalDoProduto(produtos.get(idProduto).getValorTotalDoProduto());

			produtos.set(idProduto, produto);

			break;

		case 2:
			System.out.println("--- EDITAR A QUANTIDADE DE PRODUTO ---");
			System.out.println("Informe a quantidade de produto: ");
			produto.setQuantidadeDoProduto(tec.nextInt());
			
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			
			produto.setValorTotalDoProduto(produto.getValorTotalDoProduto() * produto.getQuantidadeDoProduto());
			
			produtos.set(idProduto, produto);
			break;

		case 3:
			System.out.println("--- EDITAR O VALOR UNIT�RIO DO PRODUTO ---");
			System.out.println("Informe o valor do produto: R$");
			produto.setValorUnitarioDoProduto(tec.nextInt());
			
			produto.setNomeDoProduto(produtos.get(idProduto).getNomeDoProduto());
			produto.setValorUnitarioDoProduto(produtos.get(idProduto).getValorUnitarioDoProduto());
			
			produto.setValorTotalDoProduto(produto.getValorTotalDoProduto() * produto.getQuantidadeDoProduto());
			
			produtos.set(idProduto, produto);

		default:
			System.out.println("Op��o inv�lida");
			break;
		}
		return produtos;

	}
	
	public void excluirProduto(List<Produto> produtos) {
		
		listarProdutos(produtos);
		if(produtos.isEmpty()) {
			return;
		}
		System.out.println("----Excluir Produto----");
		
		System.out.println("Infomre o id do Produto para excluir: ");
		int idProduto = tec.nextInt() - 1;
		
		if(produtos.size() <= idProduto) {
			System.out.println("Produto n�o cadastrado.");
			return;
		}
		
		produtos.remove(idProduto);
	}
	public void menu(){
		System.out.println("\n-------- MENU ---------");
		System.out.println("1) Cadastrar pessoa");
		System.out.println("2) Listar pessoas cadastradas");
		System.out.println("3) Editar Pessoas");
		System.out.println("4) excluir Pessoas");
		
		
	}
}
