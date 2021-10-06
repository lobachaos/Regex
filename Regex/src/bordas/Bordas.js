const texto = 'Romário era um excelente jogador\n, mas hoje é um político questionador'

console.log(texto.match(/^r/ig)) // ^ inicio da palavra
console.log(texto.match(/r$/ig)) // $ final da palavra

console.log(texto.match(/^r.*r$/)) // problema do DOTALL
console.log(texto.match(/^r[\s\S]*r$/ig))  // Possivel solução pro dotall