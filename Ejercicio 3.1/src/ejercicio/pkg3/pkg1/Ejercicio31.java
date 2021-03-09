package ejercicio.pkg3.pkg1;

import java.util.Scanner;

public class Ejercicio31 {

    public static void main(String[] args) {
  
        try
        {
            Scanner tecla=new Scanner (System.in);
            Operaciones Operacion1 = new Operaciones ();
            
            System.out.println("Se calcula la media, varianza"
                    + " y desvaición estándar de un arreglo de"
                    + "números enteros aleatorios (Digite 1).");
            int op=tecla.nextInt();
            
            switch(op){
                case 1: System.out.println("Digite el tamaño del arreglo: ");
                int TamArreglo = tecla.nextInt();
                Operacion1.Ejercicio1(TamArreglo);
                break;
            }
        }catch (Exception e){}
                   
    }
    
}
