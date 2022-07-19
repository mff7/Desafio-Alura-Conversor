package br.com.desafioalura.modelo;

public class ConversorDeTempo {

	public boolean haCaracteresEspeciaisOuLetras(String valor) {
		return valor.matches("[^\\d]+");
	}

	public double segundosParaMinutos(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado /= 60;
		return valorFormatado;
	}

	public double segundosParaHoras(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado /= 60 / 60;
		return valorFormatado;
	}

	public double minutosParaSegundos(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado *= 60;
		return valorFormatado;
	}

	public double minutosParaHoras(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado /= 60;
		return valorFormatado;
	}

	public double horasParaSegundos(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado *= 60 * 60;
		return valorFormatado;

	}

	public double horasParaMinutos(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado *= 60;
		return valorFormatado;
	}

}
