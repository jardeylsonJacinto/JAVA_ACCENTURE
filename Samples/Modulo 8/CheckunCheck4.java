package sef.module8.sample;

import java.io.*;

public class CheckunCheck4 {
	public static void main(String[] args) throws IOException {
		try {
			try {
				System.out.println("Divis�o por zero");
				int b = 42 / 0;
			} catch (ArithmeticException e) {
				System.out.println(e);
			}

			try {
				System.out.println("Tentando acessar elementos que n�o est�o na matriz");
				int a[] = new int[10];
				a[21]++;
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}

		} catch (Exception e) {
			System.out.println("A exce��o do bloco try externo �. " + e);
		}

	}
}