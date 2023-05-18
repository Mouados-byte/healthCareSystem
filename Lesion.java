import java.util.*;
import java.time.*;

class Lesion {
	private String localisation;
	private int taille;
	private String type;
	private Patient patient;
	private ArrayList<Dermatoscopie> l_dermatoscopie;

	// Constructor
    public Lesion(String localisation, int taille, String type, Patient patient, ArrayList<Dermatoscopie> l_dermatoscopie) {
        this.localisation = localisation;
        this.taille = taille;
        this.type = type;
        this.patient = patient;
        this.l_dermatoscopie = l_dermatoscopie;
    }

    // Update function
    public void updateLesion(String localisation, int taille, String type, Patient patient, ArrayList<Dermatoscopie> l_dermatoscopie) {
        this.localisation = localisation;
        this.taille = taille;
        this.type = type;
        this.patient = patient;
        this.l_dermatoscopie = l_dermatoscopie;
    }


	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public ArrayList<Dermatoscopie> getL_dermatoscopie() {
		return l_dermatoscopie;
	}

	public void setL_dermatoscopie(ArrayList<Dermatoscopie> l_dermatoscopie) {
		this.l_dermatoscopie = l_dermatoscopie;
	}

	 public void addDermatoscopie(Dermatoscopie dermatoscopie) {
        l_dermatoscopie.add(dermatoscopie);
    }

}
