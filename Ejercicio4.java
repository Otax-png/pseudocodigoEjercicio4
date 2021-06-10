import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int mayorEdad, menorEdad, aleatorio;

        mayorEdad = 0;
        menorEdad = 90;

        for (int i = 1; i < 4 ; i++) {

            aleatorio = ((int)Math.floor(Math.random()*100 - 0 +1) + 0);
            System.out.println("Edad: " + aleatorio);

            if (aleatorio > mayorEdad){
                mayorEdad = aleatorio;
            } else if(aleatorio < menorEdad) {
                menorEdad = aleatorio;
            }
        }

        System.out.println("La edad mayor es: " + mayorEdad + " añosy la menor edad es de " + menorEdad + " años");
    }
}