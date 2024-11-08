package ejercicio6;

public class Administración {
	
	//Atributos
	private int dni;
	private String nombre_ad;
	private String apellidos_ad;
	private int salario_ad;
	private String estudios;
	private String antigüedad;
	
	//CONSTRUCTORS
	public Administración(int dni, String nombre_ad, String apellidos_ad, int salario_ad, String estudios,
			String antigüedad) {
		super();
		this.dni = dni;
		this.nombre_ad = nombre_ad;
		this.apellidos_ad = apellidos_ad;
		this.salario_ad = salario_ad;
		this.estudios = estudios;
		this.antigüedad = antigüedad;
	}
	//GETTERS & SETTERS

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre_ad() {
		return nombre_ad;
	}

	public void setNombre_ad(String nombre_ad) {
		this.nombre_ad = nombre_ad;
	}

	public String getApellidos_ad() {
		return apellidos_ad;
	}

	public void setApellidos_ad(String apellidos_ad) {
		this.apellidos_ad = apellidos_ad;
	}

	public int getSalario_ad() {
		return salario_ad;
	}

	public void setSalario_ad(int salario_ad) {
		this.salario_ad = salario_ad;
	}

	public String getEstudios() {
		return estudios;
	}

	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public String getAntigüedad() {
		return antigüedad;
	}

	public void setAntigüedad(String antigüedad) {
		this.antigüedad = antigüedad;
	}
	
	
	
	

}
