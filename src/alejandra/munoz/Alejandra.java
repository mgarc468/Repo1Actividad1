package alejandra.munoz;

public class Alejandra {
	
	private String nombre;



	public Alejandra() {
		super();
	}

	public Alejandra(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	
	@Override
	public String toString() {
		return "Alejandra [nombre=" + nombre + "]";
	}

	public static void imprimirNombre() {
        String nombre = "Alejandra Munoz Merino"; 
        System.out.println("Hola! Mi nombre es: " + nombre);
	
	}
}