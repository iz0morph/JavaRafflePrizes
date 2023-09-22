import java.io.Serializable;

public class Toy implements Comparable<Toy>, Serializable {
    private int id;
    private String name;
    private int dropChance;

    public Toy(int id, String name, int dropChance) {
        this.id=id;
        this.name = name;
        this.dropChance = dropChance;
    }

    public void setDropChance(int chance) {
        this.dropChance = chance;
    }

    public int getDropChance() {
        return dropChance;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Toy toy) {
        if (toy.getDropChance() == this.getDropChance()) return 0;
        return this.getDropChance() < toy.getDropChance() ? 1 : -1;
    }

    @Override
    public String toString() {
        return "Toy{" + "name='" + name + '\'' + '}';
    }

    public String getName() {
        return name;
    }
}
