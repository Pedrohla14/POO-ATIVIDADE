package entities;

import java.util.Date;

public class Pessoa {
 private String nome;
 private Integer idade;
 private char sexo;
 private String endereco;
 private Date dataNascimento;
 
 
 
 
 
 
 
public Pessoa() {
	
}





public Pessoa(String nome, Integer idade, char sexo, String endereco, Date dataNascimento) {
	
	this.nome = nome;
	this.idade = idade;
	this.sexo = sexo;
	this.endereco = endereco;
	this.dataNascimento = dataNascimento;
}


public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Integer getIdade() {
	return idade;
}


public void setIdade(Integer idade) {
	this.idade = idade;
}

public char getSexo() {
	return sexo;
}

public void setSexo(char sexo) {
	this.sexo = sexo;
}


public String getEndereco() {
	return endereco;
}

public void setEndereco(String endereco) {
	this.endereco = endereco;
}


public Date getDataNascimento() {
	return dataNascimento;
}

public void setDataNascimento(Date dataNascimento) {
	this.dataNascimento = dataNascimento;
}

 
}
