public class Main {
    public static void main(String[] args) {


        int energia = 80;

        if (energia>50){
            System.out.println("Personaje fuerte");
        }else {
            System.out.println("Personaje debil");
        }


        /*
        La estructura de condicional en kotlin es identica a la de java, pudiendose realizar en una sola linea

        Ejemplo: val estado = if (energia > 50) "Personaje fuerte" else "Personaje débil"

        Pero tenemos que declarar una variable para poder darle un valor, en cambio en java no es necesario declarar una variable para poder imprimir el resultado de la condición.


        En cuanto al operador ternario, en kotlin no existe, por lo que se debe utilizar la estructura de condicional if else para poder realizar una condición en una sola linea.
        en cambio en java si existe el operador ternario, por lo que se puede realizar una condición en una sola linea sin necesidad de utilizar la estructura de condicional if else.

        Ejemplo: String estado = energia > 50 ? "Personaje fuerte" : "Personaje débil";


         */



    }
}