//Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

let contador = 1;
let soma = 0;
let divisores=0;

for (contador = 1; contador <= 50; contador++) {
  if ( contador % 2 !== 0) {
    console.log(contador);
  }
}
