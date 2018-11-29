
package Cooperativa;
import java.util.Scanner;
public class Quito extends Estacion{
Scanner sc1 = new Scanner(System.in);
    public Quito() {
    } 
    @Override
    public void reservar(int con) {
            int asiento;           
            int cont =con;
            if (cont ==0){
                asientos("Quito");
            } 
            if(verificar("Quito")<n){
                presentarAsientos("Quito");
                System.out.println("Numero del asiento");
                asiento = sc1.nextInt();
                asiento=asiento-1;
                if(Quito[asiento].equals(ocupado)){
                    System.out.println("ya esta ocupado");
                }else{
                    Quito[asiento]=ocupado;     
                    System.out.println("se ha reservado con exito");
                }  
            }else{
                 System.out.println("no ay asientos");
            }                   
    }
}
