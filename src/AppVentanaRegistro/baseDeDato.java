package AppVentanaRegistro;

import java.util.ArrayList;

public class baseDeDato {
	private static ArrayList<usuario> usuario;

    static {
        usuario = new ArrayList<>(); // Inicializa el ArrayList
    }
    
    public baseDeDato() {
    }

    public void agregarUsuario(usuario datos) {
        usuario.add(datos);
    }

    public static boolean darAcesso(String correo, String contraseña) {
    	boolean encontrado = false;
        for (int i = 0; i < usuario.size(); i++) {
            if(usuario.get(i).getCorreo().equals(correo) && usuario.get(i).getContraseña().equals(contraseña)) {
            	encontrado=true;
            	break;
            }
        }
        return encontrado;
    }
}