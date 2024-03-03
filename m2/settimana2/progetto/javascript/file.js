let cambiopagina = document.getElementById("cambiopagina");

cambiopagina.addEventListener("click", function () {
    changePage("secondapagina.html");
});

function changePage(newPage) {
    window.location.href = newPage;
}
