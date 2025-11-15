<%--
  Created by IntelliJ IDEA.
  User: umertam
  Date: 13.11.2025
  Time: 10:37
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
    <title>Вход - HotelBooking</title>
    <link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
<header class="header">
    <div class="container">
        <nav class="navbar">
            <a href="index.html" class="logo">HotelBooking</a>
            <div class="auth-buttons">
                <a href="register.html" class="btn btn-secondary">Регистрация</a>
            </div>
        </nav>
    </div>
</header>

<main class="container">
    <div class="form-container">
        <h2>Вход в аккаунт</h2>
        <form action="/login-user" id="loginForm" method="post">
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" name="email" id="email" class="form-control" required>
                <div class="error-message">Введите корректный email</div>
            </div>

            <div class="form-group">
                <label for="password">Пароль</label>
                <input type="password" name="password" id="password" class="form-control" required minlength="6">
                <div class="error-message">Пароль должен содержать минимум 6 символов</div>
            </div>

            <button type="submit" class="btn btn-primary" style="width: 100%;">Войти</button>

            <div class="form-footer">
                <p>Нет аккаунта? <a href="register.html">Зарегистрируйтесь</a></p>
            </div>
        </form>
    </div>
</main>
</body>
</html>
