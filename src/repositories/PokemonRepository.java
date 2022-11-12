package repositories;

import models.Pokemon;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PokemonRepository {
    private Connection database;

    public PokemonRepository() {
        try {
            setDatabase();
            Statement createTables = database.createStatement();
            createTables.execute("CREATE TABLE POKEMON(NAME VARCHAR(255), TYPE VARCHAR(255) " +
                    ", BIO VARCHAR(255), POKEDEX_ENTRY INT)");
        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(PokemonRepository.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
        }
    }

    public Connection getDatabase() {
        return database;
    }

    public void setDatabase() throws SQLException {
        database = DriverManager.getConnection("jdbc:h2:mem:");
    }

    public void pokedexEntry(String name, String type, String bio, int entryNumber) {
        try {
            Statement entry = database.createStatement();
            entry.execute(String.format("INSERT INTO POKEMON (NAME, TYPE, BIO, POKEDEX_ENTRY) VALUES (%s, %s, %s, %d)", name, type, bio, entryNumber));
        } catch(SQLException exception) {

        }
    }

    public List<Pokemon> getPokedexEntries() {
        List<Pokemon> entries = new ArrayList<>();
        try {
            Statement query = database.createStatement();
            ResultSet rs = query.executeQuery("SELECT * FROM POKEMON");
            while (rs.next()) {
                entries.add(new Pokemon(rs.getString("name"),
                        rs.getString("type"), rs.getString("bio"),
                        rs.getInt("pokedex_entry")));
            }
        } catch(SQLException exception) {

        }
        return entries;
    }
}
