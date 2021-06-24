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
			pessoaController.menu();

			int opcao = pessoaController.leOpcao();
			
			public void menu(){
				System.out.println("\n-------- MENU ---------");
				System.out.println("1) Cadastrar pessoa");
				System.out.println("2) Listar pessoas cadastradas");
				System.out.println("3) Editar Pessoas");
				System.out.println("4) excluir Pessoas");
			}

			switch(opcao){
			
			
				case 1:
					pessoaController.menu();
					break;

				case 2:
					produtoController.menu();
					break;
					
				case 3:
					vendaController.menu();
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
