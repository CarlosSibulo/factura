public class cine {
    public static void main(String[] args){
        Scanner OpcionValor = new Scanner(System.in);
        System.out.print("por favor,ingrese su edad");
        int valoropcion= OpcionValor.nextInt();
        switch (valoropcion){
            case 1:
                niños de 7 años:(peliculas animadas educativas para todas las edades);
            case 2:
                 adolescemtes de 17 años:(peliculas animaciones, aventura, comedias familiares);
            case 3:
                Adultos de 18 y 3 años:(variedad de genero, accion, drama, comedia, ciencia ficcion);
            case 4:
                personas Mayores de 31 años:(pelicula clasicas, dramas);
            default: 
                System.out.print("lo siento su edad no cumple con los requistos");
        }
    }
    
}
