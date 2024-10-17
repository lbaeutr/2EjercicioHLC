      class Ejercicio6 {

    /*
    El manejo de tipos nulos en kotlin es diferente a java, en kotlin se debe especificar si una variable puede ser nula o no,
    mientras que en java no es necesario especificar si una variable puede ser nula o no.

    En kotlin se utiliza el operador ? para especificar que una variable puede ser nula,
    mientras que en java se utiliza el operador null para especificar que una variable puede ser nula.

    Ejemplo en kotlin: var personaje: String? = null
    Ejemplo en java: String personaje = null;

    En java cualquier referencia puede ser nula, pero no hay frma explicita de indicar si una variable puede ser nula o no.
    Es responsabilidad del programador realizar las verificaciones necesarias antes de acceder a una variable nula , de lo contrario, se generará una excepción NullPointerException.
     */



        public static void main(String[] args) {


            String personaje = null;

            if (personaje != null) {
                System.out.println("El personaje es " + personaje);

            } else {
                System.out.println("No hay personaje");
            }
        }

      }