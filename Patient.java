import java.util.*;
import java.time.*;

class Patient{
	private String nom;
	private String prenom;
	private LocalDateTime date_naiss;
	private String tele;
	private String adresse;
	private ArrayList<AnalysesBiologiques> p_analyse;
	private ArrayList<Sejour> p_sejour;
	private ArrayList<Lesion> p_lesion;
	private ArrayList<Medecin> p_medecin;

	public Patient(String nom, String prenom, LocalDateTime date_naiss, String tele, String adresse,
                   ArrayList<AnalysesBiologiques> p_analyse, ArrayList<Sejour> p_sejour, ArrayList<Lesion> p_lesion,
                   ArrayList<Medecin> p_medecin) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naiss = date_naiss;
        this.tele = tele;
        this.adresse = adresse;
        this.p_analyse = p_analyse;
        this.p_sejour = p_sejour;
        this.p_lesion = p_lesion;
        this.p_medecin = p_medecin;
    }

    public void updatePatient(String nom, String prenom, LocalDateTime date_naiss, String tele, String adresse,
                   ArrayList<AnalysesBiologiques> p_analyse, ArrayList<Sejour> p_sejour, ArrayList<Lesion> p_lesion,
                   ArrayList<Medecin> p_medecin) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naiss = date_naiss;
        this.tele = tele;
        this.adresse = adresse;
        this.p_analyse = p_analyse;
        this.p_sejour = p_sejour;
        this.p_lesion = p_lesion;
        this.p_medecin = p_medecin;
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDateTime getDate_naiss() {
		return date_naiss;
	}

	public void setDate_naiss(LocalDateTime date_naiss) {
		this.date_naiss = date_naiss;
	}

	public String getTele() {
		return tele;
	}

	public void setTele(String tele) {
		this.tele = tele;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public ArrayList<AnalysesBiologiques> getAnalyse() {
		return p_analyse;
	}

	public void setAnalyse(ArrayList<AnalysesBiologiques> p_analyse) {
		this.p_analyse = p_analyse;
	}

	public ArrayList<Sejour> getSejour() {
		return p_sejour;
	}

	public void setSejour(ArrayList<Sejour> p_sejour) {
		this.p_sejour = p_sejour;
	}

	public ArrayList<Lesion> getLesion() {
		return p_lesion;
	}

	public void setLesion(ArrayList<Lesion> p_lesion) {
		this.p_lesion = p_lesion;
	}

	public ArrayList<Medecin> getMedecin() {
		return this.p_medecin;
	}

	public void setMedecin(ArrayList<Medecin> medecin) {
		this.p_medecin = medecin;
	}

	public void addAnalysesBiologiques(AnalysesBiologiques analysesBiologiques) {
        p_analyse.add(analysesBiologiques);
    }

    public void addSejour(Sejour sejour) {
        p_sejour.add(sejour);
    }

    public void addLesion(Lesion lesion) {
        p_lesion.add(lesion);
    }

	public ArrayList<Patient> searchPatientsByName(ArrayList<Patient> p_Patient ,String  name) {
    ArrayList<Patient> result = new ArrayList<>();
    for (Patient patient : p_Patient) {
        if (patient.getNom().equalsIgnoreCase(name)) {
            result.add(patient);
        }
    }
    return result;
}

public ArrayList<Patient> searchPatientsBySurname(ArrayList<Patient> p_Patient , String surname) {
    ArrayList<Patient> result = new ArrayList<>();
    for (Patient patient : p_Patient) {
        if (patient.getPrenom().equalsIgnoreCase(surname)) {
            result.add(patient);
        }
    }
    return result;
}

public ArrayList<Patient> searchPatientsByDateOfBirth(ArrayList<Patient> p_Patient , LocalDateTime dateOfBirth) {
    ArrayList<Patient> result = new ArrayList<>();
    for (Patient patient : p_Patient) {
        if (patient.getDate_naiss().isEqual(dateOfBirth)) {
            result.add(patient);
        }
    }
    return result;
}

public ArrayList<Patient> searchPatientsByTelephone(ArrayList<Patient> p_Patient , String telephone) {
    ArrayList<Patient> result = new ArrayList<>();
    for (Patient patient : p_Patient) {
        if (patient.getTele().equals(telephone)) {
            result.add(patient);
        }
    }
    return result;
}

public ArrayList<Patient> searchPatientsByAddress(ArrayList<Patient> p_Patient , String address) {
    ArrayList<Patient> result = new ArrayList<>();
    for (Patient patient : p_Patient) {
        if (patient.getAdresse().equalsIgnoreCase(address)) {
            result.add(patient);
        }
    }
    return result;
}

	private ArrayList<Sejour> getSortedSejours(){
		ArrayList<Sejour> sej = new ArrayList<>(this.getSejour());
		for(int i=0 ; i < sej.size() - 1 ; i++){
			int minIndex = i;
			for (int j = i; j < sej.size() ; j++) {
				if(sej.get(j).getDate_admission().isBefore(sej.get(i).getDate_admission())){
					minIndex = j;
				}
			}
			if(minIndex > i){
				Sejour temp = sej.get(minIndex);
				sej.set(minIndex , sej.get(i));
				sej.set(i , temp);
			}
		}

		return this.p_sejour;
	}

	private int calAge(){
		LocalDateTime curr_date = LocalDateTime.now();
		int ret = Period.between(this.getDate_naiss().toLocalDate() , curr_date.toLocalDate()).getYears();
		return ret;
	}

	private ArrayList<AnalysesBiologiques> getSortedAnalyses(){
		int n = this.getAnalyse().size();
		for(int i=0 ; i < this.getAnalyse().size() - 1 ; i++){
			int minIndex = i;
			for (int j = i; j < n ; j++) {
				if(this.p_analyse.get(j).getDate().isBefore(this.p_analyse.get(i).getDate())){
					minIndex = j;
				}
			}
			if(minIndex > i){
				AnalysesBiologiques temp = this.getAnalyse().get(i);
				this.p_analyse.set(i , this.getAnalyse().get(minIndex));
				this.p_analyse.set(minIndex , temp);
			}
		}

		return this.p_analyse;
	}

	private ArrayList<Lesion> getSortedLesionParTaille(){
		ArrayList<Lesion> les = new ArrayList<>(this.getLesion());

		les.sort(Comparator.comparing(Lesion::getTaille));
		
		return les;
	}

	private ArrayList<Lesion> getSortedLesionParType(){
		ArrayList<Lesion> les = new ArrayList<>(this.getLesion());
		
		les.sort(Comparator.comparing(Lesion::getType));

		return les;
	}

	private ArrayList<Lesion> getSortedLesion(int sortType){
		switch (sortType){
			case 1:
				return this.getSortedLesionParTaille();
			case 2:
				return this.getSortedLesionParType();
			default:
				return this.getLesion();
		}
	}

	public void statistiquePatient(){
		System.out.println("Nombre total de sejours est : " + this.getSejour().size());
		System.out.println("Nombre total d'analyses biologiques' est : " + this.getAnalyse().size());
		System.out.println("Nombre total de lesions est : " + this.getLesion().size());
	}

	public ArrayList<Medecin> getSortedMedecin(){
		ArrayList<Medecin> res = new ArrayList<>(this.getMedecin());

		res.sort(Comparator.comparing(Medecin::getSpecialite));
		return res;
	}

}