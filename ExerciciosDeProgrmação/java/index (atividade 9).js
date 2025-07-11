//Uma autolocadora aluga seus carros com uma taxa fixa por dia, uma taxa por Km rodado e desconto de 10% na taxa fixa de aluguel por dia. Escrever um algoritmo que lê a taxa fixa por dia, a taxa por Km rodado, o número de dias, o número de quilômetro rodado e calcular e escrever o valor total do aluguel, o valor do desconto, o número de dias, e a quilometragem rodada.

prompt = require('prompt-sync')();

let taxafixa =prompt("Digite a taxa fixa por dia:");
let taxaporKmrodado =Number(prompt("Digite a taxa por Km rodado:"));
let numerodedias =Number(prompt("Digite o número de dias:"));
let numerodequilometrorodado =prompt("Digite o número de quilômetro rodado :");

let desconto = taxafixa * 0.10;
let taxafixacomdesconto = taxafixa - desconto;
let custodiario = taxafixacomdesconto * numerodedias;
let custoKm = taxaporKmrodado * numerodequilometrorodado;
let valortotaldoaluguel = custodiario + custoKm;


console.log("Número de dias: " + numerodedias);
console.log("Quilometragem rodada: " + numerodequilometrorodado + " km");
console.log("Valor do desconto por dia: R$ " + desconto.toFixed(2));
console.log("Valor total do aluguel: R$ " + valortotaldoaluguel.toFixed(2));