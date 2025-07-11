//Escreva um programa para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário.
const prompt = require('prompt-sync')();

let salarioAtual = Number(prompt("Digite o valor do salário atual : "));
let reajuste = Number(prompt("Digite o valor do percentual de reajuste (%): "));

let novoSalario = salarioAtual + (salarioAtual * reajuste / 100); 


console.log(' o salário que o funcionário deverá receber: R$ ' + novoSalario .toFixed(2));