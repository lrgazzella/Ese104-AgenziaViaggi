package agenziaviaggi;

import java.util.Vector;

public class Pacchetto {
	
	private String codice;
	private String descrizione;
	private int postiTotali;
	private Vector<Prenotazione> prenotazioni;
	
	public Pacchetto(String codice, String descrizione, int postiTotali){
		this.codice = codice;
		this.descrizione = descrizione;
		this.postiTotali = postiTotali;
		this.prenotazioni = new Vector<Prenotazione>();
	}
	
	public void addPrenotazione(Prenotazione p){
		this.prenotazioni.addElement(p);
	}
	public int getPostiDisponibili(){
		int size = prenotazioni.size();
		return this.postiTotali - size;
	}
	public Vector<Prenotazione> getPrenotazioni(){
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
