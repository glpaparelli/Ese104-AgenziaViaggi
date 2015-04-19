package agenziaviaggi;

import java.util.*;

public class Pacchetto {
	
	
	private String codice;
	private String descrizione;
	private int postiTotali;
	private Vector <Prenotazione> prenotazione; 
	
	public Pacchetto(String codice, String descrizione, int postiTotali) {
		super();
		if (codice != null){
			this.codice = codice;
		}
		else 
			throw new IllegalArgumentException("codice non valido");
		
		if((descrizione != null) && descrizione.length() > 0){
			this.descrizione = descrizione;
		}
			
		if (postiTotali > 0){
			this.postiTotali = postiTotali;
		}
		prenotazione = new Vector <Prenotazione>() ;
	}
	
		
	public Vector <Prenotazione> getPrenotazione() {
		return prenotazione;
	}
	
	public void addPrenotazione(Prenotazione p){
		
		if(this.getPostiDisponibili() < p.getPostiRichiesti()){
			throw new IllegalArgumentException();
		}
		else{
			prenotazione.addElement(p);
		}
	}

	public String getCodice() {
		return codice;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	

	public int getPostiTotali() {
		return postiTotali;
	}
	
	public int getPostiDisponibili(){
		
		int r=0;
		int pdisp=0;
		Prenotazione g;
		for(int i=0;i<prenotazione.size();i++){
			g = prenotazione.elementAt(i);
			r += g.getPostiRichiesti();
		}
		pdisp = this.postiTotali - r;
		return pdisp;
	}
	
	@Override
	public String toString() {
		return "Pacchetto [codice=" + codice + ", descrizione=" + descrizione
				+ ", postiTotali=" + postiTotali + ", n. prenotazioni="
				+ prenotazione.size() + ", postiDisponibili="
				+ getPostiDisponibili() + "]";
	}
}	
