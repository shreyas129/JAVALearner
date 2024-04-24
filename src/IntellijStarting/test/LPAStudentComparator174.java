package IntellijStarting.test;

import java.util.Comparator;

public class LPAStudentComparator174 implements Comparator<LPAStudent174> {
    @Override
    public int compare(LPAStudent174 o1, LPAStudent174 o2) {
        return (int) (o1.getPercentComplete() - o2.getPercentComplete());
    }
}
