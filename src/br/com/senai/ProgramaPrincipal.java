package br.com.senai;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
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
		
		
		
		System.out.println("----- PESSOA 1 -----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getAnoDeNascimento());
		System.out.println(pessoa1.getSexo());
		
		System.out.println("----- PESSOA 2 -----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getAnoDeNascimento());
		System.out.println(pessoa2.getSexo());
		
		System.out.println("----- PESSOA 3 -----");
		System.out.println(pessoa3.getNome());
		System.out.println(pessoa3.getAnoDeNascimento());
		System.out.println(pessoa3.getSexo());
		
		System.out.println("----- PESSOA 4 -----");
		System.out.println(pessoa4.getNome());
		System.out.println(pessoa4.getAnoDeNascimento());
		System.out.println(pessoa4.getSexo());
		
		
	}

}
