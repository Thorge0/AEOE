import java.util.Arrays;

public class AEOE {
    public static void main(String[] args){
        char[][] ZDArr = zweiDimReihungen.zufallsZeichenreihung(4,5);
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
