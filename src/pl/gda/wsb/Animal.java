package pl.gda.wsb;

public class Animal {
    final String species;
    String name;
    double weight;

    public static final Double DEFAULT_DOG_WEIGHT = 25.0;
    public static final Double DEFAULT_COW_WEIGHT = 300.0;
    public static final Double DEFAULT_WEIGHT = 2.0;

    public Animal(String species, String name, double weight) {
        this.species =species;
        this.name =name;
        this.weight =weight;

        if(species.equals("dog"))

    {
        this.weight = DEFAULT_DOG_WEIGHT;
    } else if(species.equals("cow"))

    {
        this.weight = DEFAULT_COW_WEIGHT;
    }

}
        void feed(){
                weight++;
        }
        void takeForAWalk(){
        weight++;
        }

    }
}


