package controllers;

import models.Pokemon;
import repositories.PokemonRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "pokedex",
        urlPatterns = { "/pokedex", "/home" }
)
public class PokedexController extends HttpServlet {
    private PokemonRepository repository;
    private List<Pokemon> knownPokemon;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // from the safari jsp, get the query string from the request made on the page
        String pokemonQuery = request.getQueryString();
        // instantiate the pokemon
        addPokemonToDatabase(pokemonQuery);
        // set request attribute with "pokemon" as the key, and the pokemon's db entry as the value
        request.setAttribute("pokemon", knownPokemon.get(0));
        // forward request and response to display page
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("./pokedex");
        dispatcher.forward(request, response);
    }

    public void init() {
        this.repository = new PokemonRepository();
        // repository.pokedexEntry("Bulbasaur", "grass", "a blurb", 001);
        this.knownPokemon = repository.getPokedexEntries();
    }
    /** 
     * addPokemonToDatabase method
     * This method will instantiate a pokemon bean and populate it with data.
     * @param pokemonName The name of the pokemon.
    */
    public void addPokemonToDatabase(String pokemonName) {
        // method variables
        String bio;
        String type;
        int entryNumber;
        // check which pokemon was requested
        // bulbasaur
        if (pokemonName == "bulbasaur") {
            // short bio
            bio = "A strange seed was planted on its back at birth. The plant sprouts and grows with this Pokemon.";
            // type
            type = "grass";
            // entry number
            entryNumber = 001;
            // add pokemon to database
            repository.pokedexEntry(pokemonName, type, bio, entryNumber);
        }
        // squirtle
        if (pokemonName == "squirtle") {
            // short bio
            bio = "When it retracts its long neck into its shell, it squirts out water with vigorous force.";
            // type
            type = "water";
            // entry number
            entryNumber = 003;
            // add pokemon to database
            repository.pokedexEntry(pokemonName, type, bio, entryNumber);
        }
        // charmander
        if (pokemonName == "charmander") {
            // short bio
            bio = "A flame burns on the tip of its tail from birth. It is said that a Charmander dies if its flame ever goes out.";
            // type
            type = "fire";
            // entry number
            entryNumber = 006;
            // add pokemon to database
            repository.pokedexEntry(pokemonName, type, bio, entryNumber);
        }
    }
}
