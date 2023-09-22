import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SetId id = new SetId();

        Toy car = new Toy(id.setId(), "car", 20);
        Toy plane = new Toy(id.setId(), "plane", 40);
        Toy doll = new Toy(id.setId(), "doll", 30);
        RafflePrizes rafflePrizes = new RafflePrizes();
        rafflePrizes.addToy(car);
        rafflePrizes.addToy(plane);
        rafflePrizes.addToy(doll);
        rafflePrizes.getPrize();
        rafflePrizes.getPrize();
        rafflePrizes.getPrize();
        rafflePrizes.getPrize();

    }
}