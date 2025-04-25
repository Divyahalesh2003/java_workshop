package com.pes.movie.repo;

import com.pes.movie.Entity.MovieEntity;

import java.sql.*;

public class MovieRepoImpl implements MovieRepo {
    @Override
    public void saveMovie(MovieEntity entity) {
        String url = "jdbc:mysql://localhost:3306/moviedata";
        String userName = "root";
        String psw = "Divyahalesh@2003";
        String query = "insert into movie_info(hero_Name,heroin_Name,language,release_date,movie_Name)" + "values(?,?,?,?,?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, psw);
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, entity.getMovieHero());
            statement.setString(2, entity.getMovieHeroin());
            statement.setString(3, entity.getLanguage());
            statement.setDate(4, Date.valueOf(entity.getReleaseDate()));
            statement.setString(5, entity.getMovieName());

            statement.execute();
            System.out.println(entity.getMovieName() + ":Date is saved");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void readMovies() {
        String url = "jdbc:mysql://localhost:3306/moviedata";
        String userName = "root";
        String psw = "Divyahalesh@2003";

        String query = "select * from movie_info";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, psw);
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                System.out.print(set.getInt("movie_id")+" "+set.getString("hero_name")+"|");
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}