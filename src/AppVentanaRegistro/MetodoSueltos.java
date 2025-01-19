package AppVentanaRegistro;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class MetodoSueltos {
	
	public static void agregarEstiloCampo(JTextField campo) {
		campo.setDisabledTextColor(Color.BLACK);
		campo.setFont(new Font("Arial", Font.BOLD,15));
	}
	
	public static JLabel crearEtiqueta(String texto, int x, int y, int width, int height) {
        JLabel etiqueta = new JLabel(texto);
        etiqueta.setBounds(x, y, width, height);
        return etiqueta;
    }
}
