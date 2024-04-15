package system2023mundopc;

public class Teclado extends DispositivoEntrada {
	
	private final int IdTeclado;
	private static int contadorTeclados;
	
	public Teclado(String tipoEntrada,String marca) {
		
		super(tipoEntrada,marca);
		this.IdTeclado=++Teclado.contadorTeclados;
	}

	@Override
	public String toString() {
		return "Raton [Teclado=" + IdTeclado +", "+super.toString()+ "]";
	}
}
