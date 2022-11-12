<!DOCTYPE html>
<html lang="en">

<%@ include file="head-tag.jsp" %>

<body>
    <!-- Main header -->
    <%@ include file="header.jsp" %>

    <!-- Content -->
    <section id="main-content">
        <div class="card">
            <h1>Safari Zone</h1>

            <!-- The map and the Pokemon. Will need to change links to servlet-->
            <div id="safari-zone">
                <img id="squirtle" class="pokemon" src="images/squirtle_pixel.png" alt="Squirtle">
                <img id="charmander" class="pokemon" src="images/charmander_pixel.png" alt="Charmander">
                <img id="bulbasaur" class="pokemon" src="images/bulbasaur_pixel.png" alt="Bulbasaur">
            </div>
        </div>
    </section>

    <form id="pokemonForm" method="GET">
        <input id="pokemonInput" type="hidden" name="pokemon"/>
    </form>

    <!-- Footer -->
    <%@ include file="footer.jsp" %>

    <script>
        let pokemon = document.querySelectorAll('.pokemon');
        let form = document.getElementById('pokemonForm');
        let input = document.getElementById('pokemonInput');

        pokemon.forEach(p => p.addEventListener('click', submitForm));

        function submitForm(event) {
            let { target: { id }} = event;
            input.value = id;

            // form.submit();
            window.location = '/controllers/pokedex';
        }
    </script>
</body>
</html>
