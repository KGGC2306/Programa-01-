import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1- Identificar variables
        int a, b, total;
        Scanner S = new Scanner(System.in);
        //2- Imprimir el mensaje ´Ingrese a´
        System.out.println ("Ingrese a");
        //3- Leer y almacenar valor en variable a
        a = S.nextInt();
        //4- Imprimir el mensaje " Ingrese b"
        System.out.println ("Ingrese b");
        //5- Leer y almacenar en variable b
        b = S.nextInt();
        //6- total = a * b
        total = a * b;
        //7- Imprimir el mensaje " El resultado es"
    // al valor de total
        System.out.println ("El resultado es" + total);
   }
}