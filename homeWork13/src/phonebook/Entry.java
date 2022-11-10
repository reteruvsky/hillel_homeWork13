package phonebook;

import java.util.ArrayList;

public class Entry {
    private String name;
    private ArrayList<String> arrayPhones;
    private String phone;

    public Entry(String name, ArrayList<String> arrayPhones, String... phone) {
        setName(name);
        setArrayPhones(arrayPhones);
        setPhone(phone);

    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public ArrayList<String> getArrayPhones() {
        return arrayPhones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setArrayPhones(ArrayList<String> arrayPhones) {
        this.arrayPhones = arrayPhones;
    }

    public void setPhone(String... phone) {
        for (String phones : phone) {
            this.phone = phones;
            arrayPhones.add(this.phone);
        }
    }
}

