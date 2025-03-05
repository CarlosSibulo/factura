package registro_vehiculo;
import java.util.Scanner;


public class registro_vehiculo {
    public static void main(String[] args){
        int opcion;
        Scanner dato_opcion= new Scanner(System.in);
        
        System.out.print("digite la placa del auto");
        opcion=dato_opcion.nextInt();
        
        for(int i=0; i<=opcion; i++){
            System.out.println("El conteo de vehiculo va en:" + Integer.toString(i));
        }
    }
}

