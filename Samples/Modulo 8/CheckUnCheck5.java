package sef.module8.sample;

public class CheckUnCheck5 {
	
	static void show() {
		try {
			throw new NullPointerException("check");
		} catch (NullPointerException ex) {
			System.out.println("show() levantou uma exce��o");
			throw ex; // rethrowing the exception
		}
	}

	public static void main(String args[]) {
		try {
			show();
		} catch (NullPointerException ex) {
			System.out.println("Exce��o no m�todo main");
		}
	}
}