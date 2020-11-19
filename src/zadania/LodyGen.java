package zadania;

import java.util.Arrays;

public class LodyGen {
    final static int N = 7;
    final static int[][] lody = {{0, 7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {31, 29, 5, 18, 0, 4},
            {28, 24, 1, 17, 5, 0}};
    private static final int[] L = new int[N];
    static int czas = Integer.MAX_VALUE;
    static int temp_czas = 0;
    public static int[] ustawienie;


    public static void main(String[] args) {
        permutacje(0);
        System.out.println(czas + " " + Arrays.toString(ustawienie));
    }

    static void permutacje(int i) {
        temp_czas = 0;
        L[6] = L[0];
        if (i == N - 1) {
            for (int j = 0; j < N; j++) {
                try {
                    temp_czas += lody[L[j - 1] - 1][L[j] - 1];
                } catch (ArrayIndexOutOfBoundsException ignored) {
                }
            }
            if (temp_czas < czas) {
                ustawienie = L;
                czas = temp_czas;
                System.out.println(czas + " " + Arrays.toString(ustawienie));
            }
        } else {
            for (int j = 1; j <= N - 1; j++) {
                int k;
                for (k = 0; k < i; k++) {
                    if (L[k] == j) {
                        break;
                    }
                }
                if (k == i) {
                    L[k] = j;
                    permutacje(i + 1);
                }
            }
        }
    }
}