package lesson_13;

import java.util.*;

public class PhoneBook {
    private final Map<String, List<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }
    public void add(String name, String phoneNumber) {
        phoneBook.putIfAbsent(name, new ArrayList<>());
        phoneBook.get(name).add(phoneNumber);
    }
    public List<String> get(String name) {
        return phoneBook.getOrDefault(name, Collections.emptyList());
    }
}
