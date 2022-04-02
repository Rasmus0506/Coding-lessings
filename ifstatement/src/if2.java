import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int houseNumber = scanner.nextInt();

        int windowCount = 6;
        System.out.println();
        if (houseNumber == 4 && windowCount > 6) {
            System.out.println("dette er det rigtige hus");


        } else {
            System.out.println("dette er det forkerte hus");
        }

    }
}


/*
OPG 8.2

Definere en variable houseNumber med typen int og initilisere den til et brugerinput
definere en variable windowCount med typen int og initilisere den til 8
hvis houseNumber er 4 og windowCount er større end 6 så print ud "Det her er det rigtige hus"
ellser så print "Det her er det forkerte hus"
Ændre på windowCount og få begge scenarier til at ske

import java.util.Scanner;

public class if2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int houseNumber = scanner.nextInt();

        int windowCount = 6;
        System.out.println();
        if (houseNumber == 4 && windowCount > 6) {
            System.out.println("dette er det rigtige hus");


        }else {
            System.out.println("dette er det forkerte hus");
        }

    }
}

 */