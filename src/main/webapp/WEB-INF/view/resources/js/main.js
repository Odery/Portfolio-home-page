$(document).ready(function () {
    // Scroll to bottom
    $(document).on("click", 'a[href^="#about"]', function (event) {
        event.preventDefault();
        //hiding sideNav
        $(".button-collapse").sideNav("hide");

        $("html, body").animate({
            scrollTop: $(document).height() - $(window).height()
        });
    });

    // Init Sidenav
    $(".button-collapse").sideNav();

    // Init Modal
    $(".modal").modal();

    // Scrollfire
    // noinspection JSAnnotator
    const options = [
        {
            selector: ".row-1",
            offset: 50,
            callback: function (el) {
                Materialize.fadeInImage($(el));
            }
        },
        {
            selector: ".row-2",
            offset: 300,
            callback: function (el) {
                Materialize.fadeInImage($(el));
            }
        },
        {
            selector: ".row-3",
            offset: 400,
            callback: function (el) {
                Materialize.fadeInImage($(el));
            }
        }
    ];

    Materialize.scrollFire(options);
});
