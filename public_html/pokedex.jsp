<!DOCTYPE html>
<html lang="en">

<%@ include file="head-tag.jsp"%>

<body>
    <!-- Main header -->
    <%@ include file="header.jsp"%>


    <!-- Content -->
    <section id="main-content">

         <h1>Visit the <a href="pokemonSafariZone.jsp">Safari Zone</a> to catch Pokemon!</h1>

        <div class="card">
            <h1>Pokedex Entries: </h1>
            <c:forEach items="${pokemon}" var="entry">
                <h2>${entry.type}-type</h2>
                <a href="/${entry.name}">: ${entry.name}</a>
            </c:forEach>
        </div>
    </section>

    <!-- Footer -->
    <%@ include file="footer.jsp" %>

</body>

</html>
