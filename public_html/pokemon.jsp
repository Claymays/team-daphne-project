<!DOCTYPE html>
<html lang="en">

<%@ include file="head-tag.jsp"%>

<body>
<!-- Main header -->
<%@ include file="header.jsp" %>

<section id="main-content">

    <h1>Catch more Pokemon at the <a href="pokemonSafariZone.jsp">Safari Zone!</a></h1>

    <div class="card">
        <h1>Pokemon #${pokemon.pokedexEntry}</h1>
        <!-- Pokemon name and picture -->
        <h2>${pokemonName.name}</h2>
        <img src="images/${pokemon.image}" alt="
        <%--TODO: Figure out the alt!--%>
        " class="poke-img">
        <br>
        <!-- Pokedex entry -->
        <p>
            ${pokemon.blurb}
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
