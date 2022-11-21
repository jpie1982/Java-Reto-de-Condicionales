import java.util.Scanner;

public class EjercicioUNO {
    public static void main(String[] args) {
        String nombre;
        String apellido;
        int edad;

        System.out.println("Ejercicio 1 - Realizar un programa en el cual se solicite el nombre, apellidos y edad de la persona. Si la persona es mayor o igual a 18 años, entonces se deberá imprimir en pantalla [Nombre completo] usted es mayor de edad, por lo tanto, puede entrar a la fiesta. Si la edad de la persona es menor que 18 años, entonces, deberá imprimirse el siguiente mensaje: [Nombre completo] usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa");
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese su nombre ");
        nombre = lectura.nextLine();
        System.out.println("Ingrese su apellido ");
        apellido = lectura.nextLine();
        System.out.println("Ingrese su edad ");
        edad = lectura.nextInt();
        if (edad > 18) {
            System.out.println(nombre + apellido +" es mayor de edad, por lo tanto, puede entrar a la fiesta");
        } else {
            System.out.println(nombre + apellido+" usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa.");
        }
    }
}
