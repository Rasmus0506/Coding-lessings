import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        int x;
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Indtast et tal");
             x = scanner.nextInt();
        }
        System.out.println(x);
    }
}







/*
OPG 7.1

public class Scope {
    public static void main(String[] args) {
        {
            int x = 25;
            System.out.println(x);
        }

        int x = 20;
        System.out.println(x);

        {
            int y = 31;
        }
        System.out.println(y);
    }
}

 */