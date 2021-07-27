package hw2_03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<String, ArrayList> phoneBook = new HashMap<>();

    public void add(String name, ArrayList arrayList) {
        ArrayList<String> aList = new ArrayList<>();

        aList.addAll(arrayList);
        phoneBook.putIfAbsent(name, aList);
    }

    public ArrayList get(String name) {
        return phoneBook.get(name);
    }
}
