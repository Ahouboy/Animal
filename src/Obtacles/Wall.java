package Obtacles;

import Animals.*;

/**
 * Created by Phil on 27.03.17.
 */
public class Wall extends Obtacle {

    public Wall (float height) {
        this.height = height;
        length = 0;
    }

    public boolean doIt(Animal animal){
        if (animal instanceof Jumpable)
            return ((Jumpable) animal).jump(height);
        else
            return false;
    }

    @Override
    public String toString() {
        return "стенка высотой " + height + "m.";
    }
}
