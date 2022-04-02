public class PaperPrinter implements  Printable{

    public void print(String print) {
        System.out.println("paper: " + print);
    }
}


//Lav en class kaldet ConsolePrinter som skal implementere Printable - print metoden skal printe "console: <argument>" hvor du bytter <argument> ud med argumentet