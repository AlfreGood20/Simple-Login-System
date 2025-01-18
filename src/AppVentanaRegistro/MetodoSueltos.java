package AppVentanaRegistro;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

public class MetodoSueltos {
	
	public static void agregarEstiloCampo(JTextField campo) {
		campo.setDisabledTextColor(Color.BLACK);
		campo.setFont(new Font("Arial", Font.BOLD,15));
	}
}
