package caminhaoPacote;

public class Caminhao {
	
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private String cambio; //manual ou automatico
	private String combustivel; //Diesel
	private double valor;
	private int anoFabricacao; 
	private int potenciaMotor; //19cv
	private double capacidadeCarga; //Peso Bruto 30
	private double potenciaMaxima; // aceleração total quilometragem  220 , 240 , 300, 400
	private double tanque; // 750Litro R#$3.500          350Litro
	
	
	
	public Caminhao() {
		
		
	}
	
	public Caminhao(String marca, String modelo, String placa, String cor, String cambio, String combustivel, int anoFabriacacao, 
			int potenciaMotor, double capacidadeCarga, double potenciaMaxima, double tanque, double valor) {
		
		
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.cambio = cambio;
		this.combustivel = combustivel;
		this.anoFabricacao = anoFabriacacao;
		this.potenciaMotor = potenciaMotor;
		this.capacidadeCarga = capacidadeCarga;
		this.potenciaMaxima = potenciaMaxima;
		this.tanque = tanque;
		
		
		
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

	public String getPlaca() {
		
		return placa; 
	}

	public void setPlaca(String placa) {
		
		this.placa = placa;
	}

	public String getCor() {
		
		return cor;
	}

	public void setCor(String cor) {
		
		this.cor = cor;
	}

	public String getCambio() {
		
		return cambio;
	}

	public void setCambio(String cambio) {
		
		this.cambio = cambio;
	}

	public String getCombustivel() {
		
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		
		this.combustivel = combustivel;
	}

	public int getAnoFabricacao() {
		
		return anoFabricacao;
	}

	public void setAnoFabricacao(int anoFabricacao) {
		
		this.anoFabricacao = anoFabricacao;
	}

	public int getPotenciaMotor() {
		
		return potenciaMotor;
	}

	public void setPotenciaMotor(int potenciaMotor) {
		
		this.potenciaMotor = potenciaMotor;
	}

	public String getCapacidadeCarga() {
		
		return String.format("%.0f", capacidadeCarga);
		
		//return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		
		this.capacidadeCarga = capacidadeCarga;
	}

	public String getPotenciaMaxima() {
		
		return String.format("%.0f", potenciaMaxima);
	}

	public void setPotenciaMaxima(double potenciaMaxima) {
		
		this.potenciaMaxima = potenciaMaxima;
	}
	
	public String getTanque() {
		
		return String.format("%.0f", tanque);
		
	}
	
	public void setTanque(double tanque) {
		
		this.tanque = tanque;
		
	}
	
	
	public String getValor() {
		
		return String.format("%.3f", valor);
		
		//return valor;
		
	}
	
	
	public void setValor(double valor) {
		
		this.valor = valor;
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
