package iLoops;

import libs.Input;

public class cancionesElefantes {
    public static void main(String[] args) {
        double monedas, residuoCambio, div25, res25, div10, res10, div5, res5;
        int c25=0, c10=0, c5=0, c1=0;
        System.out.print("¿Cuánto debo de darte de cambio? ");
        float cambio = Input.get_float();

        if(cambio>=.25){
            div25 = (int) cambio / .25;
            res25 = cambio % .25;
            System.out.println((int) div25);

            if(res25>=.10 & res25 < .25){
                div10 = (float) res25 / .10;
                res10 = res25 % .10;
                System.out.println((int)div10);

                if(res10>=.5 & res10 < .10){
                    div5 = (float) res10 / .5;
                    res5 = res10 % .5;
                    System.out.println(div5);
                }
            }
        }





       /* while(residuoCambio>0){
           //c25 = (int) (cambio / 25);
            cambio = cambio - 25;
            residuoCambio = cambio / 25;
            c25++;

        }
        System.out.print(c25);
        /*while(residuoCambio==0) {
             c25 = (int) cambio / 25;
            System.out.print(c25);
        }*/

    }
}
