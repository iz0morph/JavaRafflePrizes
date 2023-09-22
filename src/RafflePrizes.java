import java.io.IOException;
import java.util.PriorityQueue;

public class RafflePrizes {
    private PriorityQueue<Toy> toysQueue;
    private  Writable fh;

    public RafflePrizes() throws IOException {
        this.toysQueue = new PriorityQueue<>();
        this.fh = new FileHandler();
    }

    public void addToy(Toy toy){
        this.toysQueue.add(toy);
    }

    public PriorityQueue<Toy> getToysQueue() {
        return toysQueue;
    }

    public Toy getPrize() throws IOException {
        if (!this.toysQueue.isEmpty()){
            Toy prize = this.toysQueue.poll();
            this.fh.save(prize, "prizes.txt");
            System.out.printf("Вы выиграли: %s\n", prize.getName());
            return prize;
        }
        System.out.println("Все игрушки разыграны");
        return null;
    }
}
