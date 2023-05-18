import java.util.*;
import java.time.*;

class Medecin{
	private String nom;
	private String prenom;
	private LocalDateTime date_naiss;
	private String tele;
	private String adresse;
	private String specialite;
	private ArrayList<AnalysesBiologiques> m_analyse;
	private ArrayList<Dermatoscopie> m_dermatoscopie;
	private ArrayList<Patient> m_Patient;
	private ArrayList<Traitement> m_traitement;
	private ArrayList<Sejour> p_sejour;

	public Medecin(String nom, String prenom, LocalDateTime date_naiss, String tele, String adresse, String specialite,
                   ArrayList<AnalysesBiologiques> m_analyse, ArrayList<Dermatoscopie> m_dermatoscopie, ArrayList<Patient> m_Patient,
                   ArrayList<Traitement> m_traitement, ArrayList<Sejour> p_sejour) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naiss = date_naiss;
        this.tele = tele;
        this.adresse = adresse;
        this.specialite = specialite;
        this.m_analyse = m_analyse;
        this.m_dermatoscopie = m_dermatoscopie;
        this.m_Patient = m_Patient;
        this.m_traitement = m_traitement;
        this.p_sejour = p_sejour;
    }

    public void updateMedecin(String nom, String prenom, LocalDateTime date_naiss, String tele, String adresse, String specialite,
                   ArrayList<AnalysesBiologiques> m_analyse, ArrayList<Dermatoscopie> m_dermatoscopie, ArrayList<Patient> m_Patient,
                   ArrayList<Traitement> m_traitement, ArrayList<Sejour> p_sejour) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naiss = date_naiss;
        this.tele = tele;
        this.adresse = adresse;
        this.specialite = specialite;
        this.m_analyse = m_analyse;
        this.m_dermatoscopie = m_dermatoscopie;
        this.m_Patient = m_Patient;
        this.m_traitement = m_traitement;
        this.p_sejour = p_sejour;
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

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public ArrayList<AnalysesBiologiques> getAnalyse() {
		return m_analyse;
	}

	public void setAnalyse(ArrayList<AnalysesBiologiques> m_analyse) {
		this.m_analyse = m_analyse;
	}

	public ArrayList<Dermatoscopie> getDermatoscopie() {
		return m_dermatoscopie;
	}

	public void setDermatoscopie(ArrayList<Dermatoscopie> m_dermatoscopie) {
		this.m_dermatoscopie = m_dermatoscopie;
	}

	public ArrayList<Patient> getPatient() {
		return m_Patient;
	}

	public void setPatient(ArrayList<Patient> m_Patient) {
		this.m_Patient = m_Patient;
	}

	public ArrayList<Traitement> getTraitement() {
		return m_traitement;
	}

	public void setTraitement(ArrayList<Traitement> m_traitement) {
		this.m_traitement = m_traitement;
	}

	public ArrayList<Sejour> getSejour() {
		return p_sejour;
	}

	public void setSejour(ArrayList<Sejour> p_sejour) {
		this.p_sejour = p_sejour;
	}

	public void addAnalysesBiologiques(AnalysesBiologiques analysesBiologiques) {
        m_analyse.add(analysesBiologiques);
    }

    public void addDermatoscopie(Dermatoscopie dermatoscopie) {
        m_dermatoscopie.add(dermatoscopie);
    }

    public void addPatient(Patient patient) {
        m_Patient.add(patient);
    }

    public void addTraitement(Traitement traitement) {
        m_traitement.add(traitement);
    }

    public void addSejour(Sejour sejour) {
        p_sejour.add(sejour);
    }

	public ArrayList<Medecin> searchMedecinByNom(ArrayList<Medecin> m_Medecin , String nom){
		ArrayList<Medecin> res = new ArrayList<>();
		for (Medecin m : m_Medecin ) {
			if(m.getNom().equalsIgnoreCase(nom)){
				res.add(m);
			}
		}

		return res;
	}

	public ArrayList<Medecin> searchMedecinByPrenom(ArrayList<Medecin> m_Medecin , String prenom){
		ArrayList<Medecin> res = new ArrayList<>();
		for (Medecin m : m_Medecin ) {
			if(m.getPrenom().equalsIgnoreCase(prenom)){
				res.add(m);
			}
		}

		return res;
	}

	public ArrayList<Medecin> searchMedecinBySpecialite(ArrayList<Medecin> m_Medecin , String specialite){
		ArrayList<Medecin> res = new ArrayList<>();
		for (Medecin m : m_Medecin ) {
			if(m.getSpecialite().equalsIgnoreCase(specialite)){
				res.add(m);
			}
		}

		return res;
	}

	public ArrayList<Medecin> searchMedecinsByDateNaiss(ArrayList<Medecin> p_Medecin , LocalDateTime date_naiss) {
	    ArrayList<Medecin> res = new ArrayList<>();
	    for (Medecin m : p_Medecin) {
	        if (m.getDate_naiss().isEqual(date_naiss)) {
	            res.add(m);
	        }
	    }
	    return res;
	}

	public ArrayList<Medecin> searchMedecinsByTelephone(ArrayList<Medecin> p_Medecin , String telephone) {
	    ArrayList<Medecin> res = new ArrayList<>();
	    for (Medecin m : p_Medecin) {
	        if (m.getTele().equals(telephone)) {
	            res.add(m);
	        }
	    }
	    return res;
	}

	public ArrayList<Medecin> searchMedecinsByAddress(ArrayList<Medecin> p_Medecin , String address) {
	    ArrayList<Medecin> res = new ArrayList<>();
	    for (Medecin m : p_Medecin) {
	        if (m.getAdresse().equalsIgnoreCase(address)) {
	            res.add(m);
	        }
	    }
	    return res;
	}

	public ArrayList<Patient> getSortedPatientByNom(){
		ArrayList<Patient> res = new ArrayList<>(this.getPatient());
		res.sort(Comparator.comparing(Patient::getNom));
		return res;
	}

	public ArrayList<Patient> getSortedPatientByPrenom(){
		ArrayList<Patient> res = new ArrayList<>(this.getPatient());
		res.sort(Comparator.comparing(Patient::getPrenom));
		return res;
	}

	public ArrayList<Patient> getSortedPatientByDate_naiss(){
		ArrayList<Patient> res = new ArrayList<>(this.getPatient());
		res.sort(Comparator.comparing(Patient::getDate_naiss));
		return res;
	}

	public ArrayList<Patient> getSortedPatient(int sortType){
		switch (sortType){
		case 1:
			return this.getSortedPatientByNom();
		case 2:
			return this.getSortedPatientByPrenom();
		case 3:
			return this.getSortedPatientByDate_naiss();
		default:
			return m_Patient;
		}
	}

	public ArrayList<AnalysesBiologiques> getSortedAnalyses(){
		ArrayList<AnalysesBiologiques> res = new ArrayList<>(this.getAnalyse());
		res.sort(Comparator.comparing(AnalysesBiologiques::getDate));
		return res;
	}

	public ArrayList<Sejour> getSortedSejour(){
		ArrayList<Sejour> res = new ArrayList<>(this.getSejour());
		res.sort(Comparator.comparing(Sejour::getDate_admission));
		return res;
	}

	public ArrayList<Dermatoscopie> getSortedDermatoscopie(){
		ArrayList<Dermatoscopie> res = new ArrayList<>(this.getDermatoscopie());
		res.sort(Comparator.comparing(Dermatoscopie::getDate));
		return res;
	}

	public void statistiqueMedecin(){
		System.out.println(this.getNom() + " " + this.getPrenom());
		System.out.println("Nombre total des patients traites : " +  this.getPatient().size());
		System.out.println("Nombre total des Analyses Biologiques prescrites : " +  this.getAnalyse().size());
		System.out.println("Nombre total des Sejours supervises : " +  this.getSejour().size());
	}

	public ArrayList<Traitement> getSortedTraitementByNom(){
		ArrayList<Traitement> res = new ArrayList<>(this.getTraitement());
		res.sort(Comparator.comparing(Traitement::getNom_medicament));
		return res;
	}

	public ArrayList<Traitement> getSortedTraitementByPosologie(){
		ArrayList<Traitement> res = new ArrayList<>(this.getTraitement());
		res.sort(Comparator.comparing(Traitement::getPosologie));
		return res;
	}

	public ArrayList<Traitement> getSortedTraitementByDuree(){
		ArrayList<Traitement> res = new ArrayList<>(this.getTraitement());
		res.sort(Comparator.comparing(Traitement::getDuree));
		return res;
	}

	public ArrayList<Traitement> getSortedTraitement(int sortType){
		switch (sortType){
		case 1:
			return getSortedTraitementByNom();
		case 2:
			return getSortedTraitementByPosologie();
		case 3:
			return getSortedTraitementByDuree();
		default:
			return this.getTraitement();
		}
	}
}

