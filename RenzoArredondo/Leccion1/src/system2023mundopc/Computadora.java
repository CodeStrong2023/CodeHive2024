package system2023mundopc;

public class Computadora {

	private final int IdComputadora;
	private String nombre;
	private Monitor monitor;
	private Teclado teclado;
	private Raton raton;
	private static int contadorComputadoras;
	
	//Constructor vacio
	
	private Computadora() {
		this.IdComputadora=++Computadora.contadorComputadoras;
	}
	
	//Constructor 2
	
	public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
		this();
		this.nombre=nombre;
		this.monitor=monitor;
		this.teclado=teclado;
		this.raton=raton;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Raton getRaton() {
		return raton;
	}

	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	public int getIdComputadora() {
		return IdComputadora;
	}

	@Override
	public String toString() {
		return "Computadora [IdComputadora=" + IdComputadora + ", nombre=" + nombre + ", monitor=" + monitor
				+ ", teclado=" + teclado + ", raton=" + raton + "]";
	}
	
	
}
