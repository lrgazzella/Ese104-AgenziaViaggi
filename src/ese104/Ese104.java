package ese104;
import agenziaviaggi.*;

public class Ese104 {

	
	public static void main(String[] args) throws Exception {
		
		Cliente cliente = new Cliente("Lorenzo", "Gazzella");
		Filiale filiale = new Filiale(3);
		Pacchetto pacchetto = new Pacchetto("aa4", "Crocera maldive", 3);
		Prenotazione prenotazione = new Prenotazione("FFA1", 20, cliente, filiale);
		
		pacchetto.addPrenotazione(prenotazione);
		pacchetto.addPrenotazione(prenotazione);
		pacchetto.addPrenotazione(prenotazione);
		
		
		for(int i=0; i<pacchetto.getPrenotazioni().size(); i++){
			System.out.println(pacchetto.getPrenotazioni().elementAt(i).toString());		
		}
		

	}

}
