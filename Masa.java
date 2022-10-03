import java.util.Scanner;



public class Masa {
public static void main(String[] args){
   Scanner entrada=new Scanner(System.in);
   double peso;
   double altura;
   double rr;
   String R;
   //boolean a;
  // boolean b;
   System.out.println("Ingrese k Si prefiere ingresar el peso en Kilos y altura en Metros");
   System.out.println("Ingrese l Si prefiere ingresar el peso en Libras y altura en pulgadas");
   System.out.println("opcion: ");
   R=entrada.next();

   if (R.equals("k")){
    System.out.println("Peso: ");
        peso=entrada.nextDouble();
        System.out.println("Altura: ");
        altura=entrada.nextDouble();
        rr= peso/Math.pow(altura, 2);
        System.out.println("Indice de masa corporal es: "+ rr);
   }
  
   if (R.equals("l")){
    System.out.println("Peso: ");
        peso=entrada.nextDouble();
        System.out.println("Altura: ");
        altura=entrada.nextDouble();  
        rr=peso*703/Math.pow(altura, 2);
    System.out.println("Indice de masa corporal es: "+rr);
  }
   System.out.println("VALORES DE BMI en kilogramos");
   System.out.println("Bajo Peso: "+"Menos de 18.5");
   System.out.println("Normal: "+"Entre 18.5 y 24.9");
   System.out.println("Sobrepeso: "+"Entre 25 y 29.9");
   System.out.println("Obeso: "+"30 o mas");

   entrada.close();
    }
}

    