package miguelangel.garcia;

public class MiguelAngel {

	private String nombre;

	public MiguelAngel() {
		super();
	}

	public MiguelAngel(String nombre) {
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
		return "MiguelAngel [nombre=" + nombre + "]";
	}

	public static void imprimirNombre() {
        String nombre = "Miguel Ángel García"; 
        System.out.println("Hola! Mi nombre es: " + nombre);
	
	}
}
