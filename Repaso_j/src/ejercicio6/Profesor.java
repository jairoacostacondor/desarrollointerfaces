package ejercicio6;

public class Profesor {
	//Atributos
		private String dni;
		private String nombre;
		private String  apellidos;
		private int salario;
		private int num_Asignaturas;
		private String tutor;
		
		//CONSTRUCTORS
		public Profesor(String dni, String nombre, String apellidos, int salario, int num_Asignaturas, String tutor) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.salario = salario;
			this.num_Asignaturas = num_Asignaturas;
			this.tutor = tutor;
		}
			
		//GETTERS & SETTERS
		

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
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

		public int getNum_Asignaturas() {
			return num_Asignaturas;
		}

		public void setNum_Asignaturas(int num_Asignaturas) {
			this.num_Asignaturas = num_Asignaturas;
		}

		public String getTutor() {
			return tutor;
		}

		public void setTutor(String tutor) {
			this.tutor = tutor;
		}

}
