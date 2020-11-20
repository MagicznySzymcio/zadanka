package zadania;

    public class LososiePodzial {
        static double liczebnosc(int t) {
            if (t == 0) return 1000000;
            else
                return ((liczebnosc(t - 1) * (Math.pow(Math.E, 0.003))) * 0.998) * 0.998;
        }

        public static void main(String[] args) {
            int t=1;
            double jakduzo=liczebnosc(t);
            while (jakduzo>500000){
                t++;
                jakduzo=liczebnosc(t);
            }
            System.out.println("Połowa populacji, a dokładnie "+jakduzo+" po czasie: "+t+" min");

            while(jakduzo>100){
                t++;
                jakduzo=liczebnosc(t);
            }
            System.out.println("Mineło: "+t+" minut, populacja wymarła i wynosi teraz "+ jakduzo);

        }
    }

}
