/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author omara
 */
public class SumaImpar {
    static void Impares(){
        int numero = 1;
        int contador = 0;
        int suma = 0;

        do {
            if (numero % 2 != 0) {  // si el número es impar
                suma += numero;
                contador++;
            }
            numero++;
        } while (contador < 10);

        System.out.println("La suma de los primeros 10 números impares es: " + suma);
    }
    
    public static void main(String[] args){
        Impares();
    }

}
