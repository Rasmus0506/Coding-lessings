public class Human {
    private String name;
    private int cpr;
    private int age;

    public Human(String name, int cpr, int age) {
        this.age = age;
        this.name = name;
        this.cpr = cpr;
    }

    public String getname() {
        return name;
    }

    public int getCpr() {
        return cpr;
    }

    public int getAge() {
        return age;
    }
    public void setname(String n) {
    name = n;
    }

    public void setAge(int a) {
        age = a;
    }
}
