package operaciones_compra;
import java.util.Scanner;


public class Agenda_contacto {
    public static void main(String[] args){
        int opcion;
        Scanner dato_opcion = new Scanner(System.in);
        
        System.out.print("digite la agenda para hacer el contacto:");
        opcion=dato_opcion.nextInt();
        
        for(int i=0; i<=opcion; i++){
            System.out.println("el conteo para hacer el contacto va en:" + Integer.toString(i));
        }
    }
    
}
