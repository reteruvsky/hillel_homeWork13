package phonebook;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Entry firstEntry = new Entry("Ivan Franko", "+3805446568");
        Entry secondEntry = new Entry("Ivan Mazepa", "+3804634573");
        Entry thirdEntry = new Entry("Ivan Franko", "+3802342348");

        TelephoneDirectory telephoneDirectory = new TelephoneDirectory();

        telephoneDirectory.add(firstEntry);
        System.out.println();
        telephoneDirectory.add(secondEntry);
        System.out.println();
        telephoneDirectory.add(thirdEntry);

        System.out.println(telephoneDirectory.find(firstEntry));

        ArrayList<String> findArray = telephoneDirectory.findAll(firstEntry);

        for (String arr : findArray) {
            System.out.println(arr);
        }

    }
}
