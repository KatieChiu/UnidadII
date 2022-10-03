import java.util.Scanner;



public class AritmeticaMM {
    public static void main(String[] args){
      Scanner entrada=new Scanner(System.in);
      int num1;
      int num2;
      int num3;  
      int sumaprom;
      int mult;
         
         System.out.println("Ingrese el primer numero: ");
         num1=entrada.nextInt();
         System.out.println("Ingrese el segundo numero: ");
         num2=entrada.nextInt();
         System.out.println("Ingrese el tercer numero: ");
         num3=entrada.nextInt();
           
          //calculos
           sumaprom=(num1+num2+num3)/3;
           mult= num1*num2*num3;
           //condiciones para Numeros menor y mayor
            if (num1>num2 && num1>num3)
               System.out.println("el numero mayor es: "+ num1);
            else
            System.out.println("el numero menor es: "+ num1);
           if (num2>num1 && num2>num3)
               System.out.println("el numero mayor es: "+ num2);
            else
            System.out.println("el numero menor es: "+ num2);
            if (num3>num1 && num3>num2)
               System.out.println("el numero mayor es: "+ num3);
            else
            System.out.println("el numero menor es: "+ num3);
                   
            
           //Muestra de resultados
           System.out.println("La suma Promedio es: "+ sumaprom);
           System.out.println("La multiplicacion es : "+ mult);
        
         
    
           
   entrada.close();
       }
           
}
