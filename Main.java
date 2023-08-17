import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    ClasificacionesdeVehiculos cv = new ClasificacionesdeVehiculos();
        Scanner sn = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("A continuacion te mostrare los tipos de vehiculos");
        System.out.println("Estos son: ");
        System.out.println("1. terrestres");
        System.out.println("2. maritimos");
        System.out.println("3. aereos");
        System.out.print("seleccione cuales desea saber: ");
        System.out.println(" ");
        System.out.println("----------------------------------------");
        int opcionpri = sn.nextInt();

        switch (opcionpri){
            case 1:
                System.out.println("----------------------------------------");
                System.out.println("el carro "+cv.carro());
                System.out.println("el camion "+cv.camion());
                System.out.println("el motocicleta "+cv.motocicleta());
                System.out.println("----------------------------------------");
                break;

            case 2:
                System.out.println("----------------------------------------");
                System.out.println("el yate "+cv.yate());
                System.out.println("el barco "+cv.barco());
                System.out.println("el lancha "+cv.lancha());
                System.out.println("----------------------------------------");
                break;

            case 3:
                System.out.println("----------------------------------------");
                System.out.println("el avion "+cv.avion());
                System.out.println("el avioneta "+cv.avioneta());
                System.out.println("el helicoptero "+cv.helicoptero());
                System.out.println("----------------------------------------");
                break;

            default:
                System.out.println("----------------------------------------");
                System.out.println("ingrese un numero dentro del rango");
                System.out.println("----------------------------------------");

        }
    }
}