import java.util.Scanner;

public class Lommeregner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while (true) {
           System.out.println("Vil du +(1), minus(2), gange(3), dividere(4) eller afslut programmet(0)");
           int s = scanner.nextInt();
           System.out.println();
           if (s == 0) {
               break;
           }
           System.out.println("Indtast et tal");
           double x = scanner.nextDouble();
           System.out.println("Indtast et andet tal");
           double y = scanner.nextDouble();
           if (s == 1) {
               System.out.println(x + y);
           } else if (s == 2) {
               System.out.println(x - y);
           } else if (s == 3) {
               System.out.println(x * y);
           } else if (s == 4) {
               if (y == 0) {
                   System.out.println("Du kan ikke dividere med 0");
               } else {
                   System.out.println(x / y);
               }
           }
       }
        System.out.println("programmet sluttes");
    }
}
