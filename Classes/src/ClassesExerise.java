public class ClassesExerise {
    public static void main(String[] args) {

        Car myCar = new Car(0, 1, 2);

        System.out.println("Bil info");
        System.out.println("topspeed " + myCar.topspeed);
        System.out.println("kmdrive " + myCar.kmdrive);
        System.out.println("passenger " + myCar.passenger);

        System.out.println();

        myCar.Print();
        System.out.println();


        Circle myCircle = new Circle(11);


        System.out.println("Circle: " + myCircle.radius);


        System.out.println();
        myCircle.print();
        System.out.println();

        System.out.println();
        System.out.println("Diameter " + myCircle.diameter());

    }
}


//OPG 11.4 + 11.5 + 11.6
/*

Opgave 11.4:
Gå tilbage til opgave 11.2 eller 11.1 og lav en constructor der sætter attributterne
Brug nu constructoren i main i stedet for at sætte attributterne en efter en



Opgave 11.5:
Gå tilbage til opgave 11.0
Lav en constructor der sætter radius attributten
Lav en ny metode der hedder getDiameter som returnere diameteren af cirklen(diameteren udregnes som radius * 2)

I main definere en variable kaldet circleDiameter(bestem selv den rigtige type) og initilisere den til getDiameter metoden(noget ala double diameter = myCircle.getDiameter())
Print den nye variable i main metoden

Opgave 11.6(optional):
Lav en klasse kaldet Company som skal have følgende attributter:
  et int array med hvor meget de ansatte tjener
  en int der bestemmer hvor mange ansatte

Lav nu en constructor med følgende struktur:
public Company(int workers) {
  //Din kode her!
}

Sæt nu begge attributter i constructoren, arrayet skal have lige så mange pladser som der er ansatte. Alle ansatte har en løn på 20000
Lav en metode kaldet printSalary som printer lønnen ud på de ansatte der er
Opret en instans af Company i main og kald printSalary

 */