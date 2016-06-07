package Negocio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) throws IOException
	{
		Fabricante Fabri1 = new Fabricante();	
		System.out.println("Ingrese el Nombre del Fabricante 1");
		String entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		Fabri1.setNombre(entrada);
		
		System.out.println("Ingrese el Telefono del Fabricante " + Fabri1.getNombre());
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		Fabri1.setTelefono(entrada);
		
		System.out.println("Ingrese la dirección del Fabricante " + Fabri1.getNombre());
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		Fabri1.setDireccion(entrada);
		
				
		
		Televisor Tele1 = new Televisor();	
		System.out.println("Ingrese el Modelo del Televisor de " + Fabri1.getNombre());
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		Tele1.setModelo(entrada);
		
		System.out.println("Ingrese el Precio del Televisor de " + Fabri1.getNombre());
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		Tele1.setPrecio(Double.valueOf(entrada));
		
		System.out.println("Ingrese el Stock del Televisor de " + Fabri1.getNombre());
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		Tele1.setStock(Integer.valueOf(entrada));
		
		System.out.println("Ingrese las Pulgadas del Televisor de " + Fabri1.getNombre());
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		Tele1.setPulgadas(Integer.valueOf(entrada));
		
		System.out.println("El Televisor de " + Fabri1.getNombre() + " Modelo " + Tele1.getModelo() + " de "+ Tele1.getPulgadas()+ " pulgadas Posee HDMI ? (SI/NO)" );
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		Tele1.setPoseeHDMI(Boolean.valueOf(entrada));
		
		
		AireAcondicionado Aire1 = new AireAcondicionado();	
		System.out.println("Ingrese el Modelo del Aire de " + Fabri1.getNombre());
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		Aire1.setModelo(entrada);
	
		System.out.println("Ingrese el Precio del Aire de " + Fabri1.getNombre());
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		Aire1.setPrecio(Double.valueOf(entrada));
		
		System.out.println("Ingrese el Stock del Aire de " + Fabri1.getNombre());
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		Aire1.setStock(Integer.valueOf(entrada));
		
		System.out.println("Ingrese las frigorías del Aire de " + Fabri1.getNombre());
		entrada = (new BufferedReader(new InputStreamReader(System.in))).readLine();
		Aire1.setFrigorias(Integer.valueOf(entrada));
		
		/*		
		System.out.println("El Fabricante " + Fabri1.getNombre());		
		System.out.println("Modelo : " + Tele1.getModelo());
		System.out.println("Precio : " + Tele1.getPrecio());
		System.out.println("Stock : " + Tele1.getStock());
		System.out.println("Pulgadas : " + Tele1.getPulgadas());
		*/
		
		if (Tele1.getPoseeHDMI() == false)
			System.out.println(" El Televisor Posee HDMI");
		else
			System.out.println(" El Televisor NO Posee HDMI");
	
		System.out.println(Fabri1.toString());
		System.out.println(Aire1.toString());
		System.out.println(Tele1.toString());
	}
}



