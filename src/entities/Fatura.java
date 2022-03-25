package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fatura {
 private Date dataVencimento;
 private Double jurosDia;
 private Double valorTotal;
 
 private List<ContratoPessoa>contratos= new ArrayList<ContratoPessoa>();
 

public Fatura() {

}


public Fatura(Date dataVencimento, Double jurosDia, Double valorTotal) {
	
	this.dataVencimento = dataVencimento;
	this.jurosDia = jurosDia;
	this.valorTotal = valorTotal;
}


public Date getDataVencimento() {
	return dataVencimento;
}


public void setDataVencimento(Date dataVencimento) {
	this.dataVencimento = dataVencimento;
}


public Double getJurosDia() {
	return jurosDia;
}


public void setJurosDia(Double jurosDia) {
	this.jurosDia = jurosDia;
}


public Double getValorTotal() {
	return valorTotal;
}


public void setValorTotal(Double valorTotal) {
	this.valorTotal = valorTotal;
}


public List<ContratoPessoa> getContratos() {
	return contratos;
}
 
public Double valorTotal() {
	double sum=0.0;
	for(ContratoPessoa obj: contratos) {
		sum+= obj.getValorPessoa();
	}
	return sum;
}

 
 
 
 
 
}
