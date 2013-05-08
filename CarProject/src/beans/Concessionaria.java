package beans;

import java.io.Serializable;

public class Concessionaria implements Serializable{
	
	
	private static final long serialVersionUID = -7673068634792486274L;
	
	private Integer codConcessionaria;
	private String nomeConcessionaria;
	private String cnpj;
	private String endereco;
	private String bairro;
	private String referencia;
	private String enderecoWEB;
	private String email;
	private String telefone;
	private String telefone2;
	
	public Integer getCodConcessionaria() {
		return codConcessionaria;
	}
	public void setCodConcessionaria(Integer codConcessionaria) {
		this.codConcessionaria = codConcessionaria;
	}
	public String getNomeConcessionaria() {
		return nomeConcessionaria;
	}
	public void setNomeConcessionaria(String nomeConcessionaria) {
		this.nomeConcessionaria = nomeConcessionaria;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public String getEnderecoWEB() {
		return enderecoWEB;
	}
	public void setEnderecoWEB(String enderecoWEB) {
		this.enderecoWEB = enderecoWEB;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	
	@Override
	public String toString() {
		return "Concessionaria [codConcessionaria=" + codConcessionaria
				+ ", nomeConcessionaria=" + nomeConcessionaria + ", cnpj="
				+ cnpj + ", endereco=" + endereco + ", bairro=" + bairro
				+ ", referencia=" + referencia + ", enderecoWEB=" + enderecoWEB
				+ ", email=" + email + ", telefone=" + telefone
				+ ", telefone2=" + telefone2 + "]";
	}
		
}
