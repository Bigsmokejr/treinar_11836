package br.com.jb.comando;

public class Exercicio {
	public static void main(String[] args) {
		int i = 5;
		boolean achouNumero = false;
		if (i == 1) {
			System.out.println("achou Um");
			achouNumero = true;
		} 
		if (i == 2) {
			System.out.println("achou Dois");
			achouNumero = true;
		} 
		if (i == 3) {
			System.out.println("achou Tr�s");
			achouNumero = true;
		} 
		if (!achouNumero){
			System.out.println("achou Outro N�mero");
		}
	}
}
