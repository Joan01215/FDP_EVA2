package eva2_13_for_arreglos;

public class EVA2_13_FOR_ARREGLOS {

    public static void main(String[] args) {
        int arreglo[] = new int [10];
       /* arreglo[0]= 100;
        arreglo[1]= 200;
        arreglo[2]= 300;
        arreglo[3]= 400;
        arreglo[4]= 500;
        arreglo[5]= 600;
        arreglo[6]= 700;
        arreglo[7]= 800;
        arreglo[8]= 900;
        arreglo[9]= 1000;*/
        //Asingar variable
        for(int i = 0; i <10; i++){
            arreglo[i] = (int)(Math.random() *100);//casting
        }
            
        //Leer valores
        for(int i = 0; i <10; i++)
            System.out.println("["+ arreglo[i]+ "]");
         
    }
    
}
