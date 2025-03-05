package operaciones_compra;
import java.util.Scanner;

public class ventas_tienda {
    public static void main(String[] args){
        int opcion;
        Scanner dato_opcion = new Scanner(System.in);
        
        System.out.print("digite la ventas de la tienda:");
        opcion=dato_opcion.nextInt();
        
        for(int i=0; i<=opcion; i++){
            System.out.println("el conteo de las ventas de una tienda va en:");
        }
    }
    
}
