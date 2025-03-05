package operaciones_compra;
import java.util.Scanner;

public class operaciones_compra {
    public static void main(String[] args){
        int opcion;
        Scanner dato_opcion= new Scanner(System.in);
        
        System.out.print("digite la operacion para hacer la compra:");
        opcion=dato_opcion.nextInt();
        
        for(int i=0; i<=opcion; i++){
            System.out.println("el conteo de la compra va en:" + Integer.toString(i));
        }
    }
    
}
