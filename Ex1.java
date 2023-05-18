import java.util.*;
import java.time.*;

class Ex1{
	public static void main(String[] args) {
        
        ArrayList<Patient> patients = new ArrayList<>();
        ArrayList<Medecin> medecins = new ArrayList<>();
        ArrayList<Sejour> sejours = new ArrayList<>();
        ArrayList<Lesion> lesions = new ArrayList<>();
        ArrayList<Dermatoscopie> dermatoscopies = new ArrayList<>();
        ArrayList<Traitement> traitements = new ArrayList<>();
        ArrayList<AnalysesBiologiques> analysesBiologiques = new ArrayList<>();


		Patient patient1 = new Patient("John", "Doe", LocalDateTime.of(1990, 5, 10, 0, 0),
		        "1234567890", "123 Main St.", new ArrayList<>(), new ArrayList<>(), new ArrayList<>() ,
		         new ArrayList<>());
		patients.add(patient1);

		Patient patient2 = new Patient("Alice", "Smith", LocalDateTime.of(1985, 9, 15, 0, 0),
		        "9876543210", "456 Elm St.", new ArrayList<>(), new ArrayList<>(), new ArrayList<>(),
		    	new ArrayList<>());
		patients.add(patient2);


		Medecin medecin1 = new Medecin("Dr. Robert", "Johnson", LocalDateTime.of(1975, 3, 20, 0, 0),
		        "5551234567", "789 Oak St.", "Dermatology", new ArrayList<>(), new ArrayList<>(),
		        new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
		medecins.add(medecin1);

		Medecin medecin2 = new Medecin("Dr. Sarah", "Anderson", LocalDateTime.of(1980, 7, 25, 0, 0),
		        "5559876543", "321 Pine St.", "Internal Medicine", new ArrayList<>(), new ArrayList<>(),
		        new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
		medecins.add(medecin2);


		Sejour sejour1 = new Sejour(LocalDateTime.of(2023, 4, 1, 0, 0), LocalDateTime.of(2023, 4, 5, 0, 0),
		        "Dermatology", patient1, medecin1, new ArrayList<>(), new ArrayList<>());
		sejours.add(sejour1);

		Sejour sejour2 = new Sejour(LocalDateTime.of(2023, 4, 10, 0, 0), LocalDateTime.of(2023, 4, 15, 0, 0),
		        "Internal Medicine", patient2, medecin2, new ArrayList<>(), new ArrayList<>());
		sejours.add(sejour2);


		Lesion lesion1 = new Lesion("Back", 5, "Type A", patient1, new ArrayList<>());
		lesions.add(lesion1);

		Lesion lesion2 = new Lesion("Arm", 3, "Type B", patient2, new ArrayList<>());
		lesions.add(lesion2);


		Dermatoscopie dermatoscopie1 = new Dermatoscopie(LocalDateTime.of(2023, 4, 2, 0, 0),
		        "Observations 1", lesion1, medecin1, sejour1);
		dermatoscopies.add(dermatoscopie1);

		Dermatoscopie dermatoscopie2 = new Dermatoscopie(LocalDateTime.of(2023, 4, 12, 0, 0),
		        "Observations 2", lesion2, medecin2, sejour2);
		dermatoscopies.add(dermatoscopie2);


		Traitement traitement1 = new Traitement("Medicine A", "Dosage 1", 10, patient1, medecin1, sejour1);
		traitements.add(traitement1);

		Traitement traitement2 = new Traitement("Medicine B", "Dosage 2", 7, patient2, medecin2, sejour2);
		traitements.add(traitement2);


		AnalysesBiologiques analysesBiologiques1 = new AnalysesBiologiques("Type 1", LocalDateTime.of(2023, 4, 3, 0, 0),
		        "Result 1", patient1, medecin1);
		analysesBiologiques.add(analysesBiologiques1);

		AnalysesBiologiques analysesBiologiques2 = new AnalysesBiologiques("Type 2", LocalDateTime.of(2023, 4, 13, 0, 0),
		        "Result 2", patient2, medecin2);
		analysesBiologiques.add(analysesBiologiques2);

		// Connecting instances
		patient1.addAnalysesBiologiques(analysesBiologiques1);
		patient1.addLesion(lesion1);
		patient1.addSejour(sejour1);
		lesion1.addDermatoscopie(dermatoscopie1);
		lesion1.setPatient(patient1);
		dermatoscopie1.addLesion(lesion1);
		dermatoscopie1.addMedecin(medecin1);
		dermatoscopie1.addSejour(sejour1);
		sejour1.addDermatoscopie(dermatoscopie1);
		sejour1.addTraitement(traitement1);
		sejour1.setPatient(patient1);
		sejour1.setMedecin(medecin1);
		traitement1.setPatient(patient1);
		traitement1.setMedecin(medecin1);
		traitement1.setSejour(sejour1);
		analysesBiologiques1.setPatient(patient1);
		analysesBiologiques1.setMedecin(medecin1);

		patient2.addAnalysesBiologiques(analysesBiologiques2);
		patient2.addLesion(lesion2);
		patient2.addSejour(sejour2);
		lesion2.addDermatoscopie(dermatoscopie2);
		lesion2.setPatient(patient2);
		dermatoscopie2.addLesion(lesion2);
		dermatoscopie2.addMedecin(medecin2);
		dermatoscopie2.addSejour(sejour2);
		sejour2.addDermatoscopie(dermatoscopie2);
		sejour2.addTraitement(traitement2);
		sejour2.setPatient(patient2);
		sejour2.setMedecin(medecin2);
		traitement2.setPatient(patient2);
		traitement2.setMedecin(medecin2);
		traitement2.setSejour(sejour2);
		analysesBiologiques2.setPatient(patient2);
		analysesBiologiques2.setMedecin(medecin2);

    }
}



