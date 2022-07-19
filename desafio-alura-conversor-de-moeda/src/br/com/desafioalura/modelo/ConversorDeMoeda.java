package br.com.desafioalura.modelo;

public class ConversorDeMoeda {

	public double realParaDolar(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado /= 5.38;
		return valorFormatado;

	}

	public double realParaEuro(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado /= 5.50;
		return valorFormatado;

	}

	public double realParaLibra(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado /= 6.48;
		return valorFormatado;

	}

	public double realParaPesoArgentino(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado /= 0.042;
		return valorFormatado;

	}

	public double realParaPesoChileno(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado /= 0.0057;
		return valorFormatado;

	}

	public double dolarParaReais(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado /= 5.38;
		return valorFormatado;

	}

	public double EuroParaReais(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado /= 5.50;
		return valorFormatado;
	}

	public double libraParaReais(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado /= 6.48;
		return valorFormatado;
	}

	public double pesoArgentinoParaReais(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado /= 0.042;
		return valorFormatado;
	}

	public double pesoChilenoParaReais(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado /= 0.0057;
		return valorFormatado;
	}

	public boolean haCaracteresEspeciaisOuLetras(String valor) {
		return valor.matches("[^\\d]+");
	}

}
