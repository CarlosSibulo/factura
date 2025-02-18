public class campeonato {
    public static void main(String[] args){
        Scanner OpcionValor = new Scanner(System.in);
        System.out.print("por favor,ingrese el resultado");
        int valoropcion= OpcionValor.nextInt();
        switch (valoropcion){
            case 1:
                ganado();
            case 2:
                perdido();
            case 3:
                empatado();
        }
    }
    
}
