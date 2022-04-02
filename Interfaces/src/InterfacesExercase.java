public class InterfacesExercase {
    public static void main(String[] args) {
    Printable paperPrinter = new PaperPrinter();
    Printable consolePrinter = new ConsolePrinter();
    paperPrinter.print("Dav");
    consolePrinter.print("Hej");
    Bank danskebank = new DanskeBank();
    Bank nordea = new Nordea();
        System.out.println(danskebank.interestRate());
        System.out.println(nordea.interestRate());
    }
}


//Opgave 17.0
//
//Lav et interface kaldet Printable med en metode defintion kaldet print der returnere ingenting og tager et string argument
//Lav en class kaldet ConsolePrinter som skal implementere Printable - print metoden skal printe "console: <argument>" hvor du bytter <argument> ud med argumentet
//Lav en class kaldet PaperPrinter som skal implementere Printable - print metoden skal printe "paper: <argument>" hvor du bytter <argument> ud med argumentet
//Opret begge klasser men med Printable som defintion type(eg Printable paper = ...)