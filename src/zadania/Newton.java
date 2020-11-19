package zadania;

import java.util.Scanner;

public class Newton {
    public static final Scanner scan = new Scanner(System.in);
    public static int n;
    public static int k;

    public static void zapytaj() {
        System.out.println("Podaj n: ");
        n = scan.nextInt();
        System.out.println("Podaj k: ");
        k = scan.nextInt();
        if ((k <= 0) || (n <= k)) {
            System.out.println("https://pl.wikipedia.org/wiki/Symbol_Newtona");
            zapytaj();
        }
    }

    static int symbolNewtona(int n, int k)
    {
        if (k == 0 || k == n)
            return 1;
        return symbolNewtona(n - 1, k - 1) + symbolNewtona(n - 1, k);
    }

    public static void main(String[] args) {
        zapytaj();

        if( k == 0 || k == n ) System.out.println("1");
        else System.out.println(symbolNewtona(n, k));
    }
}
