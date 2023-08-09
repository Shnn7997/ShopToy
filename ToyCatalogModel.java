import java.util.*;

public class ToyCatalogModel {
    private PriorityQueue<Toy> toys;

    public ToyCatalogModel() {
        toys = new PriorityQueue<>(Comparator.comparingInt(Toy::getWeight));
    }

    public PriorityQueue<Toy> getToys() {
        return toys;
    }

    public void addToy(Toy toy) {
        toys.add(toy);
    }

    public void removeToy(int id) {
        toys.removeIf(toy -> toy.getId() == id);
    }

    public void editToy(int id, String newName, int newWeight) {
        for (Toy toy : toys) {
            if (toy.getId() == id) {
                toy.setName(newName);
                toy.setWeight(newWeight);
                return;
            }
        }
    }
}