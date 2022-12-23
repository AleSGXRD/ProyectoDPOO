package Model;

import Controller.GestionBilletera;
import java.io.Serializable;

public class Persona implements Serializable,GestionBilletera{
	private String nombre;
	private String apellido;
	private String CI;
	private String direccion;
	private int edad;
        private int dinero;
        
	public Persona(){
		this.nombre ="";
		this.apellido = "";
		this.CI = "";
		this.direccion = "";
		this.edad = 0;
	}
	public Persona(String nombre,String apellido,String CI,String direccion,int edad,int dinero){
		this.nombre =nombre;
		this.apellido =apellido;
		this.CI = CI;
		this.direccion = direccion;
		this.edad = edad;
                this.dinero = dinero;
	}
    @Override
    public String toString() {
        return "{" + "nombre: " + nombre +" apellido: "+ apellido+" CI: "+CI+" direccion: "+
        		direccion+" edad: "+edad+" dinero: "+dinero +" }";
    }
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCI() {
		return CI;
	}
	public void setCI(String cI) {
		CI = cI;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
        
        public void setDinero(int dinero) {
            this.dinero = dinero;
        }
        public int getDinero() {
            return dinero;
        }
        @Override
        public void RecargarBilletera(int mony) throws Exception{
            if(getDinero()+mony<=100000){
            setDinero(getDinero()+mony);
            }
            else{
                throw new Exception("Usted tiene mas dinero de lo permitido");
            }
        }

        @Override
        public void RetirarBilletera(int mony) throws Exception{
            if(getDinero()-mony>=0){
                setDinero(getDinero()-mony);
            }
            else{
                throw new Exception("No tiene suficiente dinero para ello");
            }
        }
    

}
