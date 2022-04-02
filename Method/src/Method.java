import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        printprofile(8, 9, 7701);
        System.out.println();
        double sum = divide5By2();
        double sum1 = divide(25.8, 6.0);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println();

        printprofile(2, 7, 6600);

        System.out.println();
        printprofile(4, 5, 4800);


    }
//Opgave 9.5(optional)
//Lav en metode der returnere int men som ikke tager nogle argumenter. Metoden hedder getUserInput.
//Inde i metoden skal i spørger brugeren efter et tal og derefter returnere det tal han skriver
//Test metoden i jeres main!
    public static double getUserInput() {
        Scanner scanner = new Scanner(System.in)

    }

    public static double divide(double f, double o) {
        return f / o;
    }


    public static double divide5By2() {
        return 5 / 2;
    }

    public static void printprofile(int id, int age, int postnr) {
        System.out.println("Profil");
        System.out.println("Id:" + id);
        System.out.println("Alder:" + age);
        System.out.println("Postnr:" + postnr);
    }

}




//Opgave 9.0:
/*
    Opgave 9.0:
Lav en metode som hedder printProfile, metoden skal printe følgende:
  Profil:
    Id: "<et tal id>"
    Alder: <en alder>
    Postnummer: <et postnummer>

byt de ting der står i <> ud med ting i selv bestemmer(men som giver mening)
Kald metoden 3 gange i jeres main

public class Method {
    public static void main(String[] args) {
        printprofile();
        System.out.println();
        double sum = divide5By2();
        System.out.println(sum);
        System.out.println();

        printprofile();

    }

    double sum = divide5By2();
    public static double divide5By2() {
        return 5 / 2;
    }

    public static void printprofile() {
        System.out.println("Profil");
        System.out.println("Id: 4");
        System.out.println("Alder: 20");
        System.out.println("Postnr: 4500");
    }

    }
     */

//Opgave 9.1:
/*
Opgave 9.1:
Lav en metode der returnere en int og som hedder divide5By2. Som metoden hedder skal i dividere 5 med 2 og returnere resultatet

Kald metoden i jeres main og print resultatet. Er det, det rigtige resultat, hvis ikke hvad kan i så ændre for at det er rigtigt


public class Method {
    public static void main(String[] args) {
        System.out.println();
        double sum = divide5By2();
        System.out.println(sum);
        System.out.println();
    }


    public static double divide5By2() {
        return 5 / 2.0;
    }
}

 */

//Opgave 9.2
/*
Opgave 9.2
Lav en metode der returnere void(ingenting) og som tager imod et int argument kaldet count
metoden hedder loopNumber og skal printe inputtet 10 count gange(eksempelvis hvis jeg kalder metoden med 5 som argument så skal den printe følgende):
  10
  10
  10
  10
  10


I main kald metoden 2 gange med forskellige tal som argumenter

public class Method {
    public static void main(String[] args) {
    loopNumber(2);
    }
    public static void loopNumber(int count) {
        for(int x = count; x > 0; x = x - 1 ) {
            System.out.println(10);

        }


    }
}

 */

//Opgave 9.3:
/*
Opgave 9.3:
Gå tilbaget til opgave 8.1 og ændre metoden til at tage imod 3 argumenter kaldet id, age og postalcode. Alle argumenter er int og metoden skal forsat returnere ingenting
Brug nu argumenterne i jeres print beskeder
Kald metoden igen i main


public class Method {
    public static void main(String[] args) {
        printprofile(8, 9, 7701);
        System.out.println();
        double sum = divide5By2();
        System.out.println(sum);
        System.out.println();

        printprofile(2, 7, 6600);

        System.out.println();
        printprofile(4, 5, 4800);



    }




    public static double divide5By2() {
        return 5 / 2;
    }

    public static void printprofile(int id, int age, int postnr) {
        System.out.println("Profil");
        System.out.println("Id:" + id);
        System.out.println("Alder:" + age);
        System.out.println("Postnr:" + postnr);
    }

}

 */

//Opgave 9.4:
/*
Opgave 9.4
Lav en metode der næsten er ens i forhold til opgave 9.1 metode men denne metode skal bare hedde divide.
Metoden skal tage imod 2 argumenter. Typerne af argumenterne og retur typen af metoden bestemmer i selv(må ikke returnere void!)
Metoden skal udregne hvad det ene argument dividerede med det andet argument giver og returnere resultatet
Test metoden i jeres main!

public class Method {
    public static void main(String[] args) {
        printprofile(8, 9, 7701);
        System.out.println();
        double sum = divide5By2();
        double sum1 = divide(25.8, 6.0);
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println();

        printprofile(2, 7, 6600);

        System.out.println();
        printprofile(4, 5, 4800);


    }

    public static double divide(double f, double o) {
        return f / o;
    }


    public static double divide5By2() {
        return 5 / 2;
    }

    public static void printprofile(int id, int age, int postnr) {
        System.out.println("Profil");
        System.out.println("Id:" + id);
        System.out.println("Alder:" + age);
        System.out.println("Postnr:" + postnr);
    }

}

 */

//Opgave 9.5:
/*
Opgave 9.5(optional)
Lav en metode der returnere int men som ikke tager nogle argumenter. Metoden hedder getUserInput.
Inde i metoden skal i spørger brugeren efter et tal og derefter returnere det tal han skriver
Test metoden i jeres main!
 */