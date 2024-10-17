fun main(){

    val personaje = Personaje("goku", 100, 50)
    personaje.mostrarInfo()

}


/*
En Kotlin, se pueden crear clases de la misma forma que en Java, pero con una sintaxis más sencilla.
Ejemplo de la creación de una clase en Kotlin:

como vemos en el ejemplo, la clase Personaje tiene tres atributos, nombre, vida y nivel,
los cuales son inicializados en el constructor de la clase que esta en la misma linea de la declaración de la clase.

De esta forma se puede simplificar la creación de clases en Kotlin, como por ejemplo la creación de un constructor, o los getters y setters de los atributos de la clase,
ya que Kotlin los crea de forma automática.

 */


class Personaje(val nombre: String, var vida: Int, var nivel: Int){


    fun mostrarInfo(){
        println("El personaje $nombre tiene $vida puntos de vida")
    }
}