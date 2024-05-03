package week9.movies;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private String databasePath;

    Database(String databasePath) { // constructor

        // create table, or confirm it exists

        this.databasePath = databasePath;

        try (Connection connection = DriverManager.getConnection(databasePath);
             Statement statement = connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS" +
                    " movies (id integer primary key, " +
                    "name text unique CHECK(length(name) >= 1), " +
                    "stars INTEGER CHECK(stars >= 0 AND stars <=5), " +
                    "watched BOOLEAN)");

        } catch (SQLException e) {
            System.out.println("Error creating movie DB table because " + e);
        }


    }

    public void addNewMovie(Movie movie) {
        String insertSQL = "INSERT INTO movies (name, stars, watched) VALUES (?,?,?)";
        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {


            //INSERT INTO movies VALUES ('Up', '4', true)
            preparedStatement.setString(1, movie.getName());
            preparedStatement.setInt(2, movie.getStars());
            preparedStatement.setBoolean(3, movie.isWatched());

            preparedStatement.execute();

        } catch (SQLException e) {
            System.out.println("Error adding movie " + movie + " because " + e);
        }

    }

    public List<Movie> getAllMovies(){
        try (Connection connection = DriverManager.getConnection(databasePath);
        Statement statement = connection.createStatement()) {
            ResultSet movieResults = statement.executeQuery("SELECT * FROM movies ORDER BY name");

            List<Movie> movies = new ArrayList<>();

            while(movieResults.next()){
                int id = movieResults.getInt("id");
                String name = movieResults.getString("name");
                int stars = movieResults.getInt("stars");
                boolean watched = movieResults.getBoolean("watched");
                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }

            return movies;

        }catch (SQLException e){
            System.out.println("Error fetching all movies because " + e);
            return null;
        }
    }

    public List<Movie> getAllMoviesByWatched(boolean watchedStatus){
        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM movies WHERE watched = ?")) {

            preparedStatement.setBoolean(1, watchedStatus);
            ResultSet movieResults = preparedStatement.executeQuery();

            List<Movie> movies = new ArrayList<>();

            while (movieResults.next()){
                int id = movieResults.getInt("id");
                String name = movieResults.getString("name");
                int stars = movieResults.getInt("stars");
                boolean watched = movieResults.getBoolean("watched");
                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }
            return movies;
        }
        catch (SQLException e){
            System.out.println("Error getting movies because " + e);
            return null;
        }
    }


    public void updateMove(Movie movie){
        String sql = "UPDATE movies SET stars = ?, watched = ? WHERE id = ?";


        try (Connection connection = DriverManager.getConnection(databasePath);
        PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setInt(1, movie.getStars());
            preparedStatement.setBoolean(2, movie.isWatched());
            preparedStatement.setInt(3, movie.getId());

            preparedStatement.execute();

        }catch (SQLException e){
            System.out.println("Error updating movie " + movie + " because " + e);
        }
    }


    public void deleteByMovie(Movie movie) {

        try(Connection connection = DriverManager.getConnection(databasePath);
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM movies WHERE id = ?")){

            preparedStatement.setInt(1, movie.getId());
            preparedStatement.execute();

        }catch (SQLException e){
            System.out.println("Error deleting movie " + movie + " because " + e);
        }
    }

    public List<Movie> searchForMovie(String nameSearch){

        try(Connection connection = DriverManager.getConnection(databasePath);
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM movies WHERE upper(name) like (?)")){

            preparedStatement.setString(1, "%" + nameSearch + "%");
            ResultSet movieResults = preparedStatement.executeQuery();

            List<Movie> movies = new ArrayList<>();

            while (movieResults.next()){
                int id = movieResults.getInt("id");
                String name = movieResults.getString("name");
                int stars = movieResults.getInt("stars");
                boolean watched = movieResults.getBoolean("watched");

                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }

            return movies;

        }catch (SQLException e){
            System.out.println("Error deleting movie " + nameSearch + " because " + e);
            return null;
        }
    }


}
