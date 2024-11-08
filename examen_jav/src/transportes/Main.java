package transportes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner teclado = new Scanner(System.in);
		int num;
		System.out.println("##########Seleccione una opción#########");
		System.out.println("Opcion 1: CONSULTAR COCHES");
		System.out.println("Opcion 2: CONSULTAR BARCOS");
		System.out.println("Opcion 3: CONSULTAR AVIONES");
		num = teclado.nextInt();
		
		if(num==1) {
			System.out.println("Consultando coches");
			//CREACIÓN DE COCHES
			Coche coche1 = new Coche("AUDI", "CIAN","23456Y", 888, 2001, false, false);
			coche1.infoCoche();
			Coche coche2 = new Coche("MERCEDES", "ROJO","89345H", 2890, 2016, true, false);
			coche2.infoCoche();
			Coche coche3 = new Coche("CITROEN", "CIAN","25631FY", 2888, 2001, true, true);
			coche3.infoCoche();
			Coche coche4 = new Coche("TESLA", "LAVANDA","98234G", 93456, 2024, false, true);
			coche4.infoCoche();
			
		}
		if(num==2) {
			System.out.println("CONSULTANDO BARCOS");
			
			//CREACION BARCOS
			
			Barco barco1 = new Barco("AAA", "ROSA", "12345D", 7865, 1999, 123, 123, "vela");
			barco1.infoBarcos();
			
			Barco barco2 = new Barco("bbb", "blanco", "288345g", 37586, 2013, 345, 678, "pesca");
			barco2.infoBarcos();
			
			Barco barco3 = new Barco("ccc", "verde", "6789j", 7865, 1999, 123, 123, "vela");
			barco3.infoBarcos();
			
		}
		
		if(num==3 ) {
			//CREACON DE AVIONES
			System.out.println("Consultando AVIONES");
			
			Avión avion1 = new Avión("GGG", "blanco", "45673d", 456, 2003, 89, 34.6, true);
			avion1.infoavion();
			
			Avión avion2 = new Avión("bfjbjgv", "negro", "52311d", 858745, 2023, 76788, 679.6, true);
			avion2.infoavion();
			
			Avión avion3 = new Avión("GFBBPL", "gris", "45234h", 78764, 2014, 6754, 34.6, false);
			avion3.infoavion();
			
			
			
			
		}
		
		
		
		
		

	}

}
