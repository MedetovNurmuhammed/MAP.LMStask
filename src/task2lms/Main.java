package task2lms;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        City city1 = new City(1, "Бишкек");
        City city2 = new City(2, "Москва");
        City city3 = new City(3, "Берлин");
        City city4 = new City(4, "Франкфурт");
        City city5 = new City(5, "Бремен");
        City city6 = new City(6, "Каракол");
        LinkedList<City> linkedList = new LinkedList<>(List.of(city1, city2, city3, city4, city5, city6));
        System.out.println(linkedList);

        Set<City> treesetjup = new TreeSet<>();
        Set<City> treesettak = new TreeSet<>();

        for (City city : linkedList) {
            if (city.getCode() % 2 == 0) {
                treesetjup.add(city);
            } else {
                treesettak.add(city);
            }
        }

        System.out.println("Жуптар:" + treesetjup);
        System.out.println("Так:" + treesettak);
    }
}
