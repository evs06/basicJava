package iConditionals;

import libs.Input;

public class minimoMonedasFloat {

    public static void main(String[] args) {
        float div25,res25,div10,res10,div05,res05,div01,res01;
        int sumMonedas = 0;

        System.out.print("¿Cuánto debo de darte de cambio? ");
        float cantidad = Input.get_float();
        float pesos=cantidad;

        div25= (float) (pesos/.25);
        System.out.println("Monedas de 25c "+(int)div25);
        res25=(float)(pesos%.25);

        div10=(float) (res25/.10);
        System.out.println("Monedas de 10c "+(int)div10);
        res10=(float)(res25%.10);

        div05=(float)(res10/.05);
        System.out.println("Monedas de 05c "+(int)div05);
        res05=(float)(res10%.05);

        div01=(float)(res05/.01);
        System.out.println("Monedas de 01c "+Math.round(div01));

        sumMonedas=(int)div25 + (int)div10 + (int)div05 + Math.round(div01);
        System.out.println("Se necesitan: " + sumMonedas + " monedas");
    }


}
