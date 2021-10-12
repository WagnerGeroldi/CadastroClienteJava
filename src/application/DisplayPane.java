package application;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class DisplayPane {

	private DisplayPane() {
	}

	public static String showInput(String text) {
		String textInput = showInputDialog(null, text);
		return textInput;
	}

	public static int showIntInput(String text) {
		int intCovert = 0;
		try {
			String textInput = showInputDialog(null, text);
			intCovert = Integer.parseInt(textInput);

		} catch (Exception e) {
			showMessageDialog(null, "Digite Apenas números Inteiros");
			return showIntInput(text);

		}
		return intCovert;

	}

	public static void showMessage(String text) {
		showMessageDialog(null, text);
	}

}
