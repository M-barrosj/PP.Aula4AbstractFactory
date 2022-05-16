package Aula4Parte2;

public class FabricaNintendo implements IFabricaDeConsoles{

	@Override
	public IConsoleNG criarConsoleNovaGeracao() {
		return new NintendoSwitch();
	}

	@Override
	public IConsoleAG criarConsoleAntigaGeracao() {
		return new Wii_U();
	}
	

}
