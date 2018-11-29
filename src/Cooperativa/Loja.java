
package Cooperativa;
import java.util.Scanner;
public class Loja extends Estacion{
    Scanner sc = new Scanner(System.in);
    public Loja() {   
    } 
    @Override
    public void reservar(int con) {      
            int asiento;
            int cont =con;          
            if (cont ==0){
            asientos("Loja");               
            }         
            if(verificar("Loja")<n){
                presentarAsientos("Loja");
                System.out.println("Numero del asiento");
                asiento = sc.nextInt();
                asiento=asiento-1;
                if(Loja[asiento].equals(ocupado)){
                    System.out.println("ya esta ocupado");
                }else{
                    Loja[asiento]=ocupado;     
                    System.out.println("se ha reservado con exito");
                }                    
            }else{
                System.out.println("no ay asientos");
            }                     
    }   
}
