package IntellijStarting;

import java.util.ArrayList;
import java.util.List;

//record Employee173(String name) implements QueryItem173 {
//    @Override
//    public boolean matchField(String fieldName, String value) {
//        return false;
//    }
//}

public class MainGenericsExtras171 {
    public static void main(String[] args) {
        int studentCount = 10;
        List<Student171>students=new ArrayList<>();
        for(int i=0;i<studentCount;i++){
            students.add(new Student171());
        }
        students.add(new LPAStudent171());
//        printList(students);
        printMoreLists(students);

        List<LPAStudent171>lpaStudents=new ArrayList<>();
        for(int i=0;i<studentCount;i++){
            lpaStudents.add(new LPAStudent171());
        }
//        printList(lpaStudents);
        printMoreLists(lpaStudents);

        testList(new ArrayList<String>(List.of("Able", "Barry", "Charlie")));
        testList(new ArrayList<Integer>(List.of(1, 2, 3)));

        var queryList = new QueryList173<>(lpaStudents);
        var matches = queryList.getMatches("Course", "Python");
        printMoreLists(matches);

        var student2021 = QueryList173.getMatches(students, "YearStarted", "2021");
        printMoreLists(student2021);

//        QueryList173<Employee173> employeeList = new QueryList173<>();
    }

    public static void printMoreLists(List<? extends Student171> students){
        for(var student:students){
            System.out.println(student);
        }
        System.out.println();
    }

//    public static <T extends Student171> void printList(List<T> students){
//        for(var student:students){
//            System.out.println(student.getYearStarted()+": "+student);
//        }
//        System.out.println();
//    }

    public static void testList(List<?>list){
        for(var element:list){
            if(element instanceof String s){
                System.out.println("String: "+s.toUpperCase());
            } else if(element instanceof Integer i) {
                System.out.println("Integer: " +i.floatValue());
            }
        }
    }

//    public static void testList(List<String> list) {
//        for(var element:list) {
//            System.out.println("String: "+element.toUpperCase());
//        }
//    }
//
//    public static void testList(List<Integer> list) {
//        for(var element:list) {
//            System.out.println("Integer: "+element.floatValue());
//        }
//    }
}
