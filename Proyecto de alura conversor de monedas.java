
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true){ // este es el bucle inicial, y lo hice asi para poder usar las opciones cuantas veces sean necesarias.
            System.out.println(" CONVERSOR DE MONEDE DE RICARDO.F.D ");
            System.out.println("1  -  Dolares\n");
            System.out.println("2  -  Euros\n");
            System.out.println("3  -  Francos Suisos\n");
            System.out.println("4  -  Dolares Canadience\n");
            System.out.println("5  -  Salir/Exit \n");

            System.out.println(" INGRESE UNA OPCION:  ");
            Scanner leer = new Scanner(System.in);
            char opcion = leer.next().charAt(0);

            switch (opcion){ 
                case '1':
                    convertir(58.75, "Dolares");
                    break; // esta es na convercion de pesos a dolar .
                case '2':
                    convertir(62.99, "Euros");
                    break; // esta es na convercion de pesos a euros.
                case '3':
                    convertir(64.33, "Francos Suisos");
                    break;  // esta es na convercion de pesos a francos suisos.
                case '4':
                    convertir(43.04, "Dolares Canadience");
                    break; // esta es na convercion de pesos a dolar canadience.
                case '5':
                    System.out.println(" --- Cerrando Programa --- ");
                    break; //necesito ayuda con esta linia que no puedo terminar el bucle solo con el break.

                default:
                    System.out.println("--- OPCION INCORRERTA ---");
                    break; // estos es por si ponen una opcion incorrecta dentro de los caracteres.
                    break;  // estos es por si ponen una opcion incorrecta dentro de los caracteres.


            }

        }
    }

// aqui abajo esta el codigo o mejor dicho las varias que utilize para hacer la covercion entre todas las opciones
    static void  convertir(double valorDeLosPesosRD, String pais){
        Scanner leer = new Scanner(System.in);
        System.out.printf("  Ingrese la cantidad de pesos Dominicanos :", pais);
        double cantidadDeMonedas = leer.nextDouble();

        double pesosRD = cantidadDeMonedas / valorDeLosPesosRD;


        pesosRD = (double) Math.round(pesosRD * 100d)/100;

        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("   Tienes $"+pesosRD+"  pesos Dominicanos    ");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");

        //nota fue un poco complicado usar todas ociones con este solo codigo pero lo logre espero que este bien realizado
        // si tienen algun consejo por favor mandarmelo. por que en verdad lo necesito para mejorar

    }

}