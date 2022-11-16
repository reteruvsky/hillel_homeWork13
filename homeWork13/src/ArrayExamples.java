import java.util.*;
import java.util.stream.Collectors;

public class ArrayExamples {

    public static void main(String[] args) {
        String[] words = {"apple", "orange", "pineapple", "banana", "apricot",
                "apricot", "broccoli", "carrot", "cherry", "garlic",
                "garlic", "melon", "leak", "kiwi", "mango",
                "mushroom", "pineapple", "orange", "pineapple", "peanut",
                "orange", "pepper", "pineapple", "pumpkin", "peanut"};

        ArrayList<String> arrayString = new ArrayList<>(List.of(words));
        System.out.println(countOccurrence(arrayString, "apricot"));


        Integer[] array = new Integer[10];

        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }

        ArrayList<Integer> arrayList = (ArrayList<Integer>) toList(array);

        for (Integer arr : arrayList) {
            System.out.println(arr);
        }


        ArrayList<Integer> intArray = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            intArray.add(5);
            intArray.add(3);
            intArray.add(2);
        }

        findUnique(intArray);


        calcOccurrence(arrayString);

        findOccurrence(arrayString);
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

    public static List<Integer> toList(Integer[] arr) {
        return Arrays.asList(arr);
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

    public static ArrayList<Occurance> findOccurrence(ArrayList<String> stringArray) {
        Set<String> set = new LinkedHashSet<>(stringArray);
        ArrayList<Occurance> objectArray = new ArrayList<>();

        for (String arr : set) {
            int sum = Collections.frequency(stringArray, arr);
            objectArray.add(new Occurance(arr, sum));
        }

        System.out.println(objectArray);

        return objectArray;
    }

}
