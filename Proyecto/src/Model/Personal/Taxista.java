package Model.Personal;

import Controller.Empresa.Pedido;
import Model.Turno;
import java.util.Vector;

public class Taxista extends Usuario{
        
        protected Pedido pedido;
        protected boolean pedidoAceptado;
        protected boolean trabajando;
        protected boolean enRescate;
        
        protected Vector<Turno> turnos = new Vector<Turno>();

	public Taxista() {
            super();
	}
	
	public Taxista(Usuario user) {
            super(user.name,user.password,user.type, new Persona(user.getNombre(),user.getApellido(),user.getCI(),
            		user.getDireccion(),user.getEdad(),user.getDinero()));
            
	}
        public Usuario getUsuario(){
            return new Usuario(this.name,this.password,this.type, new Persona(this.getNombre(),this.getApellido(),this.getCI(),
            		this.getDireccion(),this.getEdad(),this.getDinero()));
        }
        
        public Pedido getPedido(){
            return pedido;
        }
        public void setPedido(Pedido pedido){
            this.pedido=pedido;
            //System.out.println("Asignado! " +getPedido().getNombre());
        }

        public boolean isTrabajando() {
            return trabajando;
        }

        public void setTrabajando(boolean trabajando) {
            this.trabajando = trabajando;
        }

        public boolean isPedidoAceptado() {
            return pedidoAceptado;
        }

        public void setPedidoAceptado(boolean pedidoAceptado) {
            this.pedidoAceptado = pedidoAceptado;
        }
        
        public boolean isEnRescate() {
            return enRescate;
        }

        public void setEnRescate(boolean enRescate) {
            this.enRescate = enRescate;
        }

    public Vector<Turno> getTurnos() {
        return turnos;
    }

    public void setTurnos(Vector<Turno> turnos) {
        this.turnos = turnos;
    }


}
