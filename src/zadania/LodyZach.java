package zadania;

import java.util.Arrays;

public class LodyZach {
    static final int N = 6;
    static final int[][] lody = new int[][]{{0, 7, 20, 21, 12, 23}, {27, 0, 13, 16, 46, 5}, {53, 15, 0, 25, 27, 6}, {16, 2, 35, 0, 47, 10}, {31, 29, 5, 18, 0, 4}, {28, 24, 1, 17, 5, 0}};

    public LodyZach() {
    }

    public static int gentest(int poz_startowa) {
        boolean[] wykorzystane = new boolean[]{false, false, false, false, false, false};
        int[] sciezka = new int[]{poz_startowa + 1, 0, 0, 0, 0, 0, poz_startowa + 1};
        int poz_pocz = poz_startowa;
        int wyk = 1;
        int temp = 0;
        wykorzystane[poz_startowa] = true;

        int czas;
        for(czas = 0; wyk < 6; sciezka[wyk - 1] = temp + 1) {
            int min = Integer.MAX_VALUE;

            for(int j = 0; j < 6; ++j) {
                if (lody[poz_startowa][j] < min && !wykorzystane[j]) {
                    min = lody[poz_startowa][j];
                    temp = j;
                }
            }

            wykorzystane[temp] = true;
            ++wyk;
            poz_startowa = temp;
            czas += min;
        }

        czas += lody[poz_startowa][poz_pocz];
        System.out.println(Arrays.toString(sciezka));
        return czas;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 6; ++i) {
            System.out.println(gentest(i));
        }

    }
}
