package AppVentanaLogin;
import java.awt.Color;
import javax.swing.JTextField;

public class MetodosSueltos {
	
	//METODO SUELTO PARA PODER ELIMINAR EL TEXTO DE CORREO O CONTRASEÑA
	public static void addPlaceholder(JTextField textField, String placeholder) {
	    textField.setText(placeholder);
	    textField.setForeground(Color.GRAY); // Color inicial para el texto del placeholder

	    textField.addFocusListener(new java.awt.event.FocusAdapter() {
	        @Override
	        public void focusGained(java.awt.event.FocusEvent e) {
	            if (textField.getText().equals(placeholder)) {
	                textField.setText(""); // Elimina el placeholder al ganar foco
	                textField.setForeground(Color.BLACK); // Cambia el color del texto
	            }
	        }

	        @Override
	        public void focusLost(java.awt.event.FocusEvent e) {
	            if (textField.getText().isEmpty()) {
	                textField.setText(placeholder); // Restaura el placeholder si está vacío
	                textField.setForeground(Color.GRAY); // Cambia el color al placeholder
	            }
	        }
	    });
	}
	
}
