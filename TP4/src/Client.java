import java.util.ArrayList;

public class Client {
	
	private String nom;
	private String paiement;
	private String contact;
	private String reference;

	private ArrayList<Reservation> ClientReserv = new ArrayList<>();

	public Client (String nom, String paiement, String contact, String reference){
		this.nom = nom;
		this.paiement = paiement; 
		this.contact = contact;
		this.reference = reference;
	}
	
	public String getNom() {
		return nom;
	}

	public String getPaiement() {
		return paiement;
	} 

	public String getContact() {
		return contact;
	}

	public String getReference() {
		return reference;
	} 
	
}

