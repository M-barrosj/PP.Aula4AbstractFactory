package Aula4;

public class FabricaWolksvagem implements IFabricaDeCarros {

	@Override
	public ICarroDeLuxo criarCarroDeLuxo() {
		return new GolfGti();
	}

	@Override
	public ICarroPopular criarCarroPopular() {
		return new Gol();
	}

}
