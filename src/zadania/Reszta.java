package zadania;

import java.util.Arrays;
import java.util.Scanner;

public class Reszta {
    public static int[] nominaly = {500, 200, 100, 50, 20, 10, 5, 2, 1};
    public static int[] pozostale_monety = {1, 3, 2, 0, 1, 2, 4, 10, 24240};
    public static int[] lmonet = {0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static int pozycja = 0;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float reszta = scan.nextFloat() * 100;
        int resztaintegerowa = (int) reszta;
        while (resztaintegerowa>0)  {
            if (pozycja > 8) {
                System.out.println("nie");
                break;
            }
            if (resztaintegerowa >= nominaly[pozycja] && pozostale_monety[pozycja] >= 1) {
                resztaintegerowa -= nominaly[pozycja];
                pozostale_monety[pozycja]--;
                lmonet[pozycja]++;
            }
            else {
                pozycja++;
            }
        }
        System.out.println(Arrays.toString(lmonet));
    }
}
