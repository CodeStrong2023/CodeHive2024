package system2023mundopc;

public class Orden {

	private int IdOrden;
	private Computadora computadora[];//Arreglo vacio de objetos;
	private static int contadorOrdenes;
	private static final int MAX_COMPUTADORAS=10;
	private int contadorComputadora;
	
	//Comstructor vacio
	
	public Orden() {
		
		this.IdOrden=++Orden.contadorOrdenes;
		this.computadora=new Computadora[Orden.MAX_COMPUTADORAS];
	}
	
	//Metodo para agregar una nueva computadora al arreglo
	public void agregarComputadora(Computadora computadora) {
		if(this.contadorComputadora<Orden.MAX_COMPUTADORAS) {
			this.computadora[this.contadorComputadora++]=computadora;
		}
	}
}
