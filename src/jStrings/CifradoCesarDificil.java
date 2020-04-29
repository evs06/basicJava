package jStrings;

public class CifradoCesarDificil {

    public static void main(String[] args) {

        String msg = "VELOZ";

        for(int i = 0; i < msg.length(); i++) {
            char actual = Character.toUpperCase(msg.charAt(i));
            int cifradocesar = (actual + 5);

            if(cifradocesar > 90){
                cifradocesar = cifradocesar - 26;
            }
            char cifradoletras = (char) cifradocesar;

            System.out.print(cifradoletras);
        }

    }

}
