function drop_pages() {
    document.getElementById("dropdown-pages").classList.toggle("show");
}

function drop_links(){
    document.getElementById("dropdown-links").classList.toggle("show");

}

window.onclick = function(event) {
    if (!event.target.matches('.functiondropbtn')) {
        var dropdowns = document.getElementsByClassName("dropdown-content");
        var i;
        for (i = 0; i < dropdowns.length; i++) {
            var openDropdown = dropdowns[i];
            if (openDropdown.classList.contains('show')) {
                openDropdown.classList.remove('show');
            }
        }
    }
}

$(function(){
    $('table').wrap('<div class="big-table"></div>');

    function resize_table_box() {
        $('.big-table').each(function(){
            var box_width = $(this).outerWidth();
            var table_width = $(this).children('table').prop('scrollWidth');
            $(this).removeClass('scroll-left');
            if (table_width > box_width) {
                $(this).addClass('scroll-right');
            } else {
                $(this).removeClass('scroll-right');
            }
        });
    }

    resize_table_box();
    $( window ).on('resize', function() {
        resize_table_box();
    });

    $('.big-table table').on('scroll', function() {
        var parent = $(this).parent();
        if ($(this).scrollLeft() + $(this).innerWidth() >= $(this)[0].scrollWidth) {
            if (parent.hasClass('scroll-right') ){
                parent.removeClass('scroll-right');
            }
        } else if ($(this).scrollLeft() === 0){
            if (parent.hasClass('scroll-left')){
                parent.removeClass('scroll-left');
            }
        } else {
            if(!parent.hasClass('scroll-right')){
                parent.addClass('scroll-right');
            }
            if(!parent.hasClass('scroll-left')){
                parent.addClass('scroll-left');
            }
        }
    });
});