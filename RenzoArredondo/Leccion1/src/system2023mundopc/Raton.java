package system2023mundopc;

public class Raton extends DispositivoEntrada {

	private final int IdRaton;
	private static int contadorRatones;
	
	public Raton(String tipoEntrada,String marca) {
		
		super(tipoEntrada,marca);
		this.IdRaton=++Raton.contadorRatones;
	}

	@Override
	public String toString() {
		return "Raton [IdRaton=" + IdRaton +", "+super.toString()+ "]";
	}
	
	
}
