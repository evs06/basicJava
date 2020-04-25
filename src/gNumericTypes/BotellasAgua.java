package gNumericTypes;

import libs.Input;

public class BotellasAgua {
    public static void main(String[] args) {
        int botellasMin=12;
        System.out.print("¿Cuánto minutos duras bañandote? ");
        float minutos = Input.get_float();

        System.out.println("El tiempo de  " + minutos + " minutos bañandote es equivalente a " + (minutos*botellasMin) + " botellas de agua");
    }
}
