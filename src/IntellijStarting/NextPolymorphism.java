package IntellijStarting;

public class NextPolymorphism {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unKnownObject = Movie.getMovie("S", "Star Wars");
        if (unKnownObject.getClass().getSimpleName().equals("Comedy")) {
            Comedy c = (Comedy) unKnownObject;
            c.watchComedy();
        } else if (unKnownObject instanceof Adventure) {
            ((Adventure) unKnownObject).watchAdventure();
        } else if (unKnownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }
    }
}