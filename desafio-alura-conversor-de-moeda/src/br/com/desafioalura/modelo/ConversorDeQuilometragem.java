package br.com.desafioalura.modelo;

public class ConversorDeQuilometragem {

	public boolean haCaracteresEspeciaisOuLetras(String valor) {
		return valor.matches("[^\\d]+");
	}

	public double centimetrosParaMetros(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado = valorFormatado / 10 / 10;
		return valorFormatado;
	}

	public double centimetrosParaQuilometros(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado = valorFormatado / 10 / 10 / 10 / 10 / 10;
		return valorFormatado;
	}

	public double metrosParaCentimetros(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado *= 10 * 10;
		return valorFormatado;
	}

	public double metrosParaQuilometros(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado = valorFormatado / 10 / 10 / 10;
		return valorFormatado;
	}

	public double quilometrosParaCentimetros(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado *= 10 * 10 * 10 * 10 * 10;
		return valorFormatado;
	}

	public double quilometrosParaMetros(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado *= 10 * 10 * 10;
		return valorFormatado;
	}
}
