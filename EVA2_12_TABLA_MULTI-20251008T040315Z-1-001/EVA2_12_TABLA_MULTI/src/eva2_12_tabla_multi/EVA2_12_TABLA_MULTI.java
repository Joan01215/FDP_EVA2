package eva2_12_tabla_multi;

import java.util.Scanner;

public class EVA2_12_TABLA_MULTI {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num;
                System.out.println("Ingresa un numero del 1 al 10");
                num = captu.nextInt();
                for(int i = 1; i<=10; i++)
                    System.out.println(num + "x"+ i + "=" +  (num*i) );
    
    
}
}
