public class CuadradosCubos {

    public static void main(String[] args)
{ 
final int LONGITUD_ARREGLO = 11; 
int[] arreglo = new int[LONGITUD_ARREGLO]; 
final int LONGITUD = 11;
int[] arreglo2 = new int[LONGITUD];

 // calcula el valor 
for (int contador = 0; contador < arreglo.length; contador++)
arreglo[contador] = (int) Math.pow(contador,2);

for (int cub= 0; cub< arreglo2.length; cub++)
arreglo2[cub] = (int) Math.pow(cub,3);
 
System.out.printf("%s%10s%8s%n","Numero","Cuadrado","Cubo"); // encabezados de columnas


for (int contador = 0; contador < arreglo.length; contador++)
System.out.printf("%2d%8d%12d%n", contador, arreglo[contador],arreglo2[contador]);
}
 } 
