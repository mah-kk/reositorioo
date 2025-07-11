//Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números ímpares.

prompt = require('prompt-sync')();

let numero1 =Number(prompt("Digite o primeiro numero :"));
let numero2 =Number(prompt("Digite o segundo numero:"));
let numero3 =Number(prompt("Digite o terceiro numero:"));
let  numero4 =Number(prompt("Digite o quarto numero:"));
let  numero5 =Number(prompt("Digite o quinto numero:"));
let numero6 =Number(prompt("Digite o sexto numero:"));
let numero7 =Number(prompt("Digite o setimo numero:"));
let numero8 =Number(prompt("Digite o oitavo numero:"));
let numero9 =Number(prompt("Digite o nono numero:"));
let numero10 =Number(prompt("Digite o decimo numero:"));


let numeros = [numero1, numero2, numero3, numero4, numero5, numero6, numero7, numero8, numero9, numero10];
let pares = 0;
let impares = 0;
let contador = 0;

for (contador = 0; contador < numeros.length; contador++)
  if (numeros[contador] % 2 === 0)
    pares++;
  else
    impares++;
{
    console.log(contador);
  }


console.log(`Quantidade de números pares: ${pares}`);
console.log(`Quantidade de números ímpares: ${impares}`);






