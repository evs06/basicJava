package jStrings;

import libs.Input;

public class SegundosDificil {

    public static void main(String[] args) {

        System.out.print("Ingresar la duración en segundos de la canción: ");
        int segundos = Input.get_int();

        System.out.print("La duración de la cación es de " + (segundos/60) + " minutos y "  + (segundos%60) + " segundos");

        }

    }

