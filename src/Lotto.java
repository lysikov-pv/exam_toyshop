import java.util.ArrayList;
import java.util.Random;

public class Lotto {
    ArrayList<Toy> toys;
    public static Random random = new Random();

    public Lotto() {
        toys = new ArrayList<>();
    }

    public void put (Toy toy) {
        toys.add(toy);
    }

    public String getToysQty() {
        StringBuilder toysQty = new StringBuilder("\nОстаток:\n");
        for (Toy toy : toys) {
            toysQty.append(String.format("%s: %s\n",
                    toy.name,
                    toy.qty));
        }
        toysQty.append("\n");
        return toysQty.toString();
    }

    private Toy randomToy() {
        ArrayList<Integer> lottoDrum = new ArrayList();
        for (Toy toy : toys) {
            for (int i = 0; i < toy.qty; i++) lottoDrum.add(toy.id);
        }
        try {
            int randomId = lottoDrum.get(random.nextInt(lottoDrum.size()));
            for (Toy toy : toys) {
                if (toy.id == randomId) {
                    return toy;
                }
            }
        } catch (Exception e) {
        }
        return null;
    }

    public Toy get() {
       Toy toy = randomToy();
       if (toy != null) {
           toy.qty -= 1;
       }
       return toy;
    }
}
