package br.com.desafioalura.modelo;

public class ConversorDeTemperatura {

	public double celsiusParaFahrenheit(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado = (valorFormatado * 9 / 5) + 32;
		return valorFormatado;

	}

	public double celsiusParaKelvin(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado = valorFormatado + 273.15;
		return valorFormatado;
	}

	public boolean haCaracteresEspeciaisOuLetras(String valor) {
		return valor.matches("[^\\d]+");
	}

	public double fahrenheitParaCelsius(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado = (valorFormatado - 32) * 5 / 9;
		return valorFormatado;
	}

	public double fahrenheitParaKelvin(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado = (valorFormatado - 32) * 5/9 + 273.15;
		return valorFormatado;
	}

	public double kelvinParafahrenheit(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado = (valorFormatado - 273.15) * 9/5 + 32;
		return valorFormatado;
	}

	public double kelvinParaCelsius(String valor) {
		double valorFormatado = Double.parseDouble(valor);
		valorFormatado = valorFormatado - 273.15;
		return valorFormatado;
	}

}
