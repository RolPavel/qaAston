package lesson_13;

import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи
    public void add(String name, String phoneNumber) {
        phoneBook.putIfAbsent(name, new ArrayList<>());
        phoneBook.get(name).add(phoneNumber);
    }

    // Метод для получения номеров по имени
    public List<String> get(String name) {
        return phoneBook.getOrDefault(name, Collections.emptyList());
    }
}
