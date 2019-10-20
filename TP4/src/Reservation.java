import java.util.ArrayList;
import java.util.Date;

public class Reservation {

	public Date date;
	public double identifiant;
	public String etat;

	public ArrayList<Client> clients = new ArrayList<>();
	public ArrayList<Passager> passagers = new ArrayList<>();
	private Vol vol;

	public Reservation(Date date, double identifiant){
		this.date = date;
		this.identifiant = identifiant;
		this.etat = "Réservation en cours...";
	}
	
	public String getEtat(){
		return etat;
	}

	public void annuler(){
		this.etat = "Réservation annulée !";
	}

	public void confirmer(){
		this.etat = "Réservation confirmée !";
	}

	public void payer(){
		this.etat = "Réservation payé !";
	}

}

