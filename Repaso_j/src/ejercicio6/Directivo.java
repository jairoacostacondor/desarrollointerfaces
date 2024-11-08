package ejercicio6;

public class Directivo {
	//Atributos
	
	private int dni_d;
	private String nombre;
	private String apellidos;
	private int salario;
	private String salesiano;
	private String turno;
	
	//Constructors
	public Directivo(int dni_d, String nombre, String apellidos, int salario, String salesiano, String turno) {
		super();
		this.dni_d = dni_d;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.salario = salario;
		this.salesiano = salesiano;
		this.turno = turno;
	}
	
	//Getters and setters

	public int getDni_d() {
		return dni_d;
	}

	public void setDni_d(int dni_d) {
		this.dni_d = dni_d;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getSalesiano() {
		return salesiano;
	}

	public void setSalesiano(String salesiano) {
		this.salesiano = salesiano;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
	
	
	

	

}
