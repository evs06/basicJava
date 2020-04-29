package mArrays;

import libs.Input;

public class RemoverCharacter {

    public static void main(String[] args) {

        System.out.print("Ingresa cadena: \n");
        String mensaje = Input.get_string();
        String menSinEs = mensaje.trim();
        System.out.print("Ingresa la caracter que se eliminará de la cadena anterior: \n");
        char letra = Input.get_char();

        String  result = eliminarcaracter(menSinEs, letra);
        System.out.print(result);

    }

    private static String eliminarcaracter(String menSinEs, char letra) {
        String resultado = "";
        for (int x = 0; x < menSinEs.length(); x++) {
            char actual = menSinEs.charAt(x);
            if(actual != letra)
                resultado = resultado + actual;
//            for (char c = menSinEs.charAt(x); c <= menSinEs.charAt(x); c++) {
//
//                if (c!=letra) {
//                    System.out.print(c);
//                }
//            }
        }
        return resultado;
    }

}
