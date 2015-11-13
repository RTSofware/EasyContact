package iteracion1.dominio;

import java.util.List;

import iteracion1.dominio.Contacto_I1;
import iteracion1.persistencia.ContactoDAO_I1;

public class GestorContactos_I1 {
		
	public GestorContactos_I1(){
		
	}
	
	public void addContacto(Contacto_I1 contacto){
		
		ContactoDAO_I1 contactoDAO = new ContactoDAO_I1(contacto);
		
		contactoDAO.save();
		contactoDAO.close();
	}
	
	public Contacto_I1 getContacto(int id){
		
		ContactoDAO_I1 contactoDAO = new ContactoDAO_I1();
		return contactoDAO.retrieve(id);
	}
	
	public void updateContacto(Contacto_I1 contacto){
		
		ContactoDAO_I1 contactoDAO = new ContactoDAO_I1(contacto);
		contactoDAO.update();
		contactoDAO.close();
	}
	
	public void deleteContacto(Contacto_I1 contacto){
		
		ContactoDAO_I1 contactoDAO = new ContactoDAO_I1(contacto);
		contactoDAO.delete();
		contactoDAO.close();
	}
	
	public List<Contacto_I1> findContacto(String name){
		ContactoDAO_I1 contactoDAO = new ContactoDAO_I1();
		return contactoDAO.find(name);
	}
	
	public List<Contacto_I1> getAllContacto(){
		ContactoDAO_I1 contactoDAO_I1 = new ContactoDAO_I1();
		return contactoDAO_I1.retriveAll();
		
	}
	

}
