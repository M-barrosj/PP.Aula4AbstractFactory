package Aula4Parte2;

public class FabricaMicrosoft implements IFabricaDeConsoles{

	@Override
	public IConsoleNG criarConsoleNovaGeracao() {
		return new XboxSerieX();
	}

	@Override
	public IConsoleAG criarConsoleAntigaGeracao() {
		return new Xbox360();
	}

}
