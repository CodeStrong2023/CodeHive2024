package domain;

public class Gerente extends Empleado {
	
	private String departamento;

	public Gerente(String nombre, double sueldo,String departamento) {
		
		super(nombre, sueldo);
		// TODO Auto-generated constructor stub
		this.departamento=departamento;
	}
	
	@Override
	public String ObtenerDetalles() {
		return super.ObtenerDetalles()+" , Departamento: "+this.departamento;
	}

}
