public class InheritanceExercies {
    public static void main(String[] args) {
    Employee employee = new Employee(154, "jens");
    employee.print();
    Programmer programmer = new Programmer(257, "hans", 27);
    programmer.print();
    programmer.doProgramming();
    }

}
