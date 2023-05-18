import java.util.*;
import java.time.*;

class AnalysesBiologiques{
	private String type_analyse;
	private LocalDateTime date;
	private String resultat;
	private Patient patient;
	private Medecin medecin;

	public AnalysesBiologiques(String type_analyse, LocalDateTime date, String resultat, Patient patient, Medecin medecin) {
        this.type_analyse = type_analyse;
        this.date = date;
        this.resultat = resultat;
        this.patient = patient;
        this.medecin = medecin;
    }

    public void updateAnalysesBiologiques(String type_analyse, LocalDateTime date, String resultat, Patient patient, Medecin medecin) {
        this.type_analyse = type_analyse;
        this.date = date;
        this.resultat = resultat;
        this.patient = patient;
        this.medecin = medecin;
    }

	public String getType_analyse() {
		return type_analyse;
	}

	public void setType_analyse(String type_analyse) {
		this.type_analyse = type_analyse;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
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

	public void addPatient(Patient patient) {
        this.patient = patient;
    }

    public void addMedecin(Medecin medecin) {
        this.medecin = medecin;
    }
}
