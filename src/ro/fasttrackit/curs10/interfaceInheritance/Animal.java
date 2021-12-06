package ro.fasttrackit.curs10.interfaceInheritance;

public interface Animal {
    String getName();
}

interface Mamifer extends Animal {
    int numarPui();
}

interface Peste extends Animal {
    int getViteza();
}

interface Balena extends Mamifer, Peste {
    int getKilogramePlancton();
}

interface Pet {
    String play();
}

class Delfin implements Mamifer, Peste, Pet {

    @Override
    public String getName() {
        return "Willy";
    }

    @Override
    public int numarPui() {
        return 0;
    }

    @Override
    public int getViteza() {
        return 0;
    }

    @Override
    public String play() {
        return null;
    }
}


