import java.util.Scanner;
public class paroimpar
{     
public static void main(String args[])
{ 

int numero;
Scanner entrada = new Scanner(System.in);
  
System.out.println("\nIntroduzca un numero: ");
numero = entrada.nextInt();
  
if( 0 == numero % 2 )
System.out.println("\nEl numero es par.");
  
if ( 0 != numero % 2)
System.out.println("\nEl numero es impar.");
    entrada.close();
}      
}   