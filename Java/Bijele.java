import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String entrada = scan.nextLine();
        System.out.println(bijele(entrada));
    }

    /**
     * Solution for Bijele problem
     * https://open.kattis.com/problems/bijele
     * @param pieces the pieces you have
     * @return the pieces you must add or remove
     * to have a proper chess game.
     * @author Simón Marín Giraldo
     */
    public static String bijele(String pieces) {
        //Values:
        int [] supposed = {1,1,2,2,2,8};
        int [] piezas = new int[6];
        String s = "";
        for (int i = 0; i < pieces.length(); i++) {
            if (pieces.charAt(i) != ' ') {
                s += pieces.charAt(i);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            piezas[i] = Integer.parseInt("" + s.charAt(i));
        }

        String retorno = "";
        for (int i = 0; i < piezas.length; i++) {
            if (i != piezas.length-1) {
                retorno += supposed[i]-piezas[i] + " ";
            } else {
                retorno += supposed[i]-piezas[i];
            }
        }
        return retorno;
    }
}