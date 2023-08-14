package view;
import controller.SomaController;
public class Principal {
	public static void main(String[] args) {
		SomaController sc = new SomaController();
		int num = 5;
		int soma= sc.soma(num);
		System.out.println(soma);

	}

}
