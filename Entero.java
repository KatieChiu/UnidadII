
import java.util.Scanner;
public class Entero {
    public static void main(String[] args){
    Scanner entrada=new Scanner(System.in);
    char a;
    int b;
    System.out.println("Ingrese el caracter: ");
    a = entrada.next().charAt(0); 
    b= (int) a;
    
    System.out.println("El valor ASCII es: " + b);
    entrada.close();
}
}

