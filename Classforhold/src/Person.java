public class Person {
    String name;
    int age;


    public Person setage(int age) {
        this.age = age;
        return this;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public void Print() {
    System.out.println("Person info");
    System.out.println(name);
    System.out.println(age);
    }
}
