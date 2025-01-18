package AppVentanaLogin;

public class LogicaLogin {
	private String correo;
	private String contraseña;
	private final String correoFic="josealfredolopez2@gmail.com";
	private final String contraseñaFic="Alfy20";
	
	public LogicaLogin(String correo,String contraseña) {
		this.correo=correo;
		this.contraseña=contraseña;
	}
	
	public boolean comproContraseña() {
		return contraseña.equals(contraseñaFic);
	}
	
	public boolean comproCorreo() {
		return correo.equals(correoFic);
	}
}

