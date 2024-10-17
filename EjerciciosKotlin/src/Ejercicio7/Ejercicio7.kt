fun main(){

    println(multiplicar(5))

    val operacion : (Int , Int )-> Int = { a,b -> a + b}
    println(operacion(3,4))

}

fun multiplicar(num: Int): Int {
    return (num * 2)
}

/*
En Kotlin, se pueden crear funciones de la misma forma que en Java, pero con una sintaxis más sencilla.

Simplemente la declaracion de la funcion multiplicar, es mucho mas compacta y sencilla que en Java.

En cuanto a las lambdas , en lugar de definir una interfaz funcional como en java, kotlin puedes definir directamente una lambda
usando una sintaxis mucho mas simple, despues se asigna la operacion  lambda a operacion, y define los parametros de la operacion lambda.

        **Las diferencias claves:
            - Kotlin es mas conciso y sencillo que Java. [Eliminacion de codigo innecesario o definir interfaces]
            - Sintaixs mas sencilla y facil de entender.
            - Funciones más concisas.

 */