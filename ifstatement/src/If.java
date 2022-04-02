import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = 25;

        int input = scanner.nextInt();
        boolean inputCheck = input == 0;
        if (inputCheck) {
            System.out.println("Du kan ikke dividere med 0");
        } else {
            System.out.println(z / input);
        }

    }
}


/*
OPG 4.0

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        boolean xcheck =  x < 10;
        boolean acheck =  x <0;
        boolean bcheck =   x > 100;
        if (xcheck) {
            System.out.println("X er et lille tal");
        }
        if (acheck) {
            System.out.println("X er et minus tal");
        }
        if (bcheck) {
            System.out.println("X er et stort tal");
        }
        System.out.println("");
    }
}

 */

/*
OPG 4.1

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 100) {
            System.out.println("Du burde være død");
        } else if (age > 60) {
            System.out.println("Tid til pension");
        } else if (age > 18) {
            System.out.println("Nu du voksen");
        } else {
            System.out.println("Du er stadig et barn");
        }

        System.out.println("");
    }
}

 */

/*
OPG 4.2

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        boolean xcheck = x < 10;
        boolean acheck = x < -0;
        boolean bcheck = x > 100;
        if (acheck) {
            System.out.println("X er et minus tal");
        } else if (xcheck) {
            System.out.println("X er et lille tal");
        } else if (bcheck) {
            System.out.println("X er et stort tal");
        }
        System.out.println("");
    }
}

 */

/*
OPG 4.3

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int z = 25;

        int input = scanner.nextInt();
        boolean inputCheck = input == 0;
        if (inputCheck) {
            System.out.println("Du kan ikke dividere med 0");
        } else {
            System.out.println(z / input);
        }

    }
}

 */