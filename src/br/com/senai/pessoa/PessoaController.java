package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

import br.com.senai.produto.Produto;

public class PessoaController {

	private Scanner tec;

	public PessoaController(){
		tec = new Scanner(System.in);
	}

	public int leOpcao(){
		System.out.print("> ");
		return tec.nextInt();
	}

	public void menu(){
		System.out.println("\n--- MENU ---");
		System.out.println("1) Cadastrar pessoa");
		System.out.println("2) Listar pessoas cadastradas");
		System.out.println("3) Cadastrar Produto");
		System.out.println("4) listar Produtos");
		System.out.println("5) Editar produto");
		System.out.println("9) Sair do sistema");
		System.out.println("-------------------");
	}

	public Pessoa cadastrarPessoa(){
		Pessoa pessoa = new Pessoa();
		
	

		System.out.println("--- CADASTRAR PESSOA ---");
		System.out.print("Informe o nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine());

		System.out.print("Informe o ano de nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());

		System.out.print("Informe a altura: ");
		pessoa.setAltura(tec.nextDouble());
		
		System.out.print("Informe país: ");
		tec.nextLine();
		pessoa.setNomeDoPais(tec.nextLine());
		
		System.out.print("Informe a sigla do País: ");
		pessoa.setSiglaDoPais(tec.nextLine());
		
		System.out.print("Informe o Estado: ");
		pessoa.setNomeDoEstado(tec.nextLine());
		
		System.out.print("Informe o UF do Estado: ");
		pessoa.setUf(tec.nextLine());
		
		System.out.print("Informe a cidade: ");
		pessoa.setNomeDaCidade(tec.nextLine());
		
		System.out.print("Informe o endereço(Bairro): ");
		pessoa.setNomeDoBairro(tec.nextLine());
		
		System.out.println("Informe o nome da Rua: ");
		pessoa.setNomeDaRua(tec.nextLine());
		
		System.out.println("Informe o Complemento: ");
		pessoa.setComplemento(tec.nextLine());
		
		System.out.println("Informe o Número: ");
		pessoa.setNumero(tec.nextLine());
		
		

		return pessoa;
	}

	

	public List<Pessoa> listarPessoas(List<Pessoa> pessoas){
		System.out.println("--- PESSOAS CADASTRADAS ---");

		System.out.printf("| %8s | %4s | %5s | %6s | %6s | %5s | %15s | %3s | %15s | %12s | %26s | %15s | %7s |\n",
				"Nome", "Ano", "Idade", "Altura", "Pais", "Sigla", "Estado", "UF", "Cidade", "Endereço", "Rua", "Complemento", "Número");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for(int i = 0; i < pessoas.size(); i++){
			System.out.printf("| %8s | %4d | %5d | %6.2f | %6s | %5s | %15s | %3s | %15s | %12s | %26s | %15s | %7s |\n",
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura(),
					pessoas.get(i).getNomeDoPais(),
					pessoas.get(i).getSiglaDoPais(),
					pessoas.get(i).getNomeDoEstado(),
					pessoas.get(i).getUf(),
					pessoas.get(i).getNomeDaCidade(),
					pessoas.get(i).getNomeDoBairro(),
					pessoas.get(i).getNomeDaRua(),
					pessoas.get(i).getComplemento(),
					pessoas.get(i).getNumero());
					
		}

		return pessoas;
	}
	
	
	
}
