package mecanografia;

public class Texto {
// Atributos
	private String contenido; // El texto que debe escribir el usuario
	private int dificultad;   // Nivel de dificultad (por ejemplo: 1 = fácil, 2 = intermedio, 3 = difícil)
//Constructor
	public Texto(String contenido, int dificultad) {
		this.contenido = contenido;
		this.dificultad = dificultad;
	}

//Métodos Getters y Setters
	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
	 this.contenido = contenido;
	}
	
	public int getDificultad() {
	 return dificultad;
	}
	
	public void setDificultad(int dificultad) {
	 this.dificultad = dificultad;
	}
}
