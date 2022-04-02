public class Storage<T> {
    private T objekt;

    public Storage(T objekt) {
        this.objekt = objekt;
    }
    public void print() {
        System.out.println(objekt);
    }
}
