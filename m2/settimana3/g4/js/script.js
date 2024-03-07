async function chiamata(query){

    const apiKey = 'aIDLRjBQHgnA4Opj1GGAQ0jiXWp5GghLIZxes7sS1hG5Fw9wbzcdAKdV';
    
    return await fetch(`https://api.pexels.com/v1/search?query=${query}`, {
        method: 'GET',
        headers: {
            Authorization: apiKey
        }
    }).then(dati => dati.json())
}

function generaClone(){
    //crea un clone del template e inseriscilo nella row
    let template = document.querySelector('#card-template')
    let clone = template.content.cloneNode(true)

    return clone;
}



chiamata('pizza').then(pizze => {

  console.log(pizze);

})
