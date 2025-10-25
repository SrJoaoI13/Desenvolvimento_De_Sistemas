// arraw function

const somar = (a,b) =>{
    return a + b
}

const multiplicar = (a,b) =>{
    return a * b
}

const divisao = (a,b) =>{
    
    if(b == 0){
        return("Divisao por 0 não é permitida")
    }else{
        return a / b
    }
}

const subtracao = (a,b) =>{
    return a - b
}

const soma = somar(2,3)
const multi = multiplicar(2,3)
const div = divisao(2,0)
const sub = subtracao(2,3)

console.log(`Soma: ${soma}`)
console.log(`Multiplicar: ${multi}`)
console.log(`Divisao: ${div}`)
console.log(`Subtracao: ${sub}`)