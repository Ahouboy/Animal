package Animals;

/**
 * Write a description of class Hippo here.
 *
 * @author Phil
 * @version 2017.03.27
 */
public class Hippo extends Animal implements Swimable {
    private int swim_limit;

    public Hippo(String name) {
        this.name = name;
        this.run_limit = 50;
        swim_limit = 200;
    }

    String voice() {
        return "uf-uf-uf";
    }

    @Override
    public boolean swim(float length) {
        return swim_limit >= length;
    }
}