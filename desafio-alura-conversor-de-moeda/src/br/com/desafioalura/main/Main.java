package br.com.desafioalura.main;

import javax.swing.JOptionPane;

import br.com.desafioalura.modelo.ConversorDeMoeda;
import br.com.desafioalura.modelo.ConversorDeQuilometragem;
import br.com.desafioalura.modelo.ConversorDeTemperatura;
import br.com.desafioalura.modelo.ConversorDeTempo;

public class Main {

	public static void main(String[] args) {

		// ----------------------------- MENU PRINCIPAL --------------------------------
		int desejaContinuar = 0;
		while (desejaContinuar == 0) {
			
			//Vetor de opções de conversão
			Object[] opcoes = { "Conversor de Moeda", "Conversor de Temperatura", "Conversor de Quilometragem",
					"Conversor de Tempo" };
			//Solicitar alguma entrada
			Object opcaoSelecionada = JOptionPane.showInputDialog(null, "Escolha um item", "Menu",
					JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

			// ----------------------- CONVERSOR DE MOEDAS ---------------------------------

			if (opcaoSelecionada == opcoes[0]) {

				// input do Valor
				String valor = JOptionPane.showInputDialog("Insira um valor");

				// Tratamento de erro
				ConversorDeMoeda verifica = new ConversorDeMoeda();
				if (verifica.haCaracteresEspeciaisOuLetras(valor)) {
					//Informe o usuário sobre algo que aconteceu.
					JOptionPane.showMessageDialog(null, "Valor inválido");

				} else {

					// Opções de Moedas
					Object[] opcoesParaConversaoMoeda = { "Converter de Reais a Dólar", "Converter de Reais a Euro",
							"Converter de Reais a Libras Esterlinas", "Converter de Reais a Peso argentino",
							"Converter de Reais a Peso Chileno", "Converter de Dólar a Reais",
							"Converter de Euro a Reais", "Converter de Libras Esterlinas a Reais",
							"Converter de Peso argentino a  Reais", "Converter de Peso Chileno a Reais" };
					
					//Solicitar alguma entrada.
					Object opcaoSelecionadaConversor = JOptionPane.showInputDialog(null, "Escolha um item", "Moedas",
							JOptionPane.PLAIN_MESSAGE, null, opcoesParaConversaoMoeda, opcoesParaConversaoMoeda[0]);

					// Conversão

					ConversorDeMoeda conversao = new ConversorDeMoeda();
					double valorConvertido = 0;
					if (opcaoSelecionadaConversor == opcoesParaConversaoMoeda[0]) {
						valorConvertido = conversao.realParaDolar(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoMoeda[1]) {
						valorConvertido = conversao.realParaEuro(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoMoeda[2]) {
						valorConvertido = conversao.realParaLibra(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoMoeda[3]) {
						valorConvertido = conversao.realParaPesoArgentino(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoMoeda[4]) {
						valorConvertido = conversao.realParaPesoChileno(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoMoeda[5]) {
						valorConvertido = conversao.dolarParaReais(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoMoeda[6]) {
						valorConvertido = conversao.EuroParaReais(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoMoeda[7]) {
						valorConvertido = conversao.libraParaReais(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoMoeda[8]) {
						valorConvertido = conversao.pesoArgentinoParaReais(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoMoeda[9]) {
						valorConvertido = conversao.pesoChilenoParaReais(valor);
					}

					// Mensagem do Valor
					JOptionPane.showMessageDialog(null, "O valor da conversão é de " + valorConvertido);

					// Mensagem de deseja continuar? Faz uma pergunta de confirmação, como sim/não/cancelar.
					desejaContinuar = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Selecione uma opção",
							JOptionPane.YES_NO_CANCEL_OPTION);
					if (desejaContinuar == 1) {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
					}
					if (desejaContinuar == 2) {
						JOptionPane.showMessageDialog(null, "Programa concluído");

					}
				}

//*******************************************************************************************************************************

// ---------------------- CONVERSOR DE TEMPERATURA ---------------------------------

			} else if (opcaoSelecionada == opcoes[1]) {

				String valor = JOptionPane.showInputDialog("Insira um valor");

				// Tratamento de erro
				ConversorDeTemperatura verifica = new ConversorDeTemperatura();
				if (verifica.haCaracteresEspeciaisOuLetras(valor)) {
					JOptionPane.showMessageDialog(null, "Valor inválido");

				} else {

					// Opções de Medidas de temperatura
					Object[] opcoesParaConversaoTemperatura = { "Converter de Celsius a Fahrenheit",
							"Converter de Celsius a Kelvin", "Converter de Fahrenheit a Celsius",
							"Converter de Fahrenheit a Kelvin", "Converter de Kelvin a Fahrenheit",
							"Converter de Kelvin a Celsius" };
					Object opcaoSelecionadaConversor = JOptionPane.showInputDialog(null, "Escolha um item",
							"Medidas de Temperatura", JOptionPane.PLAIN_MESSAGE, null, opcoesParaConversaoTemperatura,
							opcoesParaConversaoTemperatura[0]);

					// Conversão

					ConversorDeTemperatura conversao = new ConversorDeTemperatura();
					double valorConvertido = 0;
					if (opcaoSelecionadaConversor == opcoesParaConversaoTemperatura[0]) {
						valorConvertido = conversao.celsiusParaFahrenheit(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoTemperatura[1]) {
						valorConvertido = conversao.celsiusParaKelvin(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoTemperatura[2]) {
						valorConvertido = conversao.fahrenheitParaCelsius(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoTemperatura[3]) {
						valorConvertido = conversao.fahrenheitParaKelvin(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoTemperatura[4]) {
						valorConvertido = conversao.kelvinParafahrenheit(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoTemperatura[5]) {
						valorConvertido = conversao.kelvinParaCelsius(valor);
					}

					// Mensagem do Valor
					JOptionPane.showMessageDialog(null, "O valor da conversão é de " + valorConvertido);

					// Mensagem de deseja continuar?
					desejaContinuar = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Selecione uma opção",
							JOptionPane.YES_NO_CANCEL_OPTION);
					if (desejaContinuar == 1) {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
					}
					if (desejaContinuar == 2) {
						JOptionPane.showMessageDialog(null, "Programa concluído");
					}

				}

//*******************************************************************************************************************************

// ---------------------- CONVERSOR DE QUILOMETRAGEM ---------------------------------

			} else if (opcaoSelecionada == opcoes[2]) {
				String valor = JOptionPane.showInputDialog("Insira um valor");

				// Tratamento de erro
				ConversorDeQuilometragem verifica = new ConversorDeQuilometragem();
				if (verifica.haCaracteresEspeciaisOuLetras(valor)) {
					JOptionPane.showMessageDialog(null, "Valor inválido");

				} else {

					// Opções de Medidas de Quilometragem
					Object[] opcoesParaConversaoQuilometragem = { "Converter de centímetros  a metros",
							"Converter de centímetros a quilômetros", "Converter de metros a centímetros",
							"Converter de metros a quilômetros", "Converter de quilomêtros a centímetros",
							"Converter de quilômetros a metros" };
					Object opcaoSelecionadaConversor = JOptionPane.showInputDialog(null, "Escolha um item",
							"Medidas de Temperatura", JOptionPane.PLAIN_MESSAGE, null, opcoesParaConversaoQuilometragem,
							opcoesParaConversaoQuilometragem[0]);

					// Conversão
					ConversorDeQuilometragem conversao = new ConversorDeQuilometragem();
					double valorConvertido = 0;
					if (opcaoSelecionadaConversor == opcoesParaConversaoQuilometragem[0]) {
						valorConvertido = conversao.centimetrosParaMetros(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoQuilometragem[1]) {
						valorConvertido = conversao.centimetrosParaQuilometros(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoQuilometragem[2]) {
						valorConvertido = conversao.metrosParaCentimetros(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoQuilometragem[3]) {
						valorConvertido = conversao.metrosParaQuilometros(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoQuilometragem[4]) {
						valorConvertido = conversao.quilometrosParaCentimetros(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoQuilometragem[5]) {
						valorConvertido = conversao.quilometrosParaMetros(valor);
					}
					// Mensagem do Valor
					JOptionPane.showMessageDialog(null, "O valor da conversão é de " + valorConvertido);

					// Mensagem de deseja continuar?
					desejaContinuar = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Selecione uma opção",
							JOptionPane.YES_NO_CANCEL_OPTION);
					if (desejaContinuar == 1) {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
					}
					if (desejaContinuar == 2) {
						JOptionPane.showMessageDialog(null, "Programa concluído");
					}
				}

//*******************************************************************************************************************************

// ---------------------- CONVERSOR DE TEMPO ---------------------------------

			} else if (opcaoSelecionada == opcoes[3]) {
				String valor = JOptionPane.showInputDialog("Insira um valor");

				// Tratamento de erro
				ConversorDeTempo verifica = new ConversorDeTempo();
				if (verifica.haCaracteresEspeciaisOuLetras(valor)) {
					JOptionPane.showMessageDialog(null, "Valor inválido");

				} else {

					// Opções de Medidas de Tempo
					Object[] opcoesParaConversaoTempo = { "Converter de segundos  a minutos",
							"Converter de segundos a horas", "Converter de minutos a segundos",
							"Converter de minutos a horas", "Converter de horas a segundos",
							"Converter de horas a minutos" };

					Object opcaoSelecionadaConversor = JOptionPane.showInputDialog(null, "Escolha um item",
							"Medidas de Temperatura", JOptionPane.PLAIN_MESSAGE, null, opcoesParaConversaoTempo,
							opcoesParaConversaoTempo[0]);

					// Conversão
					ConversorDeTempo conversao = new ConversorDeTempo();
					double valorConvertido = 0;
					if (opcaoSelecionadaConversor == opcoesParaConversaoTempo[0]) {
						valorConvertido = conversao.segundosParaMinutos(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoTempo[1]) {
						valorConvertido = conversao.segundosParaHoras(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoTempo[2]) {
						valorConvertido = conversao.minutosParaSegundos(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoTempo[3]) {
						valorConvertido = conversao.minutosParaHoras(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoTempo[4]) {
						valorConvertido = conversao.horasParaSegundos(valor);
					}
					if (opcaoSelecionadaConversor == opcoesParaConversaoTempo[5]) {
						valorConvertido = conversao.horasParaMinutos(valor);
					}

					// Mensagem do Valor
					JOptionPane.showMessageDialog(null, "O valor da conversão é de " + valorConvertido);

					// Mensagem de deseja continuar?
					desejaContinuar = JOptionPane.showConfirmDialog(null, "Deseja Continuar?", "Selecione uma opção",
							JOptionPane.YES_NO_CANCEL_OPTION);
					if (desejaContinuar == 1) {
						JOptionPane.showMessageDialog(null, "Programa finalizado");
					}
					if (desejaContinuar == 2) {
						JOptionPane.showMessageDialog(null, "Programa concluído");
					}
				}
			}
		}
	}
}
