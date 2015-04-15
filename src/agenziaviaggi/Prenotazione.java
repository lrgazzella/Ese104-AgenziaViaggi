package agenziaviaggi;

public class Prenotazione {
	
	private String codice;
	private int postiRichiesti;
	private Cliente cliente;
	private Filiale filiale;
	private Pacchetto pacchetto;
	
	public Prenotazione(String codice, int postiRichiesti, Cliente c, Filiale f){
		this.codice = codice;
		this.postiRichiesti = postiRichiesti;
		this.cliente = c;
		this.filiale = f;
	}
	
	public String getCodice(){
		return this.codice;
	}
	public int getPostiRichiesti(){
		return this.postiRichiesti;
	}
	public Cliente getCliente(){
		return this.cliente;
	}
	public Filiale getFiliale(){
		return this.filiale;
	}
	public void setPacchetto(Pacchetto p){
		this.pacchetto = p;
	}
	
	
	
}
