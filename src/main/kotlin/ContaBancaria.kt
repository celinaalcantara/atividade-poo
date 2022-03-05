class ContaBancaria /*constructor(var nome: String)*/ {


    var nome = ""
    var conta = 0
    var agencia = 0
    var saldo = 0.0

    fun prtSaldo(valor: Double){
        println("Seu saldo é R$$saldo")
    }

    fun deposito(valor: Double){

        if(valor <= 0){
            println("Não foi possível realizar depósito.")
        } else {
            saldo += valor
                println("Depósito realizado com sucesso.")
        }
    }

    fun saque (valor: Double){

        if(saldo < valor && saldo <= 0){
            println("Saldo insuficiente.")

        }else{
            saldo -= valor
            println("Saque realizado com sucesso.")
        }
    }


}