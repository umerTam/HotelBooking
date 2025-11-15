<%--
  Created by IntelliJ IDEA.
  User: umertam
  Date: 13.11.2025
  Time: 14:04
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
  <title>Админ панель - HotelBooking</title>
  <link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
<header class="header">
  <div class="container">
    <nav class="navbar">
      <a href="index.html" class="logo">HotelBooking</a>
      <div class="auth-buttons">
        <a href="index.html" class="btn btn-secondary">Выйти</a>
      </div>
    </nav>
  </div>
</header>

<div class="admin-header">
  <div class="container">
    <nav class="admin-nav">
      <a href="#bookings"  name="filter" class="${fn:toLowerCase((param.filter)) == 'bookings' ? 'active' : ''}">Бронирования</a>
      <a href="#hotels" name="filter" class="${fn:toLowerCase((param.filter)) == 'hotels' ? 'active' : ''}">Отели</a>
      <a href="#users" name="filter" class="${fn:toLowerCase((param.filter)) == 'users' ? 'active' : ''}">Пользователи</a>
      <a href="#reports" name="filter" class="${fn:toLowerCase((param.filter)) == 'reports' ? 'active' : ''}">Отчеты</a>
    </nav>
  </div>
</div>

<main class="container">
  <!-- Статистика -->
  <div class="stats-grid">
    <div class="stat-card">
      <span class="stat-number">156</span>
      <span>Всего бронирований</span>
    </div>
    <div class="stat-card">
      <span class="stat-number">₽842,000</span>
      <span>Общий доход</span>
    </div>
    <div class="stat-card">
      <span class="stat-number">24</span>
      <span>Активные отели</span>
    </div>
    <div class="stat-card">
      <span class="stat-number">89%</span>
      <span>Заполняемость</span>
    </div>
  </div>

  <!-- Таблица бронирований -->
  <div class="data-table">
    
    <c:choose>
      <c:when test="${not empty param.filter}"></c:when>
    </c:choose>
    
    <div class="table-header">
      <h3>Последние бронирования</h3>
      <button class="btn btn-primary">Добавить бронирование</button>
    </div>

    <div class="table-container">
      <table>
        <thead>
        <tr>
          <th>ID</th>
          <th>Гость</th>
          <th>Отель</th>
          <th>Даты</th>
          <th>Сумма</th>
          <th>Статус</th>
          <th>Действия</th>
        </tr>
        </thead>
        <tbody>
        <tr>
          <td>#001</td>
          <td>Иван Иванов</td>
          <td>Премиум Отель</td>
          <td>15.01.2024 - 20.01.2024</td>
          <td>₽27,000</td>
          <td><span class="status-badge status-confirmed">Подтверждено</span></td>
          <td>
            <button class="btn btn-secondary">Редактировать</button>
            <button class="btn btn-danger">Отменить</button>
          </td>
        </tr>
<%--        <tr>--%>
<%--          <td>#002</td>--%>
<%--          <td>Мария Петрова</td>--%>
<%--          <td>Бизнес Отель</td>--%>
<%--          <td>18.01.2024 - 22.01.2024</td>--%>
<%--          <td>₽16,800</td>--%>
<%--          <td><span class="status-badge status-pending">Ожидание</span></td>--%>
<%--          <td>--%>
<%--            <button class="btn btn-secondary">Редактировать</button>--%>
<%--            <button class="btn btn-danger">Отменить</button>--%>
<%--          </td>--%>
<%--        </tr>--%>
        </tbody>
      </table>
    </div>

    <div class="table-header">
      <h3>Список пользователей</h3>
      <button class="btn btn-primary">Добавить пользователя</button>
    </div>

    <div class="table-container">
      <table>
        <thead>
        <tr>
          <th>ID</th>
          <th>fullName</th>
          <th>email</th>
          <th>phoneNumber</th>
          <th>password</th>
          <th>Действия</th>
        </tr>
        </thead>
        <tbody>
        <tr>
          <td>#001</td>
          <td>Иван Иванов</td>
          <td>Премиум Отель</td>
          <td>15.01.2024 - 20.01.2024</td>
          <td>₽27,000</td>
          <td>
            <button class="btn btn-secondary">Редактировать</button>
            <button class="btn btn-danger">Отменить</button>
          </td>
        </tr>
        </tbody>
      </table>
    </div>
  </div>
</main>

</body>
</html>
