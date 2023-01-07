package Model.Personal;

import Controller.Empresa.Empresa;
import Controller.Interfaces.OperacionesCliente;

public class Cliente extends Usuario implements OperacionesCliente {
	
	public Cliente() {
		super();
	}
	public Cliente(Usuario user) {
            super(user.name,user.password,user.type, new Persona(user.getNombre(),user.getApellido(),user.getCI(),
            		user.getDireccion(),user.getEdad()));
            
	}
        public Usuario getUsuario(){
            return new Usuario(this.name,this.password,this.type, new Persona(this.getNombre(),this.getApellido(),this.getCI(),
            		this.getDireccion(),this.getEdad()));
        }
        @Override
	public void PedirServicio()throws Exception {
            boolean tiene = false;
            
            for(int i =0;i<Empresa.pedidos.size();i++){
                if(Empresa.pedidos.get(i).client.getCI().equals(this.getCI())){
                    tiene =true;
                }
            }
            
            if(!tiene){
            if(Empresa.coste > this.billetera.getDinero()){
                throw new Exception("Insuficiente dinero para realizar un pedido.");
            }
            else
            {
                this.RetirarBilletera(Empresa.coste);
                Empresa.addNewPedido(this);
            }
            }else{
                throw new Exception("Su pedido esta siendo procesado, por favor espere.");
            }
	}

}
