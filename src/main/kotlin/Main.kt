fun main() {
    print(
        "Qual operação você deseja realizar?" +
                "\n1)Adição \n2)Subtração \n3)Multiplicação \n4)Divisão" +
                "\nDigite o número da opição escolhida: "
    )

    val esco = readLine()!!.toInt()
    print("Digite o primeiro número: ")
    val num1 = readLine()!!.toDouble()

    print("Digite o primeiro número: ")
    val num2 = readLine()!!.toDouble()


    if (esco == 1) {
        println("Adição resultado: ${Calculadora.soma(num1, num2)}")

    } else if (esco == 2) {
        println("Subtração resultado: ${Calculadora.sub(num1, num2)}")

    } else if (esco == 3) {
        println("Multiplicação resultado: ${Calculadora.mult(num1, num2)}")

    } else if (esco == 4) {
        println("Adição resultado:  ${Calculadora.div(num1, num2)}")
    }
}

/* Segundo modo de fazer uma calculadora utilizando funções para cada operação matemática:

    1 - Adição
    2 - Subtração
    3 - Multiplicação
    4 - Divisão

println("**Calculadora***\n")
print ("Digite o 1° número:  ")
val num1 = readLine ()!!.toDouble()

print ("Digite o 2° número:  ")
val num2 = readLine ()!!.toDouble()
var operacao: Int

do{
    println("Digite a operação matematica que deseja realizar, " +
            "considerando 1 -Adição, 2 -Subtração, 3 -Multiplicação, 4 -Divisão")
    operacao = readLine()!!.toInt()

    if(!(operacao == 1 || operacao == 2 || operacao == 3 || operacao == 4)){
        println("Operação inválida")
    }

}while (!(operacao == 1  || operacao == 2 || operacao == 3  || operacao == 4))

val opcao = when (operacao){

    1 -> "Adição e o resulatdo =  ${Calculadora.soma(num1,num2)}"
    2 -> "Subtração e o resulatdo = ${Calculadora.sub(num1,num2)}"
    3 -> "Multiplicação e o resulatdo =  ${Calculadora.mult(num1,num2)} "
    4 -> "Divisão e o resulatdo = ${Calculadora.div(num1,num2)}"
    else -> "Operação inválida"
}
println("A operação escolhida foi: $opcao")
}*/










