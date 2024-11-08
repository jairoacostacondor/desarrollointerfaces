package transportes;

public class Barco extends Vehículo {

	public Barco(String marca, String color, String numBastidor, int kilómetros, int añofabricación) {
		super(marca, color, numBastidor, kilómetros, añofabricación);
		// TODO Auto-generated constructor stub
	}
	
	//Attributes
	
	protected int eslora;
	protected int calado;
	protected String barcolista;
	
	//CONSTRUCTORS

	public Barco(String marca, String color, String numBastidor, int kilómetros, int añofabricación, int eslora,
			int calado, String barcolista) {
		super(marca, color, numBastidor, kilómetros, añofabricación);
		this.eslora = eslora;
		this.calado = calado;
		this.barcolista = barcolista;
	}
	
	








	public int getEslora() {
		return eslora;
	}










	public void setEslora(int eslora) {
		this.eslora = eslora;
	}










	public int getCalado() {
		return calado;
	}










	public void setCalado(int calado) {
		this.calado = calado;
	}










	public String getBarcolista() {
		return barcolista;
	}










	public void setBarcolista(String barcolista) {
		this.barcolista = barcolista;
	}










	public void infoBarcos(){
		System.out.println("####################Información del barco################");
		System.out.println("Marca:" + getMarca() + "| Color: " + getColor() + "|Numero de Bastidor: " + getNumBastidor()
		+ "|Kilómetros: " + getKilómetros()+ "|Año Fabricación: " + getAñofabricación() + "|Eslora: " + getEslora() + "calado: " + getCalado() +
		"Tipo: " + getBarcolista());
		
		
	}








	

	
	
	
	
	
	
	
	
	
	
	
	

}
