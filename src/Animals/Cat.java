package Animals;

/**
 * Write a description of class Cat here.
 *
 * @author Phil
 * @version 2017.03.27
 * Убрана возможность плавать, иб0 водобоязнь)
 */
public class Cat extends Animal implements Jumpable {
    private float jump_limit;

    public Cat(String name) {
        this.name = name;
        this.run_limit = 100;
        jump_limit = 3.8f;
    }

    String voice() {
        return "meow";
    }


    @Override
    public boolean jump(float height) {
        return jump_limit >= height;
    }
}
