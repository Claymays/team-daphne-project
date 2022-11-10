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
        request.setAttribute("pokemon", knownPokemon.get(0));
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("./pokedex");
        dispatcher.forward(request, response);
    }

    public void init() {
        this.repository = new PokemonRepository();
        repository.pokedexEntry("Bulbasaur", "grass", "a blurb", 001);
        this.knownPokemon = repository.getPokedexEntries();
    }
}
