package IntellijStarting;

import java.util.*;

public class QueryList173 <T extends Student171 & QueryItem173>{
    private List<T> items;

    public QueryList173(List<T> items) {
        this.items = items;
    }

    public static <S extends QueryItem173> List<S> getMatches(List<S>items, String field, String value){
        List<S> matches = new ArrayList<>();
        for(var item:items){
            if(item.matchField(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }

    public List<T> getMatches(String field, String value){
        List<T> matches = new ArrayList<>();
        for(var item:items){
            if(item.matchField(field, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
}
