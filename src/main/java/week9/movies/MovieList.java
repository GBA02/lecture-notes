package week9.movies;

import java.util.List;

import static input.InputUtils.*;

public class MovieList {
    private static final String DB_Path = "jdbc:sqlite:movie_watchlist.sqlite";
    private static Database database;


    public static void main(String[] args) {
        database = new Database(DB_Path);
        addNewMovies();
        checkIfWatchedAndRate();
        deleteWatchedMovies();
        searchForMovie();
        displayAllMovies();


    }


    public static int getRatingOutOfFive(){
        int rating = positiveIntInput("What is your rating, in stars out of 5?");
        while (rating < 0 || rating > 5){
            System.out.println("Error, enter a number between 0 and 5");
            rating = positiveIntInput("What is your rating, in stars out of 5?");
        }
        return rating;
    }

    public static String getNonEmptyMovieName(){
        String name = stringInput("Enter the move name ");
        while(name.isEmpty()){
            System.out.println("Error - enter a name");
            name = stringInput("Enter the movie name");
        }
        return name;
    }

    public static void addNewMovies() {
        do {
            String movieName = getNonEmptyMovieName();
            boolean movieWatched = yesNoInput("Have you seen this movie yet");
            int movieStars = 0;
            if (movieWatched) {
                movieStars = getRatingOutOfFive();
            }
            Movie movie = new Movie(movieName, movieStars, movieWatched);
            database.addNewMovie(movie);
        } while (yesNoInput("Add a movie to the watchlist?"));
    }

    public static void displayAllMovies() {
        List<Movie> movies = database.getAllMovies();
        if (movies.isEmpty()) {
            System.out.println("No movies");
        } else {
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }

    public static void checkIfWatchedAndRate(){
        List<Movie> unwatchedMovies = database.getAllMoviesByWatched(false);

        for (Movie movie : unwatchedMovies){
            boolean hasWatched = yesNoInput("Have you watched " + movie.getName() + " yet?");
            if (hasWatched){
                int stars = positiveIntInput("What is your rating for " + movie.getName() + " out of 5?");
                movie.setWatched(true);
                movie.setStars(stars);
                database.updateMove(movie);
            }
        }
    }

    public static void deleteWatchedMovies(){
        System.out.println("Here are all the movies you have seen");

        List<Movie> watchedMovies = database.getAllMoviesByWatched(true);

        for (Movie movie: watchedMovies){
            boolean delete = yesNoInput("Delete " + movie.getName() + "?");
            if (delete){
                database.deleteByMovie(movie);
            }
        }
    }

    public static void searchForMovie(){

        String movieName = stringInput("What is the name of the movie you are looking for?");

        List<Movie> matchingMovies = database.searchForMovie(movieName);
        if (matchingMovies.isEmpty()){
            System.out.println("No movies found.");
        }else {
            System.out.println("Here are all the matching movies found:");
            for (Movie movie:matchingMovies){
                System.out.println(movie);
            }
        }

    }

}
