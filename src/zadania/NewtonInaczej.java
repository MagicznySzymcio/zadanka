package zadania;

import java.util.Arrays;
import java.util.Scanner;

public class NewtonInaczej {
    static int k;
    static int n;

    static void newton(int[][] tab)
    {
        for (int i = 1; i <=k ; i++) {
            for (int j = 0; j <=n ; j++) {
                if(i<=j) tab[i][j]=tab[i-1][j-1] + tab[i-1][j];
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Podaj n: ");
        n=scn.nextInt();
        System.out.println("Podaj k: ");
        k=scn.nextInt();

        int[][] tab = new int[k+1][n+1];

        for (int x=0; x<=n; x++)
        {
            tab[0][x] = 1;
        }
        newton(tab);

        System.out.println(Arrays.deepToString(tab).replace("], ", "]\n"));


    }
}

