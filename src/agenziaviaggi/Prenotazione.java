package agenziaviaggi;

public class Prenotazione {

	private String codice;
	private int postiRichiesti;
	private Filiale filiale;
	private Cliente cliente;
	private Pacchetto pacchetto;
	
	
	public Prenotazione(String codice, int postiRichiesti, Filiale filiale, Cliente cliente) {
		super();
		
		if((codice != null) && (codice.length() > 0)){
			this.codice = codice;
		}
		else 
			throw new IllegalArgumentException("il codice deve essere almeno maggiore di zero");
		
		if((postiRichiesti > 0)){
			this.postiRichiesti = postiRichiesti;
		}
		else 
			throw new IllegalArgumentException("il numero minore di posti prenotabili è 1");
		
		if(filiale != null){
			this.filiale = filiale;
		}
		else 
			throw new IllegalArgumentException();
		
		if (cliente != null){
			this.cliente = cliente;
		}
		else 
			throw new IllegalArgumentException();
	}

	public Pacchetto getPacchetto() {
		return pacchetto;
	}

	public void setPacchetto(Pacchetto pacchetto) {
		this.pacchetto = pacchetto;
	}

	public Filiale getFiliale() {
		return filiale;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public String getCodice() {
		return codice;
	}
	
	public int getPostiRichiesti() {
		return postiRichiesti;
	}

	@Override
	public String toString() {
		return "Prenotazione [codice=" + codice + ", postiRichiesti="
				+ postiRichiesti + ", filiale=" + filiale + ", cliente="
				+ cliente + ", pacchetto=" + pacchetto + "]";
	}
	
	
}
