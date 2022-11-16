public class Occurance {
    private String name;
    private int count;

    public Occurance(String name, int count) {
        setName(name);
        setCount(count);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public String toString() {
        return "{name: \"" + getName() + "\", occurrence: " + getCount() + "}";
    }
}
