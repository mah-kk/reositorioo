//Faça um programa para executar as seguintes conversões:– Ler uma temperatura em Fahrenheit e imprimir o equivalente em Celsius C=(5F-160)/9.– Ler uma quantidade de chuva dada em polegadas e imprimir o equivalente em milímetros (1 polegada = 25,4 mm).Declare uma constante para valor de 1 polegada em mm (milimetro_pol 25.4)

const prompt = require('prompt-sync')();

const milimetroPorPolegada = 25.4;

let fahrenheit = Number(prompt("Digite a temperatura em Fahrenheit: "));
let celsius = (5 * fahrenheit - 160) / 9;
console.log("Temperatura em Celsius: " + celsius.toFixed(2));

let polegadas = Number(prompt("Digite a quantidade de chuva (em polegadas): "));
let milimetros = polegadas * milimetroPorPolegada;
console.log("Quantidade de chuva em milímetros: " + milimetros.toFixed(2));