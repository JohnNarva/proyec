
package Cooperativa;

import java.util.Scanner;

public class Guayaquil extends Estacion{
Scanner sc2 = new Scanner(System.in);
    public Guayaquil() {
    }
    @Override
    public void reservar( int con) {
            int asiento;
            int cont =con;
            if (cont ==0){
                asientos("Guayaquil");
            }  
            if(verificar("Guayaquil")<n){
                presentarAsientos("Guayaquil");
                System.out.println("Numero del asiento");
                asiento = sc2.nextInt();
                asiento=asiento-1;
                if(Guayaquil[asiento].equals(ocupado)){
                    System.out.println("ya esta ocupado");
                }else{
                    Guayaquil[asiento]=ocupado;     
                    System.out.println("se ha reservado con exito");
                } 
            }else {
                System.out.println("no ay asientos");
            }       
    }
}
