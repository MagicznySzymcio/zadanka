package zadania;

import java.io.*;

class ResztaZach
{
    public static void main(String[] args) throws IOException
    {
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader wejscie = new BufferedReader(str);
        String tekst;
        final int[] M = {500,200,100,50,20,10,5,2,1};
        int[] count = new int[9];
        int zl, gr, r, i = 0;
        System.out.println("Podaj reszte..");
        System.out.print("zlotych: ");
        tekst = wejscie.readLine();
        zl = Integer.parseInt(tekst);
        System.out.print("groszy: ");
        tekst = wejscie.readLine();
        gr = Integer.parseInt(tekst);
        System.out.print("Reszta: ");
        r = zl*100 + gr;
        while (r > 0)
        {
            if (r >= M[i])
            {
                count[i]=count[i]+1;
                r = r - M[i];
            }
            else
                i++;
        }
        for(int k = 0; k < count.length; k++){
            if(count[k]>0) {
                if (k >= 0 && k <= 2) {
                    System.out.println(M[k] / 100 + "zł x " + count[k]);
                } else {
                    System.out.println(M[k] + "gr x " + count[k]);
                }
            }
        }
        System.out.println();
    }
}