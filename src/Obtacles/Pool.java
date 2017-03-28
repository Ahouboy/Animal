package Obtacles;

import Animals.*;
/**
 * Created by Phil    public boolean doIt(Animal animal){
 if (animal instanceof Jumpable)
 return ((Jumpable) animal).jump(height);
 else
 return false;

 }
 on 27.03.17.
 */
public class Pool extends Obtacle {

    public Pool(float length) {
        this.length = length;
        this.height = 0;
    }

    public boolean doIt(Animal animal){
        if (animal instanceof Swimable)
            return ((Swimable) animal).swim(height);
        else
            return false;

    }

    @Override
    public String toString() {
        return "пруд длиной " + length + "m.";
    }
}
