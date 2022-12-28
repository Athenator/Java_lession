import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

public class seminar {
    public static List<String> fillNames() {
        List<String> planets = new ArrayList<String>();
        Random rand = new Random();
        String[] planetsNames = new String[] { "Венера", "Земля", "Юпитер", "Меркурий", "Плутон", "Уран", "Сатурн",
                "Нептун" };
        for (int i = 0; i < 10; i++) {
            planets.add(planetsNames[rand.nextInt(8)]);
        }

        return planets;
    }

    public static void countRepeatsNames(List<String> planets) {
        int count = 1;
        for (int i = 0; i < planets.size() - 1; i++) {
            if (planets.get(i).equals(planets.get(i + 1))) {
                count++;
            } else {
                System.out.printf("%s Повторяется= %d раз(a)\n", planets.get(i), count);
                count = 1;
            }
        }
        System.out.printf("%s Повторяется= %d раз(a)\n", planets.get(planets.size() - 1), count);

    }

    public static void main(String[] args) {
        List<String> planets = fillNames();

        System.out.println(planets);
        planets.sort(null);

        countRepeatsNames(planets);
    }
}