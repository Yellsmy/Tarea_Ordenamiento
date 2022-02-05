
package ordenamiento;

public class Ordenamiento {
    //Método de Burbuja
    static void Burbuja(int[] arreglo) {
        int n = arreglo.length;
        int temp = 0;
        for(int i=0; i < n; i++){
             for(int j=1; j < (n-i); j++){
                if(arreglo[j-1] > arreglo[j]){
                    temp = arreglo[j-1];
                    arreglo[j-1] = arreglo[j];
                    arreglo[j] = temp;
                }
             }
         }
    }
    
//Método Quicksort
    public static int Quicksort(int[]arreglo, int inicio, int fin){
        int pivote = arreglo[inicio];     //El primer elemento del arreglo será el pivote
        int temporal;                 
        while (true){
            while (arreglo[inicio] < pivote){                //busca el elemento mayor del pivote
                inicio ++;               
            }
            while (arreglo[fin] > pivote){                   //busca el elemento menor del pivote
                fin --;
            }
            if (inicio >= fin){                              //Si el inicio es mayor o igual al fin se rompe el ciclo
                break;
            }
            else {                                           //Sino hace el intercambio de dato para ordenar el arreglo
                temporal = arreglo[inicio];
                arreglo[inicio] = arreglo[fin];
                arreglo[inicio]= temporal;
                inicio ++;
                fin --;               
            }
        }
        return 0;
                
    }
    
    //Método Principal
    public static void main(String[] args) {
        int arreglo[] = new int[10];
        arreglo[0]= 1;
        arreglo[1]= 100;
        arreglo[2]= 33;
        arreglo[3]= 4;
        arreglo[4]= 29;
        arreglo[5]= 74;
        arreglo[6]= 12;
        arreglo[7]= 2;
        arreglo[8]= 51;
        arreglo[9]= 99;
        
        //Impresión del arreglo original
        System.out.println("Arreglo original");
        for(int i=0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
        
        //Imprimir Método Burbuja
        System.out.println("______Método Burbuja_______ ");       
        Burbuja(arreglo);
        System.out.println("Arreglo ordenado");
        for(int i=0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }
        
        //Imprimir Método Quicksort
        System.out.println();
        System.out.println("_________Método Quicksort_________ ");       
        Quicksort(arreglo,0,arreglo.length-1);
        System.out.println("Arreglo ordenado");
        for(int i=0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
            
        }
    }
    
   
}