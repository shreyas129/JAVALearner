package IntellijStarting;

public class POJOStudent {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            RecordStudent shreyas = new RecordStudent("!1@2#3$4 " + i,
                    switch (i) {
                        case 1 -> "Shreyas";
                        case 2 -> "Pratik";
                        case 3 -> "Aaradhya";
                        case 4 -> "Prashant";
                        case 5 -> "Swapnaja";
                        default -> "Anonymous";
                    },
                    "12/9/2014", "Java grandMasterClass");
            System.out.println(shreyas);
        }

        Student pojoStudent = new Student("!2#3$5", "Shravani", "10/3/2010", "Java grandMasterClass");
        RecordStudent student = new RecordStudent("!2#3$5", "Browani", "10/3/2010", "Java grandMasterClass");

        System.out.println(pojoStudent);
        System.out.println(student);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
//        student.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(student.name() + " is taking " + student.classList());
    }
}
