package home;

import java.lang.reflect.Array;
import java.util.*;

public class first {
    public static void main(String[] args) {
        String str = "Россия идет вперед всей планеты. Планета - это не Россия.";
        System.out.println("Изначальный текст: " + str);
        str = str.replaceAll("[^A-Za-zА-Яа-я0-9]", " ");
        str = str.toLowerCase();
        String[] words = str.split(" ");
        HashMap<String, Integer> wordToCount = new HashMap<>();
        for (String word : words) {
            if (!wordToCount.containsKey(word)) {
                wordToCount.put(word, 0);
            }
            wordToCount.put(word, wordToCount.get(word) + 1);
        }

        for (String word : wordToCount.keySet()) {
            if (word != "") {
                System.out.println("Слово: " + word + " - входит " + wordToCount.get(word) + " раз");
            }
        }

        Scanner scanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите слово, вхождения которого хотите проверить: ");
        String searchWord = scanner.nextLine();
        searchWord = searchWord.toLowerCase();
        if (wordToCount.containsKey(searchWord)) {
            System.out.println("Ваше слово: '" + searchWord + "' - входит в список.");
        }else{
            System.out.println("Вашего слова нету в списке!");
        }
        scanner.close();
    }
}
