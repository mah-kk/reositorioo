//O coração humano bate em média uma vez por segundo. Desenvolver um programa para calcular e escrever quantas vezes o coração de uma pessoa baterá se viver X anos.

const prompt = require('prompt-sync')();

let anos = Number(prompt("Digite a idade : "));
let vezes = anos * 365 * 24 * 60 * 60; 

console.log('o coração de uma pessoa bateu  : ' + vezes.toFixed(2));