import java.util.Scanner;
public class Nombre {
    public static void main(String[] args) {
        String nombre="";
        Scanner scan = new Scanner(System.in); 
        System.out.println("Ingrese su nombre");
        nombre=scan.nextLine();
        System.out.println("Hola "+nombre+ " Bienvenido. Es un gusto conocerlo");
        System.out.println("Ingrese su Edad");
        int edad =scan.nextInt();
    }
}
