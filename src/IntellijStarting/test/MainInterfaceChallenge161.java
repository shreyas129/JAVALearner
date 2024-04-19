package IntellijStarting.test;

import java.util.ArrayList;
import java.util.List;

public class MainInterfaceChallenge161 {
    public static void main(String[] args) {
        List<Mappable161> mappables = new ArrayList<>();
        mappables.add(new Building162("Sydney town hall", UsageType.GOVERNMENT));
        mappables.add(new Building162("Sydney opera house", UsageType.ENTERTAINMENT));
        mappables.add(new Building162("Stadium Australia", UsageType.SPORTS));

        mappables.add(new UtilityLine162("College St", UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine162("College St", UtilityType.FIBER_OPTIC));

        for (var m : mappables) {
            Mappable161.mapIt(m);
        }
    }
}
