package Model.Personal;

import Controller.Empresa.Empresa;
import Controller.Empresa.Pedido;
import Model.Turno;
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
        public Usuario getUsuario(){
            return new Usuario(this.name,this.password,this.type, new Persona(this.getNombre(),this.getApellido(),this.getCI(),
            		this.getDireccion(),this.getEdad(),this.getDinero()));
        }
	public void AsignarPedido(int pos,Pedido pedido) throws Exception {
            if(Empresa.trabajadores.taxistas.get(pos).isTrabajando()==true){
                if(Empresa.trabajadores.taxistas.get(pos).getPedido()==null||Empresa.trabajadores.taxistas.get(pos).getPedido().client == new Cliente()){
                    pedido.SetTrabajadores(this,Empresa.trabajadores.taxistas.get(pos));
                    Empresa.trabajadores.taxistas.get(pos).setPedido(pedido);
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
