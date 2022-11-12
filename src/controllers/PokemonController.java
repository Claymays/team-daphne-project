package controllers;

import models.Pokemon;
import repositories.PokemonRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(
        name = "pokemon",
        urlPatterns = { "/pokemon" }
)
public class PokemonController extends HttpServlet {
    private PokemonRepository repository;

    // Handles all requests to view any individual pokemon.
    // Pulls the pokemon's name from the request params
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String pokemonName = request.getParameter("pokemon");
        Pokemon pokemon = repository.getPokemon(pokemonName);
        pokemon.setFound(true);
        // set request attribute with "pokemon" as the key, and the pokemon object as the value
        request.setAttribute("pokemon", pokemon);

        // forward request and response to display page
        String url = "/pokemon.jsp";
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }

    public void init() {
        this.repository = PokemonRepository.getInstance();
    }
}
