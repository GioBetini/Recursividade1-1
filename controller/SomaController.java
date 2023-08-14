package controller;

public class SomaController {
	public SomaController() {
		super();
	}

	public int soma(int num) {
		if (num == 0) { //Condição de parada ao encontrar 0 nos números naturais
			return 0;
		}
		return num + soma(num-1); //A função chama a si mesma
							      //subtraindo um da variável num a fim de 
		                          // encontrar sua condição de parada (line 9)

	}
}
