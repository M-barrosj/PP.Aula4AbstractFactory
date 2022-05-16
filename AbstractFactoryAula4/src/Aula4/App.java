package Aula4;

public class App {

	public static void main(String[] args) {
		
		IFabricaDeCarros carroFord = new FabricaFord();
		
		ICarroDeLuxo carro1 = carroFord.criarCarroDeLuxo();
		
		carro1.exibirCarroDeLuxo();
		
		ICarroPopular carro2 = carroFord.criarCarroPopular();
		
		carro2.exibirCarroPopular();
		
		IFabricaDeCarros carroWolksvagem = new FabricaWolksvagem();
		
		ICarroDeLuxo carro3 = carroWolksvagem.criarCarroDeLuxo();
		
		carro3.exibirCarroDeLuxo();
		
		ICarroPopular carro4 = carroWolksvagem.criarCarroPopular();
		
		carro4.exibirCarroPopular();
		
		
		
		
		
		

	}

}
