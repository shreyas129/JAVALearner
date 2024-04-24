package IntellijStarting;

import java.util.ArrayList;
import java.util.List;

public class MainGenericsExtras171 {
    public static void main(String[] args) {
        int studentCount = 10;
        List<Student171>students=new ArrayList<>();
        for(int i=0;i<studentCount;i++){
            students.add(new Student171());
        }
        students.add(new LPAStudent171());
        printList(students);

        List<LPAStudent171>LPAStudents=new ArrayList<>();
        for(int i=0;i<studentCount;i++){
            LPAStudents.add(new LPAStudent171());
        }
        printList(LPAStudents);
    }

    public static void printList(List students){
        for(var student:students){
            System.out.println(student);
        }
        System.out.println();
    }
}
