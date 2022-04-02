public class Programmer extends Employee {
   private int bonus;

    public Programmer(int salory,String name, int bonus) {
        super(salory, name);
        this.bonus = bonus;
    }
    public void doProgramming() {
        System.out.println("hello world");
    }
    public void print() {
        super.print();
        System.out.println(bonus);
    }
}



//Opgave 15.0:

/*        Lav en class kaldet Employee med følgende attributter:
        salary - en int der beskriver lønnen på medarbejderen
        name - et navn på medarbejderen

        Lav en constructor der sætter alle attributterne

        Lav en metode der hedder print som printer attributterne

        Lav en class kaldet Programmer som arver fra Employee med følgende ekstra attributter:
        bonus - en int der beskriver en bonus programmøren får hvert år

        Lav en constructor der sætter alle attributterne

        Lav en metode som hedder doProgramming som printer ud "hello world" eller noget lignendne
        Overskriv print metoden fra employee som også skal printe bonusen ud

        Test nu begge klasser i main, kan du kalde doProgramming på din Employee? */