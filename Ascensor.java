package ascensor;

import java.util.Scanner;


public class Ascensor {

    
    public static void main(String[] args) {
        String numero_pisos="5";
        Scanner TomarDatos = new Scanner(System.in);
        System.out.print("por favor,ingrese el piso:");
        int numero = TomarDatos.nextInt();
        TomarDatos.close();
        Scanner ProcesarDatos = new Scanner(System.in);
        int numero = ProcesarDatos .nextInt();
        ProcesarDatos.close();
         if(numero==5){
            System.out.println("el piso es valido");
        }
        else{
            System.out.println("el piso es invalido");
        }
    }
    
}
