package agenziaviaggi;

import java.util.Vector;

public class Pacchetto {
	
	private String codice;
	private String descrizione;
	private int postiTotali;
	private Vector<Prenotazione> prenotazioni;
	
	public Pacchetto(String codice, String descrizione, int postiTotali){
		
	}
	
	public void addPrenotazione(Prenotazione p){
		
	}
	public int getPostiDisponibili(){
		int size = prenotazioni.size();
		return this.postiTotali - size;
	}
	public Vector<Prenotazione> getPrenotazione(Prenotazione p){
		return prenotazioni;
	}
	public int getPostiTotali(){
		return this.postiTotali;
	}
	public String getDescrizione(){
		return this.descrizione;
	}
	public String getCodice(){
		return this.codice;
	}
	
	
	
	
}
