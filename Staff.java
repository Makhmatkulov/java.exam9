public class Staff extends Person{
    @Override
    void person(String name, String address) {
        System.out.println(name + address);
    }

    @Override
    void getName(String name) {
        System.out.println(address);
    }

    @Override
    void   getAddress(String address) {
        System.out.println(address);
    }
    String school = "International university";
    double pay = 4000;

    public static void main(String[] args) {
        Staff staff = new Staff();
        Staff staff1 = new Staff();
        staff.person("Sherzod","Toshkent, Bobur st.");
        staff.getName("Sherzod");
        staff.getAddress("Toshkent, Bobur st.");
        System.out.println(staff.school);
        System.out.println(staff.pay);
        System.out.println();
        staff1.person("Anvar","Toshkent, Bobur st.");
        staff1.getName("Sherzod");
        staff1.getAddress("Toshkent, Bobur st.");
        System.out.println(staff1.school);
        System.out.println(staff1.pay);
    }
}
