public abstract class Person {
    String name;
    String address;
    abstract void person(String name, String address);
    abstract void getName(String name);
    abstract void getAddress(String address);
    public String toString() {
        return name + "," + address;
    }
}