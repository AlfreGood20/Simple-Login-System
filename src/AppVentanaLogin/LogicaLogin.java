package AppVentanaLogin;

public class LogicaLogin {
	private String correo;
	private String contraseña;
	private final String coreoFic="FazePepinito20@gmail.com";
	private final String contraseñaFic="fazepepito9088";
	
	public LogicaLogin(String correo,String contraseña) {
		this.correo=correo;
		this.contraseña=contraseña;
	}
	
	public boolean contraseña() {
		return correo==coreoFic;
	}
	
	public boolean correo() {
		return contraseña==contraseñaFic;
	}
}
