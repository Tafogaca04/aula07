package Orientação_de_objeto;

public class Pessoa {
String nome;
int idade;
String endereco;
String profissao;
String rg;
String cpf;
public String getNome(){
return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public String getEndereco(){
	return endereco;
}
public void setEndereco(String endereco) {
	this.endereco =endereco;
}
public String getProfissao(){
	 return profissao;
}
public void setProfissao(String profissao) {
	this.profissao = profissao;
}
public String getRG(){
	 return rg;
}
public void setRG(String rg) {
	this.rg = rg;
}
public String getCPF(){
	 return cpf;
}
public void setCPF(String cpf) {
	this.cpf = cpf;
}
}