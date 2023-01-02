package Model;

import Controller.Empresa;
import java.util.Vector;

public class Operador extends Usuario {
	
        protected Vector<Turno> turnos = new Vector<Turno>();
    
	public Operador() {
            super();
	}
	
	public Operador(Usuario user) {
            super(user.name,user.password,user.type, new Persona(user.getNombre(),user.getApellido(),user.getCI(),
            		user.getDireccion(),user.getEdad(),user.getDinero()));
            
	}
	public void AsignarPedido(int pos,Usuario cliente) throws Exception {
            if(Empresa.trabajadores.taxistas.get(pos).isTrabajando()==true){
                if(Empresa.trabajadores.taxistas.get(pos).getPedido()==null||!Empresa.trabajadores.taxistas.get(pos).getCI().equals("")){
                	Empresa.trabajadores.taxistas.get(pos).setPedido(cliente);
                }
                else{
                    throw new Exception("Ya esta ocupado ese taxista");
                }
            }
            else
            {
                throw new Exception("No esta trabajando");
            }
	}

    public Vector<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(Vector<Turno> turnos) {
        this.turnos = turnos;
    }

}
