//Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

const prompt = require('prompt-sync')();
let numero = parseInt(prompt("Digite um número :"));

if (numero >= 1 && numero <= 10) {
  for (let contador = 1; contador <= 10; contador++) {
    let resultado = numero * contador;
    console.log(numero + " x " + contador + " = " + resultado);
  }
}