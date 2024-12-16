package lesson_13;

import java.util.Map;

public class Info {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "grape", "apple", "orange", "kiwi", "kiwi"};

        Map<String, Integer> wordCounts = WordCounter.countWords(words);
        System.out.println("Уникальные слова: " + wordCounts.keySet());
        wordCounts.forEach((key, value) -> System.out.println("Слово '" + key + "' встречается " + value + " раз(а)."));

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иван Иванов", "123-456-7890");
        phoneBook.add("Иван Иванов", "098-765-4321");
        phoneBook.add("Мария Петрова", "111-222-3333");

        System.out.println("Номера Иван Иванов: " + phoneBook.get("Иван Иванов"));
        System.out.println("Номера Мария Петрова: " + phoneBook.get("Мария Петрова"));
        System.out.println("Номера Петр Сидоров: " + phoneBook.get("Петр Сидоров"));
    }
}
