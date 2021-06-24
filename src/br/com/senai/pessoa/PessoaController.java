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
		
		System.out.print("Informe o nome da Rua: ");
		pessoa.setNomeDaRua(tec.nextLine());
		
		System.out.print("Informe o Complemento: ");
		pessoa.setComplemento(tec.nextLine());
		
		System.out.print("Informe o Número: ");
		pessoa.setNumero(tec.nextLine());
		
		

		return pessoa;
	}

	

	public List<Pessoa> listarPessoas(List<Pessoa> pessoas){
		
		if(pessoas.isEmpty()) {
			System.out.println("Não possui dados para listar.");
			return null;
		}
		
		System.out.println("--- PESSOAS CADASTRADAS ---");

		System.out.printf("| %2s | %8s | %4s | %5s | %6s | %6s | %5s | %15s | %3s | %15s | %12s | %26s | %15s | %7s |\n",
				"id", "Nome", "Ano", "Idade", "Altura", "Pais", "Sigla", "Estado", "UF", "Cidade", "Endereço", "Rua", "Complemento", "Número");
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		for(int i = 0; i < pessoas.size(); i++){
			System.out.printf("| %2d | %8s | %4d | %5d | %6.2f | %6s | %5s | %15s | %3s | %15s | %12s | %26s | %15s | %7s |\n",
					i + 1,
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
	
	public List<Pessoa> editarPessoas(List<Pessoa> pessoas){
		
		Pessoa pessoa = new Pessoa();
		listarPessoas(pessoas);
		
		if(pessoas.isEmpty()) {
			return null;
		}

		System.out.println("Informe o Id da pessoa para ser editado:  ");
		int idPessoa = tec.nextInt() - 1;

		System.out.println("1) Nome da Pessoa");
		System.out.println("2) Ano de Nascimento");
		System.out.println("3) Altura");
		System.out.println("4) Idade");

		

		
		int opcao = tec.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("--- EDITAR NOVO NOME ---");
			System.out.println("Informe o novo nome da Pessoa: ");
			pessoa.setNome(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
	
			pessoas.set(idPessoa, pessoa);
			break;
			
		case 2:
			System.out.println("--- EDITAR DATA DE NASCIMENTO ---");
			System.out.println("Informe a nova data: ");
			pessoa.setAnoDeNascimento(tec.nextInt());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			pessoas.set(idPessoa, pessoa);
			break;
			
		case 3:
			System.out.println("--- EDITAR A ALTURA ---");
			System.out.println("Informe a nova altura");
			pessoa.setAltura(tec.nextInt());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			
			pessoas.set(idPessoa, pessoa);
			
		case 4:
			System.out.println("--- EDITAR PAÍS ---");
			System.out.println("Informe o novo país");
			pessoa.setNomeDoPais(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			
		case 5:
			System.out.println("--- EDITAR SIGLA ---");
			System.out.println("Informe a nova sigla");
			pessoa.setSiglaDoPais(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			
		case 6:
			System.out.println("--- EDITAR ESTADO ---");
			System.out.println("Informe o novo estado");
			pessoa.setNomeDoEstado(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			
		case 7:
			System.out.println("--- EDITAR UF ---");
			System.out.println("Informe novo UF");
			pessoa.setUf(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			
		case 8:
			System.out.println("--- EDITAR CIDADE ---");
			System.out.println("Informe a nova cidade");
			pessoa.setNomeDaCidade(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			
		case 9:
			System.out.println("--- EDITAR ENDEREÇO ---");
			System.out.println("Informe o novo endereço");
			pessoa.setNomeDoBairro(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			
		case 10:
			System.out.println("--- EDITAR RUA ---");
			System.out.println("Informe a nova rua");
			pessoa.setNomeDaRua(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			
		case 11:
			System.out.println("--- EDITAR COMPLEMENTO ---");
			System.out.println("Informe um novo complemento");
			pessoa.setComplemento(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setNumero(pessoas.get(idPessoa).getNumero());
			
			
		case 12:
			System.out.println("--- EDITAR NÚMERO ---");
			System.out.println("Informe o novo número");
			pessoa.setNumero(tec.next());
			
			pessoa.setNome(pessoas.get(idPessoa).getNome());
			pessoa.setAltura(pessoas.get(idPessoa).getAltura());
			pessoa.setNomeDoPais(pessoas.get(idPessoa).getNomeDoPais());
			pessoa.setSiglaDoPais(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setNomeDoEstado(pessoas.get(idPessoa).getSiglaDoPais());
			pessoa.setUf(pessoas.get(idPessoa).getUf());
			pessoa.setNomeDaCidade(pessoas.get(idPessoa).getNomeDaCidade());
			pessoa.setNomeDoBairro(pessoas.get(idPessoa).getNomeDoBairro());
			pessoa.setNomeDaRua(pessoas.get(idPessoa).getNomeDaRua());
			pessoa.setComplemento(pessoas.get(idPessoa).getComplemento());
			
		default:
			System.out.println("Opção inválida");
			break;
			
		}
		return pessoas;
	}
	
	public void menu(){
		System.out.println("\n-------- MENU ---------");
		System.out.println("1) Cadastrar pessoa");
		System.out.println("2) Listar pessoas cadastradas");
		System.out.println("3) Editar Pessoas");
		System.out.println("4) excluir Pessoas");
	}
}
		
		
		
