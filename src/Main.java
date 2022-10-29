import java.util.HashMap;
import java.util.Map;

public class Main {
    //    Домашнее задание по теме «Коллекции HashSet и HashMap»
    static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> symbolCount = new HashMap<>();
// цикл подсчета повторений букв
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                if (symbolCount.containsKey(c)) {
                    int value = symbolCount.get(c);
                    value += 1;
                    symbolCount.replace(c, value);
                } else {
                    symbolCount.put(c, 1);
                }
            }
        }
        // найдем букву, встречающуюся максимальное число раз
        int maxCount = 0;
        char maxSymbol = 0;
        for (char key : symbolCount.keySet()) {
            int value = symbolCount.get(key);
            if (maxCount < value) {
                maxCount = value;
                maxSymbol = key;
            }
        }
        System.out.println("Чаще всего встречалась буква " + maxSymbol + " - " + maxCount + " раз");
        // найдем букву, которая реже всех встречалась
        int minCount = Integer.MAX_VALUE;
        char minSimbol = 0;
        for (char key : symbolCount.keySet()) {
            int value = symbolCount.get(key);
            if (minCount > value) {
                minCount = value;
                minSimbol = key;
            }
        }
        System.out.println("Реже всего встречалась буква " + minSimbol + " - " + minCount + " раз");
    }
}
