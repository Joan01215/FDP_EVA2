package eva2_6_arreglos_string_2;

import java.util.Scanner;

public class EVA2_6_ARREGLOS_STRING_2 {

    public static void main(String[] args) {
         Scanner captu = new Scanner(System.in);
        int dia;
        String diasSemana[] = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernres","Sabado"};
        System.out.println("Introduce el dia en numero ( 0 - 6: ");
        dia = captu.nextInt();
        System.out.println("El dias es:" + diasSemana[dia]);
    }
    
}
