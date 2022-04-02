import java.util.Scanner;

public class Stringsexe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String s1 = "test1";
        String s2 = "test2";
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("de to strings er ens");
        }
        if (input.length() > 15) {
            System.out.println("det er en lang linje");
        } else if (input.length() > 5 && input.length() <= 15) {
            System.out.println("Det er en mellemlang linje");
        } else {
            System.out.println("Det er en kort linje");
        }
        input = scanner.nextLine();
        if (input.equals("Rasmus0506")) {
            System.out.println("det er mit navn");
        } else {
            System.out.println("Hej med dig");
        }
        opg12_3();
    }

    public static void opg12_3() {
        Scanner scanner = new Scanner(System.in);
        String answer = "Bil";
        while (true) {
            System.out.println("Indtast dit gæt");
            String guess = scanner.nextLine();
            if (answer.equalsIgnoreCase(guess)) {
                System.out.println("Du gættede det");
            break;
            }
        }


    }
}


//OPG 12.0
/*
Opgave 12.0
Definere en variable s1 og initilisere den til "test"
Definere en anden variable s2 og initilisere den til "test2"

Check om s2 indeholder s1
 */

//OPG 12.1
/*
Opgave 12.1
Få et brugerinput via scanner.nextLine() (returnere en string fra scanneren) og gem det i en variable kaldet input
Hvis længden af input er større end 15 så print "Det er en lang linje"
Ellers hvis længden af input er større end 5 men mindre end 15 så print ud "Det er en mellemlang linje" (husk else if!)
I alle andre tilfælde så print ud "Det er en kort linje"
 */

//OPG 12.2

/*
Opgave 12.2
Få et brugerinput via scanner.nextLine() og overskriv variablen fra 12.1(input = scanner.nextLine())
Hvis inputtet er det samme som dit ingame navn så print ud "Det er mit navn!"
Ellers så print ud "Hej med dig"
 */

//OPG 12.3
/*
Opgave 12.3 guessing game
Definere en variable kaldet answer og sæt den til et ord du selv bestemmer
Spørg brugeren efter input og gem det i en variable kaldet guess
Bliv ved med at spørger brugeren efter inputs indtil at han gætter ordet
 */