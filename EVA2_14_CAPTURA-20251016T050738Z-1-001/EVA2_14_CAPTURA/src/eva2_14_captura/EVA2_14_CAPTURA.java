package eva2_14_captura;

import java.util.Scanner;

public class EVA2_14_CAPTURA {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int tama;
        //Capturar
        System.out.println("Cuantas calificaciones va a capturar?");
        tama=captu.nextInt();
        int califas[] = new int [tama];
        for(int i = 0; i< califas.length; i++){
            System.out.println("Calificacion" + (i+1) + ":");
            califas[i] = captu.nextInt();
        }
        //Leer
        for(int i = 0; i< califas.length; i++){
            System.out.println("[" + califas[i] + "]");
        }
        int suma = 0;
        //SUMAR TODASD LAS CALIFICACIONES
        for(int i = 0; i< califas.length; i++){
            suma = suma + califas[i];
            //suma += califas[i];
        }
        double promedio = suma / tama;
        System.out.println("Promedio = "+ promedio);
    }
    
}
}