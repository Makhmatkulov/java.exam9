public class Student extends Person{
    @Override
    void person(String name, String address) {
        System.out.println(name + address);
    }

    @Override
    void getName(String name) {
        System.out.println(name);
    }

    @Override
    void getAddress(String address) {
        System.out.println(address);
    }
    String program = "Computer science";
    int year = 2;
    double fee = 1250;

    public static void main(String[] args) {
        Student student = new Student();
        Student student1 = new Student();
        student.person("Murod","Samarkand, Chinor st.");
        student.getName("Murod");
        student.getAddress("Samarkand, Chinor st.");
        System.out.println(student.program);
        System.out.println(student.year);
        System.out.println(student.fee);
        System.out.println();
        student1.person("Mansur","Samarkand, Chinor st.");
        student1.getName("Mansur");
        student1.getAddress("Samarkand, Chinor st.");
        System.out.println(student1.program);
        System.out.println(student1.year);
        System.out.println(student1.fee);
    }
}
