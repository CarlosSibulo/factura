package operaciones_compra;
import java.util.Scanner;


public class lista_numeros {
    public static void main(String[] args){
        int opcion;
        Scanner dato_opcion = new Scanner(System.in);
        
        System.out.print("digite la lista de numero:");
        opcion=dato_opcion.nextInt();
        
        for(int i=0; i<=opcion; i++){
            System.out.println("el conteo de la lista de numero va en:"+ Integer.toString(i));
        }
    }
}
