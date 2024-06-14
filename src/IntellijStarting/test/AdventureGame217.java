package IntellijStarting.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdventureGame217 {
    private static final String GAME_LOCATIONS = """
            road,at the end of the road, W: hill, E:well house,S:valley,N:forest
            hill,on top of hill with a view in all directions,N:forest, E:road
            well house,inside a well house for a small spring,W:road,N:lake,S:stream
            valley,in a forest valley beside a tumbling stream,N:road,W:hill,E:stream
            forest,at the edge of a thick dark forest,S:road,E:lake
            lake,by an alpine lake surrounded by wildflowers,W:forest,S:well house
            stream,near a stream with a rocky bed,W:valley, N:well house
            """;
    private String lastPlace;
    private final Map<String, Location217> adventureMap = new HashMap<>();

    public AdventureGame217() {
        this(GAME_LOCATIONS);
    }

    public AdventureGame217(String customLocations) {
        loadLocations(customLocations);
    }

    private enum Compass217 {
        E, N, S, W;

        private static final String[] directions = {"East", "North", "South", "West",};

        public String getString() {
            return directions[this.ordinal()];
        }
    }

    private record Location217(String description, Map<Compass217, String> nextPlaces) {}

    private void loadLocations(String data) {
        for (String s : data.split("\\R")) {
            String[] parts = s.split(",", 3);
            Arrays.asList(parts).replaceAll(String::trim);
            Map<Compass217, String> nextPlaces = loadDirections(parts[2]);
            Location217 location = new Location217(parts[1], nextPlaces);
            adventureMap.put(parts[0], location);
        }
//        adventureMap.forEach((k, v) -> System.out.printf("%s:%s%n", k, v));
    }

    private Map<Compass217, String> loadDirections(String nextPlaces) {
        Map<Compass217, String> directions = new HashMap<>();
        List<String> nextSteps = Arrays.asList(nextPlaces.split(","));

        nextSteps.replaceAll(String::trim);

        for (String nextPlace : nextSteps) {
            String[] splits = nextPlace.split(":");
            Compass217 compass = Compass217.valueOf(splits[0].trim());
            String destination = splits[1].trim();
            directions.put(compass, destination);
        }

        return directions;
    }

    private void visit(Location217 location) {
        System.out.printf("*** You're standing %s *** %n", location.description);
        System.out.println("\tFrom here you can see:");

        location.nextPlaces.forEach((k, v) -> System.out.printf("\t\u2022 A %s to the %s (%S) %n", v, k.getString(), k));

        System.out.println("Select Your Compass (Q to quit) >> ");
    }

    public void move(String direction) {
        var nextPlaces = adventureMap.get(lastPlace).nextPlaces;
        String nextPlace = null;
        if ("ENSW".contains(direction)) {
            nextPlace = nextPlaces.get(Compass217.valueOf(direction));
            if (nextPlace != null) {
                play(nextPlace);
            }
        } else System.out.println("!! Invalid direction, try again!!");
    }

    public void play(String location) {
        if (adventureMap.containsKey(location)) {
            Location217 next = adventureMap.get(location);
            lastPlace = location;
            visit(next);
        } else System.out.println(location + " is an invalid location");
    }
}
