package agenziaviaggi;

public class Prenotazione {

	private String codice;
	private int postiRichiesti;
	private Filiale filiale;
	private Cliente cliente;
	private Pacchetto pacchetto;
	
	
	public Prenotazione(String codice, int postiRichiesti, Filiale filiale,
			Cliente cliente, Pacchetto pacchetto) {
		super();
		this.codice = codice;
		this.postiRichiesti = postiRichiesti;
		this.filiale = filiale;
		this.cliente = cliente;
		this.pacchetto = pacchetto;
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
