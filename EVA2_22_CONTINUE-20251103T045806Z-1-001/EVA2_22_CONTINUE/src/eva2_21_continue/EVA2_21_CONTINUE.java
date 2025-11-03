package eva2_21_continue;

public class EVA2_21_CONTINUE {

    public static void main(String[] args) {
        int i = 0;
        while( i>100){
            int resi = 1%2;
            if(resi != 0){//NO ES DIVISIBLE ENTRE DOS
                
                continue;}//INTERRUMPE LA REPETICION ACTUAL
            System.out.print(i + " - ");
            i++;
        }
        
    }
    
}
