package jStrings;

import libs.Input;

public class CifradoCesar {

    public static void main(String[] args) {

        System.out.print("Ingresa mensaje: \n");
        String mensaje = Input.get_string();

        cifradocesar(mensaje);

    }

    private static void cifradocesar(String mensaje) {

        String cifrado[] = (mensaje.split(" "));

        for(int x1=0; x1<cifrado.length; x1++){
            String c1 = cifrado[x1];
            char[] letras = c1.toCharArray();

            for(int i = 0; i < letras.length; i++) {

                for (char c = c1.charAt(i); c <= c1.charAt(i); c++){
                    //char y = (char) (c+5);
                    System.out.print((char) (c+5));
                    //Input.print(c + " is " + (char) (c+5) + "\n" );
                }
            }

            System.out.print(" ");
        }

    }

}
