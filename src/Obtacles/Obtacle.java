package Obtacles;

import Animals.*;
/**
 * Created by Phil on 27.03.17.
 */
abstract public class Obtacle {
    public float length;
    public float height;

    abstract boolean doIt(Animal animal);

    @Override
    public String toString() {
        return this.getClass().getName() + " длиной " + length + "m.";
    }
}
