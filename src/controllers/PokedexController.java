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

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Pokemon> foundPokemon = repository.getFoundPokemon();
        // attach pokemon collection to model, and forward request and response to display page
        request.setAttribute("pokemon", foundPokemon);
        String url = "/pokedex.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    public void init() {
        this.repository = PokemonRepository.getInstance();
    }
}
