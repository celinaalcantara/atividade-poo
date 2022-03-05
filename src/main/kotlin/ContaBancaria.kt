class ContaBancaria constructor(var nome: String){

    var conta = 0
    var agencia = 0
    var saldo = 0.0
    var senha = 0

    fun conferirS(valor: Int) {

        if (senha == 1999) {
            println("Senha inserida com sucesso.\n")
        }else{
            while (senha != 1999){
            println("Senha inválida, tente novamente.\n")
            }
        }
    }

    fun prtSaldo(){
        println("Seu saldo é R$$saldo")
    }

    fun deposito (valor: Double){

        if(valor <= 0){
            println("Não foi possível realizar depósito.")
        } else {
            saldo += valor
                println("Depósito de R$$valor realizado com sucesso.")
        }
    }

    fun saque (valor: Double){

        if(saldo < valor || saldo <= 0) {
            println("Saldo insuficiente.")
        }else if(valor <= 0){
                println("Ação inválida.")
        }else{
            saldo -= valor
            println("Saque de R$$valor realizado com sucesso.")
        }
    }

    override  fun toString(): String {
        return "Titular: $nome" +
                "\nConta: $conta" +
                "\nAgencia: $agencia" +
                "\nSaldo atual: R$$saldo"
    }

}