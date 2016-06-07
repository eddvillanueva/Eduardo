package Negocio;

public class Fabricante {

	public String nombre; 
	public String telefono; 
	public String direccion;
	public Fabricante() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String toString (){
        String mensaje="El fabricante se llama "+nombre+" TE: " + telefono + " y su dirección es " + direccion ;
        return mensaje;
	}
}
