package transportes;

public class Avión extends Vehículo{

	public Avión(String marca, String color, String numBastidor, int kilómetros, int añofabricación) {
		super(marca, color, numBastidor, kilómetros, añofabricación);
		// TODO Auto-generated constructor stub
	}
	
	//Attributes
	protected int motores;
	protected double velocidad;
	protected boolean combate;
	
	//Constructors
	
	public Avión(String marca, String color, String numBastidor, int kilómetros, int añofabricación, int motores,
			double velocidad, boolean combate) {
		super(marca, color, numBastidor, kilómetros, añofabricación);
		this.motores = motores;
		this.velocidad = velocidad;
		this.combate = combate;
	}
	
	
	
	//Other methods
	
	public int getMotores() {
		return motores;
	}



	public void setMotores(int motores) {
		this.motores = motores;
	}



	public double getVelocidad() {
		return velocidad;
	}



	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}



	public boolean isCombate() {
		return combate;
	}



	public void setCombate(boolean combate) {
		this.combate = combate;
	}



	public void infoavion() {
		System.out.println("####################Información del avión################");
		
		System.out.println("Marca:" + getMarca() + "| Color: " + getColor() + "|Numero de Bastidor: " + getNumBastidor()
		+ "|Kilómetros: " + getKilómetros()+ "|Año Fabricación: " + getAñofabricación() + "motores: " + getMotores() +
		"Velocidad: " + getVelocidad() + "|Combate: " + isCombate());
		
		System.out.println("El vehiculo con mayor velocidad tiene el Num de Bastidor: " + numBastidor);
	}

	
	
	
	
	
	
	

	
	
	

}
