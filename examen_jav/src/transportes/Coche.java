package transportes;

public class Coche extends Vehículo {

	public Coche(String marca, String color, String numBastidor, int kilómetros, int añofabricación) {
		super(marca, color, numBastidor, kilómetros, añofabricación);
		// TODO Auto-generated constructor stub
	}
	//Attributes
	protected boolean electrico;
	protected boolean antiguo;
	
	//Constructors
	
	public Coche(String marca, String color, String numBastidor, int kilómetros, int añofabricación, boolean electrico,
			boolean antiguo) {
		super(marca, color, numBastidor, kilómetros, añofabricación);
		this.electrico = electrico;
		this.antiguo = antiguo;
	}
	
	
	//Getters & Setters
	
	public boolean isElectrico() {
		return electrico;
	}


	public void setElectrico(boolean electrico) {
		this.electrico = electrico;
	}


	public boolean isAntiguo() {
		return antiguo;
	}


	public void setAntiguo(boolean antiguo) {
		this.antiguo = antiguo;
	}
//Other methods

	public void infoCoche(){
		System.out.println("####################Información del coche################");
		System.out.println("Marca:" + getMarca() + "| Color: " + getColor() + "|Numero de Bastidor: " + getNumBastidor()
		+ "|Kilómetros: " + getKilómetros()+ "|Año Fabricación: " + getAñofabricación() + "|¿Electrico? "+ isElectrico()+
		"|Antiguo " + isAntiguo());
		
		if (electrico== true) {
			System.out.println("El vehículo con numero de bastidor: " + numBastidor + "es electrico");
		}
	
		
		
	}


	
	
	
	
	

}
