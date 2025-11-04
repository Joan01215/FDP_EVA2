package eva2_28_primo;

import java.util.Scanner;

public class EVA2_28_PRIMO {

    public static void main(String[] args) {
        Scanner captu= new Scanner(System.in);
        int num;
        System.out.println("Ingresa numero: ");
        num = captu.nextInt();
        for(int i = 2; i<num; i++ ){
            if(num % i == 0){
                System.out.println("No es un numero primo");
            }
        }
        System.out.println(num + " Es un numero primo");
    }
    
}
