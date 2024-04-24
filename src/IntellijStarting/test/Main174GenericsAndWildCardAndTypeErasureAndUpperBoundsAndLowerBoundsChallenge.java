package IntellijStarting.test;

import java.util.Comparator;
import java.util.List;

public class Main174GenericsAndWildCardAndTypeErasureAndUpperBoundsAndLowerBoundsChallenge {
    public static void main(String[] args) {
        QueryList174<LPAStudent174> queryList = new QueryList174<>();
        for(int i=0;i<25;i++){
            queryList.add(new LPAStudent174());
        }
        System.out.println("Ordered");
        queryList.sort(Comparator.naturalOrder());

        printList(queryList);

        System.out.println("Matches");
        var matches = queryList.getMatches("PercentComplete", "50").getMatches("Course", "Python");
        matches.sort(new LPAStudentComparator174());
        printList(matches);

        System.out.println("Ordered");
        matches.sort(null);
        printList(matches);
    }

    public static void printList(List<?> students){
        for(var student:students){
            System.out.println(student);
        }
    }
}
