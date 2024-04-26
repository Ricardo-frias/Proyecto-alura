
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true){
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
                    break;
                case '2':
                    convertir(62.99, "Euros");
                    break;
                case '3':
                    convertir(64.33, "Francos Suisos");
                    break;
                case '4':
                    convertir(43.04, "Dolares Canadience");
                    break;
                case '5':
                    System.out.println(" --- Cerrando Programa --- ");
                    break;

                default:
                    System.out.println("--- OPCION INCORRERTA ---");
                    break;


            }

        }
    }


    static void  convertir(double valorDeLosPesosRD, String pais){
        Scanner leer = new Scanner(System.in);
        System.out.printf("  Ingrese la cantidad de pesos Dominicanos :", pais);
        double cantidadDeMonedas = leer.nextDouble();

        double pesosRD = cantidadDeMonedas / valorDeLosPesosRD;


        pesosRD = (double) Math.round(pesosRD * 100d)/100;

        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");
        System.out.println("   Tienes $"+pesosRD+"  pesos Dominicanos    ");
        System.out.println("rrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");

    }

}