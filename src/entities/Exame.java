package entities;

public class Exame {
private String nomeExame;
private Pessoa profissionalExame;

public Exame(String nomeExame, Pessoa profissionalExame) {

	this.nomeExame = nomeExame;
	this.profissionalExame = profissionalExame;
}

public String getNomeExame() {
	return nomeExame;
}

public void setNomeExame(String nomeExame) {
	this.nomeExame = nomeExame;
}

public Pessoa getProfissionalExame() {
	return profissionalExame;
}

public void setProfissionalExame(Pessoa profissionalExame) {
	this.profissionalExame = profissionalExame;
}



}
