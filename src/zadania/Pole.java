package zadania;

import java.util.Random;

public class Pole {
    public static int nalezace = 0;
    public static int wszystkie = 0;

    public static void main(String[] args) {
        Random ran = new Random();
        for (int i = 0; i<100000; i++) {
            double x = (double) ran.nextInt(1001)/1000;
            double y = (double) ran.nextInt(1001)/1000;
            double sin = Math.sin(x);
            if (x<1 && y>0 && y<sin){
                nalezace++;
                wszystkie++;
            }
            else {
                wszystkie++;
            }
        }
        System.out.println((float)nalezace/wszystkie * 100 + "%");
    }
}
