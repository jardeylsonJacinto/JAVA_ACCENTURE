package sef.module8.sample;

import java.io.*;

class ExcecaoCustomizada extends Exception {

	public ExcecaoCustomizada(String str) {
		super(str);
	}
}

public class CheckUncheck3 {
	public static void main(String[] args) {
		try {
			// c�digo que levanta uma exce��o
			throw new ExcecaoCustomizada("Esta � uma exce��o customizada"); // Coloque sua mensagem personalizada
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
