package beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


public class Carro implements Serializable{

	
	private static final long serialVersionUID = -6904919010403298937L;
	
	/* bora usar por convenção, um atributo por exemplo "cod_carro" no banco
	 * aqui, ao inves de botar esse underline, eu substitui os "underlines"
	 * por letra maiuscula. Rafael falou que o padrao java é assim e é melhor
	 * deixar assim...Só deixando o aviso aqui pra ngm se confundir
	 */
	
	/* Me aconselharam a usar sempre tipo OBJETO, digo ao inves de
	 * "int" botar INTEGER, ao inves de double botar "DOUBLE", coisas assim
	 * 
	 */
	
	private Integer codCarro;
	private BigDecimal precoTabelado;
	private String marca;
	private String modelo;
	private TipoCarro tipo;
	private Double potencia;
	private CapacidadeLitros capacidadeLitros;
	private String tipoTracao;
	private String posicaoMotor;
	private Combustivel combustivel;
	private Double autonomiaKM;
	private Double kmCidade;
	private Double kmEstrada;
	private Integer numAssentos;
	private Double volumeBagageiro;
	private Double volumeTanque;
	private Integer qntPortas;
	private Double areaCega;
	private Double aceleracao;
	private Integer velocidadeMax;
	private Date ano;
	
	public Integer getCodCarro() {
		return codCarro;
	}
	public void setCodCarro(Integer codCarro) {
		this.codCarro = codCarro;
	}
	public BigDecimal getPrecoTabelado() {
		return precoTabelado;
	}
	public void setPrecoTabelado(BigDecimal precoTabelado) {
		this.precoTabelado = precoTabelado;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public TipoCarro getTipo() {
		return tipo;
	}
	public void setTipo(TipoCarro tipo) {
		this.tipo = tipo;
	}
	public Double getPotencia() {
		return potencia;
	}
	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}
	public CapacidadeLitros getCapacidadeLitros() {
		return capacidadeLitros;
	}
	public void setCapacidadeLitros(CapacidadeLitros capacidadeLitros) {
		this.capacidadeLitros = capacidadeLitros;
	}
	public String getTipoTracao() {
		return tipoTracao;
	}
	public void setTipoTracao(String tipoTracao) {
		this.tipoTracao = tipoTracao;
	}
	public String getPosicaoMotor() {
		return posicaoMotor;
	}
	public void setPosicaoMotor(String posicaoMotor) {
		this.posicaoMotor = posicaoMotor;
	}
	public Combustivel getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(Combustivel combustivel) {
		this.combustivel = combustivel;
	}
	public Double getAutonomiaKM() {
		return autonomiaKM;
	}
	public void setAutonomiaKM(Double autonomiaKM) {
		this.autonomiaKM = autonomiaKM;
	}
	public Double getKmCidade() {
		return kmCidade;
	}
	public void setKmCidade(Double kmCidade) {
		this.kmCidade = kmCidade;
	}
	public Double getKmEstrada() {
		return kmEstrada;
	}
	public void setKmEstrada(Double kmEstrada) {
		this.kmEstrada = kmEstrada;
	}
	public Integer getNumAssentos() {
		return numAssentos;
	}
	public void setNumAssentos(Integer numAssentos) {
		this.numAssentos = numAssentos;
	}
	public Double getVolumeBagageiro() {
		return volumeBagageiro;
	}
	public void setVolumeBagageiro(Double volumeBagageiro) {
		this.volumeBagageiro = volumeBagageiro;
	}
	public Double getVolumeTanque() {
		return volumeTanque;
	}
	public void setVolumeTanque(Double volumeTanque) {
		this.volumeTanque = volumeTanque;
	}
	public Integer getQntPortas() {
		return qntPortas;
	}
	public void setQntPortas(Integer qntPortas) {
		this.qntPortas = qntPortas;
	}
	public Double getAreaCega() {
		return areaCega;
	}
	public void setAreaCega(Double areaCega) {
		this.areaCega = areaCega;
	}
	public Double getAceleracao() {
		return aceleracao;
	}
	public void setAceleracao(Double aceleracao) {
		this.aceleracao = aceleracao;
	}
	public Integer getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(Integer velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	public Date getAno() {
		return ano;
	}
	public void setAno(Date ano) {
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return "Carro [codCarro=" + codCarro + ", precoTabelado="
				+ precoTabelado + ", marca=" + marca + ", modelo=" + modelo
				+ ", tipo=" + tipo + ", potencia=" + potencia
				+ ", capacidadeLitros=" + capacidadeLitros + ", tipoTracao="
				+ tipoTracao + ", posicaoMotor=" + posicaoMotor
				+ ", combustivel=" + combustivel + ", autonomiaKM="
				+ autonomiaKM + ", kmCidade=" + kmCidade + ", kmEstrada="
				+ kmEstrada + ", numAssentos=" + numAssentos
				+ ", volumeBagageiro=" + volumeBagageiro + ", volumeTanque="
				+ volumeTanque + ", qntPortas=" + qntPortas + ", areaCega="
				+ areaCega + ", aceleracao=" + aceleracao + ", velocidadeMax="
				+ velocidadeMax + ", ano=" + ano + "]";
	}
	
	
	
	
	
}
