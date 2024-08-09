package caminhaoPacote;

public class Pizzaria {
	
	private String nome;
	private String endereco;
	private int numeroResidencial;
	private String contato;
	private double mussarela;
	private double bauru;
	private double portuguesa;
	private double frango;
	private double coca_cola;
	private double guarana;
	private double sprite;
	private double sucoNatural;
	
	
	public Pizzaria() {
		
	}


	public Pizzaria(String nome, String endereco, int numeroResidencial, String contato, double mussarela, double bauru,
			double portuguesa, double frango, double coca_cola, double guarana, double sprite, double sucoNatural) {
		
		this.nome = nome;
		this.endereco = endereco;
		this.numeroResidencial = numeroResidencial;
		this.contato = contato;
		this.mussarela = mussarela;
		this.bauru = bauru;
		this.portuguesa = portuguesa;
		this.frango = frango;
		this.coca_cola = coca_cola;
		this.guarana = guarana;
		this.sprite = sprite;
		this.sucoNatural = sucoNatural;
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public int getNumeroResidencial() {
		return numeroResidencial;
	}


	public void setNumeroResidencial(int numeroResidencial) {
		this.numeroResidencial = numeroResidencial;
	}


	public String getContato() {
		return contato;
	}


	public void setContato(String contato) {
		this.contato = contato;
	}


	public String getMussarela() {
		return String.format("%.2f", mussarela);
	}


	public void setMussarela(double mussarela) {
		this.mussarela = mussarela;
	}


	public String getBauru() {
		return String.format("%.2f", bauru);
	}


	public void setBauru(double bauru) {
		this.bauru = bauru;
	}


	public String getPortuguesa() {
		return String.format("%.2f", portuguesa);
	}


	public void setPortuguesa(double portuguesa) {
		this.portuguesa = portuguesa;
	}


	public String getFrango() {
		return String.format("%.2f", frango);
	}


	public void setFrango(double frango) {
		this.frango = frango;
	}


	public String getCoca_cola() {
		return String.format("%.2f", coca_cola);
	}


	public void setCoca_cola(double coca_cola) {
		this.coca_cola = coca_cola;
	}


	public String getGuarana() {
		return String.format("%.2f", guarana);
	}


	public void setGuarana(double guarana) {
		this.guarana = guarana;
	}


	public String getSprite() {
		return String.format("%.2f", sprite);
	}


	public void setSprite(double sprite) {
		this.sprite = sprite;
	}


	public String getSucoNatural() {
		return String.format("%.2f", sucoNatural);
	}


	public void setSucoNatural(double sucoNatural) {
		this.sucoNatural = sucoNatural;
	}
	
	
	
	
	
	

}
