
package eva2_1_exa1;

import java.util.Scanner;

public class EVA2_1_EXA1 {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int Saldo = 5000;
        int Calculo;
        int pin, opc, Monto;
        System.out.println("Introduce el pin");
        pin = captu.nextInt();
        if(pin == 1234){
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            opc = captu.nextInt();
            if(opc == 1){
                System.out.println("Tu saldo es: " + Saldo);
            }else if(opc == 2){
                System.out.println("¿Cuanto va a retirar?");
                Monto = captu.nextInt();
                if(Monto<=Saldo){
                    Calculo = Saldo - Monto;
                    System.out.println("Tu saldo es: ");
                }else{
                    System.out.println("Monto mayor al saldo");
                }
            }else if(opc ==3){
                System.out.println("¿Cuanto va a depositar?");
                Monto = captu.nextInt();
                         if(Monto>=0){
                             Calculo = Saldo + Monto;
                             System.out.println("Tu saldo es: " + Calculo);
                         }else{
                             System.out.println("Monto negativo");
                         }    
                }
        }else{
            System.out.println("Acceso denegado");
            }
        }
    }
    

