package DatosPersonales;
import java.util.Scanner;
public class Datos {
    public static void DatosPersonales (String nombre, String edad, String celular){
        //System.out.println("Bienvenido Señor " + nombre "/n" );
        //System.out.println("es un placer para nosotros contar con una persona de " + edad);
        //System.out.println("años. Proximamente nos comunicaremos con usted al numero " + celular);
        //System.out.println("Feliz Dia");
        System.out.println("Bienvenido señor " + nombre + ", es un placer para nosotros contar con una persona de "+ edad + " años. " +
                "\n" +
                "Próximamente nos comunicaremos con usted al numero " + celular +
                "\n" +
                "Feliz día");
    }
        public static void main (String[] args){
        Scanner teclado= new Scanner (System.in);
    String nombre, edad, celular;

        System.out.println("Digite su nombre");
        nombre = teclado.nextLine();
        System.out.println("Digite su edad");
        edad = teclado.nextLine();
        System.out.println("Digite su celular");
        celular = teclado.nextLine();

        DatosPersonales(nombre, edad, celular);
}
    }