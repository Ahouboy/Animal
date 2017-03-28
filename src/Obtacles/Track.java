package Obtacles;

import Animals.*;
/**
 * Created by sbt-polonskiy-fv on 27.03.17.
 */
public class Track extends Obtacle {

    public Track(float length) {
        this.length = length;
        height = 0;
    }

    public boolean doIt(Animal animal) {
        return animal.run(length);
    }

    @Override
    public String toString() {
        return "дорожка длиной " + length + "м.";
    }
}
