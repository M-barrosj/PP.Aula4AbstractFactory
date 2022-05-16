package Aula4;

public class FabricaFord implements IFabricaDeCarros{

	@Override
	public ICarroDeLuxo criarCarroDeLuxo() {
		return new Fusion();
	}

	@Override
	public ICarroPopular criarCarroPopular() {
		return new Fiesta();
	}
	
		
	
	

}
