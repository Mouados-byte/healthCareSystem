import java.util.*;
import java.time.*;

class Dermatoscopie{
	private LocalDateTime date;
	private String observations;
	private Lesion d_lesion;
	private Medecin d_medecin;
	private Sejour d_sejour;

	public Dermatoscopie(LocalDateTime date, String observations, Lesion d_lesion, Medecin d_medecin, Sejour d_sejour) {
        this.date = date;
        this.observations = observations;
        this.d_lesion = d_lesion;
        this.d_medecin = d_medecin;
        this.d_sejour = d_sejour;
    }

    public void updateDermatoscopie(LocalDateTime date, String observations, Lesion d_lesion, Medecin d_medecin, Sejour d_sejour) {
        this.date = date;
        this.observations = observations;
        this.d_lesion = d_lesion;
        this.d_medecin = d_medecin;
        this.d_sejour = d_sejour;
    }

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}

	public String getObservations() {
		return observations;
	}

	public void setObservations(String observations) {
		this.observations = observations;
	}

	public Lesion getD_lesion() {
		return d_lesion;
	}

	public void setD_lesion(Lesion d_lesion) {
		this.d_lesion = d_lesion;
	}

	public Medecin getD_medecin() {
		return d_medecin;
	}

	public void setD_medecin(Medecin d_medecin) {
		this.d_medecin = d_medecin;
	}

	public Sejour getD_sejour() {
		return d_sejour;
	}

	public void setD_sejour(Sejour d_sejour) {
		this.d_sejour = d_sejour;
	}


    public void addLesion(Lesion lesion) {
        d_lesion = lesion;
    }

    public void addMedecin(Medecin medecin) {
        d_medecin = medecin;
    }

    public void addSejour(Sejour sejour) {
        d_sejour = sejour;
    }
}

