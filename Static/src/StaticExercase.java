public class StaticExercase {
    public static void main(String[] args) {
    Plane p1 = new Plane("SAS", 4, 2, 5, 152);
    Plane p2 = new Plane("SAS", 4, 2, 3, 157);
    p1.takeoff();
    Plane.printSharedPlaneInfo();
    }

    public void mainRun() {
        //din kode her
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