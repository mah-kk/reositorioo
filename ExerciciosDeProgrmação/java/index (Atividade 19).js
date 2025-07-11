//Achar o maior, menor, média e organizar números ou sequências são os algoritmos maisimportantes e estudados em Computação. Em C não poderia ser diferente.Em nosso curso, obviamente, também não será diferente.Escreva um programa em C que solicita 10 números ao usuário, através de um laço while,e ao final mostre qual destes números é o maior
const prompt = require('prompt-sync')();
let contador = 1;
let numero = Number(prompt("Digite o número 1: "));
let maior = numero;
while (contador < 10) {
 numero = Number(prompt("Digite o número " + (contador + 1) + ": "));
 if (numero > maior) {
 maior = numero;
 }
 contador++;
}
console.log("O maior número digitado foi:", maior);