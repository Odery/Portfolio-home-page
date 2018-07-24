<!DOCTYPE html>
<html>

<head>
    <!--Import Google Icon Font-->
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
    <!--Import materialize.css-->
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}resources/css/materialize.min.css"/>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}resources/css/main.css"/>

    <!-- Page Icon-->
    <link rel="icon" type="image/png" href="${pageContext.request.contextPath}resources/img/icon.PNG"/>

    <!--Let browser know website is optimized for mobile-->
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Vakamisu Projects Portfolio</title>
</head>

<body>
<!-- Header -->
<header class="main-header">
    <nav class="transparent nav-wrapper z-depth-0">
        <div class="nav-wrapper">
            <a href="#" data-activates="mobile-nav" class="button-collapse show-on-large">
                <i class="material-icons">menu</i>
            </a>
            <a href="#" class="brand-logo" style="white-space: nowrap ;">Stepan Romanchuk</a>
            <ul class="right hide-on-med-and-down">
                <li class="active">
                    <a href="index.html">Home</a>
                </li>
                <li>
                    <a href="logos.html">Spring</a>
                </li>
                <li>
                    <a href="gaming.html">JSF</a>
                </li>
                <li>
                    <a href="gaming.html">JSP&Servlets</a>
                </li>
                <li>
                    <a class="close-sideNav" href="#about">About</a>
                </li>
            </ul>

        </div>
        <ul class="side-nav " id="mobile-nav">
            <li class="active">
                <a href="index.html">Home</a>
            </li>
            <li>
                <a href="logos.html">Spring</a>
            </li>
            <li>
                <a href="gaming.html">JSF</a>
            </li>
            <li>
                <a href="gaming.html">JSP&Servlets</a>
            </li>
            <li>
                <a href="#about">About</a>
            </li>
        </ul>
    </nav>
    <h1 class="center">Projects Portfolio</h1>
</header>

<!-- Section: Main -->
<section class="section section-main">
    <div class="container">
        <!-- Row 1 -->
        <div class="row row-1">
            <div class="col m6">
                <div class="img-content">
                    <h3>Spring</h3>
                    Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ut est similique aut officia unde ratione
                    a impedit sunt numquam
                    ea?
                </div>
            </div>
            <div class="col m6">
                <div class="card">
                    <div class="card-image">
                        <img src="img/gallery/abstract1.jpg" alt="">
                        <span class="card-title">Spring</span>
                        <a href="#abstract1"
                           class="btn-floating btn-large halfway-fab waves-effect waves-light red modal-trigger">
                            <i class="material-icons">launch</i>
                        </a>
                    </div>
                    <div class="card-content">
                        <a href="#">
                            <img class="hovGit" src="img/GitHub-Logo.png" width="17%" height="17%"/>
                        </a>
                    </div>
                </div>
            </div>
        </div>

        <!-- Row 2 -->
        <div class="row row-2">
            <div class="col m6">
                <div class="card">
                    <div class="card-image">
                        <img src="img/gallery/abstract2.jpg" alt="">
                        <span class="card-title">JSF</span>
                        <a href="#abstract2" class="btn-floating btn-large halfway-fab waves-effect waves-light red">
                            <i class="material-icons">launch</i>
                        </a>
                    </div>
                    <div class="card-content">
                        <a href="#">
                            <img class="hovGit" src="img/GitHub-Logo.png" width="17%" height="17%"/>
                        </a>
                    </div>
                </div>
            </div>
            <div class="col m6">
                <div class="img-content">
                    <h3>JSF</h3>
                    Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ut est similique aut officia unde ratione
                    a impedit sunt numquam
                    ea?
                </div>
            </div>
        </div>

        <!-- Row 3 -->
        <div class="row row-3">
            <div class="col m6">
                <div class="img-content">
                    <h3>JSP&Servlets</h3>
                    Lorem ipsum, dolor sit amet consectetur adipisicing elit. Ut est similique aut officia unde ratione
                    a impedit sunt numquam
                    ea?
                </div>
            </div>
            <div class="col m6">
                <div class="card">
                    <div class="card-image">
                        <img src="img/gallery/abstract3.jpg" alt="">
                        <span class="card-title">JSP&Servlets</span>
                        <a href="#abstract3"
                           class="btn-floating btn-large halfway-fab waves-effect waves-light red modal-trigger">
                            <i class="material-icons">launch</i>
                        </a>
                    </div>
                    <div class="card-content">
                        <a href="#">
                            <img class="hovGit" src="img/GitHub-Logo.png" width="17%" height="17%"/>
                        </a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!-- Footer -->
<footer class="page-footer">
    <div class="container">
        <div class="row">
            <div class="col l6 s12">
                <h5 class="white-text">About Me</h5>
                <p class="grey-text text-lighten-4">You can use rows and columns here to organize your footer
                    content.</p>
            </div>
            <div class="col l4 offset-l2 s12">
                <h5 class="white-text">Links</h5>
                <ul>
                    <li>
                        <a class="grey-text text-lighten-3" href="index.html">Abstract</a>
                    </li>
                    <li>
                        <a class="grey-text text-lighten-3" href="logos.html">Logos</a>
                    </li>
                    <li>
                        <a class="grey-text text-lighten-3" href="gaming.html">Gaming</a>
                    </li>

                </ul>
            </div>
        </div>
    </div>
    <div class="footer-copyright">
        <div class="container">
            © 2018 Vakamisu
        </div>
        <a name="about"/>
    </div>
</footer>

<!--Import jQuery before materialize.js-->
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/materialize.min.js"></script>
<script type="text/javascript" src="js/main.js"></script>
</body>

</html>