package Orientação_de_objeto;

public class Orientação_carro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro carro1= new Carro();
		

		carro1.setMarca("Chevrolet");
		carro1.setAno(2010);
		carro1.setModelo("Camaro amarelo");
		carro1.setCor("amarelo");
		


		

		System.out.println("---------CARRO 1---------");
		System.out.println(carro1.getMarca());
		System.out.println(carro1.getAno());
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getcor());
			
			}
	}


