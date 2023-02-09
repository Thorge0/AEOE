/**
 * Klasse zum Testen 2-dim. Reihungen
 *
 * @author Sven Dräger
 * @version 05.01.2023
 */
public class zweiDimReihungen {

    /**
     * Methode zufallsZahlenreihung
     *
     * @param m Anzahl der Zeilen
     * @param n Anzahl der Spalten
     * @return zweidimensionale Reihung der Größe mxn mit ganzzahligen Zufallswerten zwischen 0 und 1000
     */
    static int[][] zufallsZahlenreihung(int m, int n) {
        int[][] zufall = new int[m][n];
        for (int i = 0; i < zufall.length; i++) {
            for (int k = 0; k < zufall[0].length; k++) {
                zufall[i][k] = (int) (Math.random() * 1000 + 1);
            }
        }
        return zufall;
    }

    /**
     * Methode zufallsZeichenreihung
     *
     * @param m Anzahl der Zeilen
     * @param n Anzahl der Spalten
     * @return zweidimensionale Reihung der Größe mxn mit zufälligen Kleinbuchstaben zwischen a und z
     */
    static char[][] zufallsZeichenreihung(int m, int n) {
        char[][] zufall = new char[m][n];
        int asciizahl;
        for (int i = 0; i < zufall.length; i++) {
            for (int k = 0; k < zufall[0].length; k++) {
                asciizahl = (int) (Math.random() * 26 + 97);
                zufall[i][k] = (char) asciizahl;
            }
        }
        return zufall;
    }

    /**
     * Methode ausgabeZahlenreihung
     *
     * @param r zweidimensionale Reihung von Ganzzahlen
     */
    static void ausgabeZahlenreihung(int[][] r) {
        StringBuilder ausgabe = new StringBuilder();
        for (int[] ints : r) {
            for (int k = 0; k < r[0].length; k++) {
                ausgabe.append(ints[k]).append(" ");
            }
            ausgabe.append("\n");
        }
        IO.show(ausgabe.toString());
    }

    /**
     * Methode ausgabeZahlenreihung
     *
     * @param r zweidimensionale Reihung von Zeichen
     */
    static void ausgabeZeichenreihung(char[][] r) {
        StringBuilder ausgabe = new StringBuilder();
        for (char[] chars : r) {
            for (int k = 0; k < r[0].length; k++) {
                ausgabe.append(chars[k]).append(" ");
            }
            ausgabe.append("\n");
        }
        IO.show(ausgabe.toString());
    }
}
