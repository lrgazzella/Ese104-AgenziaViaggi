package agenziaviaggi;

public class Cliente {
	
	private String nome;
	private String cognome;
	
	public Cliente(String nome, String cognome){
		this.cognome = cognome;
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public String getCognome(){
		return this.cognome;
	}
	
}
