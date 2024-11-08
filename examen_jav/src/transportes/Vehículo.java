package transportes;

public class Vehículo {
	
	//Atributos
	protected String marca;
	protected String color;
	protected String numBastidor;
	protected int kilómetros;
	protected int añofabricación;
	
	//Constructors
	public Vehículo(String marca, String color, String numBastidor, int kilómetros, int añofabricación) {
		super();
		this.marca = marca;
		this.color = color;
		this.numBastidor = numBastidor;
		this.kilómetros = kilómetros;
		this.añofabricación = añofabricación;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getNumBastidor() {
		return numBastidor;
	}

	public void setNumBastidor(String numBastidor) {
		this.numBastidor = numBastidor;
	}

	public int getKilómetros() {
		return kilómetros;
	}

	public void setKilómetros(int kilómetros) {
		this.kilómetros = kilómetros;
	}

	public int getAñofabricación() {
		return añofabricación;
	}

	public void setAñofabricación(int añofabricación) {
		this.añofabricación = añofabricación;
	}
	

	
	
	
	

}
