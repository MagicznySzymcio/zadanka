package zadania;

public class KomarySzczur {

    static double[] dz2(int tydzien){
        double[] komary = new double[2];
        if(tydzien == 1){
            komary[0] = 450;
            komary[1] = 550;
        }else{
            double noweKomary = 0.1*(dz2(tydzien-1)[0] + dz2(tydzien-1)[1]);
            double samce = 0.98*dz2(tydzien-1)[0] + 0.45*noweKomary;
            double samice = 0.95*dz2(tydzien-1)[1] + 0.55*noweKomary;

            komary[0] = samce;
            komary[1] = samice;
        }
        return komary;
    }

    public static void main(String[] args){
        double komary;
        double samce =450;
        double samice= 550;
        int czas =0;

        while(samice>samce){
            czas++;
            samce = dz2(czas)[0];
            samice = dz2(czas)[1];
            komary = samice + samce;
            System.out.println("Liczba komarów: " +komary+ "\tsamce: "+samce+"\tsamice: " +samice);
        }
        System.out.println("Czas: " +czas);
    }

}
