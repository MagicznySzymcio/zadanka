package zadania;

public class LososiePodzial {
    static double liczebnosc(int t) {
        if (t == 0) return 1000000;
        else
            return ((liczebnosc(t - 1) * (Math.pow(Math.E, 0.003))) * 0.998) * 0.998;
    }
    public static double[] liczba = {0, 0, 0, 0};
    public static double l1 = 1000000/2,l2 = 1000000/3,l3 = 1000000/10,l4 = 1000000/100;

    public static void main(String[] args) {
        int t=1;
        double jakduzo=liczebnosc(t);

        while(jakduzo>100){
            t++;
            if(jakduzo<=l1 && liczba[0] == 0)
            {
                System.out.println("Połowa populacji, a dokładnie "+jakduzo+" po czasie: "+t+" min");
                liczba[0] = jakduzo;
            }
            if(jakduzo<=l2 && liczba[1] == 0)
            {
                System.out.println("1/3 populacji, a dokładnie "+jakduzo+" po czasie: "+t+" min");
                liczba[1] = jakduzo;
            }
            if(jakduzo<=l3 && liczba[2] == 0)
            {
                System.out.println("1/10 populacji, a dokładnie "+jakduzo+" po czasie: "+t+" min");
                liczba[2] = jakduzo;
            }
            if(jakduzo<=l4 && liczba[3] == 0)
            {
                System.out.println("1/100, a dokładnie "+jakduzo+" po czasie: "+t+" min");
                liczba[3] = jakduzo;
            }
            jakduzo=liczebnosc(t);
        }
        System.out.println("Mineło: "+t+" minut, populacja wymarła i wynosi teraz "+ jakduzo);

    }
}
