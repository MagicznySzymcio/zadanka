package zadania;

import java.util.Arrays;

public class DrogaZachlannie {
    final static int N = 9;
    static int brak = Integer.MAX_VALUE;
    final static int[][] droga = {
            {0, 300, 402, 356, brak, brak, brak, brak, brak},
            {300, 0, brak, brak, 440, 474, brak, brak, brak},
            {402, brak, 0, brak, brak, 330, brak, brak, brak},
            {356, brak, brak, 0, brak, brak, 823, brak, brak},
            {brak, 440, brak, brak, 0, brak, brak, 430, brak},
            {brak, 474, 330, brak, brak, 0, 813, 356, 774},
            {brak, brak, brak, 823, brak, 813, 0, brak, 403},
            {brak, brak, brak, brak, 430, 365, brak, 0, 768},
            {brak, brak, brak, brak, brak, 774, 403, 768, 0}};

    static int czas = 0;
    public static int[] ustawienie = new int[9];

    public static void main(String[] args) {
        int min_czas;
        int aktualne_miejsce = 0;
        for (int i = 0; i < N; i++) {
            min_czas = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                if ((j > aktualne_miejsce) && (i == aktualne_miejsce) && (droga[i][j] < min_czas)) {
                    min_czas = droga[i][j];
                    aktualne_miejsce = j;
                    ustawienie[i] = aktualne_miejsce;
                }
            }
            if (min_czas != Integer.MAX_VALUE)
                czas += min_czas;
        }
        System.out.println("Czas = " + czas);

        StringBuilder miejsca = new StringBuilder("Warszawa");
        for (int x: ustawienie) {
            switch (x)  {
                case 0:
                    break;
                case 1:
                    miejsca.append(" - Katowice");
                    break;
                case 2:
                    miejsca.append(" - Zakopane");
                    break;
                case 3:
                    miejsca.append(" - Lwów");
                    break;
                case 4:
                    miejsca.append(" - Wiedeń");
                    break;
                case 5:
                    miejsca.append(" - Budapeszt");
                    break;
                case 6:
                    miejsca.append(" - Bukareszt");
                    break;
                case 7:
                    miejsca.append(" - Zagrzeb");
                    break;
                case 8:
                    miejsca.append(" - Sofia");
                    break;
            }
        }
        System.out.println(miejsca);
    }
}