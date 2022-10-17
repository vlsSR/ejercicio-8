package paquete1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroSucursal,numeroPaquete,prioridad,peticion_salir;
        String direccion,ciudad,dni;
        double peso,precio;
        boolean salir = false;

        System.out.println("Introduce los datos de la sucursal: ");
        System.out.println("Numero de la sucursal: ");
        numeroSucursal = sc.nextInt();
        System.out.println("Direccion: ");
        direccion = sc.nextLine();
        sc.nextLine();
        System.out.println("Ciudad: ");
        ciudad = sc.nextLine();

        Sucursal sucursal = new Sucursal(numeroSucursal,direccion,ciudad);

        do{
            System.out.println("Introduce los datos del paquete: ");
            System.out.println("Numero paquete: ");
            numeroPaquete = sc.nextInt();
            System.out.println("DNI: ");
            dni = sc.nextLine();
            sc.nextLine();
            System.out.println("Peso: ");
            peso = sc.nextDouble();
            System.out.println("Priodida, 0 para Estandar, 1 para Alta, 2 para Express: ");
            prioridad = sc.nextInt();

            Paquete paquete = new Paquete(numeroPaquete,dni,peso,prioridad);
            precio = sucursal.calcularPrecio(paquete);

            System.out.println("En la sucursal: ");
            System.out.println(sucursal.mostrarDatosSucursal());
            System.out.println("El paquete: ");
            System.out.println(paquete.mostrarDatosPaquete());
            System.out.println("Cuesta: "+precio);

            System.out.println("Si deseas salir introduce un 1, si quieres introducir otro paquete introduce cualquier otra cosa");
            peticion_salir = sc.nextInt();
            if(peticion_salir == 1){
                salir = true;
            }
            else {
                salir = false;
            }
        } while (!salir);
    }
}