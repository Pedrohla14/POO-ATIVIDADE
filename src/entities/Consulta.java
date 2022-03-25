package entities;

public class Consulta {
 private Pessoa paciente;
 private Especialidade especialidade;
 
public Consulta(Pessoa paciente, Especialidade especialidade) {
	
	this.paciente = paciente;
	this.especialidade = especialidade;
}

public Pessoa getPaciente() {
	return paciente;
}

public void setPaciente(Pessoa paciente) {
	this.paciente = paciente;
}

public Especialidade getEspecialidade() {
	return especialidade;
}

public void setEspecialidade(Especialidade especialidade) {
	this.especialidade = especialidade;
}
 
 
}
