<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pokemon 001 | Charmander</title>
    <link href="pokemon.css" rel="stylesheet" type="text/css"/>
</head>

<body>
    <!-- Main header -->
    <%@ include file="header.jsp" %>

    <section id="main-content">
        <div class="card">
            <h1>Pokemon #004</h1>
            <!-- Pokemon name and picture -->
            <h2>Charmander, The lizard Pokemon</h2>
            <img src="images/charmander.jpg" alt="Charmander smiling">
            <br>
            <!-- Pokedex entry -->
            <p>
                "Charmander. A flame burns on the tip of its tail from birth. It is said that a Charmander dies if its flame ever goes out."
            </p>
            <!-- Description -->
            <p> - The Official Pokedex Entry</p>
            <!-- Description and image sourced from
                https://www.pokemon.com/us/pokedex/charmander &
                https://bulbapedia.bulbagarden.net/wiki/Charmander_(Pok%C3%A9mon)
            -->
        </div>
    </section>

    <!-- Footer -->
    <%@ include file="footer.jsp" %>
</body>

</html>
