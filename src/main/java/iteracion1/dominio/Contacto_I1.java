package iteracion1.dominio;

public class Contacto_I1 implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nombre;
	private String apellido;
	private String telefono;
	private String movil;
	private String email;
	private String direccion;
	
	public Contacto_I1(){
		
	}
	
	public Contacto_I1(String nombre,
			String apellido,
			String telefono,
			String movil,
			String email,
			String direccion){
		
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setTelefono(telefono);
		this.setMovil(movil);
		this.setEmail(email);
		this.setDireccion(direccion);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMovil() {
		return movil;
	}
	public void setMovil(String movil) {
		this.movil = movil;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String toString(){
		return
				getId() + ", " +
				getNombre() + " , " +
				getApellido() + ", " +
				getTelefono() + ", " +
				getMovil() + ", " +
				getEmail() + ", " + 
				getDireccion() + "\n";
	}

}
