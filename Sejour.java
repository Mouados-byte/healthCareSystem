import java.util.*;
import java.time.*;

class Sejour{
	private LocalDateTime date_admission;
	private LocalDateTime date_sortie;
	private String service;
	private Patient patient;
	private Medecin medecin;
	private ArrayList<Dermatoscopie> m_dermatoscopie;
	private ArrayList<Traitement> m_traitement;

	public Sejour(LocalDateTime date_admission, LocalDateTime date_sortie, String service, Patient patient, Medecin medecin, ArrayList<Dermatoscopie> m_dermatoscopie, ArrayList<Traitement> m_traitement) {
        this.date_admission = date_admission;
        this.date_sortie = date_sortie;
        this.service = service;
        this.patient = patient;
        this.medecin = medecin;
        this.m_dermatoscopie = m_dermatoscopie;
        this.m_traitement = m_traitement;
    }

    public void updateSejour(LocalDateTime date_admission, LocalDateTime date_sortie, String service, Patient patient, Medecin medecin, ArrayList<Dermatoscopie> m_dermatoscopie, ArrayList<Traitement> m_traitement) {
        this.date_admission = date_admission;
        this.date_sortie = date_sortie;
        this.service = service;
        this.patient = patient;
        this.medecin = medecin;
        this.m_dermatoscopie = m_dermatoscopie;
        this.m_traitement = m_traitement;
    }

	public LocalDateTime getDate_admission() {
		return date_admission;
	}

	public void setDate_admission(LocalDateTime date_admission) {
		this.date_admission = date_admission;
	}

	public LocalDateTime getDate_sortie() {
		return date_sortie;
	}

	public void setDate_sortie(LocalDateTime date_sortie) {
		this.date_sortie = date_sortie;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
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

	public ArrayList<Dermatoscopie> getM_dermatoscopie() {
		return m_dermatoscopie;
	}

	public void setM_dermatoscopie(ArrayList<Dermatoscopie> m_dermatoscopie) {
		this.m_dermatoscopie = m_dermatoscopie;
	}

	public ArrayList<Traitement> getM_traitement() {
		return m_traitement;
	}

	public void setM_traitement(ArrayList<Traitement> m_traitement) {
		this.m_traitement = m_traitement;
	}

	public void addDermatoscopie(Dermatoscopie dermatoscopie) {
        m_dermatoscopie.add(dermatoscopie);
    }

    public void addTraitement(Traitement traitement) {
        m_traitement.add(traitement);
    }
}
