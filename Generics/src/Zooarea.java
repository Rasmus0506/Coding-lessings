public class Zooarea<T extends Animal> {
    private T animal;

    public Zooarea(T animal) {
        this.animal = animal;
    }
    public void visit() {
        System.out.println("Du besøger nu et sted med" + animal.animalname());
    }
}
