package resultados_examenes;

import java.util.Scanner;
import javax.lang.model.SourceVersion;

public class resultados_examenes {
    public static void main(String[] args){
        int opcion = 0;
        Scanner dato_opcion= new Scanner(System.in);
        
        do{
            System.out.println("Lista de estudiantes");
            System.out.println("Ingrese el nombre del estudiante");
            System.out.println("Modifique el estudiante");
            System.out.println("Elimine el estudiante");
            System.out.println("Salir de la lista de esttudiantes");
            
            System.out.print("Seleccione el nombre del estudiante");
            opcion=dato_opcion.nextInt();
        }
        while(opcion>5);
    }
    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
}

