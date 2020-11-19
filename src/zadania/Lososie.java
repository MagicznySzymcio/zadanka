package zadania;

public class Lososie {
    public static double llososi = 1000000;
    public static int minuty = 0;

    public static double tick(double lososie) {
        lososie *= Math.pow(Math.E, 0.003);
        lososie = lososie * 0.998 * 0.998;
        return lososie;
    }


    public static void main(String[] args) {
        while (llososi > 100) {
            llososi = tick(llososi);
            minuty++;
        }
        System.out.println(minuty);
    }
}
