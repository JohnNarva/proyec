package Cooperativa;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        
        String nomBus;
        int cont = 0,cont1=0,cont2=0;
        int termino=1;
        
        Estacion destino1 = new Loja();
        Estacion destino2 = new Quito();
        Estacion destino3 = new Guayaquil();

        do {
            System.out.println("destino del viaje");
            nomBus = sc.nextLine();
            switch (nomBus) {
                case "loja":                    
                    destino1.reservar(cont);
                    cont=1;
                    break;
                case "quito":  
                    destino2.reservar(cont1);
                    cont1=1;
                    break;
                case "guayaquil":                  
                    destino3.reservar(cont2);
                    cont2=1;
                    break;
            }
        } while (termino == 1);

    }
}
