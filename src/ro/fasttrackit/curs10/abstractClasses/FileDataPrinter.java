package ro.fasttrackit.curs10.abstractClasses;

public class FileDataPrinter extends  DataPrinter{
    @Override
    public String[] getDataFromSource() {
        System.out.println("Reading from file");
        return new String[]{
                "line1",
                "line2",
                "line3",
                "line4",
                "line5",
                "line6",
        };
    }
}
