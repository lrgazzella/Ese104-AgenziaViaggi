package agenziaviaggi;

public class Cliente {
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + "]";
	}

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
