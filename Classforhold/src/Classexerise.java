public class Classexerise {
    public static void main(String[] args) {
        Motor myMotor = new Motor("V8",2);
        Car myCar = new Car(myMotor, "Grøn");
        myCar.Print();
        Elevator myElevator = new Elevator(1 );
        myElevator.Print();
        myElevator.setPeople(6);
        myElevator.Print();
        Person myPerson = new Person();
        myPerson.setage(15).setName("Lars");
        myPerson.Print();
    }

}


//OPG 13.0
/*
Opgave 13.0:
Lav en class Motor med følgende attributter:
  model - en string der beksriver hvilken model motoren har
  horsePower - en int der beskriver hvor mange hestekræfter den har

Lav en constructor der
Inde i klassen så lav en metode kaldet print - bestem selv retur typen og om den skal have nogle argumenter:
i print metoden skal du printe attributterne ud


Lav en class Car med følgende attributter:
  motor - med typen Motor som beskriver hvilken motor der er i bilen
  color - en string der beskriver farven på bilen

Lav en constructor der sætter attributterne(Skal constructoren have en eller to argumenter?)

Lav en print metode i Car klassen der printer color ud og alle attributterne ud i motoren

Lav en instans af Car i main
kald print metoden på din nye Car instans/objekt

Er forholdet mellem de to klasser et composition(ejer) forhold eller er det et aggregation(har et) forhold?
 */