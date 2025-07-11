//Escreva um programa que lê o tamanho do lado de um quadrado e imprime um quadradodaquele tamanho com asteriscos e espaços em branco. Seu programa deve funcionarpara quadrados com lados de todos os tamanhos entre 1 e 20.

const prompt = require('prompt-sync')();
let lado = Number(prompt("Digite o tamanho do lado do quadrado (1 a 20): "));
if (lado < 1 || lado > 20) {
 console.log("Tamanho inválido. Digite um número entre 1 e 20.");
} else {
 let linha = 0;
 while (linha < lado) {
 let coluna = 0;
 let resultado = "";
 while (coluna < lado) {
 if (linha === 0 || linha === lado - 1 || coluna === 0 || coluna === lado - 1) {
 resultado += "*";
 } else {
 resultado += " ";
 }
 coluna++;
 }
 console.log(resultado);
 linha++;
 }
}