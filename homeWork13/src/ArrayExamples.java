import phonebook.Entry;

import java.util.*;

public class ArrayExamples {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "pineapple", "banana", "apricot",
                "apricot", "broccoli", "carrot", "cherry", "garlic",
                "garlic", "melon", "leak", "kiwi", "mango",
                "mushroom", "pineapple", "orange", "pineapple", "peanut",
                "orange", "pepper", "pineapple", "pumpkin", "peanut"};

        ArrayList<String> arrayString = new ArrayList<>(List.of(words));
        System.out.println(countOccurrence(arrayString, "apricot"));


        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }

        List<Integer> list = toList(arrayList);


        ArrayList<Integer> intArray = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            intArray.add(5);
            intArray.add(3);
            intArray.add(2);
        }

        findUnique(intArray);


        calcOccurrence(arrayString);

        HashMap<String, Integer> map = findOccurrence(arrayString);

        for (Map.Entry arr : map.entrySet()) {
            System.out.println("name " + arr.getKey() + ", occurrence: " + arr.getValue());
        }
    }

    public static int countOccurrence(ArrayList<String> stringArray, String str) {
        int count = 0;

        for (String arr : stringArray) {
            if (arr.equals(str)) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> toList(ArrayList<Integer> intArray) {
        return intArray.stream().toList();
    }

    public static ArrayList<Integer> findUnique(ArrayList<Integer> intArray) {
        ArrayList<Integer> array = new ArrayList<>();

        for (Integer arr : intArray) {
            if (!(array.contains(arr))) {
                array.add(arr);
            }
        }

        return array;
    }

    public static void calcOccurrence(ArrayList<String> stringArray) {
        Set<String> set = new LinkedHashSet<>(stringArray);

        for (String arr : set) {
            int count = 0;

            for (int i = 0; i < stringArray.size(); i++) {

                if (stringArray.get(i).equals(arr)) {
                    count++;
                }
            }
            System.out.println(arr + ": " + count);
        }
    }

    public static HashMap<String, Integer> findOccurrence(ArrayList<String> stringArray) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < stringArray.size(); i++) {
            map.put(stringArray.get(i), Collections.frequency(stringArray, stringArray.get(i)));
        }

        return map;
    }
}
