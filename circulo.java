import java.util.Scanner;


public class circulo {
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        int r;
        double d;
        double c;
        double a;
        System.out.println("Ingrese el valor del radio: ");
        r=cin.nextInt();
        d=2*r;
        c=2*Math.PI*r;
        a=Math.PI*Math.pow(r,2);
        
       // resultados
       System.out.println("El diametro del circulo es de: "+ d);
       System.out.println("La circunferencia del circulo es de: "+ c);
       System.out.println("El Area del circulo es de: "+ a);
       
        cin.close();
    }
     }
