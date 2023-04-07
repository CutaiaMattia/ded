let tabella = document.querySelector('.tabella');
let td1 = document.querySelector('.td1');
let td2 = document.querySelector('.td2');
let td3 = document.querySelector('.td3');

let rispostaURL="../risorse/message.json";
let risposta = new XMLHttpRequest();
risposta.open('GET', rispostaURL);
risposta.responseType = 'json';
risposta.send();

risposta.onload = ()=>{
    const classe = risposta.response;
    console.log(classe[0].descrizione);
}
const newElemento = document.createElement("p");
const nodo = document.createTextNode("This is new.");
newElemento.appendChild(nodo);

const element = document.getElementById("div1");
element.appendChild(newElemento);

// items.forEach((item) => {
//   item.addEventListener("click", function() {
//     item.classList.toggle('toggle-active');
//   });
// });