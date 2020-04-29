package jStrings;

import libs.Input;

public class Tocayos {

    static int contador=0;

    public static void main(String[] args) {

        System.out.println("Ingresa primer nombre completo: ");
        String nombreUno = Input.get_string();

        System.out.println("Ingresa segundo nombre completo: ");
        String nombreDos = Input.get_string();

        comparacion(nombreUno,nombreDos);
        verficacioncomparacion(contador);

    }

    private static void comparacion(String nombreUno, String nombreDos) {

        String nom1[] = (nombreUno.split(" "));
        String nom2[] = (nombreDos.split(" "));

        for(int x1=0; x1<nom1.length; x1++){
            String nombre1 = nom1[x1];
            for(int x2=0; x2<nom2.length; x2++){
                String nombre2 = nom2[x2];
                if(nombre1.equals(nombre2)){
                    contador++;
                }
            }
        }

    }

    private static void verficacioncomparacion(int contador) {

        if(contador>0){
            System.out.print("Eres Tocayo");
        }
        else{
            System.out.print("No eres Tocayo");
        }

    }

}
