package Obtacles;

import Animals.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Phil on 27.03.17.
 * Класс-контейнер для препятствий
 */
public class Course {
    public ArrayList<Obtacle> obtacles;

    public Course(float length, int numWalls, int numPools) {
        /**
         * Полоса препятствий генерируется следующим образом:
         * трек-стена/пруд-трек-стена/пруд-трек
         */
        float trackLength = length / (float) (numWalls + numPools * 2 + 1);
//        System.out.println(trackLength);
        int numGeneredWalls = 0;
        int numGeneredPools = 0;
        Random random = new Random();
        obtacles = new ArrayList<>();
        obtacles.add(new Track(trackLength));
        for (int i = 0; i < (numPools + numWalls); i++) {
            if ((numWalls - numGeneredWalls) > 0 && (numPools - numGeneredPools) > 0) {
                if (random.nextInt(1) == 0) {
                    obtacles.add(new Wall(2f + random.nextFloat()));
                    numGeneredWalls++;
                } else {
                    obtacles.add(new Pool(trackLength));
                    numGeneredPools++;
                }
            } else if ((numWalls - numGeneredWalls) > 0) {
                obtacles.add(new Wall(2f + random.nextFloat()));
                numGeneredWalls++;
            } else {
                obtacles.add(new Pool(trackLength));
                numGeneredPools++;
            }
            obtacles.add(new Track(trackLength));
        }//end for
    }

    public void doIt(Team team) {
        /**
         * Как команда преодалевает полосу?
         * Простейший вариант - каждый участник проходит всю полосу, результат пишется в массив строк.
         * Можно придумать что-нибудь похитрее, но мне лень)
         * Алогитм:
         * берем участников по порядку и прогоняем по всей полосе
         */
        team.log.add(String.format("Команда %s начинает прохождение полосы препятствий.", team.name));
        for (Animal animal: team.members) {
            team.log.add(String.format("Результаты участника %s:", animal));
            for (Obtacle obtacle: this.obtacles) {
                team.log.add(String.format("Проход препятствия %s: %s", obtacle, obtacle.doIt(animal)));
            }
        }
        team.log.add(String.format("Команда %s заканчивает прохождение полосы препятствий.", team.name));
    }
}
