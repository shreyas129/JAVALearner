package IntellijStarting.test;

public class Person {
    public static void main(String[] args) {

    }
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age < 0 || age > 100 ? 0 : age;
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
//        if (!firstName.isEmpty() && !lastName.isEmpty()) {
//            return firstName + " " + lastName;
//        }
//        else if (firstName.isEmpty() && lastName.isEmpty()) {
//            return "";
//        }
//        else if (firstName.isEmpty()) {
//            return lastName;
//        }
//        else {
//            return firstName;
//        }

//        return !firstName.isEmpty() && !lastName.isEmpty() ? firstName + " " + lastName : firstName.isEmpty() && lastName.isEmpty() ? "" : firstName.isEmpty() ? lastName : firstName;

//        if (firstName.isEmpty()) {
//            if (lastName.isEmpty()) {
//                return "";
//            }
//            else {
//                return lastName;
//            }
//        }
//        else if (lastName.isEmpty()){
//            return firstName;
//        }
//        else {
//            return firstName + " " + lastName;
//        }

        return firstName.isEmpty() ? lastName.isEmpty() ? "" : lastName : lastName.isEmpty() ? firstName : firstName + " " + lastName;
    }
}
