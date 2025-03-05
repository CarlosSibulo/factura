package gestion_tareas;
import java.util.Scanner;


public class gestion_tareas {
    public static void main(String[]args){
        int opcion = 0;
        Scanner dato_opcion= new Scanner(System.in);
        
        do{
            System.out.println("menu de gestion de tareas");
            System.out.println("ingresa una tarea");
            System.out.println("modifica la tarea");
            System.out.println("elimina la tarea");
            System.out.println("salir de la lista de tarea");
            
            System.out.print("Seleccione una tarea:");
            int tarea = dato_opcion.nextInt();
        }
        while(opcion>5);
    }
    
}
