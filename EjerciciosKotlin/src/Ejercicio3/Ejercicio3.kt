fun main(){

    //Ejercicio 3

    val cofres =arrayOf("Espada", "Escudo", "Pocion") //

    //Ejemplo de for each
    for (cofre in cofres){
        println("Has encontrado un cofre con $cofre")
    }
    cofres.forEach{ cofre -> println("Has encontrado un cofre con $cofre") }

    //Ejemplo de for tradicional
    for (i in 0 until cofres.size){
        println("Has encontrado un cofre con ${cofres[i]}")
    }


/*
En ambos lenguaje tenemos la misma estructura de control, la cual es el bucle for.

Kotlin simplifica mucho el uso de los bucles for, ya que no es necesario declarar una variable de control.
Ejemplos de palabras claves para el uso de bucles for en Kotlin:
- in: Se utiliza para recorrer un rango de valores.
- until: Se utiliza para recorrer un rango de valores excluyendo el valor final.
- forEach: Se utiliza para recorrer una lista de elementos.


 */






}