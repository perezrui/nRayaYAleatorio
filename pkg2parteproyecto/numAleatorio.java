/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2parteproyecto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Juan Pablo
 */
public class numAleatorio {
        int num = 0;
        int numadivinar;
        int contador = 0;
        Random aleatorio = new Random();
        
        public void adivinarNumero(int n){     
        numadivinar = aleatorio.nextInt(n);
        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("introduce un numero que este entre el 1 y el" + n);
            num = leer.nextInt();
              if (num > numadivinar) {
                    System.out.println("el numero que tienes que adivinar es <");
                    contador++;
                } else {
                    System.out.println("el numero que tienes que adivinar es >");
                    contador++;

                }
        }  while (num != numadivinar); {
               
              

        }

            System.out.println("has acertado el numero");
            System.out.println("el numero de intentos que has hecho es de " + contador);

    }

}



