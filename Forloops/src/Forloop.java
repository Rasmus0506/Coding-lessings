import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("indtast et tal");
        while (true) {
        int d = scanner.nextInt();
            if (d == 25) {
                break;
            }
            System.out.println(d);
        }
    }
}








/*
OPG 6.2 og 6.1

import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int x = 15; x > 0; x = x - 1 ) {
            System.out.println(x);
        }
        System.out.println("Indtast dit tal");
        for(int y = scanner.nextInt(); y > 0; y = y - 1) {
            System.out.println(y);
        }
    }
}

 */











/*
for (int i = 1; i <= 5; i++) {
  for (int j = 0;j < i;j++) {
    System.out.print(i);
  }
  System.out.println();
 */