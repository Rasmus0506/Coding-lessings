import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionsExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int I = scanner.nextInt();
        int E = scanner.nextInt();


        List<Integer> integerList = new ArrayList<>();
        integerList.add(I);
        integerList.add(E);
        for (Integer integer : integerList) {
            System.out.println(integer);
        }

    }
}
