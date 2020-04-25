package iLoops;

import libs.Input;

public class MarioFacil {

    public static void main(String[] args) {
        System.out.print("Altura: ");
        int altura = Input.get_int();


        while(altura <= 1){
            System.out.print("Favor de ingresar un número mayor a 1\n");
            altura = Input.get_int();
        }

        for(int filas = 1; filas <= altura; filas++) {
            int espacios = altura - filas;

            for (int i=1 ; i <= espacios ; i++) {
                System.out.print(" ");
            }

            for (int i=1 ; i<=filas+1 ; i++) {
                System.out.print("#");
            }

            System.out.println();

        }

    }
}
