//Faça um programa que peça uma nota, entre zero e dez.Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
const prompt = require("prompt-sync")(); 
let nota;
do {
 nota = Number(prompt("Digite uma nota entre 0 e 10: "));
 if (nota < 0 || nota > 10) {
 console.log("Valor inválido! Por favor, digite uma nota entre 0 e 10.");
 }
} while (nota < 0 || nota > 10);
console.log(`Nota válida inserida: ${nota}`);