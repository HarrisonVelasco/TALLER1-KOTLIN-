fun main() {
    println("""
                                               BIENVENIDO
        Aquí se determina el estado nutricional de una persona según su índice de masa corporal
        
    """.trimIndent())

    println("Ingrese su peso en kilogramos")
    var peso = readln().toInt()
    println("Ingrese su estatura en metros")
    var estatura = readln().toDouble()

    //Formula IMC = Peso(kg)/Estatura(m)*Estatura(m)
    var Resultado = peso / (estatura*estatura)

    //Clasificación IMC y su valor correspondiente
    if (Resultado < 16){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Delgadez severa
        """.trimIndent())
    }else if (Resultado >= 16 && Resultado <= 16.99){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Delgadez moderada
        """.trimIndent())
    }else if (Resultado >= 17 && Resultado <= 18.49){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Delgadez leve
        """.trimIndent())
    }else if (Resultado >= 18.50 && Resultado < 18.51 ){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Bajo peso
        """.trimIndent())
    }else if (Resultado > 18.5 && Resultado <= 24.99){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Normal
        """.trimIndent())
    }else if (Resultado >= 25.0 && Resultado < 25.1){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Sobrepeso
        """.trimIndent())
    }else if (Resultado >= 25.01 && Resultado <= 29.99){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Preobeso
        """.trimIndent())
    }else if (Resultado > 29 && Resultado < 30.1){//88 y 1.71
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Obesidad
        """.trimIndent())
    }else if (Resultado >= 30.1 && Resultado <= 39.9){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Obesidad leve
        """.trimIndent())
    }else if (Resultado >= 35.0 && Resultado <= 39.99){
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Obesidad media
        """.trimIndent())
    }else{
        println("""
            Su estado nutricional es el siguiente:
            IMC: ${Resultado}
            Su estado es: Obesidad mórbida
        """.trimIndent())
    }

// Código realizado 100% a conciencia y con apuntes de la clase
// No se realiza uso de algúna inteligencia artificial
}