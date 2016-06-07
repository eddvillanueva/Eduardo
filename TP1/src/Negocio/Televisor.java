package Negocio;

class Televisor extends Electrodomestico {

public Integer pulgadas;
public  Boolean poseeHDMI;

public Televisor() {

}

public Integer getPulgadas() {
	return pulgadas;
}

public void setPulgadas(Integer pulgadas) {
	this.pulgadas = pulgadas;
}

public Boolean getPoseeHDMI() {

return poseeHDMI;
}

public void setPoseeHDMI(Boolean poseeHDMI) {
	this.poseeHDMI = poseeHDMI;

}

public String toString (){
	String sino;
	if (poseeHDMI == false){
		sino="Posee HDMI";
	}
		else
		{ sino="No posee HDMI";
		
	}
    String mensaje="El Televisor Modelo "+modelo+" de " + pulgadas + " pulgadas " + sino + " y su precio es " + precio + " tiene un stock de " + stock +" unidades ";
    return mensaje;	
}
}