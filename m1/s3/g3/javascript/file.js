const bottone = document.querySelector("#bottone");
const input = document.querySelector("#taskInput");
const lista = document.querySelector("#lista");

bottone.addEventListener('click', function() {
    let li = document.createElement('li');
    li.innerText = input.value;
    

    li.addEventListener('click', () => {
        li.style.setProperty("text-decoration", "line-through");
    });
    let btn = document.createElement('button');
    btn.innerText = "elimina";

    btn.addEventListener('click',function(){
        li.remove()
    })

    li.append(btn)
    lista.append(li);
});





