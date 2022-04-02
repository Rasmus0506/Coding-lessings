import java.util.Scanner;

public class PolymorphismExeraice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] x = new int[3];
        x[0] = 10;
        x[1] = 1585;
        x[2] = -474;
        double y = scanner.nextDouble();
        int k;
        k = (int) y;

        System.out.println(x[k]);

        System.out.println();
        System.out.println("Cirkel radius - Areal");
        Circle mycircle = new Circle(5);
        mycircle.getArea();
    }

}

//OPG 16
/*
Opgave 16.0

Lav en class HospitalWorker med følgende attributter:
  salary - en int der beskrvier lønnen på hospitalsmedarbejderen

Lav en constructor der sætter attributten
Lav en print metode der printer lønnen ud

Lav en class kaldet Doctor med samme attributter og metoder som HospitalWorker + følgende attributter:
  speciality - en string der beskriver speciallet en doktor har

Lav en constructor der sætter alle attributterne
Overskriv print metoden så den også printer speciality ud
Lav en metode der hedder treatPatient() som intet returnere og som tager ingen argumenter
Metoden skal printe "Behandler patient"

Lav en class kaldet Nurse med samme attributter og metoder som HospitalWorker + følgende attributter:
  bloodSamples - en boolean der beskriver om sygeplejsken må tage blodprøver


Lav en constructor der sætter alle attributterne
Overskriv print metoden så den også printer bloodmsamples ud
Ude i main lav et array med 3 pladser af typen HospitalWorker
Gør så hver plads i arrayet indeholder en instans af de 3 klasser
Kald print metoden på alle pladserne i arrayet
 */


//OPG 16,1
/*
Opgave 16.1
Lav en int array med 3 pladser og fyld dem med noget tilfældigt data
Få et brugerinput som en double men cast herefter det tal han skriver ind til en int og gem det i en variable
Brug denne variable til at printe det tal der står på inputtet index
Eksempelvis arrayet indeholder [5,9,15] bruger indtaster:
1.95
printer "9"
0.11
printer "5"
 */

//OPG 16,2
/*
Opgave 16.2
Gå tilbage til 16.0 og ændre i mainen. Når vi loopet hen over alle 3 pladser i arrayet så check om en af dem er en instans af Doctor,
 hvis den er det så cast den til en Doctor og kald treatPatient metoden
 */

//OPG 16,3

/*
Opgave 16.3:
Lav en class kaldet Shape, klassen skal være abstrakt
Klassen skal have en abstrakt metode som hedder getArea som returnere en double men tager ikke imod nogle argumenter

Lav en ny class kaldet Circle, klassen skal have følgende attributter og skal nedarver fra Shape:
  double radius;

Lav en constructor der sætter attributten

Implementere metoden getArea til at returnere cirklens areal

Lav en ny class kaldet Square som nedarver fra Shape med følgende attributter:
  double length;
  double height;

Lav en constructor der sætter alle attributterne

Implementere metoden getArea til at returnere firkantens areal

Test getArea i din main klasse
 */