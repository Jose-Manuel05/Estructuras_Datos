package org.example.Comparator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Prueba_mapas {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(12324, "Patricia");
        map.put(584993, "Manuel");
        map.put(3452, "Raúl");

        List<Map.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        for (Map.Entry<Integer, String> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
