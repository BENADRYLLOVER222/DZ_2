<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>News Page</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles/header.css">
    <link rel="stylesheet" href="styles/add.css">
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
                    <button id="menuButton"><a href="#">  MENU</a></button>
                    <ul>
                        <li><a href="MyController?command=go_to_add_page">ADD NEWS</a></li>
                        <li><a href="MyController?command=go_to_main_page">NEWS</a></li>
                        <li><a href="#">CONTACT</a></li>
                        <li><a href="MyController?command=do_logout">LOGOUT</a></li>
                    </ul>
                </li>
                <button id="cartButton"><a href="cart.html"> CART</a></button>
            </ul>
        </nav>
        <!-- END MENU -->
    </header>


<!---------------------------------------------------------PAGE CONTENT START-------------------------------------------------->
<form action="MyController" method="post">
 <input type="hidden" name="command" value="add_news"/>
    <input type="text" name="title" placeholder="Title">
    <input type="text" name="brief" placeholder="Brief">
    <input type="text" name="info" placeholder="Info">
    <input type="text" name="image" placeholder="Image link">
    <textarea name="full_text" placeholder="Full text"></textarea>
    <button type="submit">ADD NEWS</button>
</form>
<!----------------------FOOTER---------------------->
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
<!---------------------------------------------------------SCRIPTS-------------------------------------------------->
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="js/menu.js"></script>
</body>

</html>