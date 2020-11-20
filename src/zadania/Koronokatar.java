package zadania;

import java.util.Arrays;

public class Koronokatar {
    public static final int populacja = 100000;
    public static final int l_dni = 7;
    public static int odporni = 0;
    public static int zakazeni = 10;
    public static int[] przebieg = new int[l_dni + 1];

    public static int epidemia(int dzien) {
        if (dzien == 0) {
            przebieg[dzien] = 10;
            return 10;
        }
        else {
            zakazeni += zakazeni * 2;
            przebieg[dzien] = zakazeni;
            return epidemia(dzien-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(epidemia(l_dni));
        System.out.println(zakazeni);
        System.out.println(Arrays.toString(przebieg));
    }
}
