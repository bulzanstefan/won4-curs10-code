package ro.fasttrackit.curs10.abstractClasses;

public class NameDataPrinter extends DataPrinter {
    @Override
    public String[] getDataFromSource() {
        return new String[]{
                "Ana",
                "Bogdan",
                "Laura",
                "Mircea",
                "Dragos"
        };

    }
}
