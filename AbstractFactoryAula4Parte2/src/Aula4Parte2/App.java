package Aula4Parte2;



public class App {

	public static void main(String[] args) {
		
		IFabricaDeConsoles consoleSony = new FabricaSony();
		
		IConsoleNG console1 = consoleSony.criarConsoleNovaGeracao();
		
		console1.exibirConsoleNG();
		
		IConsoleAG console2 = consoleSony.criarConsoleAntigaGeracao();
		
		console2.exibirConsoleAG();
		
		IFabricaDeConsoles consoleMicrosoft = new FabricaMicrosoft();
		
		IConsoleNG console3 = consoleMicrosoft.criarConsoleNovaGeracao();
		
		console3.exibirConsoleNG();
		
		IConsoleAG console4 = consoleMicrosoft.criarConsoleAntigaGeracao();
		
		console4.exibirConsoleAG();
		
		IFabricaDeConsoles consoleNintendo = new FabricaNintendo();
		
		IConsoleNG console5 = consoleNintendo.criarConsoleNovaGeracao();
		
		console5.exibirConsoleNG();
		
		IConsoleAG console6 = consoleNintendo.criarConsoleAntigaGeracao();
		
		console6.exibirConsoleAG();


	}

}
