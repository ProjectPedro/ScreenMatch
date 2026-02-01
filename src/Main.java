public class Main {
    public static void main(String[] args) {
        Movie newMovie = new Movie();
        newMovie.name = "O Poderoso Chefão";
        newMovie.data = 1970;


        newMovie.showDetails();
        newMovie.showRating(8);
        newMovie.showRating(5);
        newMovie.showRating(3);
    }
}
