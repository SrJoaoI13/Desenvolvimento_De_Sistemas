// Atividade

// vetores de numeros

const numeros = [1,2,3,4,5];

//crie uma nova lista comos numeros com o valor dobrado do vetor numeros

//mostre os numeros pares

//Apresente a somo de todos os numeros

const numerosDobrados = numeros.map(n => n * 2);
console.log("\nNúmeros dobrados:");
console.log(numerosDobrados);

const numerosPares = numeros.filter(n => n % 2 === 0);
console.log("\nNúmeros pares:");
console.log(numerosPares);

const somaNumeros = numeros.reduce((soma, n) => soma + n, 0);
console.log("\nSoma de todos os números:");
console.log(somaNumeros);
