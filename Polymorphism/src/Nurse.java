public class Nurse extends HospitalWorker {
    private boolean bloodsamples;

    public Nurse(boolean bloodsamples, int salary){
        super(salary);
        this.bloodsamples = bloodsamples;
    }
}



//Lav en class kaldet Nurse med samme attributter og metoder som HospitalWorker + følgende attributter:
//  bloodSamples - en boolean der beskriver om sygeplejsken må tage blodprøver
//
//
//Lav en constructor der sætter alle attributterne
//Overskriv print metoden så den også printer bloodmsamples ud
//Ude i main lav et array med 3 pladser af typen HospitalWorker
//Gør så hver plads i arrayet indeholder en instans af de 3 klasser
//Kald print metoden på alle pladserne i arrayet