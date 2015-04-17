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
	
	public void addPrenotazione(Prenotazione p) throws Exception{
		if(this.getPostiDisponibili() > 0 ){
			prenotazioni.addElement(p);
			p.setPacchetto(this);
		}else{
			throw new Exception("Posto non disponibile");
		}
		
	}
	public int getPostiDisponibili(){
		int size = prenotazioni.size();
		return this.postiTotali - size;
	}
	public Vector<Prenotazione> getPrenotazioni(){
		return this.prenotazioni;
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

	@Override
	public String toString() {
		return "Pacchetto [codice=" + codice + ", descrizione=" + descrizione
				+ ", postiTotali=" + postiTotali + ", prenotazioni="
				+ prenotazioni + "]";
	}
	
	
	
	
	
	
}
