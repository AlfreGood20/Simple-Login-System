package AppVentanaLogin;

import AppVentanaRegistro.baseDeDato;

public class LogicaLogin {
	private String correo;
	private String contraseña;
	
	public LogicaLogin(String correo,String contraseña) {
		this.correo=correo;
		this.contraseña=contraseña;
	}
	
	public boolean credenciales() {
		return baseDeDato.darAcesso(correo, contraseña);
	}
}

