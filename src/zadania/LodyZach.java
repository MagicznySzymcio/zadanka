package zadania;

public class LodyZach {
    final static int N = 6;
    final static int[][] lody = {{0, 7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {31, 29, 5, 18, 0, 4},
            {28, 24, 1, 17, 5, 0}};

    public static int gentest(int poz_startowa)    {
        boolean [] wykorzystane = {false, false, false, false, false, false};
        int poz_pocz = poz_startowa;
        int wyk = 1;
        int temp = 0;
        wykorzystane[poz_startowa] = true;
        int czas = 0;
        while (wyk < N) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j<N; j++)   {
                if (lody[poz_startowa][j] < min && !wykorzystane[j])    {
                    min = lody[poz_startowa][j];
                    temp = j;
                }
            }
            wykorzystane[temp] = true;
            wyk++;
            poz_startowa = temp;
            czas += min;
        }
        czas += lody[poz_startowa][poz_pocz];
        return czas;
    }


    public static void main(String[] args) {
        System.out.println(gentest(1));

    }
}
