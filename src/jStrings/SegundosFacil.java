package jStrings;

import libs.Input;

public class SegundosFacil {

    public static void main(String[] args) {

        System.out.println("Proporciona la duración del video (mm:ss): ");
        duracion();

    }

    public static void duracion(){

        String duracion= Input.get_string();
        String a[]= (duracion.split(":"));

        int minutos= Integer.parseInt(a[0]);

        int seg2= Integer.parseInt(a[1]);

        valida(minutos, seg2);
    }

    public static void valida(int minutos, int seg2){

        while(minutos > 59 || seg2 > 59){
            System.out.print("Favor de ingresar un hora válida con el formato (mm:ss): ");
            duracion();
        }

        int segundosMin=60*minutos;
        System.out.println("Los segundos del video son: " + (segundosMin + seg2));

    }

}
