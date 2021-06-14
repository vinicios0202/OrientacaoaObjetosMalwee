package br.com.senai.produto;

import java.util.List;
import java.util.Scanner;

import br.com.senai.pessoa.Pessoa;

public class ProdutoController {
	
	
	private Scanner tec;

	public ProdutoController(){
		tec = new Scanner(System.in);
	}

	public int leOpcao(){
		System.out.print("> ");
		return tec.nextInt();
	}
	
	public Produto cadastrarProduto(){
		Produto produto = new Produto();
		
		System.out.println("--- CADASTRAR PRODUTOS ---");
		System.out.println("Nome do Produto: ");
		produto.setNomeDoProduto(tec.nextLine());
		
		System.out.println("Valor unitario do produto: ");
		produto.setValorUnitarioDoProduto(tec.nextDouble());
		
		System.out.println("Quantidade do produto: ");
		produto.setQuantidadeDoProduto(tec.nextInt());
		
		System.out.println("Valor total do produto: ");
		

		
		return produto;

}

	public List<Produto> listarProdutos(List<Produto> produtos){
		System.out.println("----PRODUTOS CADASTRADOS----");
		
		System.out.printf("| %10s | %7s | %8s | %8s |\n",
				"Nome", "ValorUni", "Quantidade", "Valor Total");
		System.out.println("----------------------------------------------------------");
		for(int i = 0; i < produtos.size(); i++){
			System.out.printf("| %10s | %7s | %8s | %8s |\n",
					produtos.get(i).getNomeDoProduto(),
					produtos.get(i).getValorUnitarioDoProduto(),
					produtos.get(i).getQuantidadeDoProduto(),
					produtos.get(i).getValorTotalDoProduto());
		}
		
		
		return produtos;
	}
}
	
	
	
		
	