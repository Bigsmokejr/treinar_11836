package br.com.maxdoliveira.operador;

public class OperadorIncremento {
	public static void main(String[] args) {
		int i = 0;
		System.out.println("i = " + i);
		i = i + 1;
		System.out.println("i = " + i);
		i += 1;
		System.out.println("i = " + i);
		i = i++;//P�s incremento (Primeiro usa o numero e depois adiciona)
		System.out.println("i = " + i);
		i = ++i;//Pr� incremento (Primeio adiciona e depois usa o numero)
		System.out.println("i = " + i);
	}
}
