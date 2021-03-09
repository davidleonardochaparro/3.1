package ejercicio.pkg3.pkg1;

public class Operaciones {
    
    private int[]array;
    private double[]array2;
    
    public Operaciones(){}
    public Operaciones(int[] array, double[] array2){
    
        this.array=array;
        this.array2=array2;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public double[] getArray2() {
        return array2;
    }

    public void setArray2(double[] array2) {
        this.array2 = array2;
    }
         public void verArray(double array[]){
             
             for(double i: array){
                 System.out.println(i+" ");
             }
             System.out.println();
         }  
         public void Ejercicio1(int a){
             int array[]=new int[a], sumatoria=0;
             double sumatoria2=0, promedio=0, desviacion=0;
             double varianza=0;
             System.out.println("Los numeros aleatorios fueron: ");
             
             for(int i=0;i<a;i++){
                 
                 int numAleatorio=(int)(Math.random()*10+1);
                 array[i]=numAleatorio;
                 System.out.println(array[i]);
                 sumatoria=(array[i]+sumatoria);                 
                 
             }
             promedio=(sumatoria/a);
             
             double []base=new double[a];
             
             for(int j=0;j<a;j++){
                 
                 base[j]=(Math.pow(array[j]-promedio,2))/a;
                 sumatoria2+=base[j];
             }
             desviacion=Math.sqrt(sumatoria2);
             varianza=Math.pow(desviacion,2);
             System.out.println("La media es: "+promedio);
             System.out.println("La desviación estandar es: "+desviacion);
             System.out.println("La varianza es: "+varianza);
         }
    
}
