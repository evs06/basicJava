package jStrings;

import libs.Input;

public class InicialesDificil {

    public static void main(String[] args) {

        System.out.print("Ingresa el nombre completo: \n");
        String mensaje = Input.get_string();

        cifrado(mensaje);

    }

    private static void cifrado(String mensaje) {

        String cifrado[] = (mensaje.split(" "));

        for(int x1=0; x1<cifrado.length; x1++){
            String c1 = cifrado[x1];

            char[] letras = c1.toCharArray();

            for(int i = 0; i < letras.length; i++) {

                if(i==0){
                    Input.print(Character.toUpperCase(letras[0]));
                }
            }

        }

    }

}


