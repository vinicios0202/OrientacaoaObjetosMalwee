package br.com.carro;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
		Carro carro5 = new Carro();
		
		carro1.setMarca("Uno");
		carro1.setModelo("Fiat");
		carro1.setAno(2000);
		carro1.setQtdPortas(4);
		
		carro2.setMarca("Gol");
		carro2.setModelo("Volkswagen");
		carro2.setAno(2004);
		carro2.setQtdPortas(4);
		
		carro3.setMarca("Palio");
		carro3.setModelo("Fiat");
		carro3.setAno(2003);
		carro3.setQtdPortas(4);
		
		carro4.setMarca("Voyage");
		carro4.setModelo("Volkswagen");
		carro4.setAno(2007);
		carro4.setQtdPortas(4);
		
		carro5.setMarca("HB20");
		carro5.setModelo("Hyundai");
		carro5.setAno(2015);
		carro5.setQtdPortas(4);
		
		System.out.println("------- CARRO 1 -------");
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getAno());
		System.out.println(carro1.getQtdPortas());
		
		System.out.println("------- CARRO 2 -------");
		System.out.println(carro2.getMarca());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getAno());
		System.out.println(carro2.getQtdPortas());
		
		System.out.println("------- CARRO 3 -------");
		System.out.println(carro3.getMarca());
		System.out.println(carro3.getModelo());
		System.out.println(carro3.getAno());
		System.out.println(carro3.getQtdPortas());
		
		System.out.println("------- CARRO 4 -------");
		System.out.println(carro4.getMarca());
		System.out.println(carro4.getModelo());
		System.out.println(carro4.getAno());
		System.out.println(carro4.getQtdPortas());
		
		System.out.println("------- CARRO 5 -------");
		System.out.println(carro5.getMarca());
		System.out.println(carro5.getModelo());
		System.out.println(carro5.getAno());
		System.out.println(carro5.getQtdPortas());
		
		
		
		
		
		
		
		
		

		
	}

}
