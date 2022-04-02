public class Car {
    double topspeed;
    double kmdrive;
    int passenger;

    public void Print() {
        System.out.println("Bil info");
        System.out.println("topspeed " + topspeed);
        System.out.println("kmdrive " + kmdrive);
        System.out.println("passenger " + passenger);
    }
     public Car(int top, int km,int pass) {
            topspeed = top;
            kmdrive = km;
            passenger = pass;
        }




}
