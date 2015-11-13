package iteracion1.persistencia;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

import iteracion1.dominio.Contacto_I1;
import iteracion1.persistencia.AgentHibernate_I1;

public class ContactoDAO_I1 {
	
	private Contacto_I1 contacto_I1;
	private Session session;
	
	private SessionFactory sessionFactory;
	
	public ContactoDAO_I1(){
		setSession(AgentHibernate_I1.getSessionFactory().openSession());
		setContacto(null);
	}
	
	public ContactoDAO_I1(Contacto_I1 contacto_I1){
		setSession(AgentHibernate_I1.getSessionFactory().openSession());
		setContacto(contacto_I1);
	}
	
	public void save(){
		getSession().beginTransaction();
		getSession().save(getContacto());
		getSession().getTransaction().commit();
	}
	
	public void update(){
		getSession().beginTransaction();
		getSession().saveOrUpdate(getContacto());
		getSession().getTransaction().commit();
	}
	
	public void delete(){
		getSession().beginTransaction();
		getSession().delete(getContacto());
		getSession().getTransaction().commit();
	}
	
	public Contacto_I1 retrieve(int id){
		return getSession().get(Contacto_I1.class, id);
	}
	
	@SuppressWarnings("unchecked")
	public List<Contacto_I1> find(String name){
		Criteria criteria = getSession().createCriteria(Contacto_I1.class);
		List<Contacto_I1> list = criteria.add(Restrictions.ilike("nombre", name, MatchMode.ANYWHERE)).list();
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public List<Contacto_I1> retriveAll(){
		return this.getSession().createCriteria(Contacto_I1.class).list();
	}
	
	public void close(){
		this.getSession().close();
	}

	public Contacto_I1 getContacto() {
		return contacto_I1;
	}

	public void setContacto(Contacto_I1 contacto_I1) {
		this.contacto_I1 = contacto_I1;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
}
