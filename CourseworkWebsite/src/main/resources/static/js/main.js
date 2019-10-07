function swapStyleSheet(styleSheet) {

    document.getElementById('pagestyle').setAttribute('href', styleSheet)

}


document.onmousemove = circles;
function circles(event) {
    var circle = document.createElement("div");
    circle.setAttribute("class", "circle");
    document.body.appendChild(circle);

    circle.style.left = event.clientX + 'px';
    circle.style.top = event.clientY + 'px';

    circle.style.transition = "all 0.5s linear 0s";

    circle.style.left = circle.offsetLeft - 1 +  window.pageXOffset + 'px';
    circle.style.top = circle.offsetTop - 1 + window.pageYOffset + 'px';




    circle.style.width = "1px";
    circle.style.height = "1px";
    circle.style.borderWidth = "0px";
    circle.style.opacity = 0;


}
