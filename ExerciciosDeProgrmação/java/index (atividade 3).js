//Crie um programa que leia o número de horas trabalhadas no mês e o valor da hora. O programa deverá imprimir o salário que o funcionário deverá receber, calculando o desconto de 6% do vale transporte do funcionário.

const prompt = require('prompt-sync')();

let numeroDehoras = Number(prompt("Digite número de horas trabalhadas: "));
let valorDaHora = Number(prompt("Digite o valor por horas trabalhadas: "));

let valorSalario = valorDaHora * numeroDehoras ; 
let descontoValeTransporte = valorSalario * 0.06;
let salarioLiquido = valorSalario - descontoValeTransporte;

console.log(' o salário que o funcionário deverá receber: R$ ' + salarioLiquido .toFixed(2));