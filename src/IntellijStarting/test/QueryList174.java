package IntellijStarting.test;

import java.util.ArrayList;
import java.util.List;

public class QueryList174<T extends Student174 & QueryItem174> extends ArrayList<T>{
//    private List<T> items;

    public QueryList174() {}

    public QueryList174(List<T> items) {
        super(items);
//        this.items = items;
    }

    public static <S extends QueryItem174> List<S> getMatches(List<S>items, String field, String value){
        List<S> matches = new ArrayList<>();
        for(var item:items){
            if(item.matchField(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }

    public QueryList174<T> getMatches(String field, String value){
        QueryList174<T> matches = new QueryList174<>();
        for(var item:this){
            if(item.matchField(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
}
