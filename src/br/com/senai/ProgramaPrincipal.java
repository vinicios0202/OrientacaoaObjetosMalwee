package br.com.senai;

import java.util.ArrayList;
import java.util.List;

import br.com.senai.loja.Venda;
import br.com.senai.loja.VendaController;
import br.com.senai.pessoa.Pessoa;
import br.com.senai.pessoa.PessoaController;
import br.com.senai.produto.Produto;
import br.com.senai.produto.ProdutoController;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		List<Pessoa> pessoas = new ArrayList<>();
		List<Produto> produtos = new ArrayList<Produto>();
		List<Venda> vendas = new ArrayList<Venda>();
		
		Produto produto = new Produto(
				"abacate",
				2.5,
				35,
				2.5 * 35
				);
		produtos.add(produto);
		

		PessoaController pessoaController = new PessoaController();
		ProdutoController produtoController = new ProdutoController();
		VendaController vendaController = new VendaController();

		boolean sair = false;

		do{
			System.out.println("\n-------- MENU ---------");
			System.out.println("1) Menu de Pessoas");
			System.out.println("2) Menu de Produtos");
			System.out.println("3) Menu de Vendas");

			int opcao = pessoaController.leOpcao();
			

			switch(opcao){
			
			
				case 1:
					pessoaController.menu(pessoas);
					break;

				case 2:
					produtoController.menu(produtos);
					break;
					
				case 3:
					vendaController.menu(vendas, produtos, pessoas);
					break;
					

				case 0:
					sair = true;
					break;

				default:
					System.out.println("Opção Invalida!");
					break;
			}
		}while(!sair);

		System.out.println("Sistema finalizado!");
	}

}
