package phonebook;

import java.util.ArrayList;

public class Entry extends ArrayList<Entry> {
    private String name;
    private String phone;

    public Entry(String name, String phone) {
        setName(name);
        setPhone(phone);

    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setPhone(String phone) {
            this.phone = phone;
    }

    public String toString() {
        return name + " " + phone;
    }
}

