<!DOCTYPE html>
<html lang="en">

<%@ include file="pokemonHead.jsp" %>

<body>
    <!-- Main header -->
    <%@ include file="pokemonHeader.jsp" %>

    <!-- Content -->
    <section id="main-content">
        <div class="card">
            <h1>Safari Zone</h1>

            <!-- The map and the Pokemon. Will need to change links to servlet-->
            <div id="safari-zone">
                <a id="squirtle" class="pokemon" href="squirtle.jsp">
                    <img src="images/squirtle_pixel.png" alt="Squirtle">
                </a>

                <a id="charmander" class="pokemon" href="charmander.jsp">
                    <img src="images/charmander_pixel.png" alt="Squirtle">
                </a>

                <a id="bulbasaur" class="pokemon" href="bulbasaur.jsp">
                    <img src="images/bulbasaur_pixel.png" alt="Squirtle">
                </a>
            </div>
        </div>
    </section>

    <!-- Footer -->
    <%@ include file="pokemonFooter.jsp" %>

</body>

</html>
