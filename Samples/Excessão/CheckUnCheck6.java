package sef.module8.sample;

// refatora��o do CheckUnCheck5
public class CheckUnCheck6 {

	static void show() throws IllegalAccessException {
		System.out.println("show() levantou uma exce��o");
		throw new IllegalAccessException("demo");
	}

	public static void main(String args[]) {
		try {
			show();
		} catch (IllegalAccessException ex) {
			System.out.println("Exce��o no m�todo main");
		}
	}
}