import java.util.Scanner;

public class EjercicioTRES {
    public static void main(String[] args) {
        //- La Droguería Mi Salud presta sus servicios en la localidad de Suba y requiere una aplicación para poder facturar los productos que vende a sus clientes y para ello, los productos tienen unas características que deben indicársele al cliente para que pueda escoger el producto a comprar. Para cada cliente, se tienen las opciones de compra de producto, consulta de precios por producto y devoluciones en caso de que se presenten.
        System.out.println("Ejercicio 3 - ");
        System.out.println("Drogueria mi Salud ");
        String nombre;
        int opcion, seleccion, analgesico=115, cremas=536, medicamentos=383;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Cual es su nombre");
        nombre = lectura.nextLine();
        System.out.println("Bienvenido " + nombre);
        System.out.println("Menu\n" + "Que producto deseas\n" + "1-Analgesicos\n" + "2-Cremas\n" + "3-Medicamentos\n"+"Seleccione una opcion\n");
        opcion = lectura.nextInt();
        if (opcion == 1) {
            System.out.println("Seleccionaste Analgesicos");
            System.out.println("Que deseas Hacer\n" + "1-Comprar Producto\n" + "2-Consultar Precio\n" + "3-Devolucion del producto\n");
            seleccion = lectura.nextInt();
            if (seleccion == 1) {
                System.out.println("Gracias por su compra del analgesico");
                System.out.println("El precio de la compra es : $" +analgesico);
            } else if (seleccion == 2) {
                System.out.println("Usted esta Consultado el precio");
                System.out.println("El precio del Analgesico  es: " +analgesico);
            } else if (seleccion == 3) {
                System.out.println("Usted esta devolviendo el producto analgesico");
            }else{ System.out.println("Seleccion no validad");}
        } else if (opcion == 2) {
            System.out.println("Seleccionaste Cremas");
            System.out.println("Que deseas Hacer\n" + "1-Comprar Producto\n" + "2-Consultar Precio\n" + "3-Devolucion del producto\n");
            seleccion = lectura.nextInt();
            if (seleccion == 1) {
                System.out.println("Gracias por su compra de su crema");
                System.out.println("El precio de la compra es: $" +cremas);
            } else if (seleccion == 2) {
                System.out.println("Usted esta Consultado el precio");
                System.out.println("El precio de la crema es: " +cremas);
            } else if (seleccion == 3) {
                System.out.println("Usted esta devolviendo el producto");
            }else{ System.out.println("Seleccion no validad");}
        }
        else if (opcion == 3) {
                System.out.println("Seleccionaste Medicamentos");
                System.out.println("Que deseas Hacer\n" + "1-Comprar Producto\n" + "2-Consultar Precio\n" + "3-Devolucion del producto\n");
                seleccion = lectura.nextInt();
                if (seleccion == 1) {
                    System.out.println("Gracias por su compra del medicamento");
                    System.out.println("El precio de la compra es: " +medicamentos);
                } else if (seleccion == 2) {
                    System.out.println("Usted esta Consultado el precio");
                    System.out.println("El precio del medicamento es: $"+medicamentos);
                } else if (seleccion == 3) {
                    System.out.println("Usted esta devolviendo el producto");
                }else {
                    System.out.println("Seleccion no validad");
                }

        }

    }

}


