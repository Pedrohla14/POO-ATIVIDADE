package entities;

import java.util.Date;

public class Contrato {
	private String nomeEmpresa;
	private Date dataContrato;
	
	
	public Contrato() {
			}


	public Contrato(String nomeEmpresa, Date dataContrato) {
		this.nomeEmpresa = nomeEmpresa;
		this.dataContrato = dataContrato;
	}


	public String getNomeEmpresa() {
		return nomeEmpresa;
	}


	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}


	public Date getDataContrato() {
		return dataContrato;
	}


	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}
	
	
}
