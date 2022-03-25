package entities;

public class ExamePessoa {
	private Pessoa paciente;
	private Exame exame;
	public ExamePessoa(Pessoa paciente, Exame exame) {
		
		this.paciente = paciente;
		this.exame = exame;
	}
	public Pessoa getPaciente() {
		return paciente;
	}
	public void setPaciente(Pessoa paciente) {
		this.paciente = paciente;
	}
	public Exame getExame() {
		return exame;
	}
	public void setExame(Exame exame) {
		this.exame = exame;
	}
	
	

}
