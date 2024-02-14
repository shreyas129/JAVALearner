package IntellijStarting;

public class Main91Object extends java.lang.Object {
    public static void main(String[] args) {
        Student1 max = new Student1("Max", 21);
        System.out.println(max);

        PrimarySchoolStudent shreyas = new PrimarySchoolStudent("Shreyas", 9, "Prashant");
        System.out.println(shreyas);
    }
}

class Student1 {
    private String name;
    private int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
//        return "Student1{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
        return name + " is " + age;
    }
}

class PrimarySchoolStudent extends Student1 {
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName + "'s kid, " + super.toString();
    }
}