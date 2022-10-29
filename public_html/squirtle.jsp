<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pokemon 007 | Squirtle</title>
    <link href="pokemon.css" rel="stylesheet" type="text/css"/>
</head>

<body>
    <!-- Main header -->
    <%@ include file="header.jsp" %>

    <section id="main-content">
        <div class="card">
            <h1>Pokemon #007</h1>
            <!-- Pokemon name and picture -->
            <h2>Squirtle, The Tiny Turtle Pokemon</h2>
            <img src="./images/squirtle.png" alt="Squirtle" class="poke-img">
            <br>
            <!-- Pokedex entry -->
            <p>
                "This Tiny Turtle Pokemon draws its long neck into its shell to launch incredible Water attacks with amazing range and accuracy. The blasts can be quite powerful."
            </p>

            <p> - The Official Pokedex Entry</p>

            <!-- Source: https://www.pokemon.com/us/pokedex/squirtle
                        https://bulbapedia.bulbagarden.net/wiki/Squirtle_(Pok%C3%A9mon)#Pok.C3.A9dex_entries_2 -->
        </div>
    </section>

    <!-- Footer -->
    <%@ include file="footer.jsp" %>

</body>

</html>
