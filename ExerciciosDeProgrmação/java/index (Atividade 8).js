//Desenvolver programa para ler o nome, idade e peso de três pessoas. Calcular e imprimir idade e o peso médio das três pessoas.

prompt = require('prompt-sync')();

let nome1 =prompt("Digite o nome da primeira pessoa:");
let idade1 =Number(prompt("Digite a idade da primeira pessoa:"));
let peso1 =Number(prompt("Digite o peso da primeira pessoa:"));

let nome2 =prompt("Digite o nome da segunda pessoa:");
let idade2 =Number(prompt("Digite a idade da segunda pessoa:"));
let peso2 =Number(prompt("Digite o peso da segunda pessoa :"));

let nome3 =prompt("Digite o nome da terceira pessoa:");
let idade3 =Number(prompt("Digite a idade da terceira pessoa:"));
let peso3 =Number(prompt("Digite o peso  da terceira pessoa:"));


  let Médiaidade = (idade1 + idade2 + idade3 ) / 3;
let Médiapeso = (peso1 + peso2 + peso3 ) / 3;
console.log('primeiro nome - '+ nome1, 'segundo nome - ' +nome2, 'terceiro nome - ' +nome3);
console.log('A média de idade é:',Médiaidade);
console.log('A média de peso é:',Médiapeso);
