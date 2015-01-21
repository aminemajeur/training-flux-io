import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {

	private String nom;
	private String prenom;
	private Date dateNaissance;

	public Person(String nom, String prenom, Date dateNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "nom:" + nom + "\nprenom:" + prenom + "\ndateNaissance:" + dateNaissance + "\n";
	}

}
