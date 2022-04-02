import java.util.Scanner;

public class Method2 {
    public static void main(String[] args) {
        printSpaces(6);
        printStar(5);
        System.out.println();
        printStair(30);

    }

    public static void printSpaces(int count) {
        for (int x = 0; x < count; x = x + 1) {
            System.out.print(" ");
        }
    }

    public static void printStar(int count) {
        for (int x = 0; x < count; x = x + 1) {
            System.out.print("*");
        }
    }

    public static void printStair(int count) {
        for (int x = 1; x <= count; x = x + 1) {
            int y = count - x;
            printSpaces(y);
            printStar(x);
            System.out.println();
        }
        printSpaces(3);
        printStar(1);
        System.out.println();
        printSpaces(2);
        printStar(2);
        System.out.println();
        printSpaces(1);
        printStar(3);
        System.out.println();
        printStar(4);

    }


}


//OPG methodes 2 (1)
/*
public class Method2 {
    public static void main(String[] args) {
    printSpaces(6);
    }
    public static void printSpaces(int count) {
       for(int x = 0; x < count; x = x + 1 ) {
           System.out.print(" ");
       }
    }


}

 */


//OPG methodes 2 (2)
