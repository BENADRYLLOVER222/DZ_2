<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <title>News Page</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles/header.css">
    <link rel="stylesheet" href="styles/news.css">
</head>

<body>
    <header>
        <div class="logo-pc">
            <img src="https://i.ibb.co/18QBf0h/logo.png" alt="logo">
        </div>
        <!-- MENU -->
        <nav>
            <ul class="menu">
                <li id="menuOpen">
                    <button id="menuButton"><a href="#">☰ MENU</a></button>
                    <ul>
                        <li><a href="MyController?command=go_to_add_page">ADD NEWS</a></li>
                        <li><a href="/news">NEWS</a></li>
                        <li><a href="#">CONTACT</a></li>
                        <li><a href="MyController?command=do_logout">LOGOUT</a></li>
                    </ul>
                </li>
                <button id="cartButton"><a href="cart.html">🛒 CART</a></button>
            </ul>
        </nav>
        <!-- END MENU -->
    </header>

    <!-- PAGE CONTENT START -->
    <div class="page-content">
        <div class="logo-mobile">
            <img src="https://i.ibb.co/18QBf0h/logo.png" alt="logo">
        </div>

        <section class="cards">
            <div class="container container__cards">
                <c:forEach var="news" items="${requestScope.mainNews}">
                    <div class="card">
                        <div class="card__top">
                            <a href="#" class="card__img">
                                <img src="${news.imgPath}" alt="${news.title}">
                            </a>
                        </div>
                        <div class="card__bottom">
                            <div class="card__title" style="font-size: 24px;">
                                <a href="#">
                                    <span>${news.title}</span>
                                </a>
                            </div>
                            <div class="card__anons">
                                <a href="#">
                                    <span>${news.brief}</span>
                                </a>
                            </div>
                            <div class="readMore">
                                <a href="#">
                                    <button class="readMore">Читать далее...</button>
                                </a>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </section>
    </div>
    <!-- PAGE CONTENT END -->

    <div class="company">
        <img src="https://i.ibb.co/bLSdcL1/company.png" alt="company">
    </div>

    <!-- FOOTER -->
    <footer>
        <a href="#">INSTAGRAM</a>
        <span> / </span>
        <a href="#">TELEGRAM</a>
        <span> / </span>
        <a href="#">TWITTER</a>
        <span> / </span>
        <a href="#">YOUTUBE</a>
    </footer>
    <!-- END FOOTER -->

    <!-- SCRIPTS -->
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <script src="js/menu.js"></script>
    <!-- END SCRIPTS -->
</body>

</html>