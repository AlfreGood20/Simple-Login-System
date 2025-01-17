package AppVentanaRegistro;

public class LogicaRegistro {
	private String nombre;
	private String apellido;
	private int edad;
	private String correo;
	private String contraseña;
	private long numeroTelefonico;
	private String genero;
	private String area;
	
	public LogicaRegistro(String nombre, String apellido, int edad, String correo, String contraseña,long numeroTelefonico, String genero, String area) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.correo = correo;
		this.contraseña = contraseña;
		this.numeroTelefonico = numeroTelefonico;
		this.genero = genero;
		this.area = area;
	}
	
	
}
