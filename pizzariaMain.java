package caminhaoPacote;

public class pizzariaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pizzaria pizzaria = new Pizzaria();
		
		
		String nome = "Renato Lima";
		String endereco = "Rua benjamin ferraz ";
		int numeroResidencial = 246;
		String contato = "96552-7154";
		double mussarela = 52.00;
		double bauru = 48.00;
		double portuguesa = 55.00;
		double frango = 45.00;
		double cocaCola = 8.00;
		double guarana = 7.00;
		double sprite = 7.00;
		double sucoNatural = 5.00;
		
		
		pizzaria.setNome(nome);
		pizzaria.setEndereco(endereco);
		pizzaria.setNumeroResidencial(numeroResidencial);
		pizzaria.setContato(contato);
		pizzaria.setMussarela(mussarela);
		pizzaria.setBauru(bauru);
		pizzaria.setPortuguesa(portuguesa);
		pizzaria.setFrango(frango);
		pizzaria.setCoca_cola(cocaCola);
		pizzaria.setGuarana(guarana);
		pizzaria.setSprite(sprite);
		pizzaria.setSucoNatural(sucoNatural);
		
		System.out.println("DADOS DO CLIENTE");
		System.out.println();
		System.out.println("Nome: " + pizzaria.getNome());
		System.out.println("Endereço: " + pizzaria.getEndereco());
		System.out.println("Numero Residencial: " + pizzaria.getNumeroResidencial());
		System.out.println("Contato: " + pizzaria.getContato());
		System.out.println();
		System.out.println("SABORES DE PIZZA");
		System.out.println();
		System.out.println("Mussarela: R$ " + pizzaria.getMussarela());
		System.out.println("Bauru: R$ " + pizzaria.getBauru());
		System.out.println("Portuguesa: R$ " + pizzaria.getPortuguesa());
		System.out.println("Frango: R$ " + pizzaria.getFrango());
		System.out.println();
		System.out.println("BEBIDAS");
		System.out.println();
		System.out.println("Coca-Cola: R$ " + pizzaria.getCoca_cola());
		System.out.println("Guarana: R$ " + pizzaria.getGuarana());
		System.out.println("Sprite: R$ " + pizzaria.getSprite());
		System.out.println("Suco Natural R$ " + pizzaria.getSucoNatural());
		
		
		
		// Neste projeto foi preenchido os dados do cliente e o fornecimento de variações e opções 
		// de pizzas e bebidas que agrade o freguês.
		
		
		// Foram criado 12 atributos onde cada um. Seguem os conceitos primordias com o uso dos
		// métodos getters e setters. E para garantir um programa completo elaborei nos métodos
		// getters o retorno com duas casas decimais usando String.format
		
		
		
		
		
		
		
		
		
		
		

	}

}
