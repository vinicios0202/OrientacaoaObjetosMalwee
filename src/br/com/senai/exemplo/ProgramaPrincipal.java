package br.com.senai.exemplo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();	
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();
		
		
		pessoa1.setNome("Vinicios");
		pessoa1.setAnoDeNascimento(2001);
		pessoa1.setSexo("M");
		
		pessoa2.setNome("Isabela");
		pessoa2.setAnoDeNascimento(2003);
		pessoa2.setSexo("F");
		
		pessoa3.setNome("Gabriela");
		pessoa3.setAnoDeNascimento(2006);
		pessoa3.setSexo("F");
		
		pessoa4.setNome("Arthur");
		pessoa4.setAnoDeNascimento(2000);
		pessoa4.setSexo("M");
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		System.out.println(" ------- PESSOAS com FOR ------- ");
		for(int i = 0; i < pessoas.size(); i++) {
			System.out.println(pessoas.get(i));
			System.out.println("###############################");
			
		}
		
		System.out.println(" ------- PESSOAS CADASTRADAS --------");
		for(Pessoa people : pessoas) {
			System.out.println(people.getNome());
			System.out.println(people.getAnoDeNascimento());
			System.out.println(people.getSexo());
			System.out.println("*////////////////////////////*");
		}
		
		System.out.println(" ------- PESSOAS com FOR EACH lambda -------- ");
		pessoas.forEach(aluno -> {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getAnoDeNascimento());
			System.out.println(aluno.getSexo());
			System.out.println("********************************");
			
		});
		
		Scanner tec = new Scanner(System.in);
		System.out.println("---- TABUADA ---- ");
		MetodoController metodoController = new MetodoController();
		metodoController.multiplicar();
		
		
		System.out.println("----- Soma de Dois Valores -----");
		System.out.println("A soma da: " + metodoController.somar());
		
		
		System.out.println("----- Subtração de Valores por Parâmetro -----");
		System.out.println("informe o primeiro valor:");
		int valor1 = tec.nextInt();
		System.out.println("informe o segundo valor");
		int valor2 = tec.nextInt();
		
		System.out.println("A subtração dá: " + metodoController.subtrair(valor1, valor2));
	}

}
