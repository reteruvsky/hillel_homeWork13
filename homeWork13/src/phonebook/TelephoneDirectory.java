package phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TelephoneDirectory {
    private HashMap<ArrayList<String>, String> map;

    public TelephoneDirectory(HashMap<ArrayList<String>, String> map) {
        setMap(map);
    }

    public HashMap<ArrayList<String>, String> getMap() {
        return map;
    }

    public void setMap(HashMap<ArrayList<String>, String> map) {
        this.map = map;
    }

    public void add(TelephoneDirectory directory, Entry write) {
        directory.getMap().put(write.getArrayPhones(), write.getName());
    }

    public String find(TelephoneDirectory telephoneDirectory, Entry write) {
        String findWrite = null;

        for (Map.Entry arr : telephoneDirectory.map.entrySet()) {
            if (write.getName().equals(arr.getValue())) {
                findWrite = arr.getValue() + " - " + arr.getKey().toString();
                break;
            }
        }

        return findWrite;
    }

    public ArrayList<String> findAll(TelephoneDirectory telephoneDirectory, Entry write) {
        String findWrite = null;

        ArrayList<String> array = new ArrayList<>();

        for (Map.Entry arr : telephoneDirectory.getMap().entrySet()) {
            if (write.getName().equals(arr.getValue())) {
                findWrite = arr.getValue() + " - " + arr.getKey().toString();
                array.add(findWrite);
            }
        }

        return array.isEmpty() ? null : array;
    }
}
