import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Vol{

	private String identifiant;
	private ZonedDateTime depart;
	private ZonedDateTime arrivee;
	private boolean etat;

	public Vol (String identifiant, ZonedDateTime depart, ZonedDateTime arrivee){
		
		this.identifiant = identifiant;
		this.depart = depart;
		this.arrivee = arrivee;
		this.etat = false;
		
	}
	
	public String getId() {
		return identifiant;
	}

	public ZonedDateTime getDepart() {
		return depart;
	} 
	
	public ZonedDateTime getArrivee() {
		return arrivee;
	}
	
	public long duree(ZonedDateTime depart, ZonedDateTime arrivee){
		return ChronoUnit.HOURS.between(this.depart, this.arrivee);
	}

	public void ouvrir(){
		this.etat = true;
	}

	public void fermee(){
		this.etat = false;
	}
}

