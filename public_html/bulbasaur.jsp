<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pokemon 001 | Bulbasaur</title>
    <link href="pokemon.css" rel="stylesheet" type="text/css"/>
</head>

<body>
    <!-- Main header -->
    <%@ include file="header.jsp" %>

    <section id="main-content">
        <div class="card">
            <h1>Pokemon #001</h1>
            <!-- Pokemon name and picture -->
            <h2>Bulbasaur, The Seed Pokemon</h2>
            <img src="images/bulbasaur.png" alt="Bulbasaur smiling" class="poke-img">
            <br>
            <!-- Pokedex entry -->
            <p>
                "A strange seed was planted on its back at birth. The plant sprouts and grows with this Pokemon."
            </p>
            <!-- Description -->
            <p> - The Official Pokedex Entry</p>
            <!-- Description and image sourced from
                https://www.pokemon.com/us/pokedex/bulbasaur &
                https://bulbapedia.bulbagarden.net/wiki/Bulbasaur_(Pok%C3%A9mon)
            -->
        </div>
    </section>

    <!-- Footer -->
    <%@ include file="footer.jsp" %>
</body>

</html>
