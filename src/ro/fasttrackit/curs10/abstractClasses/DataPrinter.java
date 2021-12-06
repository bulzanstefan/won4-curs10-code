package ro.fasttrackit.curs10.abstractClasses;

public abstract class DataPrinter {

    public void printDate() {
        String[] data = getDataFromSource();

        for (String line : data) {
            System.out.println("----" + line);
        }
    }

    public abstract String[] getDataFromSource();

}
