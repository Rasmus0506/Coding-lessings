public class EncapsulationExercise {
    public static void main(String[] args) {
        Human a = new Human("Lars", 1151, 22);
        a.setname("per");
        a.setAge(25);
        System.out.println(a.getname());
        System.out.println(a.getAge());
        System.out.println(a.getCpr());
    }
}

//OPG 14.0
/*
Opgave 14.0
Lav en class Human med følgende attributter:
name - en string der beskriver navnet på personen
cpr - en int der beskriver personens cpr nummer
age - en int der beskriver alderen på personen
lav en constructor der sætter alle attributterne

Lav getter metoder for alle attributterne
Lav setter metoder for de attributter hvor det giver mening at gøre det

Test dine metoder i main.
 */