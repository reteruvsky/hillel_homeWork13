package phonebook;

import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {
    private final HashMap<String, List<Entry>> map = new HashMap<>();

    public void add(Entry write) {
        List<Entry> array = map.get(write.getName());
        if (array == null) {
            List<Entry> arr = new ArrayList<>();
            arr.add(write);
            map.put(write.getName(), arr);
        } else {
            System.out.println("Adding " + write.getName() + " to existing list");
            array.add(write);
        }

//        for(Map.Entry<String, List<Entry>> arr: map.entrySet()) {
//            System.out.println(arr.getKey() + " - " + arr.getValue());
//        }
    }

    public String find(Entry write) {
        String findWrite = null;

        for (Map.Entry<String, List<Entry>> arr : map.entrySet()) {
            if (write.getName().equals(arr.getKey())) {
                findWrite = arr.getKey() + " - " + arr.getValue();
                break;
            }
        }

        return findWrite;
    }

    public ArrayList<String> findAll(Entry write) {
        ArrayList<String> array = new ArrayList<>();
        //String findWrite = null;

        for (Map.Entry<String, List<Entry>> arr : map.entrySet()) {
            if (write.getName().equals(arr.getKey())) {
                array.add(arr.getValue() + " - " + arr.getKey());
            }
        }

        return array.isEmpty() ? null : array;
    }
}
