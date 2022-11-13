<!DOCTYPE html>
<html lang="en">

<%@ include file="head-tag.jsp"%>

<body>
<!-- Main header -->
<%@ include file="header.jsp" %>

<section id="main-content">

    <h1>Catch more Pokemon at the <a href="pokemonSafariZone.jsp">Safari Zone!</a></h1>

    <div class="card">
        <h1>Pokemon #${pokemon.entryNumber}</h1>
        <!-- Pokemon name and picture -->
        <h2>${pokemon.name}</h2>
        <img src="images/${pokemon.name}.png" alt="One of the three starter pokemons from gen 1" class="poke-img">
        <br>
        <!-- Pokedex entry -->
        <p>
            ${pokemon.bio}
        </p>
        <!-- Description -->
        <p> - The Official Pokedex Entry</p>
        <!-- Description and image sourced from
            https://www.pokemon.com/us/pokedex/${pokemon.name} &
            https://bulbapedia.bulbagarden.net/wiki/${pokemon.name}_(Pok%C3%A9mon)
        -->
    </div>
</section>

<!-- Footer -->
<%@ include file="footer.jsp" %>

</body>

</html>
