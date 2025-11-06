package eva2_29_contraseña;

import java.util.Scanner;

public class EVA2_29_CONTRASEÑA {
final static String USU = "JOAN";
final static String PWD = "123456";
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        System.out.println("Bienvenido");
        for(int intento = 1; intento <= 4; intento++){
        System.out.println("Ingresa tu usuario");
        String usuario = captu.nextLine();
        System.out.println("Ingrese su contraseña");
        String contraseña = captu.nextLine();
        if(usuario.equals(USU) && contraseña.equals(PWD)){
           System.out.println("Bienvenido al sistema");
                break;
            }else{
                int restantes = 4 - intento;
                if(restantes > 0){
                    System.out.println("Usuario o contraseña incorrectos");
                    System.out.println("Te quedan " + restantes + " intentos");
                }else{
                    System.out.println("Numero maximo de intentos alcanzado.");
                    System.out.println("ACCESO DENEGADO");
                    break;
                }    
            }
        }
        
    }
    
}
