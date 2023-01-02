<%--
  Created by IntelliJ IDEA.
  User: delgadoa.
  Date: 12/16/22
  Time: 1:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza</title>
</head>
<body>
<form  method="POST">
  <label for="crust">Select Crust</label><br>
  <select name="crust" id="crust">
    <option>Thin</option>
    <option>Regular</option>
    <option>Thick</option>
  </select><br>
  <label for="size">Select Size</label><br>
  <select name="size" id="size">
    <option>Small</option>
    <option>Medium</option>
    <option>Large</option>
  </select><br>
  <label for="sauce">Select Sauce</label><br>
  <select name="sauce" id="sauce">
    <option>Tomato</option>
    <option>Extra</option>
    <option>None</option>
  </select><br>
  <p>Choose Toppings</p>
  <input type="checkbox" id="pepperoni" value="Pepperoni"><label for="pepperoni">Pepperoni</label>
  <input type="checkbox" id="ham" value="Ham"><label for="ham">Ham</label>
  <input type="checkbox" id="pineapple" value="Pineapple"><label for="pineapple">Pineapple</label>
  <input type="submit">Submit
</form>

</body>
</html>
