import libs.Input;

public class InicialesCharAt {

    public static void main(String[] args) {

        System.out.print("Favor de ingresar tu nombre completo: \n");
        String nombre= Input.get_string();
        String resultado="";
        for(int i=0; i<nombre.length();i++){

            char actual=nombre.charAt(i);

            if(nombre.charAt(i) >= 'A' && nombre.charAt(i) <= 'Z'){

                resultado=resultado+actual;
            }

        }

        System.out.println(resultado);
    }
}
