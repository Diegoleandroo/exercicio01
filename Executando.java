package caminhaoPacote;

public class Executando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caminhao caminhao = new Caminhao();
		
		String marca = "Scania";
		String modelo = "Truck";
		String placa = "DQA-7358";
		String cor = "Branco";
		String cambio = "Automatico";
		String combustivel = "Diesel";
		double valor = 720.000;
		int anoFabricado = 2023;
		int potenciaMotor = 450;
		int capacidadeCarga = 24;
		double potenciaMaxima = 220;
		double tanque = 300; //400 ou 3.5
		
		
		caminhao.setValor(valor);
		caminhao.setMarca(marca);
		caminhao.setModelo(modelo);
		caminhao.setPlaca(placa);
		caminhao.setCor(cor);
		caminhao.setCambio(cambio);
		caminhao.setCombustivel(combustivel);
		caminhao.setAnoFabricacao(anoFabricado);
		caminhao.setPotenciaMotor(potenciaMotor);
		caminhao.setCapacidadeCarga(capacidadeCarga);
		caminhao.setPotenciaMaxima(potenciaMaxima);
		caminhao.setTanque(tanque);
		
		
		
		System.out.println("Valor = R$ " + caminhao.getValor());
		System.out.println("Marca = " + caminhao.getMarca());
		System.out.println("Modelo = " + caminhao.getModelo());
		System.out.println("Placa = " + caminhao.getPlaca());
		System.out.println("Cor = " + caminhao.getCor());
		System.out.println("Cambio = " + caminhao.getCambio());
		System.out.println("Combustivel = " + caminhao.getCombustivel());
		System.out.println("Ano de Fabricação = " + caminhao.getAnoFabricacao());
		System.out.println("Potencia do motor " + caminhao.getPotenciaMotor() + " cv ");
		System.out.println("Capacidade de Carga = " + caminhao.getCapacidadeCarga() + " toneladas ");
		System.out.println("Potencia Máxima = " + caminhao.getPotenciaMaxima() + " Km ");
		System.out.println("Tanque = " + caminhao.getTanque() + " Litros");
		
		
		
		
		
		
		
		

	}

}
