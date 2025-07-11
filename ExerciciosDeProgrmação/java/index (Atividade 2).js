//Crie um programa que leia o valor do dólar e faça a conversão em reais. O usuário deverá inserir o valor da cotação atual do dólar (em reais) e o valor do produto (em dólar). O programa deverá imprimir o valor em reais.const prompt = require('prompt-sync')();

const prompt = require('prompt-sync')();

let valoremDolar = Number(prompt("Digite o valor em Dólar: "));
let valorEmReal = valoremDolar * 5.69; 

console.log('O valor em Real é: R$ ' + valorEmReal.toFixed(2));
