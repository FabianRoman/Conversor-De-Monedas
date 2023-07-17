package conversor;

import javax.swing.*;
import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) {
		String divisa = "";
		String simboloDivisa = "";
		double resultado = 0.0;
		String[] opciones = { "Convertir divisa", "null" };
		String[] opcionConversiones = OpcionesDivisas.getListDivisas();
		// System.out.println(OpcionesDivisas.UNO.getDivisa());
		// OpcionesDivisas valorEnum = OpcionesDivisas.UNO;
		// String resul = valorEnum.getDivisa();
		// System.out.println(resul);

		// String opcionObtenida2;

		String opcionObtenida = (String) JOptionPane.showInputDialog(null, "Escoge una opción", "Menu de Selección",
				JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

		System.out.println("Escogiste " + opcionObtenida);

		// Validacion de repeticion y error de prompt
		int valor = 0;
		while (valor == 0) {
			boolean intentoExitoso = false;
			if (opcionObtenida == opciones[0]) {
				while (!intentoExitoso) {
					try {
						resultado = Double.parseDouble(
								JOptionPane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir",
										"Ingreso de valor a convertir", JOptionPane.PLAIN_MESSAGE));

						System.out.println(resultado);
						intentoExitoso = true;
					} catch (NumberFormatException e) {
						JOptionPane.showMessageDialog(null, "Valor no válido. \n\nSolo se permite valores numericos.");
					}
				}
				String opcionObtenida2 = (String) JOptionPane.showInputDialog(null,
						"Escoge a la divisa que deseas convertir tu valor", "Opciones de divisas",
						JOptionPane.QUESTION_MESSAGE, null, opcionConversiones, null);
				// System.out.println(opcionObtenida2);

				// Seleccion de la divisa desde el ENUM y Proceso matematico.
				if (opcionObtenida2.equals(OpcionesDivisas.UNO.getDivisa())) {
					double divisaCOP = 4196.22;
					resultado = Math.round(resultado / divisaCOP * 100) / 100.0;
					System.out.println(resultado);
					divisa = "Dolares";
					simboloDivisa = "$";
				} else if (opcionObtenida2.equals(OpcionesDivisas.DOS.getDivisa())) {
					double divisaCOP = 4603.25;
					resultado = Math.round(resultado / divisaCOP * 100) / 100.0;
					System.out.println(resultado);
					divisa = "Euros";
					simboloDivisa = "€";
				} else if (opcionObtenida2.equals(OpcionesDivisas.TRES.getDivisa())) {
					double divisaCOP = 5387.31;
					resultado = Math.round(resultado / divisaCOP * 100) / 100.0;
					System.out.println(resultado);
					divisa = "Libras Esterlinas";
					simboloDivisa = "£";
				} else if (opcionObtenida2.equals(OpcionesDivisas.CUATRO.getDivisa())) {
					double divisaCOP = 29.53;
					resultado = Math.round(resultado / divisaCOP * 100) / 100.0;
					System.out.println(resultado);
					divisa = "Yenes Japonés";
					simboloDivisa = "¥";
				} else if (opcionObtenida2.equals(OpcionesDivisas.CINCO.getDivisa())) {
					double divisaCOP = 3.23;
					resultado = Math.round(resultado / divisaCOP * 100) / 100.0;
					System.out.println(resultado);
					divisa = "Wones sul-coreano";
					simboloDivisa = "₩";
					// CONVERSIONES INVERTIDAS POR TERMINAR
				} else if (opcionObtenida2.equals(OpcionesDivisas.SEIS.getDivisa())) {
					double divisaCOP = 40590.00;
					resultado = Math.round(resultado * divisaCOP * 100) / 100.0;
				} else if (opcionObtenida2.equals(OpcionesDivisas.SIETE.getDivisa())) {
					double divisaCOP = 4603.25;
					resultado = Math.round(resultado * divisaCOP * 100) / 100.0;
				} else if (opcionObtenida2.equals(OpcionesDivisas.OCHO.getDivisa())) {
					double divisaCOP = 5387.31;
					resultado = Math.round(resultado * divisaCOP * 100) / 100.0;
				} else if (opcionObtenida2.equals(OpcionesDivisas.NUEVE.getDivisa())) {
					double divisaCOP = 29.53;
					resultado = Math.round(resultado * divisaCOP * 100) / 100.0;
				} else if (opcionObtenida2.equals(OpcionesDivisas.DIEZ.getDivisa())) {
					double divisaCOP = 3.23;
					resultado = Math.round(resultado * divisaCOP * 100) / 100.0;
				}
				JOptionPane.showMessageDialog(null, "Tienes " + simboloDivisa + resultado + " " + divisa);

				valor = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "YES_NO_CANCEL_OPTION",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			}

		}
		JOptionPane.showMessageDialog(null, "El programa ha terminado");
	}

}

