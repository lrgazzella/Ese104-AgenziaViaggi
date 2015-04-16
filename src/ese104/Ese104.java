package ese104;
import agenziaviaggi.*;

public class Ese104 {

	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Lorenzo", "Gazzella");
		Filiale filiale = new Filiale(3);
		Pacchetto pacchetto = new Pacchetto("aa4", "Crocera maldive", 200);
		Prenotazione prenotazione = new Prenotazione("FFA1", 20, cliente, filiale);
		
		System.out.println(pacchetto.getPrenotazioni().size());
		pacchetto.addPrenotazione(prenotazione);
		System.out.println(pacchetto.getPrenotazioni().size());
		
		for(int i=0; i<pacchetto.getPrenotazioni().size(); i++){
			System.out.println(pacchetto.getPrenotazioni());		
		}
		

	}

}
