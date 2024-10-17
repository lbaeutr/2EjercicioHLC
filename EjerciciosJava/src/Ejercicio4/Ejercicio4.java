public class Ejercicio4 {
    public static void main(String[] args) {

        //Explicr la diferencia en como kotlin maneja rangos y control de flujo a comparación de java

        //En kotlin los rangos se pueden definir de la siguiente manera:
        //val rango = 1..5
        //val rango2 = 1 until 5
        //val rango3 = 5 downTo 1
        //val rango4 = 5 downTo 1 step 2 ()


        for (int i = 1;i<=5;i++){

            if (i==3){

                continue;
            }
            System.out.println(i);

        }

        for (int i = 0;i<5;i++){

            if (i==3){

                break;
            }
            System.out.println(i);

        }

        /*
        La diferencia entre continue
        y break en java es que continue se utiliza para saltar a la siguiente iteración del ciclo,
        mientras que break se utiliza para salir del ciclo.
         */









    }
}