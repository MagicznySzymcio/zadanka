package zadania;

import java.util.Random;

public class DrogaMonte {
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


    public static int[] Los()    {
        int[] ustawienie = new int[9];
        Random ran = new Random();
        int opcja;
        int aktualne_miejsce = 0;
        for (int i = 0; i < N; i++) {
            while (true) {
                if (i != aktualne_miejsce)  {
                    break;
                }
                    opcja = aktualne_miejsce + 1 + ran.nextInt(9 - 1 - aktualne_miejsce);
                    if (opcja == 8 && droga[i][opcja] != brak) {
                        ustawienie[opcja] = aktualne_miejsce;
                        System.out.println("test");
                        break;
                    }
                    if (droga[i][opcja] != brak) {
                        aktualne_miejsce = opcja;
                        ustawienie[opcja] = aktualne_miejsce;
                        System.out.println(opcja);
                        break;
                    }
                }
            }
        System.out.println("Czas = " + czas);
        return ustawienie;
    }




    public static void main(String[] args) {
       int[] ustawienie = Los();

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