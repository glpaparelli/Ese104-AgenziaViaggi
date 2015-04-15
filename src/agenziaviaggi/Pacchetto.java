package agenziaviaggi;

import java.util.*;

public class Pacchetto {
	
	private String codice;
	private String descrizione;
	private int postiTotali;
	private Vector <Prenotazione> prenotazione; 
	
	public Pacchetto(String codice, String descrizione, int postiTotali) {
		super();
		this.codice = codice;
		this.descrizione = descrizione;
		this.postiTotali = postiTotali;
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
		
		for(int i=0;i<prenotazione.size();i++){
			Prenotazione g = prenotazione.elementAt(i);
			r += g.getPostiRichiesti();
			
		}	
	return r;
	}
	
}	
