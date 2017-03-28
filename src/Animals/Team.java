package Animals;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Phil on 27.03.17.
 * @author Phil
 * @version 2017.03.27
 */
public class Team {
    public ArrayList<Animal> members;
    public String name;
    public ArrayList<String> log;

    public Team(String name, int number) {
        /**
         * Конструктор команды генерирует number случайных животных
         * через switch:
         */
        this.name = name;
        log = new ArrayList<String>();
        members = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < number; i++) {
            int randomInt = random.nextInt(3);
            switch (randomInt) {
                case 0: members.add(new Cat("Koshak_" + i));
                break;
                case 1: members.add(new Hen("Utya_" + i));
                break;
                case 2: members.add(new Hippo("Potam_" + i));
                break;
            }
        }
    }

    public void showResults() {
        for (String s: log) {
            System.out.println(s);
        }
    }

    public void showMembers() {
        System.out.printf("Состав команды %s:%n", name);
        for (Animal animal: members) {
            System.out.println(animal);
        }
    }
}
