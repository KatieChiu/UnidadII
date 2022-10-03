
import java.util.Scanner;
public class operaciones {
    public static void main(String[] args) {
        System.out.println("Aritmetica");
        Scanner entrada=new Scanner(System.in);
        int Num1;
        int Num2;
        int suma;
        int multiplicacion;
        int resta;
        double div;
        
        System.out.println("Ingrese primer numero");
        Num1=entrada.nextInt();
        System.out.println("Ingrese segundo numero");
        Num2=entrada.nextInt();
        
        //operaciones
     
        suma=Num1 + Num2;
        multiplicacion= Num1*Num2;
        resta=Num1-Num2;
        div=(double)Num1/Num2;
        
        System.out.println("La suma de dichos numeros es:" + suma);
        System.out.println("La multiplicacion de dichos numeros es:" + multiplicacion);
        System.out.println("La resta de dichos numeros es:" + resta);
        System.out.println("La division de dichos numeros es:" + div);
    entrada.close();
    }
}
