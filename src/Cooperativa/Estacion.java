
package Cooperativa;


public abstract class Estacion extends Cooperativa{
final String libre="libre";
final String ocupado="ocupado";
public abstract void reservar(int cont);

public void asientos(String nombre){
     String nom = nombre;
    
    switch (nom) {
        case "Loja":
            for(int i = 0;i< n;i++){
                Loja[i]=libre;
            }       break;
        case "Quito":
            for(int i = 0;i< n;i++){   
                Quito[i]=libre;
            }       break;
        case "Guayaquil":
            for(int i = 0;i< n;i++){
                Guayaquil[i]=libre;
            }       break;
        default:
            break;
    }
  
} 

public void presentarAsientos(String nombre){
    String nom = nombre;
    
    switch (nom) {
        case "Loja":
            for(int i = 0;i< n;i++){
                int aux= i+1;
                System.out.println("asiento # "+aux+"#"+"  estado:  "+Loja[i]);
            }   break;
        case "Quito":
            for(int i = 0;i< n;i++){
                int aux= i+1;
                System.out.println("asiento # "+aux+"#"+"  estado:  "+Quito[i]);
            }   break;
        case "Guayaquil":
            for(int i = 0;i< n;i++){
                int aux= i+1;
                System.out.println("asiento # "+aux+"#"+"  estado:  "+Guayaquil[i]);
            }   break;
        default:
            break;          
    }
} 

public int verificar(String nombre){
    String nom = nombre;
    int cont=0;
    switch (nom) {
        case "Loja":
            for(int i = 0;i< n;i++){
                if (Loja[i].equals(ocupado)){
                    cont+=1;
                }
                
            }
            return cont;
        case "Quito":
            for(int i = 0;i< n;i++){
                if (Quito[i].equals(ocupado)){
                    cont+=1;
                }
            }
            return cont;
        case "Guayaquil":
            for(int i = 0;i< n;i++){
                if (Guayaquil[i].equals(ocupado)){
                    cont+=1;
                }
            }
            return cont;
        default:
            break;
    }    
    return cont;
}
    
}
