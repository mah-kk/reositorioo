//A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o n−ésimo termo que deverá ser pedido pelo usuário.

const prompt = require('prompt-sync')();

let termos = parseInt(prompt("Digite a quantidade de termos da sequência de Fibonacci: "));
let fibonacci = [1, 1];
let contador = 1;

for (contador = 2; contador < termos; contador++) {
    fibonacci[contador] = fibonacci[contador - 1] + fibonacci[contador - 2];
}

console.log("Sequência de Fibonacci:", fibonacci.join(", "));


        
        


