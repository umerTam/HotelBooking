<%--
  Created by IntelliJ IDEA.
  User: umertam
  Date: 13.11.2025
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Регистрация - HotelBooking</title>
  <link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
<header class="header">
  <div class="container">
    <nav class="navbar">
      <a href="index.html" class="logo">HotelBooking</a>
      <div class="auth-buttons">
        <a href="login.html" class="btn btn-secondary">Войти</a>
      </div>
    </nav>
  </div>
</header>

<main class="container">
  <div class="form-container">
    <h2>Создать аккаунт</h2>
    <form action="register-user" id="registerForm" method="post">
      <div class="form-group">
        <label for="fullName">Полное имя</label>
        <input type="text" name="fullName" id="fullName" class="form-control" required minlength="2">
        <div class="error-message">Имя должно содержать минимум 2 символа</div>
      </div>

      <div class="form-group">
        <label for="email">Email</label>
        <input type="email" name="email" id="email" class="form-control" required>
        <div class="error-message">Введите корректный email</div>
      </div>

      <div class="form-group">
        <label for="phoneNumber">Телефон</label>
        <input type="tel" name="phoneNumber" id="phoneNumber" class="form-control" required pattern="8\d{10}">
        <div class="error-message">Введите корректный номер телефона</div>
      </div>

      <div class="form-group">
        <label for="password">Пароль</label>
        <input type="password" name="password" id="password" class="form-control" required minlength="6">
        <div class="error-message">Пароль должен содержать минимум 6 символов</div>
      </div>

      <div class="form-group">
        <label for="confirmPassword">Подтвердите пароль</label>
        <input type="password" id="confirmPassword" class="form-control" required>
        <div class="error-message">Пароли не совпадают</div>
      </div>

      <button type="submit" class="btn btn-primary" style="width: 100%;">Зарегистрироваться</button>
    </form>
      <div class="form-footer">
        <p>Уже есть аккаунт? <a href="login.html">Войдите</a></p>
      </div>

  </div>
</main>

</body>
</html>
