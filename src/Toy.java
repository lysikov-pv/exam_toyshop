public class Toy {
    public int id;
    public String name;
    public int qty;

    public Toy(int id, String name, int qty) {
        this.id = id;
        this.name = name;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return name;
    }
}
