package br.com.unicuritiba.InvestmentWallet.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Wallet")
public class Wallet {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "Nome_Investimento")
	private String Titulo;

	@Column(name = "Prazo_de_Ação")
	private String Data;

	@Column(name ="Investimento_Inicial")
	private String ValorInicial;

	@Column(name = "Empresa")
	private String Empresa;

	@Column(name = "Rentabilidade")
	private String Porcento;

	@Column(name = "Valor_Minimo")
	private String ValorMinimo;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public String getValorI() {
		return ValorInicial;
	}
	public void setValorI(String valorInicial) {
		ValorInicial = valorInicial;
	}
	public String getEmpresa() {
		return Empresa;
	}
	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}
	public String getPorcento() {
		return Porcento;
	}
	public void setPorcento(String porcento) {
		Porcento = porcento;
	}
	public String getValorMinimo() {
		return ValorMinimo;
	}
	public void setValorM(String valorMinimo) {
		ValorMinimo = valorMinimo;
	}
}
	
	