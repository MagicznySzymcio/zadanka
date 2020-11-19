package zadania;

import java.util.Arrays;

public class Droga {
    final static int N = 9;
    final static int[][] lody = {
            {0, 300, 402, 356, 99999, 99999, 99999, 99999, 99999},
            {300, 0, 99999, 99999, 440, 474, 99999, 99999, 99999},
            {402, 99999, 0, 99999, 99999, 330, 99999, 99999, 99999},
            {356, 99999, 99999, 0, 99999, 99999, 823, 99999, 99999},
            {99999, 440, 99999, 99999, 0, 99999, 99999, 430, 99999},
            {99999, 474, 330, 99999, 99999, 0, 813, 356, 774},
            {99999, 99999, 99999, 823, 99999, 813, 0, 99999, 403},
            {99999, 99999, 99999, 99999, 430, 365, 99999, 0, 768},
            {99999, 99999, 99999, 99999, 99999,774, 403, 768,0}};
    private static final int[] L = new int[N+1];
    static int czas = Integer.MAX_VALUE;
    static int temp_czas = 0;
    public static int[] ustawienie;

    public static void main(String[] args) {
        permutacje(0);
    }

    static void permutacje(int i) {
        temp_czas = 0;
        L[6] = L[0];
        if (i == N) {
            for (int j = 0; j < N; j++) {
                temp_czas += lody[L[j] - 1][L[j+1] - 1];
            }
            if (temp_czas < czas) {
                czas = temp_czas;
                ustawienie = L;
            }
            if(temp_czas <= czas && czas == 63) {
                System.out.println(czas + " " + Arrays.toString(ustawienie));
            }
        } else {
            for (int j = 1; j <= N; j++) {
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
