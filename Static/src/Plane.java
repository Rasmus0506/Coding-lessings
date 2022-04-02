public class Plane {
    private String plane;
    private int wings;
    private int engines;
    private int crew;
    private int passengers;
    public static int planesCreated;
    public static int planesAired;

    public Plane(String plane, int wings, int engines, int crew, int passengers) {
        this.plane = plane;
        this.wings = wings;
        this.engines = engines;
        this.crew = crew;
        this.passengers = passengers;
        planesCreated++;
    }

    public void takeoff() {
        System.out.println("Flyet letter");
        planesAired++;
    }


    public static void printSharedPlaneInfo() {
        System.out.println(planesCreated);
        System.out.println(planesAired);
    }
}



//OPG 17:4
/*
Opgave 17.4

Lav en klasse kaldet Plane med et par ikke statiske attributter der beskriver flyet
Lav en constructor der sætter attributterne

Lav en metode der hedder takeOf som printer ud "flyet letter" - metoden er ikke statisk, returnere void og tager ingen argumenter
Lav en statisk attribut kaldet planesCreated som skal tælles op hver gang der laves et fly
Lav en statisk attribut kaldet planesAired som skal tælles op hver gang et fly letter

Lav en statisk metode kaldet printSharedPlaneInfo som returnere void og tager ingen argumenter.
Denne metode skal printe hvad de to statiske variable indeholder

Test din klasse i main, opret et par fly og se at planesCreated stiger (via printSharedPlaneInfo).
Prøv at kald takeOf et par gange på forskellige instanser af Plane og se at planesAired stiger(via printSharedPlaneInfo).
 */