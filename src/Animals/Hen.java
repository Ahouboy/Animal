package Animals;

/**
 * Write a description of class Hen here.
 *
 * @author Phil
 * @version 2017.03.27
 */
public class Hen extends Animal implements Jumpable {
    private float jump_limit;

    public Hen(String name) {
        this.name = name;
        this.run_limit = 100;
        jump_limit = 10f;
    }

    String voice() {
        return "ko-ko-ko";
    }

    @Override
    public boolean jump(float height) {
        return jump_limit >= height;
    }
}