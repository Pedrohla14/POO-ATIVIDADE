package entities;

public class ContratoPessoa {
 private Contrato contrato;
 private Pessoa pessoa;
 private Boolean isTitutalr;
 
 
 
 public ContratoPessoa() {
	
}



public ContratoPessoa(Contrato contrato, Pessoa pessoa, Boolean isTitutalr) {
	
	this.contrato = contrato;
	this.pessoa = pessoa;
	this.isTitutalr = isTitutalr;
}



public Contrato getContrato() {
	return contrato;
}



public void setContrato(Contrato contrato) {
	this.contrato = contrato;
}



public Pessoa getPessoa() {
	return pessoa;
}



public void setPessoa(Pessoa pessoa) {
	this.pessoa = pessoa;
}



public Boolean getIsTitutalr() {
	return isTitutalr;
}



public void setIsTitutalr(Boolean isTitutalr) {
	this.isTitutalr = isTitutalr;
}



public Double getValorPessoa() {
	 return null;
 }
}
