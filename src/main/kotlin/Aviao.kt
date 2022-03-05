class Aviao /*constructor (var modelo: String)*/{

    var modelo = ""
    var piloto = false
    var nPassageiros = 0
    var motorOnOff = false
    var rodas = 0
    var velocidade = 0.0
    var combustivel = 0

    fun partida(){

        if (piloto){
            println("A piloto está a bordo e pronta para partir.")
        }else{
            println("A piloto não está a bordo.")
        }

    }

    fun abastecer(){

        if (combustivel < 100){
            println("O nível de combustível está baixo, abasteça " +
                    "antes da viagem.")
        }else{
            println("Não é necessário abastecer.")
        }

    }

    fun ligaDeslM(){
        motorOnOff = !motorOnOff
    }

    override fun toString(): String {
        return "Piloto - $piloto" +
                "\nCombustível - $combustivel" +
                "\nMotor - $motorOnOff"
    }

}