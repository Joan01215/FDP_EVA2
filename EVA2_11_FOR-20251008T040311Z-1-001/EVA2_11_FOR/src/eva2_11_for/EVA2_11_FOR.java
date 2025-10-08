package eva2_11_for;

import java.util.Scanner;

public class EVA2_11_FOR {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int ini, fin, resi;
        System.out.println("Numeros entre dos numeros");
        System.out.println("Ingrese el primer numero");
        ini = captu.nextInt();
        System.out.println("Ingrese el segundo numero");
        fin = captu.nextInt();
        for(int i = ini; i <= fin; i++){
            resi = i% 2;//SABER SI EL NUMERO ES PAR
            if( resi == 0)//ES PAR
                 System.out.println(i + " - ");
    }
    }
    
}
