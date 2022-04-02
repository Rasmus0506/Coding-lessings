public class GenericsExercise {
    public static void main(String[] args) {
       Storage<String> storage = new Storage<>("Dav");
       storage.print();
       Storage<Integer>  storage1 = new Storage<>(5);
       storage1.print();
       Monkey monkey = new Monkey(5, 6);
       Giraf giraf = new Giraf(7, 4);
       Zooarea<Monkey> monkeyZooarea = new Zooarea<>(monkey);
       Zooarea<Giraf> girafZooarea = new Zooarea<>(giraf);
       monkeyZooarea.visit();
       girafZooarea.visit();


    }
}
