package AppVentanaRegistro;

public class usuario {
	private String nombre;
	private String apellido;
	private int edad;
	private String correo;
	private String contraseña;
	private long numeroTelefonico;
	private String genero;
	
	public usuario(String nombre, String apellido, int edad, String correo, String contraseña,long numeroTelefonico, String genero, String area) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.correo = correo;
		this.contraseña = contraseña;
		this.numeroTelefonico = numeroTelefonico;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		return edad;
	}

	public String getCorreo() {
		return correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public long getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public String getGenero() {
		return genero;
	}

	
}
