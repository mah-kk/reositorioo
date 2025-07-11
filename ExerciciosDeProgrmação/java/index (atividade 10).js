//Escrever um programa que lê a taxa de consumo de potência elétrica de um refrigerador, o tempo em horas que permaneceu ligado e o valor do quilowatt hora e calcular e escrever a energia total gasta pelo refrigerador, bem como, o valor a ser pago à companhia de Energia Elétrica

prompt = require('prompt-sync')();

let taxadeconsumo =prompt("Digite a taxa de consumo de potência elétrica de um refrigerador:");
let horas =Number(prompt("Digite o tempo em horas que permaneceu ligado:"));
let quilowatt =Number(prompt("Digite o  valor do quilowatt hora:"));

let energia = taxadeconsumo * horas / 1000
let valor = energia * quilowatt;

console.log("Energia total gasta: " + energia.toFixed(2) + " kWh")
console.log("Valor a ser pago: R$ " + valor.toFixed(2));
