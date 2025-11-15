<%--
  Created by IntelliJ IDEA.
  User: umertam
  Date: 13.11.2025
  Time: 12:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>HotelBooking - Найдите идеальный отель</title>
    <link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
<!-- Header -->
<header class="header">
    <div class="container">
        <nav class="navbar">
            <a href="index.html" class="logo">HotelBooking</a>

            <ul class="nav-links">
                <li><a href="index.html" class="active">Главная</a></li>
                <li><a href="#">Отели</a></li>
                <li><a href="#">Контакты</a></li>
                <li><a href="#">О нас</a></li>
            </ul>

            <div class="auth-buttons">
                <a href="login.html" class="btn btn-secondary">Войти</a>
                <a href="register.html" class="btn btn-primary">Регистрация</a>
            </div>

            <div class="hamburger">
                <span></span>
                <span></span>
                <span></span>
            </div>
        </nav>
    </div>
</header>

<!-- Mobile Menu -->
<div class="mobile-menu">
    <div class="mobile-menu-header">
        <div class="logo">HotelBooking</div>
        <div class="close-menu">✕</div>
    </div>
    <ul class="mobile-nav-links">
        <li><a href="index.html">Главная</a></li>
        <li><a href="#">Отели</a></li>
        <li><a href="#">Контакты</a></li>
        <li><a href="#">О нас</a></li>
    </ul>
    <div class="mobile-auth-buttons">
        <a href="login.html" class="btn btn-secondary">Войти</a>
        <a href="register.html" class="btn btn-primary">Регистрация</a>
    </div>
</div>
<div class="overlay"></div>

<!-- Hero Section -->
<section class="hero">
    <div class="container">
        <h1>Найдите идеальный отель для вашего отдыха</h1>
        <p>Более 1000 отелей по всему миру с лучшими ценами и отзывами</p>

        <form class="search-form">
            <input type="text" class="form-control" placeholder="Куда вы хотите поехать?" required>
            <input type="date" class="form-control" required>
            <input type="date" class="form-control" required>
            <button type="submit" class="btn btn-primary">Найти отели</button>
        </form>
    </div>
</section>

<!-- Hotels Grid -->
<section class="container">
    <div class="hotels-grid">
        <!-- Отель 1 -->
        <div class="hotel-card">
            <div class="hotel-image">Изображение отеля</div>
            <div class="hotel-info">
                <h3 class="hotel-name">Премиум Отель</h3>
                <p class="hotel-location">Москва, Россия</p>
                <div class="rating">★★★★★</div>
                <div class="hotel-price">₽5,400/ночь</div>
                <button class="btn btn-primary">Забронировать</button>
            </div>
        </div>

        <!-- Отель 2 -->
        <div class="hotel-card">
            <div class="hotel-image">Изображение отеля</div>
            <div class="hotel-info">
                <h3 class="hotel-name">Бизнес Отель</h3>
                <p class="hotel-location">Санкт-Петербург, Россия</p>
                <div class="rating">★★★★☆</div>
                <div class="hotel-price">₽4,200/ночь</div>
                <button class="btn btn-primary">Забронировать</button>
            </div>
        </div>

        <!-- Отель 3 -->
        <div class="hotel-card">
            <div class="hotel-image">Изображение отеля</div>
            <div class="hotel-info">
                <h3 class="hotel-name">Курортный Комплекс</h3>
                <p class="hotel-location">Сочи, Россия</p>
                <div class="rating">★★★★★</div>
                <div class="hotel-price">₽6,800/ночь</div>
                <button class="btn btn-primary">Забронировать</button>
            </div>
        </div>
    </div>
</section>

</body>
</html>
