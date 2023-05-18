import java.util.*;
import java.time.*;

class Traitement{
	private String nom_medicament;
	private String posologie;
	private int duree;
	private Patient patient;
	private Medecin medecin;
	private Sejour sejour;

	public Traitement(String nom_medicament, String posologie, int duree, Patient patient, Medecin medecin, Sejour sejour) {
        this.nom_medicament = nom_medicament;
        this.posologie = posologie;
        this.duree = duree;
        this.patient = patient;
        this.medecin = medecin;
        this.sejour = sejour;
    }

    public void updateTraitement(String nom_medicament, String posologie, int duree, Patient patient, Medecin medecin, Sejour sejour) {
        this.nom_medicament = nom_medicament;
        this.posologie = posologie;
        this.duree = duree;
        this.patient = patient;
        this.medecin = medecin;
        this.sejour = sejour;
    }

	public String getNom_medicament() {
		return nom_medicament;
	}

	public void setNom_medicament(String nom_medicament) {
		this.nom_medicament = nom_medicament;
	}

	public String getPosologie() {
		return posologie;
	}

	public void setPosologie(String posologie) {
		this.posologie = posologie;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Medecin getMedecin() {
		return medecin;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public Sejour getSejour() {
		return sejour;
	}

	public void setSejour(Sejour sejour) {
		this.sejour = sejour;
	}

	public void addSejour(Sejour sejour) {
        this.sejour = sejour;
    }
}
