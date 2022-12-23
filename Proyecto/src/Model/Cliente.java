package Model;

import Controller.Empresa;

public class Cliente extends Usuario {
	
	public Cliente() {
		super();
	}
	public Cliente(Usuario user) {
            super(user.name,user.password,user.type, new Persona(user.getNombre(),user.getApellido(),user.getCI(),
            		user.getDireccion(),user.getEdad(),user.getDinero()));
            
	}
        public Usuario getUsuario(){
            return new Usuario(this.name,this.password,this.type, new Persona(this.getNombre(),this.getApellido(),this.getCI(),
            		this.getDireccion(),this.getEdad(),this.getDinero()));
        }
	public void PedirServicio()throws Exception {
            if(Empresa.coste > this.getDinero()){
                throw new Exception("Tas falta de dinero locol");
            }
            else{
                this.RetirarBilletera(Empresa.coste);
            }
	}

}
