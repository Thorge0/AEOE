import java.util.Arrays;

public class AEOE {
    public static void main(String[] args) {
        ziel1_aufgabe1();
    }

    /**
     *
     *
     */
    public static void ziel1_aufgabe1(){
        char[][] ZDArr = zweiDimReihungen.zufallsZeichenreihung(5, 20);
        System.out.println(Arrays.deepToString(ZDArr).length() - Arrays.deepToString(ZDArr).replaceAll(String.valueOf(IO.getChar("Give me Char.")), "").length());
        System.out.println(Arrays.deepToString(ZDArr));

        char gesucht = IO.getChar("Give me Char.");
        int counter = 0;

        for (char[] i : ZDArr){
            for (char j : i){
                if (j == gesucht) counter++;
            }
        }

        System.out.println(counter);
        System.out.println(Arrays.deepToString(ZDArr));
    }
}
