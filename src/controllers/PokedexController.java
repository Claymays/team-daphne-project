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
//        TODO: how to handle delegation?
        // from the safari jsp, get the query string from the request made on the page
        String pokemonQuery = request.getQueryString();
        // add pokemonQuery to knownPokemon
        knownPokemon.add(pokemonQuery);
        // instantiate the pokemon
        instantiatePokemon(pokemonQuery);
        //
        request.setAttribute("pokemon", knownPokemon.get(0));
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("./pokedex");
        dispatcher.forward(request, response);
    }

    public void init() {
        this.repository = new PokemonRepository();
        repository.pokedexEntry("Bulbasaur", "grass", "a blurb", 001);
        this.knownPokemon = repository.getPokedexEntries();
    }
    
    public void instantiatePokemon(String pokemonName) {
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
            // create pokemon class for bulbasaur
            Pokemon bulbasaur = new Pokemon(pokemonName, type, bio, entryNumber);
        }
        // squirtle
        if (pokemonName == "squirtle") {
            // short bio
            bio = "When it retracts its long neck into its shell, it squirts out water with vigorous force.";
            // type
            type = "water";
            // entry number
            entryNumber = 003;
            // create pokemon class for squirtle
            Pokemon squirtle = new Pokemon(pokemonName, type, bio, entryNumber);
        }
        // charmander
        if (pokemonName == "charmander") {
            // short bio
            bio = "A flame burns on the tip of its tail from birth. It is said that a Charmander dies if its flame ever goes out.";
            // type
            type = "fire";
            // entry number
            entryNumber = 006;
            // create pokemon class for charmander
            Pokemon charmander = new Pokemon(pokemonName, type, bio, entryNumber);
        }
    }
}
