public class menu {
    public static void main(String[] args){
        Scanner OpcionValor = new Scanner(System.in);
        System.out.print("por favor,ingrese su metod de pago");
        int valoropcion= OpcionValor.nextInt();
        switch(valoropcion){
            case 1:
                efectivo();
            case 2:
                tarjeta();
            case 3:
                credito();
            case 4:
                cheque();
            default:
                System.out.print("lo siento, fondos insufiecientes");
        }
    }
    
}
