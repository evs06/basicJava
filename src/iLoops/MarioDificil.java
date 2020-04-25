package iLoops;

import libs.Input;

public class MarioDificil {

    public static void main(String[] args) {
        System.out.print("Altura: ");
        int altura = Input.get_int();


        while(altura < 0){
            System.out.print("Favor de ingresar un número mayor a 0\n");
            altura = Input.get_int();
        }

        for(int filas = 0; filas < altura; filas++) {
            int espacios = altura - filas;

            for (int i=0 ; i < espacios ; i++) {
                System.out.print(" ");
            }

            for (int i=0 ; i<filas+1 ; i++) {
                System.out.print("#");
            }

            System.out.print("  ");

            for (int i=0 ; i<filas+ 1 ; i++) {
                System.out.print("#");
            }

            System.out.println();

        }

    }

}
