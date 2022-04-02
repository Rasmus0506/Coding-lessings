public class Doctor extends HospitalWorker  {
    private String speciality;

    public Doctor(String speciality, int salary) {
        super(salary);
        this.speciality = speciality;
    }
}



//Lav en class kaldet Doctor med samme attributter og metoder som HospitalWorker + følgende attributter:
//  speciality - en string der beskriver speciallet en doktor har
//
//Lav en constructor der sætter alle attributterne
//Overskriv print metoden så den også printer speciality ud
//Lav en metode der hedder treatPatient() som intet returnere og som tager ingen argumenter
//Metoden skal printe "Behandler patient"