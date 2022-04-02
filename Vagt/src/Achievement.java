public class Achievement {
    private String name;
    private int salaryincrease;
    String date;


    public Achievement(String name, int salaryincrease, String date){
    this.name = name;
    this.salaryincrease = salaryincrease;
    this.date = date;
    }
    public void print(){
        System.out.println(name);
        System.out.println(salaryincrease);
        System.out.println(date);
    }
}
