package agenziaviaggi;

public class Filiale {

	private int numero;

	public Filiale(int numero) {
		super();
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return "Filiale [numero=" + numero + "]";
	}
}
