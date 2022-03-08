fun main(){

    //Avião
    /* 2) Crie uma classe avião e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto avião, defina as instancias deste
    objeto e apresente as informações deste objeto no console.*/

    /*val aviao = Aviao("Abd456")

    aviao.piloto = true
    aviao.nPassageiros = 30
    aviao.motorOnOff = false
    aviao.rodas = 6
    aviao.velocidade = 0.0
    aviao.combustivel = 120

    aviao.partida()

    aviao.abastecer()

    aviao.ligaDeslM()

    println(aviao)
}


    //Conta Bancária
    *//*6) Crie uma classe conta bancaria e apresente os atributos e métodos
    referentes esta classe, em seguida crie um objeto conta bancaria,
    defina as instancias deste objeto e apresente as informações deste
    objeto no console.*/

    val titular = ContaBancaria("Prince")
    var saldo = 0.0
    var contador = 0

    titular.nome = "Prince"
    titular.conta = 1958
    titular.agencia = 84
    titular.saldo = 1000.0
    titular.senha = 1999

    println(titular)

    println("Digite a senha: ")
    var senha = readLine()!!. toInt()

    titular.conferirS(senha)

    println("Digite o valor do saque: ")
    val saque = readLine()!!.toDouble()

    titular.saque(saque)

    println("Digite o valor do depósito: ")
    val deposito = readLine()!!.toDouble()

    titular.deposito(deposito)

    println("\nMovimentação na conta\n$titular")
}