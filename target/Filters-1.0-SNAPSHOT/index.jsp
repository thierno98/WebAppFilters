<%--
  Created by IntelliJ IDEA.
  User: Thier
  Date: 07/05/2021
  Time: 00:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <style>
      <%@ include file="style.css"%>
    </style>
    <title>DemoFilters</title>
  </head>
  <body>
    <div class='bold-line'></div>
    <div class='container'>
      <div class='window'>
        <div class='overlay'></div>
        <div class='content'>
          <div class='welcome'>Connexion</div>
          <div class='subtitle'>Veuillez saisir vos informations.</div>
          <form action="DemoServlet">
            <div class='input-fields'>
              <input type='text' placeholder='Username' name="username" class='input-line full-width'></input>
              <input type='password' placeholder='Password' name="password" class='input-line full-width'></input>

            </div>
            <div><input type='submit' class='ghost-round full-width' placeholder="Se connecter"></div>
          </form>
        </div>
      </div>
    </div>
  </body>
</html>
