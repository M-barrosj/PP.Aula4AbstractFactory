package Aula4Parte2;

public class FabricaSony implements IFabricaDeConsoles {

	@Override
	public IConsoleNG criarConsoleNovaGeracao() {
		return new Playstation5();
	}

	@Override
	public IConsoleAG criarConsoleAntigaGeracao() {
		return new Playstation2();
	}

}
