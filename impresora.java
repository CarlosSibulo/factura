public class impresora_1 {
    public static void main(String[]args){
        int opcion = 0;
        Scanner dato_opcion= new Scanner(System.in);
        System.out.print("por favor, ingresa la cantidad de paginas que desea imprimir");
        opcion= dato_opcion.nextInt();
        while (opcion){
            System.out.println("imprimiendo espere un momento");
            System.out.println("ya terminamos de imprimir");
            System.out.println("desea imprimir mas paginas");
            System.out.println("lo siento se han acabado las paginas");
        }
    }
    
}
