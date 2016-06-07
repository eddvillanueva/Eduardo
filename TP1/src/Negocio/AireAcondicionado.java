package Negocio;

class AireAcondicionado extends Electrodomestico {
	public Integer frigorias;
	
	public AireAcondicionado() {
	
	}

	public Integer getFrigorias() {
		return frigorias;
	}

	public void setFrigorias(Integer frigorias) {
		this.frigorias = frigorias;
	}

	public String toString (){
        String mensaje="El Aire Modelo "+modelo+" de frigorías " + frigorias + " que su precio es " + precio + " tiene un stock de " + stock +" unidades ";
        return mensaje;
	}
	}
