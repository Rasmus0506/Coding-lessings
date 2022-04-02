
public class ConsolePrinter implements Printable {

    @Override
    public void print(String print) {
        System.out.println("console: " + print);

    }
}



//Lav en class kaldet PaperPrinter som skal implementere Printable - print metoden skal printe "paper: <argument>" hvor du bytter <argument> ud med argumentet