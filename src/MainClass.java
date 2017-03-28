import Animals.*;
import Obtacles.*;

import java.util.ArrayList;

/**
 * Created by sbt-polonskiy-fv on 27.03.17.
 */
public class MainClass {
    public static void main(String[] args) {
//        Track track = new Track(10f);
//        Wall wall = new Wall(2f);
//        Pool poll = new Pool(9f);
//        ArrayList<Obtacle> list = new ArrayList<>();
//        list.add(new Track(10f));
        Course c = new Course(70f, 2, 2);  // Создаем полосу препятствий
        Team t1 = new Team("Peppers", 4);     // Создаем первую команду
        Team t2 = new Team("Beatles", 4);     // Создаем вторую команду
        t1.showMembers();
        t2.showMembers();
        c.doIt(t1);                  // Просим первую команду пройти полосу
        c.doIt(t2);                  // Просим вторую команду пройти полосу
        t1.showResults();            // Показываем результаты первой команды
        t2.showResults();            // Показываем результаты второй команды
    }
}
