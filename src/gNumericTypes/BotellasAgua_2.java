package gNumericTypes;

import libs.Input;

public class BotellasAgua_2 {

    public static void main(String[] args) {

        int botellasxmin = 12;
        System.out.print(" ¿Cuánto minutos tardas en bañarte? ");
        int minutos = Input.get_int();

        while(minutos <= 0){
            System.out.print("Favor de ingresar un número mayor a 0\n");
            minutos = Input.get_int();
        }

        System.out.print("El número de botellas que consumiste al bañarte por "+minutos+" minutos son: " + botellasxmin * minutos);
    }

}
