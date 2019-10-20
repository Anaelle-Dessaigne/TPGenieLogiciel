import java.util.ArrayList;

public class Passager{

	private String nom;
	private String contact;

	private ArrayList<Reservation> passagerReserv = new ArrayList<>();

	public Passager(String nom, String contact){
		this.nom = nom;
		this.contact = contact;
	}
	
	public String getNom() {
		return nom;
	}

	public String getContact() {
		return contact;
	} 
	
}
