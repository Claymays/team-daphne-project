package controllers;

import models.Pokemon;
import repositories.PokemonRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.*;

@WebServlet(
        name = "pokedex",
        urlPatterns = { "/pokedex", "/home" }
)
public class PokedexController extends HttpServlet {
    // class variables
    // list of Pokemon beans
    private Map<String, Pokemon> knownPokemon;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // from the safari jsp, get the query string from the request made on the page
        String pokemonQuery = request.getParameter("pokemon");
        // determine the requested pokemon, instantiate it, and add it to the map
        addPokemonToCollection(pokemonQuery);
        // from the query, get the appropriate pokemon from the map
        request.setAttribute("pokemon", knownPokemon.get(pokemonQuery));
        // forward request and response to display page
        String url = "/pokemon.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    public void init() {
        //this.repository = new PokemonRepository();
        //repository.pokedexEntry("Bulbasaur", "grass", "a bio", 001);
        //this.knownPokemon = repository.getPokedexEntries();
        // initialize the Pokemon map
        knownPokemon = new TreeMap<String, Pokemon>();
    }

    /**
     * addPokemonToCollection method
     * This method will instantiate a pokemon bean and populate it with data.
     * Then it will insert that bean into the collection.
     * @param pokemonName The name of the pokemon.
    */
    public void addPokemonToCollection(String pokemonName) {
        // method variables
        String bio;
        String type;
        int entryNumber;
        String name = pokemonName;
        // check which pokemon was requested
        // bulbasaur
        if (name.equals("bulbasaur")) {
            // short bio
            bio = "A strange seed was planted on its back at birth. The plant sprouts and grows with this Pokemon.";
            // type
            type = "grass";
            // entry number
            entryNumber = 001;
            // instantiate bulbasaur
            Pokemon bulbasaur = new Pokemon();
            // add data to Pokemon bean
            bulbasaur.setName(name);
            bulbasaur.setBio(bio);
            bulbasaur.setType(type);
            bulbasaur.setEntryNumber(entryNumber);
            // add to collection
            knownPokemon.put(name, bulbasaur);
        }
        // squirtle
        if (name.equals("squirtle")) {
            // short bio
            bio = "When it retracts its long neck into its shell, it squirts out water with vigorous force.";
            // type
            type = "water";
            // entry number
            entryNumber = 003;
            // instantiate squirtle
            Pokemon squirtle = new Pokemon();
            // add data to Pokemon bean
            squirtle.setName(name);
            squirtle.setBio(bio);
            squirtle.setType(type);
            squirtle.setEntryNumber(entryNumber);
            // add to collection
            knownPokemon.put(name, squirtle);
        }
        // charmander
        if (name.equals("charmander")) {
            // short bio
            bio = "A flame burns on the tip of its tail from birth. It is said that a Charmander dies if its flame ever goes out.";
            // type
            type = "fire";
            // entry number
            entryNumber = 006;
            // instantiate bulbasaur
            Pokemon charmander = new Pokemon();
            // add data to Pokemon bean
            charmander.setName(name);
            charmander.setBio(bio);
            charmander.setType(type);
            charmander.setEntryNumber(entryNumber);
            // add to collection
            knownPokemon.put(name, charmander);
        }
    }
}
