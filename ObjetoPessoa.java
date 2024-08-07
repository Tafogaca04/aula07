package Orientação_de_objeto;

public class ObjetoPessoa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pessoa pessoa1= new Pessoa();
Pessoa pessoa2= new Pessoa();

pessoa1.setNome("Tom Crusie");
pessoa1.setIdade(60);
pessoa1.setEndereco("California,USA");
pessoa1.setProfissao("Ator");
pessoa1.setRG("300.553.200.21");
pessoa1.setCPF("310.987.345-18");


pessoa2.setNome("Messi");
pessoa2.setIdade(35);
pessoa2.setEndereco("Miami,USA");
pessoa2.setProfissao("Jogador de futebol");
pessoa2.setCPF("320.716.028-12");
pessoa2.setRG("220.200.490.87");


System.out.println("---------OBJETO 1---------");
System.out.println(pessoa1.getNome());
System.out.println(pessoa1.getIdade());
System.out.println(pessoa1.getEndereco());
System.out.println(pessoa1.getProfissao());
System.out.println(pessoa1.getRG());
System.out.println(pessoa1.getCPF());

System.out.println("---------OBJETO 2---------");
System.out.println(pessoa2.getNome());
System.out.println(pessoa2.getIdade());
System.out.println(pessoa2.getEndereco());
System.out.println(pessoa2.getProfissao());
System.out.println(pessoa2.getRG());
System.out.println(pessoa2.getCPF());
	}
	}
