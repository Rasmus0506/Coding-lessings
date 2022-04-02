public class Circle extends Shape {
        private double radius;

        public Circle(double radius) {
                this.radius = radius;
        }

        public double getArea(){
                System.out.println(3.14 * radius * radius);
                return 3.14 * radius * radius;
        }

}

//Lav en ny class kaldet Circle, klassen skal have følgende attributter og skal nedarver fra Shape:
//  double radius;
//Implementere metoden getArea til at returnere cirklens areal(3.14 * radius * radius)
