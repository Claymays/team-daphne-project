package repositories;

import models.Pokemon;
import java.util.HashMap;
import java.util.*;

public class PokemonRepository {
    private Map<String, Pokemon> knownPokemon;
    private static PokemonRepository instance;

    // Instantiates the repo with hard-coded values.
    private PokemonRepository() {
        this.knownPokemon = new TreeMap<>();

        // bulbasaur

        String pokemonName = "bulbasaur";
        String bio = "A strange seed was planted on its back at birth. The plant sprouts and grows with this Pokemon.";
        // type
        String type = "grass";
        // entry number
        String entryNumber = "001";
        // add pokemon to database
        knownPokemon.put(pokemonName, new Pokemon(pokemonName, type, bio, entryNumber));

        // squirtle
        // short bio
        pokemonName = "squirtle";
        bio = "When it retracts its long neck into its shell, it squirts out water with vigorous force.";
        // type
        type = "water";
        // entry number
        entryNumber = "003";
        // add pokemon to database
        knownPokemon.put(pokemonName, new Pokemon(pokemonName, type, bio, entryNumber));

        // charmander
        pokemonName = "charmander";
        // short bio
        bio = "A flame burns on the tip of its tail from birth. It is said that a Charmander dies if its flame ever goes out.";
        // type
        type = "fire";
        // entry number
        entryNumber = "006";
        // add pokemon to database
        knownPokemon.put(pokemonName, new Pokemon(pokemonName, type, bio, entryNumber));
    }

    public Map<String, Pokemon> getKnownPokemon() {
        return knownPokemon;
    }

    public void setKnownPokemon(Map<String, Pokemon> knownPokemon) {
        this.knownPokemon = knownPokemon;
    }

    // A way to ensure only one instance is creating for the entire app
    public static PokemonRepository getInstance() {
        if (instance == null) {
            instance = new PokemonRepository();
        }
        return instance;
    }

    public void pokedexEntry(String name, String type, String bio, String entryNumber) {
       knownPokemon.put(name, new Pokemon(name, type, bio, entryNumber));
    }

    public Pokemon getPokemon(String name) {
        return knownPokemon.get(name);
    }

    // Iterates through the map, returning only those that have been found
    public List<Pokemon> getFoundPokemon() {
        List<Pokemon> foundPokemon = new ArrayList<>();
        for (Pokemon pokemon : knownPokemon.values()) {
            if (pokemon.isFound()) {
                foundPokemon.add(pokemon);
            }
        }
        return foundPokemon;
    }
}
