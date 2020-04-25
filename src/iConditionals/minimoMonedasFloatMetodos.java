package iConditionals;

import libs.Input;

public class minimoMonedasFloatMetodos {

    static int sumMon=0;

    public static void main(String[] args)
    {
        System.out.print("¿Cuánto debo de darte de cambio? ");
        float pesos = Input.get_float();

        cambio(pesos);
        System.out.print("Se necesitan: " + sumMon + " monedas");

    }

    public static void cambio(float pesos) {
        float div25,res25;
        div25= (float) (pesos/.25);
        System.out.println("Se darán " +(int)div25+" de 25c ");
        res25=(float)(pesos%.25);

        moneda10(res25);
        sumMon+=(int)div25;
    }

    private static void moneda10(float res25) {
        float div10,res10;
        div10=(float) (res25/.10);
        System.out.println("Se darán "+(int)div10+" de 10c ");
        res10=(float)(res25%.10);

        moneda05(res10);
        sumMon+=(int)div10;
    }

    private static void moneda05(float res10) {
        float div05,res05;
        div05=(float)(res10/.05);
        System.out.println("Se darán "+(int)div05+" de 05c");
        res05=(float)(res10%.05);

        moneda01(res05);
        sumMon+=(int)div05;
    }

    private static void moneda01(float res05) {
        float div01;
        div01=(float)(res05/.01);
        System.out.println("Se darán "+Math.round(div01)+" de 01c ");

        sumMon+=Math.round(div01);
    }

}




