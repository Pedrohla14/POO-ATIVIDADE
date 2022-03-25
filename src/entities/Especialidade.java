package entities;

public class Especialidade {
 private String nomeEpecialidade ;
 private Pessoa profissionalConsulta;
 
public Especialidade() {

}

public Especialidade(String nomeEpecialidade, Pessoa profissionalConsulta) {

	this.nomeEpecialidade = nomeEpecialidade;
	this.profissionalConsulta = profissionalConsulta;
}

public String getNomeEpecialidade() {
	return nomeEpecialidade;
}

public void setNomeEpecialidade(String nomeEpecialidade) {
	this.nomeEpecialidade = nomeEpecialidade;
}

public Pessoa getProfissionalConsulta() {
	return profissionalConsulta;
}

public void setProfissionalConsulta(Pessoa profissionalConsulta) {
	this.profissionalConsulta = profissionalConsulta;
}
 
 
}
