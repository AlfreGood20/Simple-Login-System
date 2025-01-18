package AppVentanaRegistro;

public class usuario {
	private String nombre;
	private String apellido;
	private int edad;
	private String correo;
	private String contraseña;
	private String genero;
	
	public usuario(String nombreSelec, String apellidoSelec, int edadSelec, String correoSelec, String contraseñaSelec,String generoSelec) {
		this.nombre = nombreSelec;
		this.apellido = apellidoSelec;
		this.edad = edadSelec;
		this.correo = correoSelec;
		this.contraseña = contraseñaSelec;
		this.genero = generoSelec;
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

	public String getGenero() {
		return genero;
	}

	@Override
	public String toString() {
		return "usuario [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", correo=" + correo
				+ ", contraseña=" + contraseña + ", genero=" + genero + "]";
	}

	
}
