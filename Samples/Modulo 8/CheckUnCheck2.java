package sef.module8.sample;

import java.io.*;

public class CheckUnCheck2 {
	public static void main(String[] args) throws IOException {

		try {
			int arr[] = { 1, 3, 4, 2, 45, 6 };
			System.out.println(arr[131]);
			System.out.println(25 / 0);
			System.out.println("Esta instru��o nunca ser� executada porque o controle mudou para o bloco catch. ");
		} catch (ArithmeticException e) {
			System.out.println("Voc� est� tentando dividir por zero! Isso n�o est� certo!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Voc� est� tentando acessar um �ndice que n�o est� no array!");
		} finally {
			System.out.println("Este c�digo est� no bloco finally. Ele n�o depende se uma exce��o ocorreu ou n�o. ");
		}
	}

}