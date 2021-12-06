package ro.fasttrackit.curs10.abstractClasses;

public class Main {
    public static void main(String[] args) {
        DataPrinter printer = new NameDataPrinter();
        printer.printDate();

        new FileDataPrinter().printDate();
    }
}
