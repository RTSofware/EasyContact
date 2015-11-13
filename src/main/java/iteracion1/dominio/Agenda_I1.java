package iteracion1.dominio;

import java.util.List;

import iteracion1.dominio.GestorContactos_I1;

public class Agenda_I1 {

	private GestorContactos_I1 gestor;
	
	public Agenda_I1(){
		
		setGestor(new GestorContactos_I1());
	}
	
	public void addContacto(Contacto_I1 contacto){
		
		getGestor().addContacto(contacto);
	}
	
	public void updateContacto(Contacto_I1 contacto){
		
		getGestor().updateContacto(contacto);
	}
	
	public void deleteContacto(Contacto_I1 contacto){
		getGestor().deleteContacto(contacto);
	}
	
	public List<Contacto_I1> findContacto(String name){
		return getGestor().findContacto(name);
	}
	
	public Contacto_I1 getContacto(int id){
		return getGestor().getContacto(id);
	}
	
	public List<Contacto_I1> getAllContacto(){
		return getGestor().getAllContacto();
	}
	
	public GestorContactos_I1 getGestor() {
		return gestor;
	}

	public void setGestor(GestorContactos_I1 gestor) {
		this.gestor = gestor;
	}
}
