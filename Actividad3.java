import java.util.Scanner;

public class Actividad3 {
    
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int pNumero, sNumero;

        System.out.println("ingrese el primer numero");
        pNumero=sc.nextInt();

        System.out.println("ingrese el segundo numero");
        sNumero=sc.nextInt();

        if (pNumero%sNumero==0) {
        System.out.println(sNumero + " es multipo de " + pNumero);

        }

        else if (sNumero%pNumero==0) {
        System.out.println(pNumero + " es multiplo de " + sNumero);

        }

        else {
        System.out.println("no hay multiplo entre ellos");

        }
    }
}