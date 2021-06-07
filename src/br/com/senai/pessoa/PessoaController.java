package br.com.senai.pessoa;

import java.util.List;
import java.util.Scanner;

public class PessoaController {

	private Scanner tec;
	
	public PessoaController() {
		tec = new Scanner(System.in);
	}
	
	public int leOpcao() {
		System.out.println("> ");
		return tec.nextInt();
	}
	
	public void menu() {
		System.out.println("\n--- MENU ---");
		System.out.println("1) Cadastrar pessoa");
		System.out.println("2) Listar pessoas cadastradas");
		System.out.println("9) Sair do Sitema");
		System.out.println("--------------------");

	}
	
	public Pessoa cadastrarPessoa() {
		Pessoa pessoa = new Pessoa();
		
		System.out.println("--- CADASTRAR PESSOA ---");
		System.out.println("Informar o nome: ");
		tec.nextLine();
		pessoa.setNome(tec.nextLine());
		
		System.out.println("Informe o ano de Nascimento: ");
		pessoa.setAnoDeNascimento(tec.nextInt());
		
		System.out.println("informe a altura");
		pessoa.setAltura(tec.nextDouble());
		
		return pessoa;		
	}
	
	public List<Pessoa> ListarPessoas(List<Pessoa> pessoas){
		System.out.printf("| %20s | %4s | %5s | %6s |\n", "Nome", "Ano", "idade", "Altura");
		
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.printf("| %20s | %4d | %5d | %6.2f |\n",
					pessoas.get(i).getNome(),
					pessoas.get(i).getAnoDeNascimento(),
					pessoas.get(i).getIdade(),
					pessoas.get(i).getAltura());
		
		}
		return pessoas;  
	}
	}
