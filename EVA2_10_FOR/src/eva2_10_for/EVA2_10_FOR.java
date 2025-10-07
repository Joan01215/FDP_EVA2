package eva2_10_for;

import java.util.Scanner;

public class EVA2_10_FOR {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        {int num;
                System.out.println("Ingresa un numero del 1 al 10");
                num = captu.nextInt();
                for(int i = 1; i<=10; i++)
                    System.out.println(num + "x"+ i );
}
}
    }
