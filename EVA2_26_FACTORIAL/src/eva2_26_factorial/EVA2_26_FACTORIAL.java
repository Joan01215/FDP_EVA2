package eva2_26_factorial;

import java.util.Scanner;

public class EVA2_26_FACTORIAL {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num,factorial=1;
        System.out.println("Ingresa un numero: ");
        num = captu.nextInt();
        for(int i =1; i<=num; i++){
            factorial = factorial*i;
        
        System.out.println("El factorial de " + num + " es " + factorial);
    }
    
}
}