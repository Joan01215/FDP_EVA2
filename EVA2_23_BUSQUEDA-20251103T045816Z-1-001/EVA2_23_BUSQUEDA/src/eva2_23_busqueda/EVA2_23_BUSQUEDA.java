package eva2_23_busqueda;

import java.util.Scanner;

public class EVA2_23_BUSQUEDA {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor, posi = -1;//-1 SIGNIFICA QUE NO LO ENCONTRAMOS
        int datos[] = new int[10];
        for(int i = 0; i < datos.length; i++){
            datos[i] = (int)(Math.random()* 100);
        }
        for(int i = 0; i < datos.length; i++){
        System.out.print("["+ datos[i] + "]");
        }
        System.out.println("");
        System.out.println("Valor a buscar: ");
        valor = captu.nextInt();
        //BUSQUEDA LINEAL
        for(int i = 0; i<datos.length; i++){
            if(valor == datos[i]){//LO ENCONTRAMOS
                posi= i;//REGRESSAMOS DONDE LO ENCONTRAMOS
                break;
                //YA LO ENCONTRE, DETENGO LA BUSQUEDA
            }
                    
        
        }
        System.out.println("Posicion: "+ posi);
        
    }
    
}
