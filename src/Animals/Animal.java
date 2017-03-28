package Animals;

/**
 * Abstract class Animal - write a description of the class here
 *
 * @author Phil
 * @version 2017.03.27
 */
abstract public class Animal {
    public String name;
    protected float run_limit;

    abstract String voice();

    public boolean run(float length) {
        return run_limit >= length;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + " " + name;
    }
}
