public class Elevator {
    int people;

    public Elevator(int people) {
        this.people = people;
    }
    public void setPeople(int people) {
        this.people = people;
    }
    public void Print() {
        System.out.println("Elevator info");
        System.out.println("Der kan være " + people + " personer");
    }
}
