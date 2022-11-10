package phonebook;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Entry firstEntry = new Entry("Ivan Franko", new ArrayList<String>(), "+3805446568", "+3802342348");
        Entry secondEntry = new Entry("Ivan Mazepa", new ArrayList<String>(), "+3804634573");
        Entry thirdEntry = new Entry("Mykhailo Hrushevsky", new ArrayList<String>(), "+3808743424", "+380973456745");
        Entry fourthEntry = new Entry("Ivan Franko", new ArrayList<String>(), "+3805738467", "+380674836521", "+3805773455");

        HashMap<ArrayList<String>, String> personal = new HashMap<>();
        TelephoneDirectory directory = new TelephoneDirectory(personal);

        directory.add(directory, firstEntry);
        directory.add(directory, secondEntry);
        directory.add(directory, thirdEntry);
        directory.add(directory, fourthEntry);


        System.out.println(directory.find(directory, firstEntry));

        ArrayList<String> arrayList = directory.findAll(directory, firstEntry);

        for (String arr : arrayList) {
            System.out.println(arr);
        }
    }
}
