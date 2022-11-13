<!DOCTYPE html>
<html lang="en">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pokedex</title>
    <link href="pokemon.css" rel="stylesheet" type="text/css"/>
</head>

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
                <a href="pokemon?pokemon=${entry.name}"> ${entry.entryNumber}: ${entry.name}</a>
            </c:forEach>
        </div>
        <br>
        <br>
        <div class="card">
            <h1>Pokedex detailed summary: </h1>
            <c:forEach items="${pokemon}" var="entry">
                <%-- begin table --%>
                <table>
                    <tr>
                        <th>Name</th>
                        <th>Type</th>
                        <th>Bio</th>
                        <th>Entry number</th>
                        <th>Found</th>
                    </tr>
                    <tr>
                        <td>${entry.name}</td>
                        <td>${entry.type}</td>
                        <td>${entry.bio}</td>
                        <td>${entry.entryNumber}</td>
                        <td>${entry.found}</td>
                    </tr>
                </table>
            </c:forEach>
        </div>
    </section>

    <!-- Footer -->
    <%@ include file="footer.jsp" %>

</body>

</html>
