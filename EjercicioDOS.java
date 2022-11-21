import java.util.Scanner;

public class EjercicioDOS {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2 - La video tienda que presta sus servicios de alquiler de películas a los usuarios del barrio el Porvenir, requiere de una aplicación que permita registrar el alquiler de las películas que adquieren sus usuarios. Para cada usuario se debe permitir la opción de alquilar película, consultar películas disponibles y recibir película en la video tienda con la opción de realizar anotaciones sobre estas si se llegan a presentar daños u otra novedad sobre la película.");
        String nombre, apellido;
        int valor;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Bienvenido al Video club PORVENIR");
        System.out.println("Ingrese su nombre ");
        nombre = lectura.nextLine();
        System.out.println("Bienvenido:" + nombre);
        System.out.println("\n Menu \n" +
                "1-Alquiler Pelicula\n" + "2-Consultar Pelicula disponible\n" + "3-Recibir Pelicula en tienda\n");
        valor = lectura.nextInt();

        if (valor == 1) {
            System.out.println(nombre + " Esta alquilando una Pelicula");

        } else if (valor == 2) {
            System.out.println(nombre + " Consultando una Pelicula Disponible");
            System.out.println("Peliculas disponibles \n 1- Avatar.\n 2-Seven.\n");
            int alquiler = lectura.nextInt();
            if (alquiler == 1){
                System.out.println("Usted esta alquilando Avatar");
            }else{
                System.out.println("Usted esta alquilando Seven");
            }
        } else if (valor == 3) {
            System.out.println(nombre + " Esta Recibiendo una Pelicula en la tienda");
            System.out.println("Desea realizar alguna Comentario? - (1-Si/ 2-No)");
            int opcion = lectura.nextInt();
            if (opcion ==1 ) {
                System.out.println(nombre + " Que comentarios deseas Realizar ");
                String comentario = lectura.nextLine();
                System.out.println(comentario+ "\n Este es el comentario realizado ");
            } else {
                System.out.println(nombre + " Gracias por venir al Video club PORVENIR");
            }
        } else {
            System.out.println(nombre + " Gracias por venir al Video club PORVENIR, pero no es una opcion Valida ");
        }
    }
}
